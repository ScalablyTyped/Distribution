package typings.mendixmodelsdk.distGenMappingsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructuresNs.IJsonStructure
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.Element
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ElementType
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingElement
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingMicroflowCall
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingMicroflowParameter
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingEnum
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectMappingElement
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinition
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameter
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IImportedWebService
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.IXmlSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
    extends typings.mendixmodelsdk.distSdkInternalMod.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val children: IList[Element] = js.native
    val containerAsElement: Element = js.native
    val containerAsEntityMessageDefinition: EntityMessageDefinition = js.native
    val containerAsJsonStructure: JsonStructure = js.native
    var elementType: ElementType = js.native
    var errorMessage: String = js.native
    /**
      * In version 7.6.0: introduced
      */
    var exposedItemName: String = js.native
    var exposedName: String = js.native
    var fractionDigits: Double = js.native
    var isDefaultType: Boolean = js.native
    var maxLength: Double = js.native
    var maxOccurs: Double = js.native
    var minOccurs: Double = js.native
    @JSName("model")
    var model_Element: IModel = js.native
    var nillable: Boolean = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      */
    var path: String = js.native
    var primitiveType: XmlPrimitiveType = js.native
    var totalDigits: Double = js.native
    var warningMessage: String = js.native
  }
  
  @js.native
  class ElementType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  trait IMappingDocument extends IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.IMappingDocument because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  abstract class MappingDocument protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    var importedWebService: IImportedWebService | Null = js.native
    val importedWebServiceQualifiedName: String | Null = js.native
    /**
      * In version 6.4.0: introduced
      */
    var jsonStructure: IJsonStructure | Null = js.native
    val jsonStructureQualifiedName: String | Null = js.native
    /**
      * In version 7.6.0: introduced
      */
    var messageDefinition: IMessageDefinition | Null = js.native
    val messageDefinitionQualifiedName: String | Null = js.native
    var operationName: String = js.native
    /**
      * In version 7.14.0: introduced
      */
    var publicName: String = js.native
    var rootElementName: String = js.native
    val rootMappingElements: IList[ObjectMappingElement] = js.native
    var serviceName: String = js.native
    var xmlSchema: IXmlSchema | Null = js.native
    val xmlSchemaQualifiedName: String | Null = js.native
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMappingDocument: MappingDocument = js.native
    val containerAsObjectMappingElement: ObjectMappingElement = js.native
    var documentation: String = js.native
    var elementType: ElementType = js.native
    /**
      * In version 6.6.0: introduced
      */
    var exposedName: String = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var jsonPath: String = js.native
    var maxOccurs: Double = js.native
    var minOccurs: Double = js.native
    @JSName("model")
    var model_MappingElement: IModel = js.native
    var nillable: Boolean = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: deleted
      */
    var path: String = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var xmlPath: String = js.native
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsObjectMappingElement: ObjectMappingElement = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    @JSName("model")
    var model_MappingMicroflowCall: IModel = js.native
    val parameterMappings: IList[MappingMicroflowParameter] = js.native
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMappingMicroflowCall: MappingMicroflowCall = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var jsonValueElementPath: String = js.native
    var levelOfParent: Double = js.native
    @JSName("model")
    var model_MappingMicroflowParameter: IModel = js.native
    var parameter: IMicroflowParameter | Null = js.native
    val parameterQualifiedName: String | Null = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: deleted
      */
    var valueElementPath: String = js.native
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      *
      * In version 7.6.0: introduced
      */
    var xmlValueElementPath: String = js.native
  }
  
  @js.native
  class ObjectHandlingBackupEnum () extends AbstractEnum
  
  @js.native
  class ObjectHandlingEnum () extends AbstractEnum
  
  @js.native
  abstract class ObjectMappingElement protected () extends MappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase | Null = js.native
    val associationQualifiedName: String | Null = js.native
    val children: IList[MappingElement] = js.native
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
    /**
      * In version 6.4.0: introduced
      */
    var isDefaultType: Boolean = js.native
    var mappingMicroflowCall: MappingMicroflowCall | Null = js.native
    var objectHandling: ObjectHandlingEnum = js.native
    var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackupAllowOverride: Boolean = js.native
  }
  
  @js.native
  abstract class ValueMappingElement protected () extends MappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attribute: IAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
    var converter: IMicroflow | Null = js.native
    val converterQualifiedName: String | Null = js.native
    /**
      * In version 6.4.1: deleted
      */
    var expectedContentTypes: String = js.native
    var fractionDigits: Double = js.native
    var isContent: Boolean = js.native
    var isKey: Boolean = js.native
    var isXmlAttribute: Boolean = js.native
    var maxLength: Double = js.native
    var totalDigits: Double = js.native
    /**
      * In version 7.9.0: introduced
      */
    var `type`: DataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var xmlDataType: String = js.native
    /**
      * In version 6.1.0: introduced
      */
    var xmlPrimitiveType: XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object Element extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ElementType extends js.Object {
    var All: ElementType = js.native
    var Array: ElementType = js.native
    var Choice: ElementType = js.native
    var Inheritance: ElementType = js.native
    var NamedArray: ElementType = js.native
    var Object: ElementType = js.native
    var Sequence: ElementType = js.native
    var Undefined: ElementType = js.native
    var Value: ElementType = js.native
    var Wrapper: ElementType = js.native
  }
  
  /* static members */
  @js.native
  object MappingDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MappingMicroflowCall = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: ObjectMappingElement): MappingMicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MappingMicroflowParameter = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: MappingMicroflowCall): MappingMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: ObjectHandlingBackupEnum = js.native
    var Error: ObjectHandlingBackupEnum = js.native
    var Ignore: ObjectHandlingBackupEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: ObjectHandlingEnum = js.native
    var Custom: ObjectHandlingEnum = js.native
    var Find: ObjectHandlingEnum = js.native
    var Parameter: ObjectHandlingEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
}

