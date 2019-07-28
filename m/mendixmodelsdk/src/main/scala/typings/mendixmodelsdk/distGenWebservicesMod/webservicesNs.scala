package typings.mendixmodelsdk.distGenWebservicesMod

import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.Msd
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdAssociation
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdAttribute
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdEnumerationContainer
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdMicroflowParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.IImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameter
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenRestMod.restNs.PublishedODataService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.AppServiceState
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAssociation
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAttribute
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntity
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntityBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataMember
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.HeaderAuthentication
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IPublishedServiceBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.ImportedWebService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PartEncoding
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedAppService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedOperation
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedParameter
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedResource
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedServiceBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedWebService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcMessagePartElement
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcOperationElement
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.ServiceInfo
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.SoapVersion
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.SystemIdDataAttribute
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.VersionedService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlEntry
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices")
@js.native
object webservicesNs extends js.Object {
  @js.native
  class AppServiceState () extends AbstractEnum
  
  @js.native
  class DataAssociation protected () extends DataEntityBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase | Null = js.native
    var associationByContract: MsdAssociation | Null = js.native
    val associationQualifiedName: String | Null = js.native
    /**
      * In version 8.0.0: introduced
      */
    var exposedAssociationName: String = js.native
  }
  
  @js.native
  class DataAttribute protected () extends DataMember {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attribute: IAttribute | Null = js.native
    var attributeByContract: MsdAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
  }
  
  @js.native
  class DataEntity protected () extends DataEntityBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class DataEntityBase protected () extends DataMember {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val childMembers: IList[DataMember] = js.native
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
    var exposedItemName: String = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `WebServices`.
    */
  @js.native
  abstract class DataMember protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDataEntityBase: DataEntityBase = js.native
    val containerAsPublishedParameter: PublishedParameter = js.native
    val containerAsPublishedResource: PublishedResource = js.native
    var exposedName: String = js.native
    var isKey: Boolean = js.native
    var isLockedByContract: Boolean = js.native
    var isNillable: Boolean = js.native
    var isNillableByContract: Boolean = js.native
    var isOptional: Boolean = js.native
    var isOptionalByContract: Boolean = js.native
    @JSName("model")
    var model_DataMember: IModel = js.native
  }
  
  @js.native
  class HeaderAuthentication () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-web-services relevant section in reference guide}
    */
  @js.native
  trait IImportedWebService extends IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-app-services relevant section in reference guide}
    */
  @js.native
  trait IPublishedAppService extends IPublishedServiceBase
  
  @js.native
  trait IPublishedServiceBase extends IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  @js.native
  trait IPublishedWebService extends IPublishedServiceBase
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-web-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IImportedWebService because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class ImportedWebService protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * In version 6.4.1: introduced
      */
    var useMtom: Boolean = js.native
    var wsdlDescription: WsdlDescription | Null = js.native
    var wsdlUrl: String = js.native
  }
  
  @js.native
  class OperationInfo protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 6.1.0: deleted
      */
    var allowSimpleMappingInheritance: Boolean = js.native
    val containerAsServiceInfo: ServiceInfo = js.native
    var documentation: String = js.native
    @JSName("model")
    var model_OperationInfo: IModel = js.native
    var name: String = js.native
    var requestBodyElementName: String = js.native
    var requestBodyEncoded: Boolean = js.native
    val requestBodyPartEncodings: IList[PartEncoding] = js.native
    var requestBodyRpcElement: RpcOperationElement = js.native
    var requestHeaderElementName: String = js.native
    var requestHeaderEncoded: Boolean = js.native
    var requestHeaderPartEncoding: PartEncoding | Null = js.native
    var requestHeaderRpcElement: RpcOperationElement = js.native
    var responseBodyElementName: String = js.native
    var responseBodyRpcElement: RpcOperationElement = js.native
    var soapAction: String = js.native
  }
  
  @js.native
  class PartEncoding protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsOperationInfo: OperationInfo = js.native
    @JSName("model")
    var model_PartEncoding: IModel = js.native
    var partName: String = js.native
    var partXsdType: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-app-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IPublishedAppService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class PublishedAppService protected () extends PublishedServiceBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class PublishedOperation protected () extends PublishedResource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var description: String = js.native
    var documentation: String = js.native
    var entityExposedName: String = js.native
    var entityExposedNameByContract: String = js.native
    var image: IImage | Null = js.native
    val imageQualifiedName: String | Null = js.native
    var isLockedByContract: Boolean = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    var name: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var operationReturnType: DataType = js.native
    val parameters: IList[PublishedParameter] = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var returnType: String = js.native
    var returnTypeIsNillable: Boolean = js.native
    var returnTypeIsOptional: Boolean = js.native
    var returnTypeNameByContract: String = js.native
    var returnTypeSpecificationByContract: String = js.native
  }
  
  @js.native
  class PublishedParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsPublishedOperation: PublishedOperation = js.native
    var dataEntity: DataEntity = js.native
    var entityExposedItemName: String = js.native
    var entityExposedItemNameByContract: String = js.native
    var entityExposedName: String = js.native
    var isLockedByContract: Boolean = js.native
    var isNillable: Boolean = js.native
    var isOptional: Boolean = js.native
    var isOptionalByContract: Boolean = js.native
    @JSName("model")
    var model_PublishedParameter: IModel = js.native
    var parameter: IMicroflowParameter | Null = js.native
    var parameterByContract: MsdMicroflowParameter = js.native
    val parameterQualifiedName: String | Null = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: DataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: String = js.native
  }
  
  @js.native
  abstract class PublishedResource protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsPublishedODataService: PublishedODataService = js.native
    val containerAsVersionedService: VersionedService = js.native
    var dataEntity: DataEntity = js.native
    @JSName("model")
    var model_PublishedResource: IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IPublishedServiceBase because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  abstract class PublishedServiceBase protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val versionedServices: IList[VersionedService] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IPublishedWebService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class PublishedWebService protected () extends PublishedServiceBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class RpcMessagePartElement protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsRpcOperationElement: RpcOperationElement = js.native
    var elementName: String = js.native
    @JSName("model")
    var model_RpcMessagePartElement: IModel = js.native
    var partName: String = js.native
    var typeName: String = js.native
  }
  
  @js.native
  class RpcOperationElement protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsOperationInfo: OperationInfo = js.native
    val messagePartElements: IList[RpcMessagePartElement] = js.native
    @JSName("model")
    var model_RpcOperationElement: IModel = js.native
    var name: String = js.native
  }
  
  @js.native
  class ServiceInfo protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsWsdlDescription: WsdlDescription = js.native
    var documentation: String = js.native
    var location: String = js.native
    var locationConstant: IConstant | Null = js.native
    val locationConstantQualifiedName: String | Null = js.native
    @JSName("model")
    var model_ServiceInfo: IModel = js.native
    var name: String = js.native
    val operations: IList[OperationInfo] = js.native
    var portName: String = js.native
    var soapVersion: SoapVersion = js.native
  }
  
  @js.native
  class SoapVersion () extends AbstractEnum
  
  /**
    * In version 6.7.0: introduced
    */
  @js.native
  class SystemIdDataAttribute protected () extends DataMember {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  @js.native
  class VersionedService protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var appServiceState: AppServiceState = js.native
    var caption: String = js.native
    val containerAsPublishedServiceBase: PublishedServiceBase = js.native
    var description: String = js.native
    var documentation: String = js.native
    var enumerationsByContract: MsdEnumerationContainer | Null = js.native
    var headerAuthentication: HeaderAuthentication = js.native
    var headerImportMapping: IImportMapping | Null = js.native
    val headerImportMappingQualifiedName: String | Null = js.native
    var headerMicroflow: IMicroflow | Null = js.native
    val headerMicroflowQualifiedName: String | Null = js.native
    var image: IImage | Null = js.native
    val imageQualifiedName: String | Null = js.native
    var isLockedByContract: Boolean = js.native
    @JSName("model")
    var model_VersionedService: IModel = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
    val operations: IList[PublishedOperation] = js.native
    /**
      * In version 7.13.0: introduced
      */
    var optimizedXml: Boolean = js.native
    var targetNamespace: String = js.native
    var validate: Boolean = js.native
    var versionNumber: Double = js.native
  }
  
  @js.native
  class WsdlDescription protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsImportedWebService: ImportedWebService = js.native
    val containerAsMsd: Msd = js.native
    var importsHaveLocations: Boolean = js.native
    @JSName("model")
    var model_WsdlDescription: IModel = js.native
    val schemaEntries: IList[XmlSchemaEntry] = js.native
    val services: IList[ServiceInfo] = js.native
    var targetNamespace: String = js.native
    val wsdlEntries: IList[WsdlEntry] = js.native
  }
  
  @js.native
  class WsdlEntry protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsWsdlDescription: WsdlDescription = js.native
    var contents: String = js.native
    var localizedContentsFormat: String = js.native
    var localizedLocationFormat: String = js.native
    var location: String = js.native
    @JSName("model")
    var model_WsdlEntry: IModel = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceState extends js.Object {
    var Consumable: AppServiceState = js.native
    var Deprecated: AppServiceState = js.native
    var Draft: AppServiceState = js.native
  }
  
  /* static members */
  @js.native
  object DataAssociation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataAssociation = js.native
    /**
      * Creates and returns a new DataAssociation instance in the SDK and on the server.
      * The new DataAssociation will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createIn(container: DataEntityBase): DataAssociation = js.native
  }
  
  /* static members */
  @js.native
  object DataAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataAttribute = js.native
    /**
      * Creates and returns a new DataAttribute instance in the SDK and on the server.
      * The new DataAttribute will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createIn(container: DataEntityBase): DataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object DataEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createInDataEntityBaseUnderChildMembers(container: DataEntityBase): DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'dataEntity' property
      * of the parent PublishedParameter element passed as argument.
      */
    def createInPublishedParameterUnderDataEntity(container: PublishedParameter): DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'dataEntity' property
      * of the parent PublishedResource element passed as argument.
      */
    def createInPublishedResourceUnderDataEntity(container: PublishedResource): DataEntity = js.native
  }
  
  /* static members */
  @js.native
  object DataEntityBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DataMember extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object HeaderAuthentication extends js.Object {
    var Custom: HeaderAuthentication = js.native
    var None: HeaderAuthentication = js.native
    var UsernamePassword: HeaderAuthentication = js.native
  }
  
  /* static members */
  @js.native
  object ImportedWebService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ImportedWebService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): ImportedWebService = js.native
  }
  
  /* static members */
  @js.native
  object OperationInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new OperationInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): OperationInfo = js.native
    /**
      * Creates and returns a new OperationInfo instance in the SDK and on the server.
      * The new OperationInfo will be automatically stored in the 'operations' property
      * of the parent ServiceInfo element passed as argument.
      */
    def createIn(container: ServiceInfo): OperationInfo = js.native
  }
  
  /* static members */
  @js.native
  object PartEncoding extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PartEncoding = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestBodyPartEncodings(container: OperationInfo): PartEncoding = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestHeaderPartEncoding(container: OperationInfo): PartEncoding = js.native
  }
  
  /* static members */
  @js.native
  object PublishedAppService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new PublishedAppService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): PublishedAppService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedOperation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PublishedOperation = js.native
    /**
      * Creates and returns a new PublishedOperation instance in the SDK and on the server.
      * The new PublishedOperation will be automatically stored in the 'operations' property
      * of the parent VersionedService element passed as argument.
      */
    def createIn(container: VersionedService): PublishedOperation = js.native
  }
  
  /* static members */
  @js.native
  object PublishedParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PublishedParameter = js.native
    /**
      * Creates and returns a new PublishedParameter instance in the SDK and on the server.
      * The new PublishedParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedOperation element passed as argument.
      */
    def createIn(container: PublishedOperation): PublishedParameter = js.native
  }
  
  /* static members */
  @js.native
  object PublishedResource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object PublishedServiceBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object PublishedWebService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new PublishedWebService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): PublishedWebService = js.native
  }
  
  /* static members */
  @js.native
  object RpcMessagePartElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RpcMessagePartElement = js.native
    /**
      * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
      * The new RpcMessagePartElement will be automatically stored in the 'messagePartElements' property
      * of the parent RpcOperationElement element passed as argument.
      */
    def createIn(container: RpcOperationElement): RpcMessagePartElement = js.native
  }
  
  /* static members */
  @js.native
  object RpcOperationElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestBodyRpcElement(container: OperationInfo): RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestHeaderRpcElement(container: OperationInfo): RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderResponseBodyRpcElement(container: OperationInfo): RpcOperationElement = js.native
  }
  
  /* static members */
  @js.native
  object ServiceInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ServiceInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ServiceInfo = js.native
    /**
      * Creates and returns a new ServiceInfo instance in the SDK and on the server.
      * The new ServiceInfo will be automatically stored in the 'services' property
      * of the parent WsdlDescription element passed as argument.
      */
    def createIn(container: WsdlDescription): ServiceInfo = js.native
  }
  
  /* static members */
  @js.native
  object SoapVersion extends js.Object {
    var Soap11: SoapVersion = js.native
    var Soap12: SoapVersion = js.native
  }
  
  /* static members */
  @js.native
  object SystemIdDataAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): SystemIdDataAttribute = js.native
    /**
      * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
      * The new SystemIdDataAttribute will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 and higher
      */
    def createIn(container: DataEntityBase): SystemIdDataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object VersionedService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new VersionedService instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): VersionedService = js.native
    /**
      * Creates and returns a new VersionedService instance in the SDK and on the server.
      * The new VersionedService will be automatically stored in the 'versionedServices' property
      * of the parent PublishedServiceBase element passed as argument.
      */
    def createIn(container: PublishedServiceBase): VersionedService = js.native
  }
  
  /* static members */
  @js.native
  object WsdlDescription extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WsdlDescription = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
      * of the parent ImportedWebService element passed as argument.
      */
    def createInImportedWebServiceUnderWsdlDescription(container: ImportedWebService): WsdlDescription = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
      * of the parent appservices.Msd element passed as argument.
      */
    def createInMsdUnderWsdlDescription(container: Msd): WsdlDescription = js.native
  }
  
  /* static members */
  @js.native
  object WsdlEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WsdlEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WsdlEntry = js.native
    /**
      * Creates and returns a new WsdlEntry instance in the SDK and on the server.
      * The new WsdlEntry will be automatically stored in the 'wsdlEntries' property
      * of the parent WsdlDescription element passed as argument.
      */
    def createIn(container: WsdlDescription): WsdlEntry = js.native
  }
  
}

