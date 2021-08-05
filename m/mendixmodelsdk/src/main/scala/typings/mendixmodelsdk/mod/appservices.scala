package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.webservicesMod.webservices.DataAssociation
import typings.mendixmodelsdk.webservicesMod.webservices.DataAttribute
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.webservicesMod.webservices.VersionedService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appservices {
  
  @JSImport("mendixmodelsdk", "appservices.AppServiceAction")
  @js.native
  class AppServiceAction protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.AppServiceAction {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction]
    
    /**
      * Creates and returns a new AppServiceAction instance in the SDK and on the server.
      * The new AppServiceAction will be automatically stored in the 'actions' property
      * of the parent ConsumedAppService element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService): typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceAction.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter")
  @js.native
  class AppServiceActionParameter protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.AppServiceActionParameter {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter]
    
    /**
      * Creates and returns a new AppServiceActionParameter instance in the SDK and on the server.
      * The new AppServiceActionParameter will be automatically stored in the 'parameters' property
      * of the parent AppServiceAction element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction): typings.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceActionParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum")
  @js.native
  class AppServiceLocationEnum protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.AppServiceLocationEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object AppServiceLocationEnum {
    
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum.Constant")
    @js.native
    def Constant: typings.mendixmodelsdk.appservicesMod.appservices.AppServiceLocationEnum = js.native
    inline def Constant_=(x: typings.mendixmodelsdk.appservicesMod.appservices.AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constant")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum.Default")
    @js.native
    def Default: typings.mendixmodelsdk.appservicesMod.appservices.AppServiceLocationEnum = js.native
    inline def Default_=(x: typings.mendixmodelsdk.appservicesMod.appservices.AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.AppServiceLocationEnum.Parameter")
    @js.native
    def Parameter: typings.mendixmodelsdk.appservicesMod.appservices.AppServiceLocationEnum = js.native
    inline def Parameter_=(x: typings.mendixmodelsdk.appservicesMod.appservices.AppServiceLocationEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/consumed-app-services relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "appservices.ConsumedAppService")
  @js.native
  class ConsumedAppService protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.ConsumedAppService {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
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
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.ConsumedAppService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.ConsumedAppService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.Msd")
  @js.native
  class Msd protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.Msd {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.Msd = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.Msd]
    
    /**
      * Creates and returns a new Msd instance in the SDK and on the server.
      * The new Msd will be automatically stored in the 'msd' property
      * of the parent ConsumedAppService element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.ConsumedAppService): typings.mendixmodelsdk.appservicesMod.appservices.Msd = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.Msd]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.Msd.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.Msd.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdAssociation")
  @js.native
  class MsdAssociation protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdAssociation {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdAssociation]
    
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associationByContract' property
      * of the parent webservices.DataAssociation element passed as argument.
      */
    /* static member */
    inline def createInDataAssociationUnderAssociationByContract(container: DataAssociation): typings.mendixmodelsdk.appservicesMod.appservices.MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataAssociationUnderAssociationByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdAssociation]
    
    /**
      * Creates and returns a new MsdAssociation instance in the SDK and on the server.
      * The new MsdAssociation will be automatically stored in the 'associations' property
      * of the parent MsdDomainModel element passed as argument.
      */
    /* static member */
    inline def createInMsdDomainModelUnderAssociations(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdDomainModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdDomainModelUnderAssociations")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdAssociation]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAssociation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAssociation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdAttribute")
  @js.native
  class MsdAttribute protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdAttribute {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute]
    
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
      * of the parent webservices.DataAttribute element passed as argument.
      */
    /* static member */
    inline def createInDataAttributeUnderAttributeByContract(container: DataAttribute): typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataAttributeUnderAttributeByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute]
    
    /**
      * Creates and returns a new MsdAttribute instance in the SDK and on the server.
      * The new MsdAttribute will be automatically stored in the 'attributes' property
      * of the parent MsdEntity element passed as argument.
      */
    /* static member */
    inline def createInMsdEntityUnderAttributes(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdEntity): typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdEntityUnderAttributes")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdAttribute.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdDomainModel")
  @js.native
  class MsdDomainModel protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdDomainModel {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdDomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdDomainModel]
    
    /**
      * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
      * The new MsdDomainModel will be automatically stored in the 'domainModel' property
      * of the parent Msd element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.Msd): typings.mendixmodelsdk.appservicesMod.appservices.MsdDomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdDomainModel]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdDomainModel.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdDomainModel.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdEntity")
  @js.native
  class MsdEntity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdEntity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEntity]
    
    /**
      * Creates and returns a new MsdEntity instance in the SDK and on the server.
      * The new MsdEntity will be automatically stored in the 'entities' property
      * of the parent MsdDomainModel element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdDomainModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEntity]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEntity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEntity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdEnumeration")
  @js.native
  class MsdEnumeration protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdEnumeration {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumeration]
    
    /**
      * Creates and returns a new MsdEnumeration instance in the SDK and on the server.
      * The new MsdEnumeration will be automatically stored in the 'enumerations' property
      * of the parent MsdEnumerationContainer element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer): typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumeration]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumeration.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumeration.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer")
  @js.native
  class MsdEnumerationContainer protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdEnumerationContainer {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer]
    
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
      * of the parent Msd element passed as argument.
      */
    /* static member */
    inline def createInMsdUnderEnumerations(container: typings.mendixmodelsdk.appservicesMod.appservices.Msd): typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdUnderEnumerations")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer]
    
    /**
      * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
      * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
      * of the parent webservices.VersionedService element passed as argument.
      */
    /* static member */
    inline def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVersionedServiceUnderEnumerationsByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdEnumerationValue")
  @js.native
  class MsdEnumerationValue protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdEnumerationValue {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationValue]
    
    /**
      * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
      * The new MsdEnumerationValue will be automatically stored in the 'values' property
      * of the parent MsdEnumeration element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumeration): typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationValue]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdEnumerationValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdMetadata")
  @js.native
  class MsdMetadata protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdMetadata {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata]
    
    /**
      * Creates and returns a new MsdMetadata instance in the SDK and on the server.
      * The new MsdMetadata will be automatically stored in the 'metadata' property
      * of the parent Msd element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.Msd): typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMetadata.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMetadata.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdMicroflow")
  @js.native
  class MsdMicroflow protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdMicroflow {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow]
    
    /**
      * Creates and returns a new MsdMicroflow instance in the SDK and on the server.
      * The new MsdMicroflow will be automatically stored in the 'microflows' property
      * of the parent MsdMetadata element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata): typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflow.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter")
  @js.native
  class MsdMicroflowParameter protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdMicroflowParameter {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter]
    
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
      * of the parent MsdMicroflow element passed as argument.
      */
    /* static member */
    inline def createInMsdMicroflowUnderParameters(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflow): typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdMicroflowUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter]
    
    /**
      * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
      * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
      * of the parent webservices.PublishedParameter element passed as argument.
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterByContract")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdText")
  @js.native
  class MsdText protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdText {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdText]
    
    /**
      * Creates and returns a new MsdText instance in the SDK and on the server.
      * The new MsdText will be automatically stored in the 'translations' property
      * of the parent MsdEnumerationValue element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationValue): typings.mendixmodelsdk.appservicesMod.appservices.MsdText = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdText]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdText.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdText.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "appservices.MsdVersion")
  @js.native
  class MsdVersion protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdVersion {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    inline def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdVersion]
    
    /**
      * Creates and returns a new MsdVersion instance in the SDK and on the server.
      * The new MsdVersion will be automatically stored in the 'version' property
      * of the parent Msd element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.Msd): typings.mendixmodelsdk.appservicesMod.appservices.MsdVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.appservicesMod.appservices.MsdVersion]
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdVersion.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "appservices.MsdVersion.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.appservicesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
