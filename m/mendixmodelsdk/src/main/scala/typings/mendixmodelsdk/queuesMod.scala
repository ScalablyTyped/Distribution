package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.JavaActionCallAction
import typings.mendixmodelsdk.microflowsMod.microflows.MicroflowCall
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queuesMod {
  
  @JSImport("mendixmodelsdk/src/gen/queues", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object queues {
    
    /**
      * In version 9.3.0: removed experimental
      * In version 8.16.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/queues", "queues.BasicQueueConfig")
    @js.native
    open class BasicQueueConfig protected () extends QueueConfig {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 9.13.0: introduced
        */
      def clusterWide: Boolean = js.native
      def clusterWide_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 9.12.0: deleted
        * In version 8.16.0: introduced
        */
      def parallelism: Double = js.native
      
      /**
        * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
        *
        * In version 9.12.0: introduced
        */
      def parallelismExpression: String = js.native
      def parallelismExpression_=(newValue: String): Unit = js.native
      
      def parallelism_=(newValue: Double): Unit = js.native
    }
    object BasicQueueConfig {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.BasicQueueConfig")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BasicQueueConfig instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): BasicQueueConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BasicQueueConfig]
      
      /**
        * Creates and returns a new BasicQueueConfig instance in the SDK and on the server.
        * The new BasicQueueConfig will be automatically stored in the 'config' property
        * of the parent Queue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.16.0 and higher
        */
      /* static member */
      inline def createIn(container: Queue): BasicQueueConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[BasicQueueConfig]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.BasicQueueConfig.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.BasicQueueConfig.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/task-queue relevant section in reference guide}
      *
      * In version 9.3.0: removed experimental
      * In version 8.16.0: introduced
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
    - typings.mendixmodelsdk.queuesMod.queues.IQueue because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/queues", "queues.Queue")
    @js.native
    open class Queue protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      def config: QueueConfig = js.native
      def config_=(newValue: QueueConfig): Unit = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MQueue: FolderBase = js.native
    }
    object Queue {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.Queue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Queue unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Queue]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.Queue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.Queue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Queues`.
      */
    /**
      * In version 9.3.0: removed experimental
      * In version 8.16.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueConfig")
    @js.native
    abstract class QueueConfig protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsQueue: Queue = js.native
    }
    object QueueConfig {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueConfig")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueConfig.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueConfig.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.10.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueExponentialRetry")
    @js.native
    open class QueueExponentialRetry protected () extends QueueRetry {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def initialInterval: Double = js.native
      def initialInterval_=(newValue: Double): Unit = js.native
      
      def intervalType: QueueRetryIntervalType = js.native
      def intervalType_=(newValue: QueueRetryIntervalType): Unit = js.native
      
      def maximumInterval: Double = js.native
      def maximumInterval_=(newValue: Double): Unit = js.native
      
      def retries: Double = js.native
      def retries_=(newValue: Double): Unit = js.native
    }
    object QueueExponentialRetry {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueExponentialRetry")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new QueueExponentialRetry instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): QueueExponentialRetry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[QueueExponentialRetry]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueExponentialRetry.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueExponentialRetry.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.10.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueFixedRetry")
    @js.native
    open class QueueFixedRetry protected () extends QueueRetry {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def interval: Double = js.native
      
      def intervalType: QueueRetryIntervalType = js.native
      def intervalType_=(newValue: QueueRetryIntervalType): Unit = js.native
      
      def interval_=(newValue: Double): Unit = js.native
      
      def retries: Double = js.native
      def retries_=(newValue: Double): Unit = js.native
    }
    object QueueFixedRetry {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueFixedRetry")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new QueueFixedRetry instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): QueueFixedRetry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[QueueFixedRetry]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueFixedRetry.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueFixedRetry.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.10.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetry")
    @js.native
    abstract class QueueRetry protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsQueueSettings: QueueSettings = js.native
    }
    object QueueRetry {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetry")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetry.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetry.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetryIntervalType")
    @js.native
    open class QueueRetryIntervalType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object QueueRetryIntervalType {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetryIntervalType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetryIntervalType.Hours")
      @js.native
      def Hours: QueueRetryIntervalType = js.native
      inline def Hours_=(x: QueueRetryIntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hours")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetryIntervalType.Minutes")
      @js.native
      def Minutes: QueueRetryIntervalType = js.native
      inline def Minutes_=(x: QueueRetryIntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minutes")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueRetryIntervalType.Seconds")
      @js.native
      def Seconds: QueueRetryIntervalType = js.native
      inline def Seconds_=(x: QueueRetryIntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Seconds")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.10.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueSettings")
    @js.native
    open class QueueSettings protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsJavaActionCallAction: JavaActionCallAction = js.native
      
      def containerAsMicroflowCall: MicroflowCall = js.native
      
      def queue: IQueue | Null = js.native
      
      def queueQualifiedName: String | Null = js.native
      
      def queue_=(newValue: IQueue | Null): Unit = js.native
      
      def retry: QueueRetry | Null = js.native
      def retry_=(newValue: QueueRetry | Null): Unit = js.native
    }
    object QueueSettings {
      
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueSettings")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new QueueSettings instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): QueueSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[QueueSettings]
      
      /**
        * Creates and returns a new QueueSettings instance in the SDK and on the server.
        * The new QueueSettings will be automatically stored in the 'queueSettings' property
        * of the parent microflows.JavaActionCallAction element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.10.0 and higher
        */
      /* static member */
      inline def createInJavaActionCallActionUnderQueueSettings(container: JavaActionCallAction): QueueSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJavaActionCallActionUnderQueueSettings")(container.asInstanceOf[js.Any]).asInstanceOf[QueueSettings]
      
      /**
        * Creates and returns a new QueueSettings instance in the SDK and on the server.
        * The new QueueSettings will be automatically stored in the 'queueSettings' property
        * of the parent microflows.MicroflowCall element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.10.0 and higher
        */
      /* static member */
      inline def createInMicroflowCallUnderQueueSettings(container: MicroflowCall): QueueSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowCallUnderQueueSettings")(container.asInstanceOf[js.Any]).asInstanceOf[QueueSettings]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueSettings.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/queues", "queues.QueueSettings.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/task-queue relevant section in reference guide}
      *
      * In version 9.3.0: removed experimental
      * In version 8.16.0: introduced
      */
    @js.native
    trait IQueue
      extends StObject
         with IDocument
  }
}
