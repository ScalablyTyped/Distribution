package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object businessevents {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `BusinessEvents`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEvent")
  @js.native
  open class ConsumedBusinessEvent protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.businessevents.ConsumedBusinessEvent {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ConsumedBusinessEvent {
    
    @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ConsumedBusinessEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEvent]
    
    /**
      * Creates and returns a new ConsumedBusinessEvent instance in the SDK and on the server.
      * The new ConsumedBusinessEvent will be automatically stored in the 'businessEvents' property
      * of the parent ConsumedBusinessEventService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.11.0 and higher
      */
    /* static member */
    inline def createIn(
      container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEventService
    ): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEvent]
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEvent.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEvent.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.8.0: introduced
    */
  @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEventService")
  @js.native
  open class ConsumedBusinessEventService protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.businessevents.ConsumedBusinessEventService {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ConsumedBusinessEventService {
    
    @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEventService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedBusinessEventService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEventService]
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEventService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.ConsumedBusinessEventService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "businessevents.PublishedBusinessEventService")
  @js.native
  open class PublishedBusinessEventService protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.businessevents.PublishedBusinessEventService {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedBusinessEventService {
    
    @JSImport("mendixmodelsdk", "businessevents.PublishedBusinessEventService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedBusinessEventService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedBusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedBusinessEventService]
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedBusinessEventService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedBusinessEventService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "businessevents.PublishedChannel")
  @js.native
  open class PublishedChannel protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.businessevents.PublishedChannel {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedChannel {
    
    @JSImport("mendixmodelsdk", "businessevents.PublishedChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedChannel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel]
    
    /**
      * Creates and returns a new PublishedChannel instance in the SDK and on the server.
      * The new PublishedChannel will be automatically stored in the 'channels' property
      * of the parent PublishedBusinessEventService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.11.0 and higher
      */
    /* static member */
    inline def createIn(
      container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedBusinessEventService
    ): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel]
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedChannel.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedChannel.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "businessevents.PublishedMessage")
  @js.native
  open class PublishedMessage protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.businessevents.PublishedMessage {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedMessage {
    
    @JSImport("mendixmodelsdk", "businessevents.PublishedMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedMessage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage]
    
    /**
      * Creates and returns a new PublishedMessage instance in the SDK and on the server.
      * The new PublishedMessage will be automatically stored in the 'messages' property
      * of the parent PublishedChannel element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.11.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage]
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedMessage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedMessage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "businessevents.PublishedMessageAttribute")
  @js.native
  open class PublishedMessageAttribute protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.businessevents.PublishedMessageAttribute {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedMessageAttribute {
    
    @JSImport("mendixmodelsdk", "businessevents.PublishedMessageAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedMessageAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute]
    
    /**
      * Creates and returns a new PublishedMessageAttribute instance in the SDK and on the server.
      * The new PublishedMessageAttribute will be automatically stored in the 'attributes' property
      * of the parent PublishedMessage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.11.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedMessageAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "businessevents.PublishedMessageAttribute.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
