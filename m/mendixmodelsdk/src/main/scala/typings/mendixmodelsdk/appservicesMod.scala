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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appservicesMod {
  
  @JSImport("mendixmodelsdk/src/gen/appservices", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object appservices {
    
    /**
      * In version 9.0.2: deleted
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedAppService, name, parameters */ @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceAction")
    @js.native
    open class AppServiceAction protected ()
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
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceAction")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AppServiceAction instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): AppServiceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AppServiceAction]
      
      /**
        * Creates and returns a new AppServiceAction instance in the SDK and on the server.
        * The new AppServiceAction will be automatically stored in the 'actions' property
        * of the parent ConsumedAppService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: ConsumedAppService): AppServiceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[AppServiceAction]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceAction.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceAction.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, name */ @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceActionParameter")
    @js.native
    open class AppServiceActionParameter protected ()
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
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceActionParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): AppServiceActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AppServiceActionParameter]
      
      /**
        * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
        * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
        * of the parent AppServiceAction element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: AppServiceAction): AppServiceActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[AppServiceActionParameter]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceActionParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceActionParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceLocationEnum")
    @js.native
    open class AppServiceLocationEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object AppServiceLocationEnum {
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceLocationEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceLocationEnum.Constant")
      @js.native
      def Constant: AppServiceLocationEnum = js.native
      inline def Constant_=(x: AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constant")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceLocationEnum.Default")
      @js.native
      def Default: AppServiceLocationEnum = js.native
      inline def Default_=(x: AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.AppServiceLocationEnum.Parameter")
      @js.native
      def Parameter: AppServiceLocationEnum = js.native
      inline def Parameter_=(x: AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide8/consumed-app-services relevant section in reference guide}
      *
      * In version 9.0.2: deleted
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
    - typings.mendixmodelsdk.appservicesMod.appservices.IConsumedAppService because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined actions */ @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.ConsumedAppService")
    @js.native
    open class ConsumedAppService protected () extends Document {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.ConsumedAppService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ConsumedAppService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): ConsumedAppService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConsumedAppService]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.ConsumedAppService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.ConsumedAppService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.Msd")
    @js.native
    open class Msd protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.Msd")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Msd instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): Msd = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Msd]
      
      /**
        * Creates and returns a new Msd instance in the SDK and on the server.
        * The new Msd will be automatically stored in the 'msd' property
        * of the parent ConsumedAppService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: ConsumedAppService): Msd = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Msd]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.Msd.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.Msd.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAssociation")
    @js.native
    open class MsdAssociation protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAssociation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdAssociation instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdAssociation]
      
      /**
        * Creates and returns a new MsdAssociation instance in the SDK and on the server.
        * The new MsdAssociation will be automatically stored in the 'associationByContract' property
        * of the parent webservices.DataAssociation element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInDataAssociationUnderAssociationByContract(container: DataAssociation): MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataAssociationUnderAssociationByContract")(container.asInstanceOf[js.Any]).asInstanceOf[MsdAssociation]
      
      /**
        * Creates and returns a new MsdAssociation instance in the SDK and on the server.
        * The new MsdAssociation will be automatically stored in the 'associations' property
        * of the parent MsdDomainModel element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInMsdDomainModelUnderAssociations(container: MsdDomainModel): MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdDomainModelUnderAssociations")(container.asInstanceOf[js.Any]).asInstanceOf[MsdAssociation]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAssociation.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAssociation.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAttribute")
    @js.native
    open class MsdAttribute protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAttribute")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdAttribute]
      
      /**
        * Creates and returns a new MsdAttribute instance in the SDK and on the server.
        * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
        * of the parent webservices.DataAttribute element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInDataAttributeUnderAttributeByContract(container: DataAttribute): MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataAttributeUnderAttributeByContract")(container.asInstanceOf[js.Any]).asInstanceOf[MsdAttribute]
      
      /**
        * Creates and returns a new MsdAttribute instance in the SDK and on the server.
        * The new MsdAttribute will be automatically stored in the 'attributes' property
        * of the parent MsdEntity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInMsdEntityUnderAttributes(container: MsdEntity): MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdEntityUnderAttributes")(container.asInstanceOf[js.Any]).asInstanceOf[MsdAttribute]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAttribute.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdAttribute.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdDomainModel")
    @js.native
    open class MsdDomainModel protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdDomainModel")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdDomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdDomainModel]
      
      /**
        * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
        * The new MsdDomainModel will be automatically stored in the 'domainModel' property
        * of the parent Msd element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: Msd): MsdDomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdDomainModel]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdDomainModel.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdDomainModel.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEntity")
    @js.native
    open class MsdEntity protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEntity")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEntity instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdEntity]
      
      /**
        * Creates and returns a new MsdEntity instance in the SDK and on the server.
        * The new MsdEntity will be automatically stored in the 'entities' property
        * of the parent MsdDomainModel element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: MsdDomainModel): MsdEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdEntity]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEntity.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEntity.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumeration")
    @js.native
    open class MsdEnumeration protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumeration")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdEnumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdEnumeration]
      
      /**
        * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
        * The new MsdEnumeration will be automatically stored in the 'enumerations' property
        * of the parent MsdEnumerationContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: MsdEnumerationContainer): MsdEnumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdEnumeration]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumeration.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumeration.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationContainer")
    @js.native
    open class MsdEnumerationContainer protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationContainer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdEnumerationContainer]
      
      /**
        * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
        * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
        * of the parent Msd element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInMsdUnderEnumerations(container: Msd): MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdUnderEnumerations")(container.asInstanceOf[js.Any]).asInstanceOf[MsdEnumerationContainer]
      
      /**
        * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
        * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
        * of the parent webservices.VersionedService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVersionedServiceUnderEnumerationsByContract")(container.asInstanceOf[js.Any]).asInstanceOf[MsdEnumerationContainer]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationContainer.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationContainer.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationValue")
    @js.native
    open class MsdEnumerationValue protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdEnumerationValue]
      
      /**
        * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
        * The new MsdEnumerationValue will be automatically stored in the 'values' property
        * of the parent MsdEnumeration element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: MsdEnumeration): MsdEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdEnumerationValue]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationValue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdEnumerationValue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMetadata")
    @js.native
    open class MsdMetadata protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMetadata")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdMetadata instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdMetadata]
      
      /**
        * Creates and returns a new MsdMetadata instance in the SDK and on the server.
        * The new MsdMetadata will be automatically stored in the 'metadata' property
        * of the parent Msd element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: Msd): MsdMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdMetadata]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMetadata.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMetadata.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflow")
    @js.native
    open class MsdMicroflow protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflow")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdMicroflow]
      
      /**
        * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
        * The new MsdMicroflow will be automatically stored in the 'microflows' property
        * of the parent MsdMetadata element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: MsdMetadata): MsdMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdMicroflow]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflow.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflow.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflowParameter")
    @js.native
    open class MsdMicroflowParameter protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflowParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdMicroflowParameter]
      
      /**
        * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
        * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
        * of the parent MsdMicroflow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInMsdMicroflowUnderParameters(container: MsdMicroflow): MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdMicroflowUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[MsdMicroflowParameter]
      
      /**
        * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
        * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
        * of the parent webservices.PublishedParameter element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterByContract")(container.asInstanceOf[js.Any]).asInstanceOf[MsdMicroflowParameter]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflowParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdMicroflowParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdText")
    @js.native
    open class MsdText protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdText")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdText instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdText]
      
      /**
        * Creates and returns a new MsdText instance in the SDK and on the server.
        * The new MsdText will be automatically stored in the 'translations' property
        * of the parent MsdEnumerationValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: MsdEnumerationValue): MsdText = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdText]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdText.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdText.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdVersion")
    @js.native
    open class MsdVersion protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdVersion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MsdVersion instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MsdVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MsdVersion]
      
      /**
        * Creates and returns a new MsdVersion instance in the SDK and on the server.
        * The new MsdVersion will be automatically stored in the 'version' property
        * of the parent Msd element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.1
        */
      /* static member */
      inline def createIn(container: Msd): MsdVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MsdVersion]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdVersion.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/appservices", "appservices.MsdVersion.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `AppServices`.
      */
    /**
      * In version 9.0.2: deleted
      */
    @js.native
    trait IAppServiceAction
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsConsumedAppService: IConsumedAppService = js.native
      
      @JSName("model")
      val model_IAppServiceAction: IModel = js.native
      
      val name: String = js.native
      
      val parameters: IList[IAppServiceActionParameter] = js.native
    }
    
    /**
      * In version 9.0.2: deleted
      */
    @js.native
    trait IAppServiceActionParameter
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsAppServiceAction: IAppServiceAction = js.native
      
      @JSName("model")
      val model_IAppServiceActionParameter: IModel = js.native
      
      val name: String = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide8/consumed-app-services relevant section in reference guide}
      *
      * In version 9.0.2: deleted
      */
    @js.native
    trait IConsumedAppService
      extends StObject
         with IDocument {
      
      val actions: IList[IAppServiceAction] = js.native
    }
  }
}
