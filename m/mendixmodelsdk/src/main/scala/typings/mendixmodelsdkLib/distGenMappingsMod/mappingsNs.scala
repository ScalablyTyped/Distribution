package typings
package mendixmodelsdkLib.distGenMappingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings")
@js.native
object mappingsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  abstract class Element protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val children: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Element] = js.native
    val containerAsElement: Element = js.native
    val containerAsEntityMessageDefinition: mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition = js.native
    val containerAsJsonStructure: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure = js.native
    var elementType: ElementType = js.native
    var errorMessage: java.lang.String = js.native
    /**
      * In version 7.6.0: introduced
      */
    var exposedItemName: java.lang.String = js.native
    var exposedName: java.lang.String = js.native
    var fractionDigits: scala.Double = js.native
    var isDefaultType: scala.Boolean = js.native
    var maxLength: scala.Double = js.native
    var maxOccurs: scala.Double = js.native
    var minOccurs: scala.Double = js.native
    @JSName("model")
    var model_Element: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var nillable: scala.Boolean = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      */
    var path: java.lang.String = js.native
    var primitiveType: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var totalDigits: scala.Double = js.native
    var warningMessage: java.lang.String = js.native
  }
  
  @js.native
  class ElementType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  trait IMappingDocument
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMappingsMod.mappingsNs.IMappingDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class MappingDocument protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var importedWebService: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IImportedWebService | scala.Null = js.native
    val importedWebServiceQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 6.4.0: introduced
      */
    var jsonStructure: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.IJsonStructure | scala.Null = js.native
    val jsonStructureQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 7.6.0: introduced
      */
    var messageDefinition: mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinition | scala.Null = js.native
    val messageDefinitionQualifiedName: java.lang.String | scala.Null = js.native
    var operationName: java.lang.String = js.native
    /**
      * In version 7.14.0: introduced
      */
    var publicName: java.lang.String = js.native
    var rootElementName: java.lang.String = js.native
    val rootMappingElements: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ObjectMappingElement] = js.native
    var serviceName: java.lang.String = js.native
    var xmlSchema: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.IXmlSchema | scala.Null = js.native
    val xmlSchemaQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMappingDocument: MappingDocument = js.native
    val containerAsObjectMappingElement: ObjectMappingElement = js.native
    var documentation: java.lang.String = js.native
    var elementType: ElementType = js.native
    /**
      * In version 6.6.0: introduced
      */
    var exposedName: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var jsonPath: java.lang.String = js.native
    var maxOccurs: scala.Double = js.native
    var minOccurs: scala.Double = js.native
    @JSName("model")
    var model_MappingElement: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var nillable: scala.Boolean = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: deleted
      */
    var path: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var xmlPath: java.lang.String = js.native
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsObjectMappingElement: ObjectMappingElement = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_MappingMicroflowCall: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MappingMicroflowParameter] = js.native
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMappingMicroflowCall: MappingMicroflowCall = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var jsonValueElementPath: java.lang.String = js.native
    var levelOfParent: scala.Double = js.native
    @JSName("model")
    var model_MappingMicroflowParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameter: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameter | scala.Null = js.native
    val parameterQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: deleted
      */
    var valueElementPath: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var xmlValueElementPath: java.lang.String = js.native
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  abstract class ObjectMappingElement protected () extends MappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase | scala.Null = js.native
    val associationQualifiedName: java.lang.String | scala.Null = js.native
    val children: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MappingElement] = js.native
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 6.4.0: introduced
      */
    var isDefaultType: scala.Boolean = js.native
    var mappingMicroflowCall: MappingMicroflowCall | scala.Null = js.native
    var objectHandling: ObjectHandlingEnum = js.native
    var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackupAllowOverride: scala.Boolean = js.native
  }
  
  @js.native
  abstract class ValueMappingElement protected () extends MappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
    var converter: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val converterQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 6.4.1: deleted
      */
    var expectedContentTypes: java.lang.String = js.native
    var fractionDigits: scala.Double = js.native
    var isContent: scala.Boolean = js.native
    var isKey: scala.Boolean = js.native
    var isXmlAttribute: scala.Boolean = js.native
    var maxLength: scala.Double = js.native
    var totalDigits: scala.Double = js.native
    /**
      * In version 7.9.0: introduced
      */
    var `type`: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var xmlDataType: java.lang.String = js.native
    /**
      * In version 6.1.0: introduced
      */
    var xmlPrimitiveType: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object Element extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ElementType extends js.Object {
    var All: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Array: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Choice: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Inheritance: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var NamedArray: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Object: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Sequence: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Undefined: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Value: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
    var Wrapper: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ElementType = js.native
  }
  
  /* static members */
  @js.native
  object MappingDocument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowCall extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowCall = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowParameter = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowCall): mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    var Error: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    var Ignore: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Custom: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Find: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
    var Parameter: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValueMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMappingsMod.StructureVersionInfo = js.native
  }
  
}

