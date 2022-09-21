package typings.moddle

import org.scalablytyped.runtime.StringDictionary
import typings.moddle.anon.LocalName
import typings.moddle.anon.TypeofElement
import typings.moddle.moddleBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moddle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("moddle", "AnyElement")
  @js.native
  open class AnyElement () extends ModdleBase {
    
    @JSName("$descriptor")
    var $descriptor: GenericDescriptor = js.native
    
    @JSName("$instanceOf")
    def $instanceOf(element: String): Boolean = js.native
    @JSName("$instanceOf")
    def $instanceOf(element: String, `type`: String): Boolean = js.native
    @JSName("$instanceOf")
    def $instanceOf(element: Element): Boolean = js.native
    @JSName("$instanceOf")
    def $instanceOf(element: Element, `type`: String): Boolean = js.native
    
    @JSName("$type")
    var $type: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("moddle", "Element")
  @js.native
  open class Element () extends ModdleBase {
    def this(fields: StringDictionary[Any]) = this()
    
    @JSName("$attrs")
    var $attrs: Record[String, Any] = js.native
    
    @JSName("$descriptor")
    var $descriptor: Descriptor = js.native
    
    @JSName("$instanceOf")
    def $instanceOf(element: String): Boolean = js.native
    @JSName("$instanceOf")
    def $instanceOf(element: String, `type`: String): Boolean = js.native
    @JSName("$instanceOf")
    def $instanceOf(element: Element): Boolean = js.native
    @JSName("$instanceOf")
    def $instanceOf(element: Element, `type`: String): Boolean = js.native
    
    @JSName("$parent")
    var $parent: Element = js.native
    
    @JSName("$type")
    var $type: String = js.native
    
    var hasType: js.UndefOr[js.Function2[/* element */ this.type, /* type */ js.UndefOr[String], Boolean]] = js.native
    
    var idNumeric: js.UndefOr[Double] = js.native
  }
  /* static members */
  object Element {
    
    @JSImport("moddle", "Element")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("moddle", "Element.$descriptor")
    @js.native
    def $descriptor: Descriptor = js.native
    inline def $descriptor_=(x: Descriptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$descriptor")(x.asInstanceOf[js.Any])
    
    @JSImport("moddle", "Element.$model")
    @js.native
    def $model: Moddle = js.native
    inline def $model_=(x: Moddle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$model")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("moddle", "Factory")
  @js.native
  open class Factory protected () extends StObject {
    def this(model: Moddle, properties: Properties) = this()
    
    def createType(descriptor: Descriptor): TypeofElement = js.native
    
    var model: Moddle = js.native
    
    var properties: Properties = js.native
  }
  
  @JSImport("moddle", "Moddle")
  @js.native
  open class Moddle protected () extends StObject {
    def this(packages: js.Array[PackageDefinition]) = this()
    
    def create(descriptor: String): Element = js.native
    def create(descriptor: String, attrs: StringDictionary[Any]): Element = js.native
    /**
      * Create an instance of the specified type.
      *
      * @example
      *
      * var foo = moddle.create('my:Foo');
      * var bar = moddle.create('my:Bar', { id: 'BAR_1' });
      */
    def create(descriptor: Descriptor): Element = js.native
    def create(descriptor: Descriptor, attrs: StringDictionary[Any]): Element = js.native
    
    /**
      * Creates an any-element type to be used within model instances.
      *
      * This can be used to create custom elements that lie outside the meta-model.
      * The created element contains all the meta-data required to serialize it
      * as part of meta-model elements.
      *
      * @example
      *
      * var foo = moddle.createAny('vendor:Foo', 'http://vendor', {
      *   value: 'bar'
      * });
      *
      * var container = moddle.create('my:Container', 'http://my', {
      *   any: [ foo ]
      * });
      */
    def createAny(name: String, nsUri: String, properties: StringDictionary[Any]): AnyElement = js.native
    
    var factory: Factory = js.native
    
    /**
      * Returns the descriptor for an element.
      */
    def getElementDescriptor(element: TypeofElement): Descriptor = js.native
    
    /**
      * Returns a registered package by uri or prefix
      */
    def getPackage(uriOrPrefix: String): PackageDefinition = js.native
    
    /**
      * Returns a snapshot of all known packages
      */
    def getPackages(): js.Array[PackageDefinition] = js.native
    
    /**
      * Returns the descriptor of an elements named property
      */
    def getPropertyDescriptor(element: Element, property: String): js.UndefOr[PropertyDescriptor] = js.native
    
    def getType(descriptor: String): TypeofElement = js.native
    /**
      * Returns the type representing a given descriptor
      *
      * @example
      *
      * var Foo = moddle.getType('my:Foo');
      * var foo = new Foo({ 'id' : 'FOO_1' });
      */
    def getType(descriptor: Descriptor): TypeofElement = js.native
    
    /**
      * Returns a mapped type's descriptor
      */
    def getTypeDescriptor(`type`: String): TypeDefinition = js.native
    
    /**
      * Returns true if the given descriptor or instance
      * represents the given type.
      *
      * May be applied to this, if element is omitted.
      */
    def hasType(element: Element): Boolean = js.native
    def hasType(element: Element, `type`: String): Boolean = js.native
    
    var properties: Properties = js.native
    
    var registry: Registry = js.native
    
    var typeCache: Record[String, TypeofElement] = js.native
  }
  
  @JSImport("moddle", "ModdleBase")
  @js.native
  open class ModdleBase () extends StObject {
    
    def get(name: String): Any = js.native
    
    def set(name: String, value: Any): Any = js.native
  }
  
  @JSImport("moddle", "Properties")
  @js.native
  open class Properties protected () extends StObject {
    def this(moddle: Moddle) = this()
    
    /**
      * Define a property on the target element.
      */
    def define(target: Element, name: String, options: StringDictionary[Any]): Unit = js.native
    
    /**
      * Define the descriptor for an element.
      */
    def defineDescriptor(target: Element, descriptor: Descriptor): Unit = js.native
    
    /**
      * Define the model for an element.
      */
    def defineModel(target: Element, model: Moddle): Unit = js.native
    
    /**
      * Returns the named property of the given element.
      */
    def get(target: Element, name: String): Any = js.native
    
    var model: Moddle = js.native
    
    /**
      * Sets a named property on the target element.
      * If the value is undefined, the property gets deleted.
      */
    def set(target: Element, name: String): Unit = js.native
    def set(target: Element, name: String, value: Any): Unit = js.native
  }
  
  @JSImport("moddle", "Registry")
  @js.native
  open class Registry protected () extends StObject {
    def this(packages: js.Array[PackageDefinition], properties: Properties) = this()
    
    def definePackage(target: Descriptor, pkg: PackageDefinition): Unit = js.native
    def definePackage(target: TypeDefinition, pkg: PackageDefinition): Unit = js.native
    
    /**
      * Returns the effective descriptor for a type.
      */
    def getEffectiveDescriptor(name: String): Descriptor = js.native
    
    def getPackage(uriOrPrefix: String): PackageDefinition = js.native
    
    def getPackages(): js.Array[PackageDefinition] = js.native
    
    /**
      * Traverse the type hierarchy from bottom to top,
      * calling iterator with (type, inherited) for all elements in
      * the inheritance chain.
      */
    def mapTypes(nsName: Ns, iterator: js.Function2[/* type */ TypeDefinition, /* inherited */ Boolean, Unit]): Unit = js.native
    def mapTypes(
      nsName: Ns,
      iterator: js.Function2[/* type */ TypeDefinition, /* inherited */ Boolean, Unit],
      `trait`: Boolean
    ): Unit = js.native
    
    var packageMap: Record[String, PackageDefinition] = js.native
    
    var packages: js.Array[PackageDefinition] = js.native
    
    var properties: Properties = js.native
    
    def registerPackage(pkg: PackageDefinition): Unit = js.native
    
    /**
      * Register a type from a specific package with us
      */
    def registerType(`type`: TypeDefinition, pkg: PackageDefinition): Unit = js.native
    
    var typeMap: Record[String, TypeDefinition] = js.native
  }
  
  inline def coerceType[T /* <: BuiltInTypes | String */, V](`type`: T, value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def isBuiltInType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInType")().asInstanceOf[Boolean]
  inline def isBuiltInType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSimpleType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseNameNs(name: String): Ns = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNameNs")(name.asInstanceOf[js.Any]).asInstanceOf[Ns]
  inline def parseNameNs(name: String, defaultPrefix: String): Ns = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNameNs")(name.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[Ns]
  
  /* Rewritten from type alias, can be one of: 
    - typings.moddle.moddleStrings.String
    - typings.moddle.moddleStrings.Boolean
    - typings.moddle.moddleStrings.Integer
    - typings.moddle.moddleStrings.Real
    - typings.moddle.moddleStrings.Element
  */
  trait BuiltInTypes extends StObject
  object BuiltInTypes {
    
    inline def Boolean: typings.moddle.moddleStrings.Boolean = "Boolean".asInstanceOf[typings.moddle.moddleStrings.Boolean]
    
    inline def Element: typings.moddle.moddleStrings.Element = "Element".asInstanceOf[typings.moddle.moddleStrings.Element]
    
    inline def Integer: typings.moddle.moddleStrings.Integer = "Integer".asInstanceOf[typings.moddle.moddleStrings.Integer]
    
    inline def Real: typings.moddle.moddleStrings.Real = "Real".asInstanceOf[typings.moddle.moddleStrings.Real]
    
    inline def String: typings.moddle.moddleStrings.String = "String".asInstanceOf[typings.moddle.moddleStrings.String]
  }
  
  /* Inlined parent std.Omit<moddle.moddle.GenericDescriptor, 'isGeneric' | 'ns'> */
  trait Descriptor extends StObject {
    
    var allTypes: js.Array[TypeDefinition]
    
    var allTypesByName: Record[String, TypeDefinition]
    
    var bodyProperty: js.UndefOr[PropertyDefinition] = js.undefined
    
    var idProperty: js.UndefOr[PropertyDefinition] = js.undefined
    
    var name: String
    
    var ns: Ns
    
    var properties: js.Array[PropertyDescriptor]
    
    var propertiesByName: Record[String, PropertyDescriptor]
  }
  object Descriptor {
    
    inline def apply(
      allTypes: js.Array[TypeDefinition],
      allTypesByName: Record[String, TypeDefinition],
      name: String,
      ns: Ns,
      properties: js.Array[PropertyDescriptor],
      propertiesByName: Record[String, PropertyDescriptor]
    ): Descriptor = {
      val __obj = js.Dynamic.literal(allTypes = allTypes.asInstanceOf[js.Any], allTypesByName = allTypesByName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], propertiesByName = propertiesByName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Descriptor]
    }
    
    extension [Self <: Descriptor](x: Self) {
      
      inline def setAllTypes(value: js.Array[TypeDefinition]): Self = StObject.set(x, "allTypes", value.asInstanceOf[js.Any])
      
      inline def setAllTypesByName(value: Record[String, TypeDefinition]): Self = StObject.set(x, "allTypesByName", value.asInstanceOf[js.Any])
      
      inline def setAllTypesVarargs(value: TypeDefinition*): Self = StObject.set(x, "allTypes", js.Array(value*))
      
      inline def setBodyProperty(value: PropertyDefinition): Self = StObject.set(x, "bodyProperty", value.asInstanceOf[js.Any])
      
      inline def setBodyPropertyUndefined: Self = StObject.set(x, "bodyProperty", js.undefined)
      
      inline def setIdProperty(value: PropertyDefinition): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNs(value: Ns): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[PropertyDescriptor]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesByName(value: Record[String, PropertyDescriptor]): Self = StObject.set(x, "propertiesByName", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: PropertyDescriptor*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  trait GenericDescriptor extends StObject {
    
    var isGeneric: `true`
    
    var name: String
    
    var ns: LocalName
  }
  object GenericDescriptor {
    
    inline def apply(name: String, ns: LocalName): GenericDescriptor = {
      val __obj = js.Dynamic.literal(isGeneric = true, name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericDescriptor]
    }
    
    extension [Self <: GenericDescriptor](x: Self) {
      
      inline def setIsGeneric(value: `true`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNs(value: LocalName): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModdleTypesMap extends StObject {
    
    var Boolean: scala.Boolean
    
    var Integer: Double
    
    var Real: Double
    
    var String: java.lang.String
  }
  object ModdleTypesMap {
    
    inline def apply(Boolean: Boolean, Integer: Double, Real: Double, String: String): ModdleTypesMap = {
      val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], Integer = Integer.asInstanceOf[js.Any], Real = Real.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModdleTypesMap]
    }
    
    extension [Self <: ModdleTypesMap](x: Self) {
      
      inline def setBoolean(value: Boolean): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
      
      inline def setInteger(value: Double): Self = StObject.set(x, "Integer", value.asInstanceOf[js.Any])
      
      inline def setReal(value: Double): Self = StObject.set(x, "Real", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ns extends StObject {
    
    var localName: String
    
    var name: String
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Ns {
    
    inline def apply(localName: String, name: String): Ns = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ns]
    }
    
    extension [Self <: Ns](x: Self) {
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  trait PackageDefinition extends StObject {
    
    /**
      * The `associations` property is reserved for future use.
      */
    var associations: js.UndefOr[Any] = js.undefined
    
    /**
      * The `enumerations` property is reserved for future use.
      */
    var enumerations: js.UndefOr[Any] = js.undefined
    
    var name: String
    
    /**
      * The `prefix` uniquely identifies elements in a package if more multiple packages are in place.
      */
    var prefix: String
    
    /**
      * The `types` collection contains all known types.
      */
    var types: js.Array[TypeDefinition]
    
    var uri: String
  }
  object PackageDefinition {
    
    inline def apply(name: String, prefix: String, types: js.Array[TypeDefinition], uri: String): PackageDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageDefinition]
    }
    
    extension [Self <: PackageDefinition](x: Self) {
      
      inline def setAssociations(value: Any): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
      
      inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
      
      inline def setEnumerations(value: Any): Self = StObject.set(x, "enumerations", value.asInstanceOf[js.Any])
      
      inline def setEnumerationsUndefined: Self = StObject.set(x, "enumerations", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[TypeDefinition]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: TypeDefinition*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyDefinition extends StObject {
    
    /**
      * The default value to set if non is defined
      */
    var default: js.UndefOr[String | Double | js.Symbol | Boolean] = js.undefined
    
    var isBody: js.UndefOr[Boolean] = js.undefined
    
    var isId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collection (i.e. list like) property.
      */
    var isMany: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reference to another object via its id property
      */
    var isReference: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Property name.
      */
    var name: String
    
    /**
      * Redefines the property inherited from a super type,
      * overriding name, type and qualifiers
      */
    var redefines: js.UndefOr[String] = js.undefined
    
    /**
      * The type attribute may reference simple types such as String, Boolean,
      * Integer or Real or any custom defined type.
      */
    var `type`: BuiltInTypes | String
  }
  object PropertyDefinition {
    
    inline def apply(name: String, `type`: BuiltInTypes | String): PropertyDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyDefinition]
    }
    
    extension [Self <: PropertyDefinition](x: Self) {
      
      inline def setDefault(value: String | Double | js.Symbol | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setIsBody(value: Boolean): Self = StObject.set(x, "isBody", value.asInstanceOf[js.Any])
      
      inline def setIsBodyUndefined: Self = StObject.set(x, "isBody", js.undefined)
      
      inline def setIsId(value: Boolean): Self = StObject.set(x, "isId", value.asInstanceOf[js.Any])
      
      inline def setIsIdUndefined: Self = StObject.set(x, "isId", js.undefined)
      
      inline def setIsMany(value: Boolean): Self = StObject.set(x, "isMany", value.asInstanceOf[js.Any])
      
      inline def setIsManyUndefined: Self = StObject.set(x, "isMany", js.undefined)
      
      inline def setIsReference(value: Boolean): Self = StObject.set(x, "isReference", value.asInstanceOf[js.Any])
      
      inline def setIsReferenceUndefined: Self = StObject.set(x, "isReference", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRedefines(value: String): Self = StObject.set(x, "redefines", value.asInstanceOf[js.Any])
      
      inline def setRedefinesUndefined: Self = StObject.set(x, "redefines", js.undefined)
      
      inline def setType(value: BuiltInTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyDescriptor
    extends StObject
       with PropertyDefinition {
    
    var inherited: js.UndefOr[Boolean] = js.undefined
    
    var ns: Ns
  }
  object PropertyDescriptor {
    
    inline def apply(name: String, ns: Ns, `type`: BuiltInTypes | String): PropertyDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyDescriptor]
    }
    
    extension [Self <: PropertyDescriptor](x: Self) {
      
      inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
      
      inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
      
      inline def setNs(value: Ns): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeDefinition extends StObject {
    
    /**
      * Some meta-models require it to plug-in new properties that to certain existing model elements.
      * This can be acomplished using the extends field.
      */
    var `extends`: js.UndefOr[js.Array[String]] = js.undefined
    
    var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var name: String
    
    var properties: js.UndefOr[js.Array[PropertyDefinition]] = js.undefined
    
    /**
      * Types can inherit from one or more super types by specifying the `superClass` property.
      */
    var superClass: js.UndefOr[js.Array[String]] = js.undefined
    
    var traits: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TypeDefinition {
    
    inline def apply(name: String): TypeDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeDefinition]
    }
    
    extension [Self <: TypeDefinition](x: Self) {
      
      inline def setExtends(value: js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[PropertyDefinition]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: PropertyDefinition*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setSuperClass(value: js.Array[String]): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
      
      inline def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
      
      inline def setSuperClassVarargs(value: String*): Self = StObject.set(x, "superClass", js.Array(value*))
      
      inline def setTraits(value: js.Array[String]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
      
      inline def setTraitsVarargs(value: String*): Self = StObject.set(x, "traits", js.Array(value*))
    }
  }
}
