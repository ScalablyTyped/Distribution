package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.Msd
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices")
@js.native
object webservicesNs extends js.Object {
  @js.native
  class AppServiceState ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.AppServiceState
  
  @js.native
  class DataAssociation protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.DataAssociation {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class DataAttribute protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.DataAttribute {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class DataEntity protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.DataEntity {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class DataEntityBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.DataEntityBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `WebServices`.
    */
  @js.native
  abstract class DataMember protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.DataMember {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class HeaderAuthentication ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.HeaderAuthentication
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-web-services relevant section in reference guide}
    */
  @js.native
  class ImportedWebService protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.ImportedWebService {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class OperationInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.OperationInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class PartEncoding protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.PartEncoding {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-app-services relevant section in reference guide}
    */
  @js.native
  class PublishedAppService protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.PublishedAppService {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class PublishedOperation protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.PublishedOperation {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class PublishedParameter protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.PublishedParameter {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class PublishedResource protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.PublishedResource {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class PublishedServiceBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.PublishedServiceBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  @js.native
  class PublishedWebService protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.PublishedWebService {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class RpcMessagePartElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.RpcMessagePartElement {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class RpcOperationElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.RpcOperationElement {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ServiceInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.ServiceInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class SoapVersion ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.SoapVersion
  
  /**
    * In version 6.7.0: introduced
    */
  @js.native
  class SystemIdDataAttribute protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.SystemIdDataAttribute {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
    */
  @js.native
  class VersionedService protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.VersionedService {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class WsdlDescription protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.WsdlDescription {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class WsdlEntry protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservicesNs.WsdlEntry {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object AppServiceState extends js.Object {
    var Consumable: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.AppServiceState = js.native
    var Deprecated: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.AppServiceState = js.native
    var Draft: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.AppServiceState = js.native
  }
  
  /* static members */
  @js.native
  object DataAssociation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAssociation = js.native
    /**
      * Creates and returns a new DataAssociation instance in the SDK and on the server.
      * The new DataAssociation will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntityBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAssociation = js.native
  }
  
  /* static members */
  @js.native
  object DataAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAttribute = js.native
    /**
      * Creates and returns a new DataAttribute instance in the SDK and on the server.
      * The new DataAttribute will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntityBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object DataEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      */
    def createInDataEntityBaseUnderChildMembers(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntityBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'dataEntity' property
      * of the parent PublishedParameter element passed as argument.
      */
    def createInPublishedParameterUnderDataEntity(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedParameter): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntity = js.native
    /**
      * Creates and returns a new DataEntity instance in the SDK and on the server.
      * The new DataEntity will be automatically stored in the 'dataEntity' property
      * of the parent PublishedResource element passed as argument.
      */
    def createInPublishedResourceUnderDataEntity(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedResource): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntity = js.native
  }
  
  /* static members */
  @js.native
  object DataEntityBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DataMember extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object HeaderAuthentication extends js.Object {
    var Custom: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.HeaderAuthentication = js.native
    var None: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.HeaderAuthentication = js.native
    var UsernamePassword: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.HeaderAuthentication = js.native
  }
  
  /* static members */
  @js.native
  object ImportedWebService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImportedWebService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.ImportedWebService = js.native
  }
  
  /* static members */
  @js.native
  object OperationInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OperationInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo = js.native
    /**
      * Creates and returns a new OperationInfo instance in the SDK and on the server.
      * The new OperationInfo will be automatically stored in the 'operations' property
      * of the parent ServiceInfo element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.ServiceInfo): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo = js.native
  }
  
  /* static members */
  @js.native
  object PartEncoding extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PartEncoding = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestBodyPartEncodings(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PartEncoding = js.native
    /**
      * Creates and returns a new PartEncoding instance in the SDK and on the server.
      * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestHeaderPartEncoding(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PartEncoding = js.native
  }
  
  /* static members */
  @js.native
  object PublishedAppService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedAppService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedAppService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedOperation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedOperation = js.native
    /**
      * Creates and returns a new PublishedOperation instance in the SDK and on the server.
      * The new PublishedOperation will be automatically stored in the 'operations' property
      * of the parent VersionedService element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.VersionedService): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedOperation = js.native
  }
  
  /* static members */
  @js.native
  object PublishedParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedParameter = js.native
    /**
      * Creates and returns a new PublishedParameter instance in the SDK and on the server.
      * The new PublishedParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedOperation element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedOperation): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedParameter = js.native
  }
  
  /* static members */
  @js.native
  object PublishedResource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object PublishedServiceBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object PublishedWebService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedWebService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedWebService = js.native
  }
  
  /* static members */
  @js.native
  object RpcMessagePartElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcMessagePartElement = js.native
    /**
      * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
      * The new RpcMessagePartElement will be automatically stored in the 'messagePartElements' property
      * of the parent RpcOperationElement element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcOperationElement): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcMessagePartElement = js.native
  }
  
  /* static members */
  @js.native
  object RpcOperationElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestBodyRpcElement(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderRequestHeaderRpcElement(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
    /**
      * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
      * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
      * of the parent OperationInfo element passed as argument.
      */
    def createInOperationInfoUnderResponseBodyRpcElement(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.OperationInfo): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.RpcOperationElement = js.native
  }
  
  /* static members */
  @js.native
  object ServiceInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ServiceInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.ServiceInfo = js.native
    /**
      * Creates and returns a new ServiceInfo instance in the SDK and on the server.
      * The new ServiceInfo will be automatically stored in the 'services' property
      * of the parent WsdlDescription element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.ServiceInfo = js.native
  }
  
  /* static members */
  @js.native
  object SoapVersion extends js.Object {
    var Soap11: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.SoapVersion = js.native
    var Soap12: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.SoapVersion = js.native
  }
  
  /* static members */
  @js.native
  object SystemIdDataAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.SystemIdDataAttribute = js.native
    /**
      * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
      * The new SystemIdDataAttribute will be automatically stored in the 'childMembers' property
      * of the parent DataEntityBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataEntityBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.SystemIdDataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object VersionedService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new VersionedService instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.VersionedService = js.native
    /**
      * Creates and returns a new VersionedService instance in the SDK and on the server.
      * The new VersionedService will be automatically stored in the 'versionedServices' property
      * of the parent PublishedServiceBase element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedServiceBase): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.VersionedService = js.native
  }
  
  /* static members */
  @js.native
  object WsdlDescription extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
      * of the parent ImportedWebService element passed as argument.
      */
    def createInImportedWebServiceUnderWsdlDescription(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.ImportedWebService): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
    /**
      * Creates and returns a new WsdlDescription instance in the SDK and on the server.
      * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
      * of the parent appservices.Msd element passed as argument.
      */
    def createInMsdUnderWsdlDescription(container: Msd): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
  }
  
  /* static members */
  @js.native
  object WsdlEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WsdlEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlEntry = js.native
    /**
      * Creates and returns a new WsdlEntry instance in the SDK and on the server.
      * The new WsdlEntry will be automatically stored in the 'wsdlEntries' property
      * of the parent WsdlDescription element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription): typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlEntry = js.native
  }
  
}

