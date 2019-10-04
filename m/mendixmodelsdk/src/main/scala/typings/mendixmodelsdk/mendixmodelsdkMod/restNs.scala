package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "rest")
@js.native
object restNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-odata-services relevant section in reference guide}
    *
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.18.0: introduced
    */
  @js.native
  class ConsumedODataService protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.ConsumedODataService {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/cors-settings relevant section in reference guide}
    *
    * In version 7.18.0: introduced
    */
  @js.native
  class CorsConfiguration protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.CorsConfiguration {
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
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  @js.native
  class ODataAttribute protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.ODataAttribute {
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
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.18.0: introduced
    */
  @js.native
  class ODataEntity protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.ODataEntity {
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
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class ODataNavigationProperty protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.ODataNavigationProperty {
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
    * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
    */
  @js.native
  class PublishedODataService protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.PublishedODataService {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-odata-resource relevant section in reference guide}
    */
  @js.native
  class PublishedRestResource protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.PublishedRestResource {
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
    * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.6.0: introduced
    */
  @js.native
  class PublishedRestService protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.PublishedRestService {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/published-rest-operation relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @js.native
  class PublishedRestServiceOperation protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.PublishedRestServiceOperation {
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
    * See: {@link https://docs.mendix.com/refguide7/published-rest-resource relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @js.native
  class PublishedRestServiceResource protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.PublishedRestServiceResource {
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
  class RestAuthenticationType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.RestAuthenticationType
  
  /**
    * In version 7.11.0: removed experimental
    * In version 7.8.0: introduced
    */
  @js.native
  class RestOperationParameter protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.RestOperationParameter {
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
  class RestOperationParameterType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.restNs.RestOperationParameterType
  
  /* static members */
  @js.native
  object ConsumedODataService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates a new ConsumedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenRestMod.restNs.ConsumedODataService = js.native
  }
  
  /* static members */
  @js.native
  object CorsConfiguration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.CorsConfiguration = js.native
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * The new CorsConfiguration will be automatically stored in the 'corsConfiguration' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestService): typings.mendixmodelsdk.distGenRestMod.restNs.CorsConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object ODataAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.ODataAttribute = js.native
    /**
      * Creates and returns a new ODataAttribute instance in the SDK and on the server.
      * The new ODataAttribute will be automatically stored in the 'attributes' property
      * of the parent ODataEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenRestMod.restNs.ODataEntity): typings.mendixmodelsdk.distGenRestMod.restNs.ODataAttribute = js.native
  }
  
  /* static members */
  @js.native
  object ODataEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.ODataEntity = js.native
    /**
      * Creates and returns a new ODataEntity instance in the SDK and on the server.
      * The new ODataEntity will be automatically stored in the 'entities' property
      * of the parent ConsumedODataService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenRestMod.restNs.ConsumedODataService): typings.mendixmodelsdk.distGenRestMod.restNs.ODataEntity = js.native
  }
  
  /* static members */
  @js.native
  object ODataNavigationProperty extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.ODataNavigationProperty = js.native
    /**
      * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
      * The new ODataNavigationProperty will be automatically stored in the 'navigationProperties' property
      * of the parent ODataEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenRestMod.restNs.ODataEntity): typings.mendixmodelsdk.distGenRestMod.restNs.ODataNavigationProperty = js.native
  }
  
  /* static members */
  @js.native
  object PublishedODataService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedODataService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestResource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestResource = js.native
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * The new PublishedRestResource will be automatically stored in the 'resources' property
      * of the parent PublishedODataService element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenRestMod.restNs.PublishedODataService): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestResource = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates a new PublishedRestService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestService = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestServiceOperation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceOperation = js.native
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * The new PublishedRestServiceOperation will be automatically stored in the 'operations' property
      * of the parent PublishedRestServiceResource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceResource): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceOperation = js.native
  }
  
  /* static members */
  @js.native
  object PublishedRestServiceResource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceResource = js.native
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * The new PublishedRestServiceResource will be automatically stored in the 'resources' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestService): typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceResource = js.native
  }
  
  /* static members */
  @js.native
  object RestAuthenticationType extends js.Object {
    var Basic: typings.mendixmodelsdk.distGenRestMod.restNs.RestAuthenticationType = js.native
    var Microflow: typings.mendixmodelsdk.distGenRestMod.restNs.RestAuthenticationType = js.native
    var None: typings.mendixmodelsdk.distGenRestMod.restNs.RestAuthenticationType = js.native
    var Session: typings.mendixmodelsdk.distGenRestMod.restNs.RestAuthenticationType = js.native
  }
  
  /* static members */
  @js.native
  object RestOperationParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameter = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestServiceOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInPublishedRestServiceOperationUnderParameters(container: typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestServiceOperation): typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameter = js.native
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInPublishedRestServiceUnderParameters(container: typings.mendixmodelsdk.distGenRestMod.restNs.PublishedRestService): typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameter = js.native
  }
  
  /* static members */
  @js.native
  object RestOperationParameterType extends js.Object {
    var Body: typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameterType = js.native
    var Form: typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameterType = js.native
    var Header: typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameterType = js.native
    var Path: typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameterType = js.native
    var Query: typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameterType = js.native
  }
  
}

