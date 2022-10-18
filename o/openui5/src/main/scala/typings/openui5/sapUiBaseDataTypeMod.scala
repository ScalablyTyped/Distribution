package typings.openui5

import typings.openui5.anon.DefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseDataTypeMod {
  
  @JSImport("sap/ui/base/DataType", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DataType {
    
    /**
      * The base type of this type or undefined if this is a primitive type.
      *
      * @returns Base type or `undefined`
      */
    /* CompleteClass */
    override def getBaseType(): js.UndefOr[DataType] = js.native
    
    /**
      * Returns the component type of this type or `undefined` if this is not an array type.
      *
      * @returns Component type or `undefined`
      */
    /* CompleteClass */
    override def getComponentType(): js.UndefOr[DataType] = js.native
    
    /**
      * The default value for this type. Each type must define a default value.
      *
      * @returns Default value of the data type. The type of the returned value must match the JavaScript type
      * of the data type (a string for string types etc.)
      */
    /* CompleteClass */
    override def getDefaultValue(): Any = js.native
    
    /**
      * Returns the object with keys and values from which this enum type was created or `undefined` if this
      * is not an enum type.
      *
      * @returns Object with enum keys and values or `undefined`
      */
    /* CompleteClass */
    override def getEnumValues(): js.UndefOr[js.Object] = js.native
    
    /**
      * The qualified name of the data type.
      *
      * @returns Name of the data type
      */
    /* CompleteClass */
    override def getName(): String = js.native
    
    /**
      * Returns the most basic (primitive) type that this type has been derived from.
      *
      * If the type is a primitive type by itself, `this` is returned.
      *
      * @returns Primitive type of this type
      */
    /* CompleteClass */
    override def getPrimitiveType(): DataType = js.native
    
    /**
      * Whether this type is an array type.
      *
      * @returns Whether this type is an array type
      */
    /* CompleteClass */
    override def isArrayType(): Boolean = js.native
    
    /**
      * Whether this type is an enumeration type.
      *
      * @returns Whether this type is an enum type
      */
    /* CompleteClass */
    override def isEnumType(): Boolean = js.native
    
    /**
      * Checks whether the given value is valid for this type.
      *
      * To be implemented by concrete types.
      *
      * @returns Whether the given value is valid for this data type (without conversion)
      */
    /* CompleteClass */
    override def isValid(/**
      * Value to be checked
      */
    vValue: Any): Boolean = js.native
    
    /**
      * Normalizes the given value using the specified normalizer for this data type.
      *
      * If no normalizer has been set, the original value is returned.
      *
      * @returns Normalized value
      */
    /* CompleteClass */
    override def normalize(/**
      * Value to be normalized
      */
    oValue: Any): Any = js.native
    
    /**
      * Parses the given string value and converts it into the specific data type.
      *
      * @returns Value in the correct internal format
      */
    /* CompleteClass */
    override def parseValue(/**
      * String representation for a value of this type
      */
    sValue: String): Any = js.native
    
    /**
      * Set or unset a normalizer function to be used for values of this data type.
      *
      * When a normalizer function has been set, it will be applied to values of this type whenever {@link #normalize}
      * is called. `ManagedObject.prototype.setProperty` calls the `normalize` method before setting a new value
      * to a property (normalization is applied on-write, not on-read).
      *
      * The `fnNormalize` function has the signature
      * ```javascript
      *
      *   fnNormalize(value:any) : any
      * ```
      *  It will be called with a value for this type and should return a normalized value (which also must be
      * valid for the this type). There's no mean to reject a value. The `this` context of the function will
      * be this type.
      *
      * This method allows applications or application frameworks to plug-in a generic value normalization for
      * a type, e.g. to convert all URLs in some app-specific way before they are applied to controls. It is
      * not intended to break-out of the value range defined by a type.
      */
    /* CompleteClass */
    override def setNormalizer(/**
      * Function to apply for normalizing
      */
    fnNormalizer: js.Function): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/base/DataType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Derives a new type from a given base type.
      *
      * Example:
      *
      * ```javascript
      *
      *
      *   var fooType = DataType.createType('foo', {
      *       isValid : function(vValue) {
      *           return /^(foo(bar)?)$/.test(vValue);
      *       }
      *   }, DataType.getType('string'));
      *
      *   fooType.isValid('foo'); // true
      *   fooType.isValid('foobar'); // true
      *   fooType.isValid('==foobar=='); // false
      *
      * ```
      *
      *
      * If `mSettings` contains an implementation for `isValid`, then the validity check of the newly created
      * type will first execute the check of the base type and then call the given `isValid` function.
      *
      * Array types and enumeration types cannot be created with this method. They're created on-the-fly by {@link
      * #.getType DataType.getType} when such a type is looked up.
      *
      * **Note:** The creation of new primitive types is not supported. When a type is created without a base
      * type, it is automatically derived from the primitive type `any`.
      *
      * **Note:** If a type has to be used in classes, then the implementation of `isValid` must exactly have
      * the structure shown in the example above (single return statement, regular expression literal of the
      * form `/^(...)$/`, calling `/regex/.test()` on the given value). Only the inner part of the regular expression
      * literal can be different.
      *
      * @returns The newly created type object
      */
    inline def createType(/**
      * Unique qualified name of the new type
      */
    sName: String): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("createType")(sName.asInstanceOf[js.Any]).asInstanceOf[DataType]
    inline def createType(
      /**
      * Unique qualified name of the new type
      */
    sName: String,
      /**
      * Settings for the new type
      */
    mSettings: Unit,
      /**
      * Base type for the new type
      */
    vBase: String
    ): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("createType")(sName.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any], vBase.asInstanceOf[js.Any])).asInstanceOf[DataType]
    inline def createType(
      /**
      * Unique qualified name of the new type
      */
    sName: String,
      /**
      * Settings for the new type
      */
    mSettings: Unit,
      /**
      * Base type for the new type
      */
    vBase: DataType
    ): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("createType")(sName.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any], vBase.asInstanceOf[js.Any])).asInstanceOf[DataType]
    inline def createType(
      /**
      * Unique qualified name of the new type
      */
    sName: String,
      /**
      * Settings for the new type
      */
    mSettings: DefaultValue
    ): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("createType")(sName.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any])).asInstanceOf[DataType]
    inline def createType(
      /**
      * Unique qualified name of the new type
      */
    sName: String,
      /**
      * Settings for the new type
      */
    mSettings: DefaultValue,
      /**
      * Base type for the new type
      */
    vBase: String
    ): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("createType")(sName.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any], vBase.asInstanceOf[js.Any])).asInstanceOf[DataType]
    inline def createType(
      /**
      * Unique qualified name of the new type
      */
    sName: String,
      /**
      * Settings for the new type
      */
    mSettings: DefaultValue,
      /**
      * Base type for the new type
      */
    vBase: DataType
    ): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("createType")(sName.asInstanceOf[js.Any], mSettings.asInstanceOf[js.Any], vBase.asInstanceOf[js.Any])).asInstanceOf[DataType]
    
    /**
      * Looks up the type with the given name and returns it.
      *
      * See {@link topic:ac56d92162ed47ff858fdf1ce26c18c4 Defining Control Properties} for a list of the built-in
      * primitive types and their semantics.
      *
      * The lookup consists of the following steps:
      * 	 - When a type with the given name is already known, it will be returned
      * 	 - When the name ends with a pair of brackets (`[]`), a type with the name in front of the brackets
      * 			(`name.slice(0,-2)`) will be looked up and an array type will be created with the looked-up type as its
      * 			component type. If the component type is `undefined`, `undefined` will be returned
      * 	 - When a global property exists with the same name as the type and when the value of that property
      * 			is an instance of `DataType`, that instance will be returned
      * 	 - When a global property exists with the same name as the type and when the value of that property
      * 			is a plain object (its prototype is `Object`), then an enum type will be created, based on the keys and
      * 			values in that object. The `parseValue` method of the type will accept any of the keys in the plain object
      * 			and convert them to the corresponding value; `isValid` will accept any of the values from the plain object's
      * 			keys. The `defaultValue` will be the value of the first key found in the plain object
      * 	 - When a global property exist with any other, non-falsy value, a warning is logged and the primitive
      * 			type 'any' is returned
      * 	 - If no such global property exist, an error is logged and `undefined` is returned
      *
      *  UI Libraries and even components can introduce additional types. This method only checks
      * for types that either have been defined already, or that describe arrays of values of an already defined
      * type or types whose name matches the global name of a plain object (containing enum keys and values).
      * This method doesn't try to load modules that might contain type definitions. So before being able to
      * lookup and use a specific type, the module containing its definition has to be loaded. For that reason
      * it is suggested that controls (or `ManagedObject` classes in general) declare a dependency to all modules
      * (typically `some/lib/library.js` modules) that contain the type definitions needed by the specific control
      * or class definition.
      *
      * @returns Type object or `undefined` when no such type has been defined yet
      */
    inline def getType(/**
      * Qualified name of the type to retrieve
      */
    sTypeName: String): js.UndefOr[DataType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(sTypeName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DataType]]
  }
  
  trait DataType extends StObject {
    
    /**
      * The base type of this type or undefined if this is a primitive type.
      *
      * @returns Base type or `undefined`
      */
    def getBaseType(): js.UndefOr[DataType]
    
    /**
      * Returns the component type of this type or `undefined` if this is not an array type.
      *
      * @returns Component type or `undefined`
      */
    def getComponentType(): js.UndefOr[DataType]
    
    /**
      * The default value for this type. Each type must define a default value.
      *
      * @returns Default value of the data type. The type of the returned value must match the JavaScript type
      * of the data type (a string for string types etc.)
      */
    def getDefaultValue(): Any
    
    /**
      * Returns the object with keys and values from which this enum type was created or `undefined` if this
      * is not an enum type.
      *
      * @returns Object with enum keys and values or `undefined`
      */
    def getEnumValues(): js.UndefOr[js.Object]
    
    /**
      * The qualified name of the data type.
      *
      * @returns Name of the data type
      */
    def getName(): String
    
    /**
      * Returns the most basic (primitive) type that this type has been derived from.
      *
      * If the type is a primitive type by itself, `this` is returned.
      *
      * @returns Primitive type of this type
      */
    def getPrimitiveType(): DataType
    
    /**
      * Whether this type is an array type.
      *
      * @returns Whether this type is an array type
      */
    def isArrayType(): Boolean
    
    /**
      * Whether this type is an enumeration type.
      *
      * @returns Whether this type is an enum type
      */
    def isEnumType(): Boolean
    
    /**
      * Checks whether the given value is valid for this type.
      *
      * To be implemented by concrete types.
      *
      * @returns Whether the given value is valid for this data type (without conversion)
      */
    def isValid(/**
      * Value to be checked
      */
    vValue: Any): Boolean
    
    /**
      * Normalizes the given value using the specified normalizer for this data type.
      *
      * If no normalizer has been set, the original value is returned.
      *
      * @returns Normalized value
      */
    def normalize(/**
      * Value to be normalized
      */
    oValue: Any): Any
    
    /**
      * Parses the given string value and converts it into the specific data type.
      *
      * @returns Value in the correct internal format
      */
    def parseValue(/**
      * String representation for a value of this type
      */
    sValue: String): Any
    
    /**
      * Set or unset a normalizer function to be used for values of this data type.
      *
      * When a normalizer function has been set, it will be applied to values of this type whenever {@link #normalize}
      * is called. `ManagedObject.prototype.setProperty` calls the `normalize` method before setting a new value
      * to a property (normalization is applied on-write, not on-read).
      *
      * The `fnNormalize` function has the signature
      * ```javascript
      *
      *   fnNormalize(value:any) : any
      * ```
      *  It will be called with a value for this type and should return a normalized value (which also must be
      * valid for the this type). There's no mean to reject a value. The `this` context of the function will
      * be this type.
      *
      * This method allows applications or application frameworks to plug-in a generic value normalization for
      * a type, e.g. to convert all URLs in some app-specific way before they are applied to controls. It is
      * not intended to break-out of the value range defined by a type.
      */
    def setNormalizer(/**
      * Function to apply for normalizing
      */
    fnNormalizer: js.Function): Unit
  }
  object DataType {
    
    inline def apply(
      getBaseType: () => js.UndefOr[DataType],
      getComponentType: () => js.UndefOr[DataType],
      getDefaultValue: () => Any,
      getEnumValues: () => js.UndefOr[js.Object],
      getName: () => String,
      getPrimitiveType: () => DataType,
      isArrayType: () => Boolean,
      isEnumType: () => Boolean,
      isValid: Any => Boolean,
      normalize: Any => Any,
      parseValue: String => Any,
      setNormalizer: js.Function => Unit
    ): DataType = {
      val __obj = js.Dynamic.literal(getBaseType = js.Any.fromFunction0(getBaseType), getComponentType = js.Any.fromFunction0(getComponentType), getDefaultValue = js.Any.fromFunction0(getDefaultValue), getEnumValues = js.Any.fromFunction0(getEnumValues), getName = js.Any.fromFunction0(getName), getPrimitiveType = js.Any.fromFunction0(getPrimitiveType), isArrayType = js.Any.fromFunction0(isArrayType), isEnumType = js.Any.fromFunction0(isEnumType), isValid = js.Any.fromFunction1(isValid), normalize = js.Any.fromFunction1(normalize), parseValue = js.Any.fromFunction1(parseValue), setNormalizer = js.Any.fromFunction1(setNormalizer))
      __obj.asInstanceOf[DataType]
    }
    
    extension [Self <: DataType](x: Self) {
      
      inline def setGetBaseType(value: () => js.UndefOr[DataType]): Self = StObject.set(x, "getBaseType", js.Any.fromFunction0(value))
      
      inline def setGetComponentType(value: () => js.UndefOr[DataType]): Self = StObject.set(x, "getComponentType", js.Any.fromFunction0(value))
      
      inline def setGetDefaultValue(value: () => Any): Self = StObject.set(x, "getDefaultValue", js.Any.fromFunction0(value))
      
      inline def setGetEnumValues(value: () => js.UndefOr[js.Object]): Self = StObject.set(x, "getEnumValues", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetPrimitiveType(value: () => DataType): Self = StObject.set(x, "getPrimitiveType", js.Any.fromFunction0(value))
      
      inline def setIsArrayType(value: () => Boolean): Self = StObject.set(x, "isArrayType", js.Any.fromFunction0(value))
      
      inline def setIsEnumType(value: () => Boolean): Self = StObject.set(x, "isEnumType", js.Any.fromFunction0(value))
      
      inline def setIsValid(value: Any => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
      
      inline def setNormalize(value: Any => Any): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
      
      inline def setParseValue(value: String => Any): Self = StObject.set(x, "parseValue", js.Any.fromFunction1(value))
      
      inline def setSetNormalizer(value: js.Function => Unit): Self = StObject.set(x, "setNormalizer", js.Any.fromFunction1(value))
    }
  }
}
