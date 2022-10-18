package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataAssociation
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataAttribute
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.VersionedService
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appservices {
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.AppServiceAction")
  @js.native
  open class AppServiceAction protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.AppServiceAction {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AppServiceAction {
    
    @JSImport("mendixmodelsdk", "appservices.AppServiceAction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AppServiceAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction]
    
    /**
      * Creates and returns a new AppServiceAction instance in the SDK and on the server.
      * The new AppServiceAction will be automatically stored in the 'actions' property
      * of the parent ConsumedAppService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.ConsumedAppService): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceAction.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter")
  @js.native
  open class AppServiceActionParameter protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.AppServiceActionParameter {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AppServiceActionParameter {
    
    @JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter]
    
    /**
      * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
      * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
      * of the parent AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum")
  @js.native
  open class AppServiceLocationEnum protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.AppServiceLocationEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AppServiceLocationEnum {
    
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum.Constant")
    @js.native
    def Constant: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceLocationEnum = js.native
    inline def Constant_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constant")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum.Default")
    @js.native
    def Default: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceLocationEnum = js.native
    inline def Default_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum.Parameter")
    @js.native
    def Parameter: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceLocationEnum = js.native
    inline def Parameter_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide8/consumed-app-services relevant section in reference guide}
    *
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.ConsumedAppService")
  @js.native
  open class ConsumedAppService protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.ConsumedAppService {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ConsumedAppService {
    
    @JSImport("mendixmodelsdk", "appservices.ConsumedAppService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedAppService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.ConsumedAppService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.ConsumedAppService]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.ConsumedAppService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.ConsumedAppService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.Msd")
  @js.native
  open class Msd protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.Msd {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Msd {
    
    @JSImport("mendixmodelsdk", "appservices.Msd")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Msd instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd]
    
    /**
      * Creates and returns a new Msd instance in the SDK and on the server.
      * The new Msd will be automatically stored in the 'msd' property
      * of the parent ConsumedAppService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.ConsumedAppService): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.Msd.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.Msd.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdAssociation")
  @js.native
  open class MsdAssociation protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdAssociation {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdAssociation {
    
    @JSImport("mendixmodelsdk", "appservices.MsdAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAssociation]
    
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associationByContract' property
      * of the parent webservices.DataAssociation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInDataAssociationUnderAssociationByContract(container: DataAssociation): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataAssociationUnderAssociationByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAssociation]
    
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associations' property
      * of the parent MsdDomainModel element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInMsdDomainModelUnderAssociations(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdDomainModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdDomainModelUnderAssociations")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAssociation]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAssociation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAssociation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdAttribute")
  @js.native
  open class MsdAttribute protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdAttribute {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdAttribute {
    
    @JSImport("mendixmodelsdk", "appservices.MsdAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAttribute]
    
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
      * of the parent webservices.DataAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInDataAttributeUnderAttributeByContract(container: DataAttribute): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataAttributeUnderAttributeByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAttribute]
    
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributes' property
      * of the parent MsdEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInMsdEntityUnderAttributes(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEntity): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdEntityUnderAttributes")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAttribute.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdDomainModel")
  @js.native
  open class MsdDomainModel protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdDomainModel {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdDomainModel {
    
    @JSImport("mendixmodelsdk", "appservices.MsdDomainModel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdDomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdDomainModel]
    
    /**
      * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
      * The new MsdDomainModel will be automatically stored in the 'domainModel' property
      * of the parent Msd element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdDomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdDomainModel]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdDomainModel.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdDomainModel.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdEntity")
  @js.native
  open class MsdEntity protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdEntity {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdEntity {
    
    @JSImport("mendixmodelsdk", "appservices.MsdEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEntity]
    
    /**
      * Creates and returns a new MsdEntity instance in the SDK and on the server.
      * The new MsdEntity will be automatically stored in the 'entities' property
      * of the parent MsdDomainModel element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdDomainModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEntity]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEntity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEntity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdEnumeration")
  @js.native
  open class MsdEnumeration protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdEnumeration {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdEnumeration {
    
    @JSImport("mendixmodelsdk", "appservices.MsdEnumeration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumeration]
    
    /**
      * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
      * The new MsdEnumeration will be automatically stored in the 'enumerations' property
      * of the parent MsdEnumerationContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumeration]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumeration.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumeration.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer")
  @js.native
  open class MsdEnumerationContainer protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdEnumerationContainer {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdEnumerationContainer {
    
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer]
    
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
      * of the parent Msd element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInMsdUnderEnumerations(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdUnderEnumerations")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer]
    
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
      * of the parent webservices.VersionedService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVersionedServiceUnderEnumerationsByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationContainer]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdEnumerationValue")
  @js.native
  open class MsdEnumerationValue protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdEnumerationValue {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdEnumerationValue {
    
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationValue]
    
    /**
      * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
      * The new MsdEnumerationValue will be automatically stored in the 'values' property
      * of the parent MsdEnumeration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumeration): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationValue]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdMetadata")
  @js.native
  open class MsdMetadata protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdMetadata {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdMetadata {
    
    @JSImport("mendixmodelsdk", "appservices.MsdMetadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdMetadata instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMetadata]
    
    /**
      * Creates and returns a new MsdMetadata instance in the SDK and on the server.
      * The new MsdMetadata will be automatically stored in the 'metadata' property
      * of the parent Msd element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMetadata]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMetadata.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMetadata.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdMicroflow")
  @js.native
  open class MsdMicroflow protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdMicroflow {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdMicroflow {
    
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflow]
    
    /**
      * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
      * The new MsdMicroflow will be automatically stored in the 'microflows' property
      * of the parent MsdMetadata element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMetadata): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflow]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflow.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter")
  @js.native
  open class MsdMicroflowParameter protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdMicroflowParameter {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdMicroflowParameter {
    
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflowParameter]
    
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
      * of the parent MsdMicroflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInMsdMicroflowUnderParameters(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflow): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdMicroflowUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflowParameter]
    
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflowParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdText")
  @js.native
  open class MsdText protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdText {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdText {
    
    @JSImport("mendixmodelsdk", "appservices.MsdText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdText]
    
    /**
      * Creates and returns a new MsdText instance in the SDK and on the server.
      * The new MsdText will be automatically stored in the 'translations' property
      * of the parent MsdEnumerationValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdEnumerationValue): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdText = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdText]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdText.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdText.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.0.2: deleted
    */
  @JSImport("mendixmodelsdk", "appservices.MsdVersion")
  @js.native
  open class MsdVersion protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.appservices.MsdVersion {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MsdVersion {
    
    @JSImport("mendixmodelsdk", "appservices.MsdVersion")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MsdVersion instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdVersion]
    
    /**
      * Creates and returns a new MsdVersion instance in the SDK and on the server.
      * The new MsdVersion will be automatically stored in the 'version' property
      * of the parent Msd element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.1
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd): typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdVersion]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdVersion.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdVersion.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenAppservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
