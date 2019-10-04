package typings.mendixmodelsdk.distGenRestMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IRemoteEntitySourceDocument
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.RemoteEntitySourceDocument
import typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.IExportMapping
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.IImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CommitEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.HttpConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RequestProxyType
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenRestMod.restNs.ConsumedODataService
import typings.mendixmodelsdk.distGenRestMod.restNs.CorsConfiguration
import typings.mendixmodelsdk.distGenRestMod.restNs.ODataAttribute
import typings.mendixmodelsdk.distGenRestMod.restNs.ODataEntity
import typings.mendixmodelsdk.distGenRestMod.restNs.ODataNavigationProperty
import typings.mendixmodelsdk.distGenRestMod.restNs.PublishedODataService
import typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestResource
import typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestService
import typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceOperation
import typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceResource
import typings.mendixmodelsdk.distGenRestMod.restNs.RestAuthenticationType
import typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameter
import typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameterType
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleRole
import typings.mendixmodelsdk.distGenServicesMod.servicesNs.HttpMethod
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedResource
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/rest", "rest")
@js.native
object restNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-odata-services relevant section in reference guide}
    *
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.18.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenRestMod.restNs.IConsumedODataService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ConsumedODataService protected () extends RemoteEntitySourceDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val entities: IList[ODataEntity] = js.native
    /**
      * In version 8.0.0: introduced
      */
    var httpConfiguration: HttpConfiguration = js.native
    var metadata: String = js.native
    var metadataUrl: String = js.native
    var proxyHost: IConstant | Null = js.native
    val proxyHostQualifiedName: String | Null = js.native
    var proxyPassword: IConstant | Null = js.native
    val proxyPasswordQualifiedName: String | Null = js.native
    var proxyPort: IConstant | Null = js.native
    val proxyPortQualifiedName: String | Null = js.native
    var proxyType: RequestProxyType = js.native
    var proxyUsername: IConstant | Null = js.native
    val proxyUsernameQualifiedName: String | Null = js.native
    /**
      * In version 8.0.0: introduced
      */
    var serviceId: String = js.native
    /**
      * In version 8.0.0: introduced
      */
    var serviceName: String = js.native
    /**
      * In version 8.0.0: introduced
      */
    var version: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/cors-settings relevant section in reference guide}
    *
    * In version 7.18.0: introduced
    */
  @js.native
  class CorsConfiguration protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var allowAuthentication: Boolean = js.native
    var allowedOrigins: IConstant | Null = js.native
    val allowedOriginsQualifiedName: String | Null = js.native
    val containerAsPublishedRestService: PublishedRestService = js.native
    var maxAge: IConstant | Null = js.native
    val maxAgeQualifiedName: String | Null = js.native
    @JSName("model")
    var model_CorsConfiguration: IModel = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Rest`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-odata-services relevant section in reference guide}
    *
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.18.0: introduced
    */
  @js.native
  trait IConsumedODataService extends IRemoteEntitySourceDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
    */
  @js.native
  trait IPublishedODataService extends IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.6.0: introduced
    */
  @js.native
  trait IPublishedRestService extends IDocument
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  @js.native
  class ODataAttribute protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attribute: IAttribute = js.native
    val attributeQualifiedName: String = js.native
    val containerAsODataEntity: ODataEntity = js.native
    @JSName("model")
    var model_ODataAttribute: IModel = js.native
    var name: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.18.0: introduced
    */
  @js.native
  class ODataEntity protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: introduced
      */
    val attributes: IList[ODataAttribute] = js.native
    val containerAsConsumedODataService: ConsumedODataService = js.native
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
    /**
      * In version 7.19.0: introduced
      */
    var entitySet: String = js.native
    /**
      * In version 7.22.0: introduced
      */
    val keyNames: IList[String] = js.native
    @JSName("model")
    var model_ODataEntity: IModel = js.native
    var name: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.22.0: introduced
      */
    val navigationProperties: IList[ODataNavigationProperty] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class ODataNavigationProperty protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase = js.native
    val associationQualifiedName: String = js.native
    val containerAsODataEntity: ODataEntity = js.native
    @JSName("model")
    var model_ODataNavigationProperty: IModel = js.native
    var name: String = js.native
    var thisSideIsParent: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenRestMod.restNs.IPublishedODataService because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class PublishedODataService protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val allowedModuleRoles: IList[IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
    /**
      * In version 8.0.0: introduced
      */
    var authenticationMicroflow: IMicroflow | Null = js.native
    val authenticationMicroflowQualifiedName: String | Null = js.native
    /**
      * In version 8.0.0: introduced
      */
    val authenticationTypes: IList[RestAuthenticationType] = js.native
    var namespace: String = js.native
    var path: String = js.native
    /**
      * In version 7.19.0: introduced
      */
    var publishAssociations: Boolean = js.native
    val resources: IList[PublishedRestResource] = js.native
    /**
      * In version 8.0.0: introduced
      */
    var serviceName: String = js.native
    /**
      * In version 8.0.0: introduced
      */
    var version: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-odata-resource relevant section in reference guide}
    */
  @js.native
  class PublishedRestResource protected () extends PublishedResource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 8.0.0: introduced
      */
    var description: String = js.native
    /**
      * In version 7.19.0: introduced
      */
    var exposedName: String = js.native
    var pageSize: Double = js.native
    var path: String = js.native
    /**
      * In version 8.0.0: introduced
      */
    var summary: String = js.native
    var usePaging: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenRestMod.restNs.IPublishedRestService because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class PublishedRestService protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val allowedRoles: IList[IModuleRole] = js.native
    val allowedRolesQualifiedNames: js.Array[String] = js.native
    /**
      * In version 7.17.0: introduced
      */
    var authenticationMicroflow: IMicroflow | Null = js.native
    val authenticationMicroflowQualifiedName: String | Null = js.native
    /**
      * In version 7.13.0: deleted
      * In version 7.11.0: introduced
      */
    var authenticationType: RestAuthenticationType = js.native
    /**
      * In version 7.13.0: introduced
      */
    val authenticationTypes: IList[RestAuthenticationType] = js.native
    /**
      * In version 7.18.0: introduced
      */
    var corsConfiguration: CorsConfiguration | Null = js.native
    /**
      * In version 7.17.0: introduced
      */
    val parameters: IList[RestOperationParameter] = js.native
    var path: String = js.native
    /**
      * In version 7.7.0: introduced
      */
    val resources: IList[PublishedRestServiceResource] = js.native
    /**
      * In version 7.12.0: introduced
      */
    var serviceName: String = js.native
    /**
      * In version 7.12.0: introduced
      */
    var version: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-operation relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @js.native
  class PublishedRestServiceOperation protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.14.0: introduced
      */
    var commit: CommitEnum = js.native
    val containerAsPublishedRestServiceResource: PublishedRestServiceResource = js.native
    /**
      * In version 7.15.0: introduced
      */
    var deprecated: Boolean = js.native
    var documentation: String = js.native
    /**
      * In version 7.14.0: introduced
      */
    var exportMapping: IExportMapping | Null = js.native
    val exportMappingQualifiedName: String | Null = js.native
    var httpMethod: HttpMethod = js.native
    /**
      * In version 7.14.0: introduced
      */
    var importMapping: IImportMapping | Null = js.native
    val importMappingQualifiedName: String | Null = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    @JSName("model")
    var model_PublishedRestServiceOperation: IModel = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
    /**
      * In version 7.17.0: introduced
      */
    val parameters: IList[RestOperationParameter] = js.native
    var path: String = js.native
    var summary: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-resource relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @js.native
  class PublishedRestServiceResource protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsPublishedRestService: PublishedRestService = js.native
    var documentation: String = js.native
    @JSName("model")
    var model_PublishedRestServiceResource: IModel = js.native
    var name: String = js.native
    val operations: IList[PublishedRestServiceOperation] = js.native
  }
  
  @js.native
  class RestAuthenticationType () extends AbstractEnum
  
  /**
    * In version 7.11.0: removed experimental
    * In version 7.8.0: introduced
    */
  @js.native
  class RestOperationParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsPublishedRestService: PublishedRestService = js.native
    val containerAsPublishedRestServiceOperation: PublishedRestServiceOperation = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var dataType: String = js.native
    /**
      * In version 7.17.0: introduced
      */
    var microflowParameter: IMicroflowParameter | Null = js.native
    val microflowParameterQualifiedName: String | Null = js.native
    @JSName("model")
    var model_RestOperationParameter: IModel = js.native
    var name: String = js.native
    var parameterType: RestOperationParameterType = js.native
    /**
      * In version 7.17.0: introduced
      */
    var `type`: DataType = js.native
  }
  
  @js.native
  class RestOperationParameterType () extends AbstractEnum
  
  /* static members */
  @js.native
  object ConsumedODataService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ConsumedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): ConsumedODataService = js.native
  }
  
  /* static members */
  @js.native
  object CorsConfiguration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CorsConfiguration = js.native
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * The new CorsConfiguration will be automatically stored in the 'corsConfiguration' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 and higher
      */
    def createIn(container: PublishedRestService): CorsConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object ODataAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ODataAttribute = js.native
    /**
      * Creates and returns a new ODataAttribute instance in the SDK and on the server.
      * The new ODataAttribute will be automatically stored in the 'attributes' property
      * of the parent ODataEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: ODataEntity): ODataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object ODataEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ODataEntity = js.native
    /**
      * Creates and returns a new ODataEntity instance in the SDK and on the server.
      * The new ODataEntity will be automatically stored in the 'entities' property
      * of the parent ConsumedODataService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 and higher
      */
    def createIn(container: ConsumedODataService): ODataEntity = js.native
  }
  
  /* static members */
  @js.native
  object ODataNavigationProperty extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ODataNavigationProperty = js.native
    /**
      * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
      * The new ODataNavigationProperty will be automatically stored in the 'navigationProperties' property
      * of the parent ODataEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: ODataEntity): ODataNavigationProperty = js.native
  }
  
  /* static members */
  @js.native
  object PublishedODataService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new PublishedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): PublishedODataService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestResource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PublishedRestResource = js.native
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * The new PublishedRestResource will be automatically stored in the 'resources' property
      * of the parent PublishedODataService element passed as argument.
      */
    def createIn(container: PublishedODataService): PublishedRestResource = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new PublishedRestService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): PublishedRestService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestServiceOperation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PublishedRestServiceOperation = js.native
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * The new PublishedRestServiceOperation will be automatically stored in the 'operations' property
      * of the parent PublishedRestServiceResource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    def createIn(container: PublishedRestServiceResource): PublishedRestServiceOperation = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestServiceResource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PublishedRestServiceResource = js.native
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * The new PublishedRestServiceResource will be automatically stored in the 'resources' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    def createIn(container: PublishedRestService): PublishedRestServiceResource = js.native
  }
  
  /* static members */
  @js.native
  object RestAuthenticationType extends js.Object {
    var Basic: RestAuthenticationType = js.native
    var Microflow: RestAuthenticationType = js.native
    var None: RestAuthenticationType = js.native
    var Session: RestAuthenticationType = js.native
  }
  
  /* static members */
  @js.native
  object RestOperationParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RestOperationParameter = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestServiceOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInPublishedRestServiceOperationUnderParameters(container: PublishedRestServiceOperation): RestOperationParameter = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInPublishedRestServiceUnderParameters(container: PublishedRestService): RestOperationParameter = js.native
  }
  
  /* static members */
  @js.native
  object RestOperationParameterType extends js.Object {
    var Body: RestOperationParameterType = js.native
    var Form: RestOperationParameterType = js.native
    var Header: RestOperationParameterType = js.native
    var Path: RestOperationParameterType = js.native
    var Query: RestOperationParameterType = js.native
  }
  
}

