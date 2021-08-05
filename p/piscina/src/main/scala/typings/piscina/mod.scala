package typings.piscina

import typings.node.workerThreadsMod.Worker
import typings.piscina.commonMod.TaskQueue
import typings.piscina.commonMod.Transferable
import typings.piscina.piscinaStrings.abort
import typings.piscina.piscinaStrings.auto
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("piscina", JSImport.Namespace)
  @js.native
  class ^ () extends Piscina {
    def this(options: Options) = this()
  }
  @JSImport("piscina", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def move(`val`: Transferable): ArrayBufferView | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferView | Transferable]
  inline def move(`val`: TransferListItem): ArrayBufferView | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferView | Transferable]
  inline def move(`val`: ArrayBufferView): ArrayBufferView | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferView | Transferable]
  
  /* Rewritten from type alias, can be one of: 
    - typings.piscina.mod.AbortSignalEventTarget
    - typings.piscina.mod.AbortSignalEventEmitter
  */
  trait AbortSignalAny extends StObject
  
  trait AbortSignalEventEmitter
    extends StObject
       with AbortSignalAny {
    
    @JSName("once")
    def once_abort(name: abort, listener: js.Function0[Unit]): Unit
  }
  object AbortSignalEventEmitter {
    
    inline def apply(once: (abort, js.Function0[Unit]) => Unit): AbortSignalEventEmitter = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[AbortSignalEventEmitter]
    }
    
    extension [Self <: AbortSignalEventEmitter](x: Self) {
      
      inline def setOnce(value: (abort, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait AbortSignalEventTarget
    extends StObject
       with AbortSignalAny {
    
    var aborted: js.UndefOr[Boolean] = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(name: abort, listener: js.Function0[Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(name: abort, listener: js.Function0[Unit], options: AbortSignalEventTargetAddOptions): Unit = js.native
  }
  
  trait AbortSignalEventTargetAddOptions extends StObject {
    
    var once: Boolean
  }
  object AbortSignalEventTargetAddOptions {
    
    inline def apply(once: Boolean): AbortSignalEventTargetAddOptions = {
      val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortSignalEventTargetAddOptions]
    }
    
    extension [Self <: AbortSignalEventTargetAddOptions](x: Self) {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    }
  }
  
  type EnvSpecifier = js.Any
  
  trait FilledOptions
    extends StObject
       with Options {
    
    @JSName("concurrentTasksPerWorker")
    var concurrentTasksPerWorker_FilledOptions: Double
    
    @JSName("filename")
    var filename_FilledOptions: String | Null
    
    @JSName("idleTimeout")
    var idleTimeout_FilledOptions: Double
    
    @JSName("maxQueue")
    var maxQueue_FilledOptions: Double
    
    @JSName("maxThreads")
    var maxThreads_FilledOptions: Double
    
    @JSName("minThreads")
    var minThreads_FilledOptions: Double
    
    @JSName("niceIncrement")
    var niceIncrement_FilledOptions: Double
    
    @JSName("taskQueue")
    var taskQueue_FilledOptions: TaskQueue
    
    @JSName("useAtomics")
    var useAtomics_FilledOptions: Boolean
  }
  object FilledOptions {
    
    inline def apply(
      concurrentTasksPerWorker: Double,
      idleTimeout: Double,
      maxQueue: Double,
      maxThreads: Double,
      minThreads: Double,
      niceIncrement: Double,
      taskQueue: TaskQueue,
      useAtomics: Boolean
    ): FilledOptions = {
      val __obj = js.Dynamic.literal(concurrentTasksPerWorker = concurrentTasksPerWorker.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], maxQueue = maxQueue.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], minThreads = minThreads.asInstanceOf[js.Any], niceIncrement = niceIncrement.asInstanceOf[js.Any], taskQueue = taskQueue.asInstanceOf[js.Any], useAtomics = useAtomics.asInstanceOf[js.Any], filename = null)
      __obj.asInstanceOf[FilledOptions]
    }
    
    extension [Self <: FilledOptions](x: Self) {
      
      inline def setConcurrentTasksPerWorker(value: Double): Self = StObject.set(x, "concurrentTasksPerWorker", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxQueue(value: Double): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      inline def setMaxThreads(value: Double): Self = StObject.set(x, "maxThreads", value.asInstanceOf[js.Any])
      
      inline def setMinThreads(value: Double): Self = StObject.set(x, "minThreads", value.asInstanceOf[js.Any])
      
      inline def setNiceIncrement(value: Double): Self = StObject.set(x, "niceIncrement", value.asInstanceOf[js.Any])
      
      inline def setTaskQueue(value: TaskQueue): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
      
      inline def setUseAtomics(value: Boolean): Self = StObject.set(x, "useAtomics", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.undefined
    
    var concurrentTasksPerWorker: js.UndefOr[Double] = js.undefined
    
    var env: js.UndefOr[EnvSpecifier] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    var filename: js.UndefOr[String | Null] = js.undefined
    
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    var maxQueue: js.UndefOr[Double | auto] = js.undefined
    
    var maxThreads: js.UndefOr[Double] = js.undefined
    
    var minThreads: js.UndefOr[Double] = js.undefined
    
    var niceIncrement: js.UndefOr[Double] = js.undefined
    
    var resourceLimits: js.UndefOr[ResourceLimits] = js.undefined
    
    var taskQueue: js.UndefOr[TaskQueue] = js.undefined
    
    var useAtomics: js.UndefOr[Boolean] = js.undefined
    
    var workerData: js.UndefOr[js.Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      inline def setConcurrentTasksPerWorker(value: Double): Self = StObject.set(x, "concurrentTasksPerWorker", value.asInstanceOf[js.Any])
      
      inline def setConcurrentTasksPerWorkerUndefined: Self = StObject.set(x, "concurrentTasksPerWorker", js.undefined)
      
      inline def setEnv(value: EnvSpecifier): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setMaxQueue(value: Double | auto): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueUndefined: Self = StObject.set(x, "maxQueue", js.undefined)
      
      inline def setMaxThreads(value: Double): Self = StObject.set(x, "maxThreads", value.asInstanceOf[js.Any])
      
      inline def setMaxThreadsUndefined: Self = StObject.set(x, "maxThreads", js.undefined)
      
      inline def setMinThreads(value: Double): Self = StObject.set(x, "minThreads", value.asInstanceOf[js.Any])
      
      inline def setMinThreadsUndefined: Self = StObject.set(x, "minThreads", js.undefined)
      
      inline def setNiceIncrement(value: Double): Self = StObject.set(x, "niceIncrement", value.asInstanceOf[js.Any])
      
      inline def setNiceIncrementUndefined: Self = StObject.set(x, "niceIncrement", js.undefined)
      
      inline def setResourceLimits(value: ResourceLimits): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      inline def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
      
      inline def setTaskQueue(value: TaskQueue): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueUndefined: Self = StObject.set(x, "taskQueue", js.undefined)
      
      inline def setUseAtomics(value: Boolean): Self = StObject.set(x, "useAtomics", value.asInstanceOf[js.Any])
      
      inline def setUseAtomicsUndefined: Self = StObject.set(x, "useAtomics", js.undefined)
      
      inline def setWorkerData(value: js.Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
      
      inline def setWorkerDataUndefined: Self = StObject.set(x, "workerData", js.undefined)
    }
  }
  
  @js.native
  trait Piscina
    extends typings.eventemitterAsyncresource.mod.^ {
    
    def completed: Double = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def duration: Double = js.native
    
    def options: FilledOptions = js.native
    
    /* private */ var `private`: js.Any = js.native
    
    def queueSize: Double = js.native
    
    def runTask(task: js.Any): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: String): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: String, filename: String): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: String, filename: String, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: String, filename: Unit, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: String, filename: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: String, filename: AbortSignalAny, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: Unit, filename: String): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: Unit, filename: String, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: Unit, filename: Unit, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: Unit, filename: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: Unit, filename: AbortSignalAny, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: String): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: String, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: Unit, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: AbortSignalAny, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: TransferList): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: String): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: String, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: Unit, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: AbortSignalAny): js.Promise[js.Any] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: AbortSignalAny, abortSignal: AbortSignalAny): js.Promise[js.Any] = js.native
    
    def runTime: js.Any = js.native
    
    def threads: js.Array[Worker] = js.native
    
    def utilization: Double = js.native
    
    def waitTime: js.Any = js.native
  }
  
  type ResourceLimits = js.Object
  
  type TransferList = js.Any
  
  type TransferListItem = js.Any
}
