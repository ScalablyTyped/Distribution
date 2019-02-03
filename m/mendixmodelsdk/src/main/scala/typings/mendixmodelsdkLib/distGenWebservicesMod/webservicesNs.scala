package typings
package mendixmodelsdkLib.distGenWebservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices")
@js.native
object webservicesNs extends js.Object {
  @js.native
  class AppServiceState ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class DataAssociation protected () extends DataEntityBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase | scala.Null = js.native
    var associationByContract: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAssociation | scala.Null = js.native
    val associationQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class DataAttribute protected () extends DataMember {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    var attributeByContract: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class DataEntity protected () extends DataEntityBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class DataEntityBase protected () extends DataMember {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val childMembers: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataMember] = js.native
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
    var exposedItemName: java.lang.String = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `WebServices`.
    */
  @js.native
  abstract class DataMember protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDataEntityBase: DataEntityBase = js.native
    val containerAsPublishedParameter: PublishedParameter = js.native
    val containerAsPublishedResource: PublishedResource = js.native
    var exposedName: java.lang.String = js.native
    var isKey: scala.Boolean = js.native
    var isLockedByContract: scala.Boolean = js.native
    var isNillable: scala.Boolean = js.native
    var isNillableByContract: scala.Boolean = js.native
    var isOptional: scala.Boolean = js.native
    var isOptionalByContract: scala.Boolean = js.native
    @JSName("model")
    var model_DataMember: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class HeaderAuthentication ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-web-services relevant section in reference guide}
    */
  @js.native
  trait IImportedWebService
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-app-services relevant section in reference guide}
    */
  @js.native
  trait IPublishedAppService extends IPublishedServiceBase
  
  @js.native
  trait IPublishedServiceBase
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  @js.native
  trait IPublishedWebService extends IPublishedServiceBase
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-web-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IImportedWebService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class ImportedWebService protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * In version 6.4.1: introduced
      */
    var useMtom: scala.Boolean = js.native
    var wsdlDescription: WsdlDescription | scala.Null = js.native
    var wsdlUrl: java.lang.String = js.native
  }
  
  @js.native
  class OperationInfo protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 6.1.0: deleted
      */
    var allowSimpleMappingInheritance: scala.Boolean = js.native
    val containerAsServiceInfo: ServiceInfo = js.native
    var documentation: java.lang.String = js.native
    @JSName("model")
    var model_OperationInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var requestBodyElementName: java.lang.String = js.native
    var requestBodyEncoded: scala.Boolean = js.native
    val requestBodyPartEncodings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[PartEncoding] = js.native
    var requestBodyRpcElement: RpcOperationElement = js.native
    var requestHeaderElementName: java.lang.String = js.native
    var requestHeaderEncoded: scala.Boolean = js.native
    var requestHeaderPartEncoding: PartEncoding | scala.Null = js.native
    var requestHeaderRpcElement: RpcOperationElement = js.native
    var responseBodyElementName: java.lang.String = js.native
    var responseBodyRpcElement: RpcOperationElement = js.native
    var soapAction: java.lang.String = js.native
  }
  
  @js.native
  class PartEncoding protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsOperationInfo: OperationInfo = js.native
    @JSName("model")
    var model_PartEncoding: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var partName: java.lang.String = js.native
    var partXsdType: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-app-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IPublishedAppService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class PublishedAppService protected () extends PublishedServiceBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  @js.native
  class PublishedOperation protected () extends PublishedResource {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var description: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    var entityExposedName: java.lang.String = js.native
    var entityExposedNameByContract: java.lang.String = js.native
    var image: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val imageQualifiedName: java.lang.String | scala.Null = js.native
    var isLockedByContract: scala.Boolean = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    var name: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var operationReturnType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[PublishedParameter] = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var returnType: java.lang.String = js.native
    var returnTypeIsNillable: scala.Boolean = js.native
    var returnTypeIsOptional: scala.Boolean = js.native
    var returnTypeNameByContract: java.lang.String = js.native
    var returnTypeSpecificationByContract: java.lang.String = js.native
  }
  
  @js.native
  class PublishedParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsPublishedOperation: PublishedOperation = js.native
    var dataEntity: DataEntity = js.native
    var entityExposedItemName: java.lang.String = js.native
    var entityExposedItemNameByContract: java.lang.String = js.native
    var entityExposedName: java.lang.String = js.native
    var isLockedByContract: scala.Boolean = js.native
    var isNillable: scala.Boolean = js.native
    var isOptional: scala.Boolean = js.native
    var isOptionalByContract: scala.Boolean = js.native
    @JSName("model")
    var model_PublishedParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameter: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameter | scala.Null = js.native
    var parameterByContract: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMicroflowParameter = js.native
    val parameterQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: java.lang.String = js.native
  }
  
  @js.native
  abstract class PublishedResource protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsPublishedODataService: mendixmodelsdkLib.distGenRestMod.restNs.PublishedODataService = js.native
    val containerAsVersionedService: VersionedService = js.native
    var dataEntity: DataEntity = js.native
    @JSName("model")
    var model_PublishedResource: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IPublishedServiceBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  abstract class PublishedServiceBase protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val versionedServices: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[VersionedService] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IPublishedWebService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class PublishedWebService protected () extends PublishedServiceBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  @js.native
  class RpcMessagePartElement protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsRpcOperationElement: RpcOperationElement = js.native
    var elementName: java.lang.String = js.native
    @JSName("model")
    var model_RpcMessagePartElement: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var partName: java.lang.String = js.native
    var typeName: java.lang.String = js.native
  }
  
  @js.native
  class RpcOperationElement protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsOperationInfo: OperationInfo = js.native
    val messagePartElements: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[RpcMessagePartElement] = js.native
    @JSName("model")
    var model_RpcOperationElement: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
  }
  
  @js.native
  class ServiceInfo protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsWsdlDescription: WsdlDescription = js.native
    var documentation: java.lang.String = js.native
    var location: java.lang.String = js.native
    var locationConstant: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val locationConstantQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_ServiceInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val operations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[OperationInfo] = js.native
    var portName: java.lang.String = js.native
    var soapVersion: SoapVersion = js.native
  }
  
  @js.native
  class SoapVersion ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * In version 6.7.0: introduced
    */
  @js.native
  class SystemIdDataAttribute protected () extends DataMember {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  @js.native
  class VersionedService protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var appServiceState: AppServiceState = js.native
    var caption: java.lang.String = js.native
    val containerAsPublishedServiceBase: PublishedServiceBase = js.native
    var description: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    var enumerationsByContract: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationContainer | scala.Null = js.native
    var headerAuthentication: HeaderAuthentication = js.native
    var headerImportMapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping | scala.Null = js.native
    val headerImportMappingQualifiedName: java.lang.String | scala.Null = js.native
    var headerMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val headerMicroflowQualifiedName: java.lang.String | scala.Null = js.native
    var image: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val imageQualifiedName: java.lang.String | scala.Null = js.native
    var isLockedByContract: scala.Boolean = js.native
    @JSName("model")
    var model_VersionedService: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackup: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    val operations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[PublishedOperation] = js.native
    /**
      * In version 7.13.0: introduced
      */
    var optimizedXml: scala.Boolean = js.native
    var targetNamespace: java.lang.String = js.native
    var validate: scala.Boolean = js.native
    var versionNumber: scala.Double = js.native
  }
  
  @js.native
  class WsdlDescription protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsImportedWebService: ImportedWebService = js.native
    val containerAsMsd: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd = js.native
    var importsHaveLocations: scala.Boolean = js.native
    @JSName("model")
    var model_WsdlDescription: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val schemaEntries: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry] = js.native
    val services: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ServiceInfo] = js.native
    var targetNamespace: java.lang.String = js.native
    val wsdlEntries: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[WsdlEntry] = js.native
  }
  
  @js.native
  class WsdlEntry protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsWsdlDescription: WsdlDescription = js.native
    var contents: java.lang.String = js.native
    var localizedContentsFormat: java.lang.String = js.native
    var localizedLocationFormat: java.lang.String = js.native
    var location: java.lang.String = js.native
    @JSName("model")
    var model_WsdlEntry: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceState extends js.Object {
    var Consumable: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.AppServiceState = js.native
    var Deprecated: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.AppServiceState = js.native
    var Draft: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.AppServiceState = js.native
  }
  
  /* static members */
  @js.native
  object DataAssociation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAssociation = js.native
    /**
      * Creates and returns a new DataAssociation instance in the SDK and on the server.
      * The new DataAssociation will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntityBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAssociation = js.native
  }
  
  /* static members */
  @js.native
  object DataAttribute extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAttribute = js.native
    /**
      * Creates and returns a new DataAttribute instance in the SDK and on the server.
      * The new DataAttribute will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntityBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object DataEntity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createInDataEntityBaseUnderChildMembers(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntityBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'dataEntity' property
      * of the parent PublishedParameter element passed as argument.
      */
    def createInPublishedParameterUnderDataEntity(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'dataEntity' property
      * of the parent PublishedResource element passed as argument.
      */
    def createInPublishedResourceUnderDataEntity(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedResource): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntity = js.native
  }
  
  /* static members */
  @js.native
  object DataEntityBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DataMember extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object HeaderAuthentication extends js.Object {
    var Custom: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.HeaderAuthentication = js.native
    var None: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.HeaderAuthentication = js.native
    var UsernamePassword: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.HeaderAuthentication = js.native
  }
  
  /* static members */
  @js.native
  object ImportedWebService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImportedWebService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.ImportedWebService = js.native
  }
  
  /* static members */
  @js.native
  object OperationInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OperationInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.OperationInfo = js.native
    /**
      * Creates and returns a new OperationInfo instance in the SDK and on the server.
      * The new OperationInfo will be automatically stored in the 'operations' property
      * of the parent ServiceInfo element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.ServiceInfo): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.OperationInfo = js.native
  }
  
  /* static members */
  @js.native
  object PartEncoding extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PartEncoding = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestBodyPartEncodings(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.OperationInfo): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PartEncoding = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestHeaderPartEncoding(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.OperationInfo): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PartEncoding = js.native
  }
  
  /* static members */
  @js.native
  object PublishedAppService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedAppService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedAppService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedOperation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation = js.native
    /**
      * Creates and returns a new PublishedOperation instance in the SDK and on the server.
      * The new PublishedOperation will be automatically stored in the 'operations' property
      * of the parent VersionedService element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.VersionedService): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation = js.native
  }
  
  /* static members */
  @js.native
  object PublishedParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter = js.native
    /**
      * Creates and returns a new PublishedParameter instance in the SDK and on the server.
      * The new PublishedParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedOperation element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter = js.native
  }
  
  /* static members */
  @js.native
  object PublishedResource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object PublishedServiceBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object PublishedWebService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedWebService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedWebService = js.native
  }
  
  /* static members */
  @js.native
  object RpcMessagePartElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.RpcMessagePartElement = js.native
    /**
      * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
      * The new RpcMessagePartElement will be automatically stored in the 'messagePartElements' property
      * of the parent RpcOperationElement element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.RpcOperationElement): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.RpcMessagePartElement = js.native
  }
  
  /* static members */
  @js.native
  object RpcOperationElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestBodyRpcElement(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.OperationInfo): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestHeaderRpcElement(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.OperationInfo): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderResponseBodyRpcElement(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.OperationInfo): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
  }
  
  /* static members */
  @js.native
  object ServiceInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ServiceInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.ServiceInfo = js.native
    /**
      * Creates and returns a new ServiceInfo instance in the SDK and on the server.
      * The new ServiceInfo will be automatically stored in the 'services' property
      * of the parent WsdlDescription element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.ServiceInfo = js.native
  }
  
  /* static members */
  @js.native
  object SoapVersion extends js.Object {
    var Soap11: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.SoapVersion = js.native
    var Soap12: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.SoapVersion = js.native
  }
  
  /* static members */
  @js.native
  object SystemIdDataAttribute extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.SystemIdDataAttribute = js.native
    /**
      * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
      * The new SystemIdDataAttribute will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataEntityBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.SystemIdDataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object VersionedService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new VersionedService instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.VersionedService = js.native
    /**
      * Creates and returns a new VersionedService instance in the SDK and on the server.
      * The new VersionedService will be automatically stored in the 'versionedServices' property
      * of the parent PublishedServiceBase element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedServiceBase): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.VersionedService = js.native
  }
  
  /* static members */
  @js.native
  object WsdlDescription extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
      * of the parent ImportedWebService element passed as argument.
      */
    def createInImportedWebServiceUnderWsdlDescription(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.ImportedWebService): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
      * of the parent appservices.Msd element passed as argument.
      */
    def createInMsdUnderWsdlDescription(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
  }
  
  /* static members */
  @js.native
  object WsdlEntry extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WsdlEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlEntry = js.native
    /**
      * Creates and returns a new WsdlEntry instance in the SDK and on the server.
      * The new WsdlEntry will be automatically stored in the 'wsdlEntries' property
      * of the parent WsdlDescription element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlEntry = js.native
  }
  
}

