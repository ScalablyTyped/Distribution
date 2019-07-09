package typings
package mendixmodelsdkLib.distGenAppservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices")
@js.native
object appservicesNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceAction because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedAppService, name, parameters */ @js.native
  class AppServiceAction protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.9.0: introduced
      */
    var actionReturnType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    var caption: java.lang.String = js.native
    val containerAsConsumedAppService: ConsumedAppService | IConsumedAppService = js.native
    var description: java.lang.String = js.native
    var image: java.lang.String = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_AppServiceAction: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[AppServiceActionParameter | IAppServiceActionParameter] = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var returnType: java.lang.String = js.native
    var returnTypeCanBeEmpty: scala.Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, name */ @js.native
  class AppServiceActionParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var canBeEmpty: scala.Boolean = js.native
    val containerAsAppServiceAction: AppServiceAction | IAppServiceAction = js.native
    @JSName("model")
    var model_AppServiceActionParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: java.lang.String = js.native
  }
  
  @js.native
  class AppServiceLocationEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IConsumedAppService because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined actions */ @js.native
  class ConsumedAppService protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val actions: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[AppServiceAction | IAppServiceAction] = js.native
    var appServiceLocation: AppServiceLocationEnum = js.native
    var appStoreGuid: java.lang.String = js.native
    var appStoreVersion: java.lang.String = js.native
    var appStoreVersionGuid: java.lang.String = js.native
    var fromAppStore: scala.Boolean = js.native
    var locationConstant: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant | scala.Null = js.native
    val locationConstantQualifiedName: java.lang.String | scala.Null = js.native
    var msd: Msd = js.native
    var timeOut: scala.Double = js.native
    var useTimeOut: scala.Boolean = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `AppServices`.
    */
  @js.native
  trait IAppServiceAction
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsConsumedAppService: IConsumedAppService = js.native
    @JSName("model")
    val model_IAppServiceAction: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IAppServiceActionParameter] = js.native
  }
  
  @js.native
  trait IAppServiceActionParameter
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsAppServiceAction: IAppServiceAction = js.native
    @JSName("model")
    val model_IAppServiceActionParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
    */
  @js.native
  trait IConsumedAppService
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument {
    val actions: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IAppServiceAction] = js.native
  }
  
  @js.native
  class Msd protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsConsumedAppService: ConsumedAppService = js.native
    var domainModel: MsdDomainModel = js.native
    var enumerations: MsdEnumerationContainer = js.native
    var metadata: MsdMetadata = js.native
    @JSName("model")
    var model_Msd: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var version: MsdVersion = js.native
    var wsdl: java.lang.String = js.native
    var wsdlDescription: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
  }
  
  @js.native
  class MsdAssociation protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var associationKind: java.lang.String = js.native
    var associationOwner: java.lang.String = js.native
    var associationType: java.lang.String = js.native
    var childDeleteBehavior: java.lang.String = js.native
    var childEntityName: java.lang.String = js.native
    var childX: scala.Double = js.native
    var childY: scala.Double = js.native
    val containerAsDataAssociation: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAssociation = js.native
    val containerAsMsdDomainModel: MsdDomainModel = js.native
    var guid: java.lang.String = js.native
    @JSName("model")
    var model_MsdAssociation: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var parentDeleteBehavior: java.lang.String = js.native
    var parentEntityName: java.lang.String = js.native
    var parentX: scala.Double = js.native
    var parentY: scala.Double = js.native
  }
  
  @js.native
  class MsdAttribute protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attributeType: java.lang.String = js.native
    val containerAsDataAttribute: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAttribute = js.native
    val containerAsMsdEntity: MsdEntity = js.native
    var defaultValue: java.lang.String = js.native
    var enumerationName: java.lang.String = js.native
    var guid: java.lang.String = js.native
    var length: scala.Double = js.native
    @JSName("model")
    var model_MsdAttribute: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
  }
  
  @js.native
  class MsdDomainModel protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val associations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdAssociation] = js.native
    val containerAsMsd: Msd = js.native
    val entities: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdEntity] = js.native
    @JSName("model")
    var model_MsdDomainModel: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class MsdEntity protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val attributes: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdAttribute] = js.native
    val containerAsMsdDomainModel: MsdDomainModel = js.native
    var generalizationName: java.lang.String = js.native
    var guid: java.lang.String = js.native
    var locationX: scala.Double = js.native
    var locationY: scala.Double = js.native
    @JSName("model")
    var model_MsdEntity: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var persistable: scala.Boolean = js.native
  }
  
  @js.native
  class MsdEnumeration protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMsdEnumerationContainer: MsdEnumerationContainer = js.native
    var guid: java.lang.String = js.native
    @JSName("model")
    var model_MsdEnumeration: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val values: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdEnumerationValue] = js.native
  }
  
  @js.native
  class MsdEnumerationContainer protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMsd: Msd = js.native
    val containerAsVersionedService: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.VersionedService = js.native
    val enumerations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdEnumeration] = js.native
    @JSName("model")
    var model_MsdEnumerationContainer: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class MsdEnumerationValue protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMsdEnumeration: MsdEnumeration = js.native
    var guid: java.lang.String = js.native
    var image: java.lang.String = js.native
    @JSName("model")
    var model_MsdEnumerationValue: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val translations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdText] = js.native
  }
  
  @js.native
  class MsdMetadata protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
    val containerAsMsd: Msd = js.native
    var description: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    var headerAuthentication: java.lang.String = js.native
    var image: java.lang.String = js.native
    var instanceGuid: java.lang.String = js.native
    val microflows: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdMicroflow] = js.native
    @JSName("model")
    var model_MsdMetadata: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var publishDateTime: java.lang.String = js.native
    var serviceGuid: java.lang.String = js.native
    val supportedProtocols: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[java.lang.String] = js.native
    var version: scala.Double = js.native
    var versionGuid: java.lang.String = js.native
  }
  
  @js.native
  class MsdMicroflow protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMsdMetadata: MsdMetadata = js.native
    var description: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    var image: java.lang.String = js.native
    @JSName("model")
    var model_MsdMicroflow: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MsdMicroflowParameter] = js.native
    var returnType: java.lang.String = js.native
    var returnTypeCanBeEmpty: scala.Boolean = js.native
    var returnTypeSpecification: java.lang.String = js.native
    /**
      * In version 6.1.0: deleted
      */
    var systemEntityType: java.lang.String = js.native
  }
  
  @js.native
  class MsdMicroflowParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var canBeEmpty: scala.Boolean = js.native
    val containerAsMsdMicroflow: MsdMicroflow = js.native
    val containerAsPublishedParameter: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter = js.native
    @JSName("model")
    var model_MsdMicroflowParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    /**
      * In version 6.1.0: deleted
      */
    var systemEntityType: java.lang.String = js.native
    var `type`: java.lang.String = js.native
    var typeSpecification: java.lang.String = js.native
  }
  
  @js.native
  class MsdText protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
    val containerAsMsdEnumerationValue: MsdEnumerationValue = js.native
    var languageCode: java.lang.String = js.native
    @JSName("model")
    var model_MsdText: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class MsdVersion protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMsd: Msd = js.native
    @JSName("model")
    var model_MsdVersion: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var version: scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    /**
      * Creates and returns a new AppServiceAction instance in the SDK and on the server.
      * The new AppServiceAction will be automatically stored in the 'actions' property
      * of the parent ConsumedAppService element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.ConsumedAppService): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceActionParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    /**
      * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
      * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
      * of the parent AppServiceAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceLocationEnum extends js.Object {
    var Constant: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceLocationEnum = js.native
    var Default: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceLocationEnum = js.native
    var Parameter: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceLocationEnum = js.native
  }
  
  /* static members */
  @js.native
  object ConsumedAppService extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates a new ConsumedAppService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.ConsumedAppService = js.native
  }
  
  /* static members */
  @js.native
  object Msd extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Msd instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd = js.native
    /**
      * Creates and returns a new Msd instance in the SDK and on the server.
      * The new Msd will be automatically stored in the 'msd' property
      * of the parent ConsumedAppService element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.ConsumedAppService): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd = js.native
  }
  
  /* static members */
  @js.native
  object MsdAssociation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAssociation = js.native
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associationByContract' property
      * of the parent webservices.DataAssociation element passed as argument.
      */
    def createInDataAssociationUnderAssociationByContract(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAssociation): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAssociation = js.native
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associations' property
      * of the parent MsdDomainModel element passed as argument.
      */
    def createInMsdDomainModelUnderAssociations(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdDomainModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAssociation = js.native
  }
  
  /* static members */
  @js.native
  object MsdAttribute extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAttribute = js.native
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
      * of the parent webservices.DataAttribute element passed as argument.
      */
    def createInDataAttributeUnderAttributeByContract(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.DataAttribute): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAttribute = js.native
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributes' property
      * of the parent MsdEntity element passed as argument.
      */
    def createInMsdEntityUnderAttributes(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEntity): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdAttribute = js.native
  }
  
  /* static members */
  @js.native
  object MsdDomainModel extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdDomainModel = js.native
    /**
      * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
      * The new MsdDomainModel will be automatically stored in the 'domainModel' property
      * of the parent Msd element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdDomainModel = js.native
  }
  
  /* static members */
  @js.native
  object MsdEntity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEntity = js.native
    /**
      * Creates and returns a new MsdEntity instance in the SDK and on the server.
      * The new MsdEntity will be automatically stored in the 'entities' property
      * of the parent MsdDomainModel element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdDomainModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEntity = js.native
  }
  
  /* static members */
  @js.native
  object MsdEnumeration extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumeration = js.native
    /**
      * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
      * The new MsdEnumeration will be automatically stored in the 'enumerations' property
      * of the parent MsdEnumerationContainer element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationContainer): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumeration = js.native
  }
  
  /* static members */
  @js.native
  object MsdEnumerationContainer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationContainer = js.native
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
      * of the parent Msd element passed as argument.
      */
    def createInMsdUnderEnumerations(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationContainer = js.native
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
      * of the parent webservices.VersionedService element passed as argument.
      */
    def createInVersionedServiceUnderEnumerationsByContract(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.VersionedService): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationContainer = js.native
  }
  
  /* static members */
  @js.native
  object MsdEnumerationValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationValue = js.native
    /**
      * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
      * The new MsdEnumerationValue will be automatically stored in the 'values' property
      * of the parent MsdEnumeration element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumeration): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationValue = js.native
  }
  
  /* static members */
  @js.native
  object MsdMetadata extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdMetadata instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMetadata = js.native
    /**
      * Creates and returns a new MsdMetadata instance in the SDK and on the server.
      * The new MsdMetadata will be automatically stored in the 'metadata' property
      * of the parent Msd element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMetadata = js.native
  }
  
  /* static members */
  @js.native
  object MsdMicroflow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMicroflow = js.native
    /**
      * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
      * The new MsdMicroflow will be automatically stored in the 'microflows' property
      * of the parent MsdMetadata element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMetadata): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMicroflow = js.native
  }
  
  /* static members */
  @js.native
  object MsdMicroflowParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMicroflowParameter = js.native
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
      * of the parent MsdMicroflow element passed as argument.
      */
    def createInMsdMicroflowUnderParameters(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMicroflow): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMicroflowParameter = js.native
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
      * of the parent webservices.PublishedParameter element passed as argument.
      */
    def createInPublishedParameterUnderParameterByContract(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object MsdText extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdText = js.native
    /**
      * Creates and returns a new MsdText instance in the SDK and on the server.
      * The new MsdText will be automatically stored in the 'translations' property
      * of the parent MsdEnumerationValue element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdEnumerationValue): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdText = js.native
  }
  
  /* static members */
  @js.native
  object MsdVersion extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenAppservicesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdVersion instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdVersion = js.native
    /**
      * Creates and returns a new MsdVersion instance in the SDK and on the server.
      * The new MsdVersion will be automatically stored in the 'version' property
      * of the parent Msd element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.Msd): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.MsdVersion = js.native
  }
  
}

