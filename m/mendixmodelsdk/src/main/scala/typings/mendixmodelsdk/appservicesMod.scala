package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.IConstant
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import typings.mendixmodelsdk.webservicesMod.webservices.DataAssociation
import typings.mendixmodelsdk.webservicesMod.webservices.DataAttribute
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.webservicesMod.webservices.VersionedService
import typings.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appservicesMod {
  
  @JSImport("mendixmodelsdk/dist/gen/appservices", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object appservices {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedAppService, name, parameters */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction")
    @js.native
    class AppServiceAction protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 7.9.0: introduced
        */
      def actionReturnType: DataType = js.native
      def actionReturnType_=(newValue: DataType): Unit = js.native
      
      def caption: String = js.native
      def caption_=(newValue: String): Unit = js.native
      
      def containerAsConsumedAppService: ConsumedAppService = js.native
      @JSName("containerAsConsumedAppService")
      val containerAsConsumedAppService_FAppServiceAction: IConsumedAppService = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def image: String = js.native
      def image_=(newValue: String): Unit = js.native
      
      def microflow: IMicroflow | Null = js.native
      
      def microflowQualifiedName: String | Null = js.native
      
      def microflow_=(newValue: IMicroflow | Null): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FAppServiceAction: String = js.native
      
      def parameters: IList[AppServiceActionParameter] = js.native
      @JSName("parameters")
      val parameters_FAppServiceAction: IList[IAppServiceActionParameter] = js.native
      
      @JSName("qualifiedName")
      def qualifiedName_MAppServiceAction: String | Null = js.native
      
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def returnType: String = js.native
      
      def returnTypeCanBeEmpty: Boolean = js.native
      def returnTypeCanBeEmpty_=(newValue: Boolean): Unit = js.native
      
      def returnType_=(newValue: String): Unit = js.native
    }
    object AppServiceAction {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AppServiceAction instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction.create")
      @js.native
      def create(model: IModel): AppServiceAction = js.native
      
      /**
        * Creates and returns a new AppServiceAction instance in the SDK and on the server.
        * The new AppServiceAction will be automatically stored in the 'actions' property
        * of the parent ConsumedAppService element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction.createIn")
      @js.native
      def createIn(container: ConsumedAppService): AppServiceAction = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceAction.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, name */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter")
    @js.native
    class AppServiceActionParameter protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def canBeEmpty: Boolean = js.native
      def canBeEmpty_=(newValue: Boolean): Unit = js.native
      
      def containerAsAppServiceAction: AppServiceAction = js.native
      @JSName("containerAsAppServiceAction")
      val containerAsAppServiceAction_FAppServiceActionParameter: IAppServiceAction = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FAppServiceActionParameter: String = js.native
      
      /**
        * In version 7.9.0: introduced
        */
      def parameterType: DataType = js.native
      def parameterType_=(newValue: DataType): Unit = js.native
      
      @JSName("qualifiedName")
      def qualifiedName_MAppServiceActionParameter: String | Null = js.native
      
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def `type`: String = js.native
      def type_=(newValue: String): Unit = js.native
    }
    object AppServiceActionParameter {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter.create")
      @js.native
      def create(model: IModel): AppServiceActionParameter = js.native
      
      /**
        * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
        * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
        * of the parent AppServiceAction element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter.createIn")
      @js.native
      def createIn(container: AppServiceAction): AppServiceActionParameter = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceActionParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceLocationEnum")
    @js.native
    class AppServiceLocationEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object AppServiceLocationEnum {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceLocationEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceLocationEnum.Constant")
      @js.native
      def Constant: AppServiceLocationEnum = js.native
      @scala.inline
      def Constant_=(x: AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constant")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceLocationEnum.Default")
      @js.native
      def Default: AppServiceLocationEnum = js.native
      @scala.inline
      def Default_=(x: AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.AppServiceLocationEnum.Parameter")
      @js.native
      def Parameter: AppServiceLocationEnum = js.native
      @scala.inline
      def Parameter_=(x: AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/consumed-app-services relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.appservicesMod.appservices.IConsumedAppService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined actions */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService")
    @js.native
    class ConsumedAppService protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      def actions: IList[AppServiceAction] = js.native
      @JSName("actions")
      val actions_FConsumedAppService: IList[IAppServiceAction] = js.native
      
      def appServiceLocation: AppServiceLocationEnum = js.native
      def appServiceLocation_=(newValue: AppServiceLocationEnum): Unit = js.native
      
      def appStoreGuid: String = js.native
      def appStoreGuid_=(newValue: String): Unit = js.native
      
      def appStoreVersion: String = js.native
      
      def appStoreVersionGuid: String = js.native
      def appStoreVersionGuid_=(newValue: String): Unit = js.native
      
      def appStoreVersion_=(newValue: String): Unit = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConsumedAppService: FolderBase = js.native
      
      def fromAppStore: Boolean = js.native
      def fromAppStore_=(newValue: Boolean): Unit = js.native
      
      def locationConstant: IConstant | Null = js.native
      
      def locationConstantQualifiedName: String | Null = js.native
      
      def locationConstant_=(newValue: IConstant | Null): Unit = js.native
      
      def msd: Msd = js.native
      def msd_=(newValue: Msd): Unit = js.native
      
      def timeOut: Double = js.native
      def timeOut_=(newValue: Double): Unit = js.native
      
      def useTimeOut: Boolean = js.native
      def useTimeOut_=(newValue: Boolean): Unit = js.native
    }
    object ConsumedAppService {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ConsumedAppService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService.createIn")
      @js.native
      def createIn(container: IFolderBase): ConsumedAppService = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd")
    @js.native
    class Msd protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsConsumedAppService: ConsumedAppService = js.native
      
      def domainModel: MsdDomainModel = js.native
      def domainModel_=(newValue: MsdDomainModel): Unit = js.native
      
      def enumerations: MsdEnumerationContainer = js.native
      def enumerations_=(newValue: MsdEnumerationContainer): Unit = js.native
      
      def metadata: MsdMetadata = js.native
      def metadata_=(newValue: MsdMetadata): Unit = js.native
      
      def version: MsdVersion = js.native
      def version_=(newValue: MsdVersion): Unit = js.native
      
      def wsdl: String = js.native
      
      def wsdlDescription: WsdlDescription = js.native
      def wsdlDescription_=(newValue: WsdlDescription): Unit = js.native
      
      def wsdl_=(newValue: String): Unit = js.native
    }
    object Msd {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Msd instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd.create")
      @js.native
      def create(model: IModel): Msd = js.native
      
      /**
        * Creates and returns a new Msd instance in the SDK and on the server.
        * The new Msd will be automatically stored in the 'msd' property
        * of the parent ConsumedAppService element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd.createIn")
      @js.native
      def createIn(container: ConsumedAppService): Msd = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.Msd.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation")
    @js.native
    class MsdAssociation protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def associationKind: String = js.native
      def associationKind_=(newValue: String): Unit = js.native
      
      def associationOwner: String = js.native
      def associationOwner_=(newValue: String): Unit = js.native
      
      def associationType: String = js.native
      def associationType_=(newValue: String): Unit = js.native
      
      def childDeleteBehavior: String = js.native
      def childDeleteBehavior_=(newValue: String): Unit = js.native
      
      def childEntityName: String = js.native
      def childEntityName_=(newValue: String): Unit = js.native
      
      def childX: Double = js.native
      def childX_=(newValue: Double): Unit = js.native
      
      def childY: Double = js.native
      def childY_=(newValue: Double): Unit = js.native
      
      def containerAsDataAssociation: DataAssociation = js.native
      
      def containerAsMsdDomainModel: MsdDomainModel = js.native
      
      def guid: String = js.native
      def guid_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      def parentDeleteBehavior: String = js.native
      def parentDeleteBehavior_=(newValue: String): Unit = js.native
      
      def parentEntityName: String = js.native
      def parentEntityName_=(newValue: String): Unit = js.native
      
      def parentX: Double = js.native
      def parentX_=(newValue: Double): Unit = js.native
      
      def parentY: Double = js.native
      def parentY_=(newValue: Double): Unit = js.native
    }
    object MsdAssociation {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdAssociation instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation.create")
      @js.native
      def create(model: IModel): MsdAssociation = js.native
      
      /**
        * Creates and returns a new MsdAssociation instance in the SDK and on the server.
        * The new MsdAssociation will be automatically stored in the 'associationByContract' property
        * of the parent webservices.DataAssociation element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation.createInDataAssociationUnderAssociationByContract")
      @js.native
      def createInDataAssociationUnderAssociationByContract(container: DataAssociation): MsdAssociation = js.native
      
      /**
        * Creates and returns a new MsdAssociation instance in the SDK and on the server.
        * The new MsdAssociation will be automatically stored in the 'associations' property
        * of the parent MsdDomainModel element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation.createInMsdDomainModelUnderAssociations")
      @js.native
      def createInMsdDomainModelUnderAssociations(container: MsdDomainModel): MsdAssociation = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute")
    @js.native
    class MsdAttribute protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attributeType: String = js.native
      def attributeType_=(newValue: String): Unit = js.native
      
      def containerAsDataAttribute: DataAttribute = js.native
      
      def containerAsMsdEntity: MsdEntity = js.native
      
      def defaultValue: String = js.native
      def defaultValue_=(newValue: String): Unit = js.native
      
      def enumerationName: String = js.native
      def enumerationName_=(newValue: String): Unit = js.native
      
      def guid: String = js.native
      def guid_=(newValue: String): Unit = js.native
      
      def length: Double = js.native
      def length_=(newValue: Double): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
    }
    object MsdAttribute {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute.create")
      @js.native
      def create(model: IModel): MsdAttribute = js.native
      
      /**
        * Creates and returns a new MsdAttribute instance in the SDK and on the server.
        * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
        * of the parent webservices.DataAttribute element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute.createInDataAttributeUnderAttributeByContract")
      @js.native
      def createInDataAttributeUnderAttributeByContract(container: DataAttribute): MsdAttribute = js.native
      
      /**
        * Creates and returns a new MsdAttribute instance in the SDK and on the server.
        * The new MsdAttribute will be automatically stored in the 'attributes' property
        * of the parent MsdEntity element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute.createInMsdEntityUnderAttributes")
      @js.native
      def createInMsdEntityUnderAttributes(container: MsdEntity): MsdAttribute = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel")
    @js.native
    class MsdDomainModel protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def associations: IList[MsdAssociation] = js.native
      
      def containerAsMsd: Msd = js.native
      
      def entities: IList[MsdEntity] = js.native
    }
    object MsdDomainModel {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel.create")
      @js.native
      def create(model: IModel): MsdDomainModel = js.native
      
      /**
        * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
        * The new MsdDomainModel will be automatically stored in the 'domainModel' property
        * of the parent Msd element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel.createIn")
      @js.native
      def createIn(container: Msd): MsdDomainModel = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity")
    @js.native
    class MsdEntity protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attributes: IList[MsdAttribute] = js.native
      
      def containerAsMsdDomainModel: MsdDomainModel = js.native
      
      def generalizationName: String = js.native
      def generalizationName_=(newValue: String): Unit = js.native
      
      def guid: String = js.native
      def guid_=(newValue: String): Unit = js.native
      
      def locationX: Double = js.native
      def locationX_=(newValue: Double): Unit = js.native
      
      def locationY: Double = js.native
      def locationY_=(newValue: Double): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      def persistable: Boolean = js.native
      def persistable_=(newValue: Boolean): Unit = js.native
    }
    object MsdEntity {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEntity instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity.create")
      @js.native
      def create(model: IModel): MsdEntity = js.native
      
      /**
        * Creates and returns a new MsdEntity instance in the SDK and on the server.
        * The new MsdEntity will be automatically stored in the 'entities' property
        * of the parent MsdDomainModel element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity.createIn")
      @js.native
      def createIn(container: MsdDomainModel): MsdEntity = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration")
    @js.native
    class MsdEnumeration protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMsdEnumerationContainer: MsdEnumerationContainer = js.native
      
      def guid: String = js.native
      def guid_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      def values: IList[MsdEnumerationValue] = js.native
    }
    object MsdEnumeration {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration.create")
      @js.native
      def create(model: IModel): MsdEnumeration = js.native
      
      /**
        * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
        * The new MsdEnumeration will be automatically stored in the 'enumerations' property
        * of the parent MsdEnumerationContainer element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration.createIn")
      @js.native
      def createIn(container: MsdEnumerationContainer): MsdEnumeration = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumeration.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer")
    @js.native
    class MsdEnumerationContainer protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMsd: Msd = js.native
      
      def containerAsVersionedService: VersionedService = js.native
      
      def enumerations: IList[MsdEnumeration] = js.native
    }
    object MsdEnumerationContainer {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer.create")
      @js.native
      def create(model: IModel): MsdEnumerationContainer = js.native
      
      /**
        * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
        * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
        * of the parent Msd element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer.createInMsdUnderEnumerations")
      @js.native
      def createInMsdUnderEnumerations(container: Msd): MsdEnumerationContainer = js.native
      
      /**
        * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
        * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
        * of the parent webservices.VersionedService element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer.createInVersionedServiceUnderEnumerationsByContract")
      @js.native
      def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): MsdEnumerationContainer = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue")
    @js.native
    class MsdEnumerationValue protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMsdEnumeration: MsdEnumeration = js.native
      
      def guid: String = js.native
      def guid_=(newValue: String): Unit = js.native
      
      def image: String = js.native
      def image_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      def translations: IList[MsdText] = js.native
    }
    object MsdEnumerationValue {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue.create")
      @js.native
      def create(model: IModel): MsdEnumerationValue = js.native
      
      /**
        * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
        * The new MsdEnumerationValue will be automatically stored in the 'values' property
        * of the parent MsdEnumeration element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue.createIn")
      @js.native
      def createIn(container: MsdEnumeration): MsdEnumerationValue = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata")
    @js.native
    class MsdMetadata protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def caption: String = js.native
      def caption_=(newValue: String): Unit = js.native
      
      def containerAsMsd: Msd = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      def headerAuthentication: String = js.native
      def headerAuthentication_=(newValue: String): Unit = js.native
      
      def image: String = js.native
      def image_=(newValue: String): Unit = js.native
      
      def instanceGuid: String = js.native
      def instanceGuid_=(newValue: String): Unit = js.native
      
      def microflows: IList[MsdMicroflow] = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      def publishDateTime: String = js.native
      def publishDateTime_=(newValue: String): Unit = js.native
      
      def serviceGuid: String = js.native
      def serviceGuid_=(newValue: String): Unit = js.native
      
      def supportedProtocols: IList[String] = js.native
      
      def version: Double = js.native
      
      def versionGuid: String = js.native
      def versionGuid_=(newValue: String): Unit = js.native
      
      def version_=(newValue: Double): Unit = js.native
    }
    object MsdMetadata {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdMetadata instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata.create")
      @js.native
      def create(model: IModel): MsdMetadata = js.native
      
      /**
        * Creates and returns a new MsdMetadata instance in the SDK and on the server.
        * The new MsdMetadata will be automatically stored in the 'metadata' property
        * of the parent Msd element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata.createIn")
      @js.native
      def createIn(container: Msd): MsdMetadata = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow")
    @js.native
    class MsdMicroflow protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMsdMetadata: MsdMetadata = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      def image: String = js.native
      def image_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      def parameters: IList[MsdMicroflowParameter] = js.native
      
      def returnType: String = js.native
      
      def returnTypeCanBeEmpty: Boolean = js.native
      def returnTypeCanBeEmpty_=(newValue: Boolean): Unit = js.native
      
      def returnTypeSpecification: String = js.native
      def returnTypeSpecification_=(newValue: String): Unit = js.native
      
      def returnType_=(newValue: String): Unit = js.native
      
      /**
        * In version 6.1.0: deleted
        */
      def systemEntityType: String = js.native
      def systemEntityType_=(newValue: String): Unit = js.native
    }
    object MsdMicroflow {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow.create")
      @js.native
      def create(model: IModel): MsdMicroflow = js.native
      
      /**
        * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
        * The new MsdMicroflow will be automatically stored in the 'microflows' property
        * of the parent MsdMetadata element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow.createIn")
      @js.native
      def createIn(container: MsdMetadata): MsdMicroflow = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflow.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter")
    @js.native
    class MsdMicroflowParameter protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def canBeEmpty: Boolean = js.native
      def canBeEmpty_=(newValue: Boolean): Unit = js.native
      
      def containerAsMsdMicroflow: MsdMicroflow = js.native
      
      def containerAsPublishedParameter: PublishedParameter = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      /**
        * In version 6.1.0: deleted
        */
      def systemEntityType: String = js.native
      def systemEntityType_=(newValue: String): Unit = js.native
      
      def `type`: String = js.native
      
      def typeSpecification: String = js.native
      def typeSpecification_=(newValue: String): Unit = js.native
      
      def type_=(newValue: String): Unit = js.native
    }
    object MsdMicroflowParameter {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter.create")
      @js.native
      def create(model: IModel): MsdMicroflowParameter = js.native
      
      /**
        * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
        * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
        * of the parent MsdMicroflow element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter.createInMsdMicroflowUnderParameters")
      @js.native
      def createInMsdMicroflowUnderParameters(container: MsdMicroflow): MsdMicroflowParameter = js.native
      
      /**
        * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
        * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
        * of the parent webservices.PublishedParameter element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter.createInPublishedParameterUnderParameterByContract")
      @js.native
      def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): MsdMicroflowParameter = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText")
    @js.native
    class MsdText protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def caption: String = js.native
      def caption_=(newValue: String): Unit = js.native
      
      def containerAsMsdEnumerationValue: MsdEnumerationValue = js.native
      
      def languageCode: String = js.native
      def languageCode_=(newValue: String): Unit = js.native
    }
    object MsdText {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdText instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText.create")
      @js.native
      def create(model: IModel): MsdText = js.native
      
      /**
        * Creates and returns a new MsdText instance in the SDK and on the server.
        * The new MsdText will be automatically stored in the 'translations' property
        * of the parent MsdEnumerationValue element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText.createIn")
      @js.native
      def createIn(container: MsdEnumerationValue): MsdText = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdVersion")
    @js.native
    class MsdVersion protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMsd: Msd = js.native
      
      def version: Double = js.native
      def version_=(newValue: Double): Unit = js.native
    }
    object MsdVersion {
      
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdVersion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdVersion instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdVersion.create")
      @js.native
      def create(model: IModel): MsdVersion = js.native
      
      /**
        * Creates and returns a new MsdVersion instance in the SDK and on the server.
        * The new MsdVersion will be automatically stored in the 'version' property
        * of the parent Msd element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdVersion.createIn")
      @js.native
      def createIn(container: Msd): MsdVersion = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdVersion.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdVersion.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
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
      * See: {@link https://docs.mendix.com/refguide/consumed-app-services relevant section in reference guide}
      */
    @js.native
    trait IConsumedAppService extends IDocument {
      
      val actions: IList[IAppServiceAction] = js.native
    }
  }
}
