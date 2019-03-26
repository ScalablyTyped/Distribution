package typings
package mendixmodelsdkLib.distGenRestMod

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
  - mendixmodelsdkLib.distGenRestMod.restNs.IConsumedODataService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ConsumedODataService protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val entities: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ODataEntity] = js.native
    var location: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val locationQualifiedName: java.lang.String | scala.Null = js.native
    var metadata: java.lang.String = js.native
    var metadataUrl: java.lang.String = js.native
    var proxyHost: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val proxyHostQualifiedName: java.lang.String | scala.Null = js.native
    var proxyPassword: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val proxyPasswordQualifiedName: java.lang.String | scala.Null = js.native
    var proxyPort: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val proxyPortQualifiedName: java.lang.String | scala.Null = js.native
    var proxyType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestProxyType = js.native
    var proxyUsername: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val proxyUsernameQualifiedName: java.lang.String | scala.Null = js.native
    var serviceUrl: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/cors-settings relevant section in reference guide}
    *
    * In version 7.18.0: introduced
    */
  @js.native
  class CorsConfiguration protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var allowAuthentication: scala.Boolean = js.native
    var allowedOrigins: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val allowedOriginsQualifiedName: java.lang.String | scala.Null = js.native
    val containerAsPublishedRestService: PublishedRestService = js.native
    var maxAge: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val maxAgeQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_CorsConfiguration: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
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
  trait IConsumedODataService
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
    */
  @js.native
  trait IPublishedODataService
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.6.0: introduced
    */
  @js.native
  trait IPublishedRestService
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.18.0: introduced
    */
  @js.native
  class ODataEntity protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsConsumedODataService: ConsumedODataService = js.native
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
    /**
      * In version 7.19.0: introduced
      */
    var entitySet: java.lang.String = js.native
    /**
      * In version 7.22.0: introduced
      */
    val keyNames: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[java.lang.String] = js.native
    @JSName("model")
    var model_ODataEntity: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.22.0: introduced
      */
    val navigationProperties: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ODataNavigationProperty] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class ODataNavigationProperty protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase = js.native
    val associationQualifiedName: java.lang.String = js.native
    val containerAsODataEntity: ODataEntity = js.native
    @JSName("model")
    var model_ODataNavigationProperty: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var thisSideIsParent: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenRestMod.restNs.IPublishedODataService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class PublishedODataService protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val allowedModuleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[java.lang.String] = js.native
    var namespace: java.lang.String = js.native
    var path: java.lang.String = js.native
    /**
      * In version 7.19.0: introduced
      */
    var publishAssociations: scala.Boolean = js.native
    val resources: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[PublishedRestResource] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-odata-resource relevant section in reference guide}
    */
  @js.native
  class PublishedRestResource protected ()
    extends mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedResource {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.19.0: introduced
      */
    var exposedName: java.lang.String = js.native
    var pageSize: scala.Double = js.native
    var path: java.lang.String = js.native
    var usePaging: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenRestMod.restNs.IPublishedRestService because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class PublishedRestService protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val allowedRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole] = js.native
    val allowedRolesQualifiedNames: js.Array[java.lang.String] = js.native
    /**
      * In version 7.17.0: introduced
      */
    var authenticationMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val authenticationMicroflowQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 7.13.0: deleted
      * In version 7.11.0: introduced
      */
    var authenticationType: RestAuthenticationType = js.native
    /**
      * In version 7.13.0: introduced
      */
    val authenticationTypes: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[RestAuthenticationType] = js.native
    /**
      * In version 7.18.0: introduced
      */
    var corsConfiguration: CorsConfiguration | scala.Null = js.native
    /**
      * In version 7.17.0: introduced
      */
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[RestOperationParameter] = js.native
    var path: java.lang.String = js.native
    /**
      * In version 7.7.0: introduced
      */
    val resources: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[PublishedRestServiceResource] = js.native
    /**
      * In version 7.12.0: introduced
      */
    var serviceName: java.lang.String = js.native
    /**
      * In version 7.12.0: introduced
      */
    var version: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-operation relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @js.native
  class PublishedRestServiceOperation protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.14.0: introduced
      */
    var commit: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CommitEnum = js.native
    val containerAsPublishedRestServiceResource: PublishedRestServiceResource = js.native
    /**
      * In version 7.15.0: introduced
      */
    var deprecated: scala.Boolean = js.native
    var documentation: java.lang.String = js.native
    /**
      * In version 7.14.0: introduced
      */
    var exportMapping: mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping | scala.Null = js.native
    val exportMappingQualifiedName: java.lang.String | scala.Null = js.native
    var httpMethod: mendixmodelsdkLib.distGenServicesMod.servicesNs.HttpMethod = js.native
    /**
      * In version 7.14.0: introduced
      */
    var importMapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping | scala.Null = js.native
    val importMappingQualifiedName: java.lang.String | scala.Null = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_PublishedRestServiceOperation: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackup: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    /**
      * In version 7.17.0: introduced
      */
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[RestOperationParameter] = js.native
    var path: java.lang.String = js.native
    var summary: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-resource relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @js.native
  class PublishedRestServiceResource protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsPublishedRestService: PublishedRestService = js.native
    var documentation: java.lang.String = js.native
    @JSName("model")
    var model_PublishedRestServiceResource: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val operations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[PublishedRestServiceOperation] = js.native
  }
  
  @js.native
  class RestAuthenticationType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * In version 7.11.0: removed experimental
    * In version 7.8.0: introduced
    */
  @js.native
  class RestOperationParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsPublishedRestService: PublishedRestService = js.native
    val containerAsPublishedRestServiceOperation: PublishedRestServiceOperation = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var dataType: java.lang.String = js.native
    /**
      * In version 7.17.0: introduced
      */
    var microflowParameter: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameter | scala.Null = js.native
    val microflowParameterQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_RestOperationParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var parameterType: RestOperationParameterType = js.native
    /**
      * In version 7.17.0: introduced
      */
    var `type`: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
  }
  
  @js.native
  class RestOperationParameterType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /* static members */
  @js.native
  object ConsumedODataService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates a new ConsumedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenRestMod.restNs.ConsumedODataService = js.native
  }
  
  /* static members */
  @js.native
  object CorsConfiguration extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenRestMod.restNs.CorsConfiguration = js.native
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * The new CorsConfiguration will be automatically stored in the 'corsConfiguration' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestService): mendixmodelsdkLib.distGenRestMod.restNs.CorsConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object ODataEntity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenRestMod.restNs.ODataEntity = js.native
    /**
      * Creates and returns a new ODataEntity instance in the SDK and on the server.
      * The new ODataEntity will be automatically stored in the 'entities' property
      * of the parent ConsumedODataService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenRestMod.restNs.ConsumedODataService): mendixmodelsdkLib.distGenRestMod.restNs.ODataEntity = js.native
  }
  
  /* static members */
  @js.native
  object ODataNavigationProperty extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenRestMod.restNs.ODataNavigationProperty = js.native
    /**
      * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
      * The new ODataNavigationProperty will be automatically stored in the 'navigationProperties' property
      * of the parent ODataEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenRestMod.restNs.ODataEntity): mendixmodelsdkLib.distGenRestMod.restNs.ODataNavigationProperty = js.native
  }
  
  /* static members */
  @js.native
  object PublishedODataService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenRestMod.restNs.PublishedODataService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestResource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestResource = js.native
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * The new PublishedRestResource will be automatically stored in the 'resources' property
      * of the parent PublishedODataService element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenRestMod.restNs.PublishedODataService): mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestResource = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedRestService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestServiceOperation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestServiceOperation = js.native
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * The new PublishedRestServiceOperation will be automatically stored in the 'operations' property
      * of the parent PublishedRestServiceResource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestServiceResource): mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestServiceOperation = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestServiceResource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestServiceResource = js.native
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * The new PublishedRestServiceResource will be automatically stored in the 'resources' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestService): mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestServiceResource = js.native
  }
  
  /* static members */
  @js.native
  object RestAuthenticationType extends js.Object {
    var Basic: mendixmodelsdkLib.distGenRestMod.restNs.RestAuthenticationType = js.native
    var Microflow: mendixmodelsdkLib.distGenRestMod.restNs.RestAuthenticationType = js.native
    var None: mendixmodelsdkLib.distGenRestMod.restNs.RestAuthenticationType = js.native
    var Session: mendixmodelsdkLib.distGenRestMod.restNs.RestAuthenticationType = js.native
  }
  
  /* static members */
  @js.native
  object RestOperationParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestServiceOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInPublishedRestServiceOperationUnderParameters(container: mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestServiceOperation): mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInPublishedRestServiceUnderParameters(container: mendixmodelsdkLib.distGenRestMod.restNs.PublishedRestService): mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter = js.native
  }
  
  /* static members */
  @js.native
  object RestOperationParameterType extends js.Object {
    var Body: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameterType = js.native
    var Header: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameterType = js.native
    var Path: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameterType = js.native
    var Query: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameterType = js.native
  }
  
}

