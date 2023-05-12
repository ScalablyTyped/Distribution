package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
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
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventDefinition")
  @js.native
  open class BusinessEventDefinition protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventDefinition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BusinessEventDefinition {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BusinessEventDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventDefinition]
    
    /**
      * Creates and returns a new BusinessEventDefinition instance in the SDK and on the server.
      * The new BusinessEventDefinition will be automatically stored in the 'definition' property
      * of the parent BusinessEventService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventService): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventDefinition]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventDefinition.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventService")
  @js.native
  open class BusinessEventService protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object BusinessEventService {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new BusinessEventService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventService]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.BusinessEventService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Channel")
  @js.native
  open class Channel protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Channel {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Channel {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Channel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Channel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Channel]
    
    /**
      * Creates and returns a new Channel instance in the SDK and on the server.
      * The new Channel will be automatically stored in the 'channels' property
      * of the parent BusinessEventDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventDefinition): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Channel]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Channel.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Channel.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.24.0: deleted
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEvent")
  @js.native
  open class ConsumedBusinessEvent protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEvent {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ConsumedBusinessEvent {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEvent")
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
      *  9.11.0 to 9.23.0
      */
    /* static member */
    inline def createIn(
      container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEventService
    ): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEvent]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEvent.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEvent.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.24.0: deleted
    * In version 9.8.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEventService")
  @js.native
  open class ConsumedBusinessEventService protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEventService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ConsumedBusinessEventService {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEventService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedBusinessEventService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ConsumedBusinessEventService]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEventService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ConsumedBusinessEventService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Message")
  @js.native
  open class Message protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Message {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Message {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Message")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Message instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Message = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Message]
    
    /**
      * Creates and returns a new Message instance in the SDK and on the server.
      * The new Message will be automatically stored in the 'messages' property
      * of the parent Channel element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Channel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Message = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Message]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Message.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.Message.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.MessageAttribute")
  @js.native
  open class MessageAttribute protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.MessageAttribute {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MessageAttribute {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.MessageAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MessageAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.MessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.MessageAttribute]
    
    /**
      * Creates and returns a new MessageAttribute instance in the SDK and on the server.
      * The new MessageAttribute will be automatically stored in the 'attributes' property
      * of the parent Message element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.Message): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.MessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.MessageAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.MessageAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.MessageAttribute.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.24.0: deleted
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedBusinessEventService")
  @js.native
  open class PublishedBusinessEventService protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedBusinessEventService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedBusinessEventService {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedBusinessEventService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedBusinessEventService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedBusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedBusinessEventService]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedBusinessEventService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedBusinessEventService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.24.0: deleted
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedChannel")
  @js.native
  open class PublishedChannel protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedChannel {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedChannel")
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
      *  9.11.0 to 9.23.0
      */
    /* static member */
    inline def createIn(
      container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedBusinessEventService
    ): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedChannel.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedChannel.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.24.0: deleted
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessage")
  @js.native
  open class PublishedMessage protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedMessage {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessage")
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
      *  9.11.0 to 9.23.0
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedChannel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.24.0: deleted
    * In version 9.11.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessageAttribute")
  @js.native
  open class PublishedMessageAttribute protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedMessageAttribute {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessageAttribute")
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
      *  9.11.0 to 9.23.0
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessage): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessageAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.PublishedMessageAttribute.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ServiceOperation")
  @js.native
  open class ServiceOperation protected ()
    extends typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ServiceOperation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ServiceOperation {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ServiceOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ServiceOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ServiceOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ServiceOperation]
    
    /**
      * Creates and returns a new ServiceOperation instance in the SDK and on the server.
      * The new ServiceOperation will be automatically stored in the 'operationImplementations' property
      * of the parent BusinessEventService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.BusinessEventService): typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ServiceOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.ServiceOperation]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ServiceOperation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "businessevents.ServiceOperation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenBusinesseventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
