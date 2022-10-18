package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.JavaActionCallAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowCall
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queues {
  
  /**
    * In version 9.3.0: removed experimental
    * In version 8.16.0: introduced
    */
  @JSImport("mendixmodelsdk", "queues.BasicQueueConfig")
  @js.native
  open class BasicQueueConfig protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.BasicQueueConfig {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BasicQueueConfig {
    
    @JSImport("mendixmodelsdk", "queues.BasicQueueConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BasicQueueConfig instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenQueuesMod.queues.BasicQueueConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.BasicQueueConfig]
    
    /**
      * Creates and returns a new BasicQueueConfig instance in the SDK and on the server.
      * The new BasicQueueConfig will be automatically stored in the 'config' property
      * of the parent Queue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.16.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenQueuesMod.queues.Queue): typings.mendixmodelsdk.srcGenQueuesMod.queues.BasicQueueConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.BasicQueueConfig]
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.BasicQueueConfig.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.BasicQueueConfig.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/task-queue relevant section in reference guide}
    *
    * In version 9.3.0: removed experimental
    * In version 8.16.0: introduced
    */
  @JSImport("mendixmodelsdk", "queues.Queue")
  @js.native
  open class Queue protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.Queue {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Queue {
    
    @JSImport("mendixmodelsdk", "queues.Queue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Queue unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenQueuesMod.queues.Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.Queue]
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.Queue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.Queue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Queues`.
    */
  /**
    * In version 9.3.0: removed experimental
    * In version 8.16.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "queues.QueueConfig")
  @js.native
  open class QueueConfig protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.QueueConfig {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object QueueConfig {
    
    @JSImport("mendixmodelsdk", "queues.QueueConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueConfig.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueConfig.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "queues.QueueExponentialRetry")
  @js.native
  open class QueueExponentialRetry protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.QueueExponentialRetry {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object QueueExponentialRetry {
    
    @JSImport("mendixmodelsdk", "queues.QueueExponentialRetry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new QueueExponentialRetry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueExponentialRetry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueExponentialRetry]
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueExponentialRetry.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueExponentialRetry.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "queues.QueueFixedRetry")
  @js.native
  open class QueueFixedRetry protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.QueueFixedRetry {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object QueueFixedRetry {
    
    @JSImport("mendixmodelsdk", "queues.QueueFixedRetry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new QueueFixedRetry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueFixedRetry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueFixedRetry]
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueFixedRetry.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueFixedRetry.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.10.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "queues.QueueRetry")
  @js.native
  open class QueueRetry protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.QueueRetry {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object QueueRetry {
    
    @JSImport("mendixmodelsdk", "queues.QueueRetry")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueRetry.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueRetry.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "queues.QueueRetryIntervalType")
  @js.native
  open class QueueRetryIntervalType protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.QueueRetryIntervalType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object QueueRetryIntervalType {
    
    @JSImport("mendixmodelsdk", "queues.QueueRetryIntervalType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueRetryIntervalType.Hours")
    @js.native
    def Hours: typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueRetryIntervalType = js.native
    inline def Hours_=(x: typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueRetryIntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hours")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueRetryIntervalType.Minutes")
    @js.native
    def Minutes: typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueRetryIntervalType = js.native
    inline def Minutes_=(x: typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueRetryIntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minutes")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueRetryIntervalType.Seconds")
    @js.native
    def Seconds: typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueRetryIntervalType = js.native
    inline def Seconds_=(x: typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueRetryIntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Seconds")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "queues.QueueSettings")
  @js.native
  open class QueueSettings protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.queues.QueueSettings {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object QueueSettings {
    
    @JSImport("mendixmodelsdk", "queues.QueueSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new QueueSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings]
    
    /**
      * Creates and returns a new QueueSettings instance in the SDK and on the server.
      * The new QueueSettings will be automatically stored in the 'queueSettings' property
      * of the parent microflows.JavaActionCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 and higher
      */
    /* static member */
    inline def createInJavaActionCallActionUnderQueueSettings(container: JavaActionCallAction): typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionCallActionUnderQueueSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings]
    
    /**
      * Creates and returns a new QueueSettings instance in the SDK and on the server.
      * The new QueueSettings will be automatically stored in the 'queueSettings' property
      * of the parent microflows.MicroflowCall element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 and higher
      */
    /* static member */
    inline def createInMicroflowCallUnderQueueSettings(container: MicroflowCall): typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowCallUnderQueueSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings]
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueSettings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "queues.QueueSettings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenQueuesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
