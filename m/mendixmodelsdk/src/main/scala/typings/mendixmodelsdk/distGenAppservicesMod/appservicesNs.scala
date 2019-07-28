package typings.mendixmodelsdk.distGenAppservicesMod

import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.AppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.AppServiceActionParameter
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.AppServiceLocationEnum
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.ConsumedAppService
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IConsumedAppService
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.Msd
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdAssociation
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdAttribute
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdDomainModel
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdEntity
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdEnumeration
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdEnumerationContainer
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdEnumerationValue
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdMetadata
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdMicroflow
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdMicroflowParameter
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdText
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.MsdVersion
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAssociation
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.DataAttribute
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedParameter
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.VersionedService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices")
@js.native
object appservicesNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceAction because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedAppService, name, parameters */ @js.native
  class AppServiceAction protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.9.0: introduced
      */
    var actionReturnType: DataType = js.native
    var caption: String = js.native
    val containerAsConsumedAppService: ConsumedAppService | IConsumedAppService = js.native
    var description: String = js.native
    var image: String = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    @JSName("model")
    var model_AppServiceAction: IModel = js.native
    var name: String = js.native
    val parameters: IList[AppServiceActionParameter | IAppServiceActionParameter] = js.native
    val qualifiedName: String | Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var returnType: String = js.native
    var returnTypeCanBeEmpty: Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, name */ @js.native
  class AppServiceActionParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var canBeEmpty: Boolean = js.native
    val containerAsAppServiceAction: AppServiceAction | IAppServiceAction = js.native
    @JSName("model")
    var model_AppServiceActionParameter: IModel = js.native
    var name: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: DataType = js.native
    val qualifiedName: String | Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: String = js.native
  }
  
  @js.native
  class AppServiceLocationEnum () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IConsumedAppService because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined actions */ @js.native
  class ConsumedAppService protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val actions: IList[AppServiceAction | IAppServiceAction] = js.native
    var appServiceLocation: AppServiceLocationEnum = js.native
    var appStoreGuid: String = js.native
    var appStoreVersion: String = js.native
    var appStoreVersionGuid: String = js.native
    var fromAppStore: Boolean = js.native
    var locationConstant: IConstant | Null = js.native
    val locationConstantQualifiedName: String | Null = js.native
    var msd: Msd = js.native
    var timeOut: Double = js.native
    var useTimeOut: Boolean = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `AppServices`.
    */
  @js.native
  trait IAppServiceAction
    extends IElement
       with IByNameReferrable {
    val containerAsConsumedAppService: IConsumedAppService = js.native
    @JSName("model")
    val model_IAppServiceAction: IModel = js.native
    val name: String = js.native
    val parameters: IList[IAppServiceActionParameter] = js.native
  }
  
  @js.native
  trait IAppServiceActionParameter
    extends IElement
       with IByNameReferrable {
    val containerAsAppServiceAction: IAppServiceAction = js.native
    @JSName("model")
    val model_IAppServiceActionParameter: IModel = js.native
    val name: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
    */
  @js.native
  trait IConsumedAppService extends IDocument {
    val actions: IList[IAppServiceAction] = js.native
  }
  
  @js.native
  class Msd protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsConsumedAppService: ConsumedAppService = js.native
    var domainModel: MsdDomainModel = js.native
    var enumerations: MsdEnumerationContainer = js.native
    var metadata: MsdMetadata = js.native
    @JSName("model")
    var model_Msd: IModel = js.native
    var version: MsdVersion = js.native
    var wsdl: String = js.native
    var wsdlDescription: WsdlDescription = js.native
  }
  
  @js.native
  class MsdAssociation protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var associationKind: String = js.native
    var associationOwner: String = js.native
    var associationType: String = js.native
    var childDeleteBehavior: String = js.native
    var childEntityName: String = js.native
    var childX: Double = js.native
    var childY: Double = js.native
    val containerAsDataAssociation: DataAssociation = js.native
    val containerAsMsdDomainModel: MsdDomainModel = js.native
    var guid: String = js.native
    @JSName("model")
    var model_MsdAssociation: IModel = js.native
    var name: String = js.native
    var parentDeleteBehavior: String = js.native
    var parentEntityName: String = js.native
    var parentX: Double = js.native
    var parentY: Double = js.native
  }
  
  @js.native
  class MsdAttribute protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attributeType: String = js.native
    val containerAsDataAttribute: DataAttribute = js.native
    val containerAsMsdEntity: MsdEntity = js.native
    var defaultValue: String = js.native
    var enumerationName: String = js.native
    var guid: String = js.native
    var length: Double = js.native
    @JSName("model")
    var model_MsdAttribute: IModel = js.native
    var name: String = js.native
  }
  
  @js.native
  class MsdDomainModel protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val associations: IList[MsdAssociation] = js.native
    val containerAsMsd: Msd = js.native
    val entities: IList[MsdEntity] = js.native
    @JSName("model")
    var model_MsdDomainModel: IModel = js.native
  }
  
  @js.native
  class MsdEntity protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val attributes: IList[MsdAttribute] = js.native
    val containerAsMsdDomainModel: MsdDomainModel = js.native
    var generalizationName: String = js.native
    var guid: String = js.native
    var locationX: Double = js.native
    var locationY: Double = js.native
    @JSName("model")
    var model_MsdEntity: IModel = js.native
    var name: String = js.native
    var persistable: Boolean = js.native
  }
  
  @js.native
  class MsdEnumeration protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMsdEnumerationContainer: MsdEnumerationContainer = js.native
    var guid: String = js.native
    @JSName("model")
    var model_MsdEnumeration: IModel = js.native
    var name: String = js.native
    val values: IList[MsdEnumerationValue] = js.native
  }
  
  @js.native
  class MsdEnumerationContainer protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMsd: Msd = js.native
    val containerAsVersionedService: VersionedService = js.native
    val enumerations: IList[MsdEnumeration] = js.native
    @JSName("model")
    var model_MsdEnumerationContainer: IModel = js.native
  }
  
  @js.native
  class MsdEnumerationValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMsdEnumeration: MsdEnumeration = js.native
    var guid: String = js.native
    var image: String = js.native
    @JSName("model")
    var model_MsdEnumerationValue: IModel = js.native
    var name: String = js.native
    val translations: IList[MsdText] = js.native
  }
  
  @js.native
  class MsdMetadata protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    val containerAsMsd: Msd = js.native
    var description: String = js.native
    var documentation: String = js.native
    var headerAuthentication: String = js.native
    var image: String = js.native
    var instanceGuid: String = js.native
    val microflows: IList[MsdMicroflow] = js.native
    @JSName("model")
    var model_MsdMetadata: IModel = js.native
    var name: String = js.native
    var publishDateTime: String = js.native
    var serviceGuid: String = js.native
    val supportedProtocols: IList[String] = js.native
    var version: Double = js.native
    var versionGuid: String = js.native
  }
  
  @js.native
  class MsdMicroflow protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMsdMetadata: MsdMetadata = js.native
    var description: String = js.native
    var documentation: String = js.native
    var image: String = js.native
    @JSName("model")
    var model_MsdMicroflow: IModel = js.native
    var name: String = js.native
    val parameters: IList[MsdMicroflowParameter] = js.native
    var returnType: String = js.native
    var returnTypeCanBeEmpty: Boolean = js.native
    var returnTypeSpecification: String = js.native
    /**
      * In version 6.1.0: deleted
      */
    var systemEntityType: String = js.native
  }
  
  @js.native
  class MsdMicroflowParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var canBeEmpty: Boolean = js.native
    val containerAsMsdMicroflow: MsdMicroflow = js.native
    val containerAsPublishedParameter: PublishedParameter = js.native
    @JSName("model")
    var model_MsdMicroflowParameter: IModel = js.native
    var name: String = js.native
    /**
      * In version 6.1.0: deleted
      */
    var systemEntityType: String = js.native
    var `type`: String = js.native
    var typeSpecification: String = js.native
  }
  
  @js.native
  class MsdText protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    val containerAsMsdEnumerationValue: MsdEnumerationValue = js.native
    var languageCode: String = js.native
    @JSName("model")
    var model_MsdText: IModel = js.native
  }
  
  @js.native
  class MsdVersion protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMsd: Msd = js.native
    @JSName("model")
    var model_MsdVersion: IModel = js.native
    var version: Double = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AppServiceAction = js.native
    /**
      * Creates and returns a new AppServiceAction instance in the SDK and on the server.
      * The new AppServiceAction will be automatically stored in the 'actions' property
      * of the parent ConsumedAppService element passed as argument.
      */
    def createIn(container: ConsumedAppService): AppServiceAction = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceActionParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AppServiceActionParameter = js.native
    /**
      * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
      * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
      * of the parent AppServiceAction element passed as argument.
      */
    def createIn(container: AppServiceAction): AppServiceActionParameter = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceLocationEnum extends js.Object {
    var Constant: AppServiceLocationEnum = js.native
    var Default: AppServiceLocationEnum = js.native
    var Parameter: AppServiceLocationEnum = js.native
  }
  
  /* static members */
  @js.native
  object ConsumedAppService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ConsumedAppService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): ConsumedAppService = js.native
  }
  
  /* static members */
  @js.native
  object Msd extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Msd instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Msd = js.native
    /**
      * Creates and returns a new Msd instance in the SDK and on the server.
      * The new Msd will be automatically stored in the 'msd' property
      * of the parent ConsumedAppService element passed as argument.
      */
    def createIn(container: ConsumedAppService): Msd = js.native
  }
  
  /* static members */
  @js.native
  object MsdAssociation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdAssociation = js.native
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associationByContract' property
      * of the parent webservices.DataAssociation element passed as argument.
      */
    def createInDataAssociationUnderAssociationByContract(container: DataAssociation): MsdAssociation = js.native
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associations' property
      * of the parent MsdDomainModel element passed as argument.
      */
    def createInMsdDomainModelUnderAssociations(container: MsdDomainModel): MsdAssociation = js.native
  }
  
  /* static members */
  @js.native
  object MsdAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdAttribute = js.native
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
      * of the parent webservices.DataAttribute element passed as argument.
      */
    def createInDataAttributeUnderAttributeByContract(container: DataAttribute): MsdAttribute = js.native
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributes' property
      * of the parent MsdEntity element passed as argument.
      */
    def createInMsdEntityUnderAttributes(container: MsdEntity): MsdAttribute = js.native
  }
  
  /* static members */
  @js.native
  object MsdDomainModel extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdDomainModel = js.native
    /**
      * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
      * The new MsdDomainModel will be automatically stored in the 'domainModel' property
      * of the parent Msd element passed as argument.
      */
    def createIn(container: Msd): MsdDomainModel = js.native
  }
  
  /* static members */
  @js.native
  object MsdEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdEntity = js.native
    /**
      * Creates and returns a new MsdEntity instance in the SDK and on the server.
      * The new MsdEntity will be automatically stored in the 'entities' property
      * of the parent MsdDomainModel element passed as argument.
      */
    def createIn(container: MsdDomainModel): MsdEntity = js.native
  }
  
  /* static members */
  @js.native
  object MsdEnumeration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdEnumeration = js.native
    /**
      * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
      * The new MsdEnumeration will be automatically stored in the 'enumerations' property
      * of the parent MsdEnumerationContainer element passed as argument.
      */
    def createIn(container: MsdEnumerationContainer): MsdEnumeration = js.native
  }
  
  /* static members */
  @js.native
  object MsdEnumerationContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdEnumerationContainer = js.native
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
      * of the parent Msd element passed as argument.
      */
    def createInMsdUnderEnumerations(container: Msd): MsdEnumerationContainer = js.native
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
      * of the parent webservices.VersionedService element passed as argument.
      */
    def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): MsdEnumerationContainer = js.native
  }
  
  /* static members */
  @js.native
  object MsdEnumerationValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdEnumerationValue = js.native
    /**
      * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
      * The new MsdEnumerationValue will be automatically stored in the 'values' property
      * of the parent MsdEnumeration element passed as argument.
      */
    def createIn(container: MsdEnumeration): MsdEnumerationValue = js.native
  }
  
  /* static members */
  @js.native
  object MsdMetadata extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdMetadata instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdMetadata = js.native
    /**
      * Creates and returns a new MsdMetadata instance in the SDK and on the server.
      * The new MsdMetadata will be automatically stored in the 'metadata' property
      * of the parent Msd element passed as argument.
      */
    def createIn(container: Msd): MsdMetadata = js.native
  }
  
  /* static members */
  @js.native
  object MsdMicroflow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdMicroflow = js.native
    /**
      * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
      * The new MsdMicroflow will be automatically stored in the 'microflows' property
      * of the parent MsdMetadata element passed as argument.
      */
    def createIn(container: MsdMetadata): MsdMicroflow = js.native
  }
  
  /* static members */
  @js.native
  object MsdMicroflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdMicroflowParameter = js.native
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
      * of the parent MsdMicroflow element passed as argument.
      */
    def createInMsdMicroflowUnderParameters(container: MsdMicroflow): MsdMicroflowParameter = js.native
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
      * of the parent webservices.PublishedParameter element passed as argument.
      */
    def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): MsdMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object MsdText extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdText = js.native
    /**
      * Creates and returns a new MsdText instance in the SDK and on the server.
      * The new MsdText will be automatically stored in the 'translations' property
      * of the parent MsdEnumerationValue element passed as argument.
      */
    def createIn(container: MsdEnumerationValue): MsdText = js.native
  }
  
  /* static members */
  @js.native
  object MsdVersion extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MsdVersion instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MsdVersion = js.native
    /**
      * Creates and returns a new MsdVersion instance in the SDK and on the server.
      * The new MsdVersion will be automatically stored in the 'version' property
      * of the parent Msd element passed as argument.
      */
    def createIn(container: Msd): MsdVersion = js.native
  }
  
}

