package typings.piscina

import typings.node.workerThreadsMod.Worker
import typings.piscina.commonMod.TaskQueue
import typings.piscina.commonMod.Transferable
import typings.piscina.piscinaStrings.abort
import typings.piscina.piscinaStrings.auto
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("piscina", JSImport.Namespace)
  @js.native
  class ^ () extends Piscina {
    def this(options: Options) = this()
  }
  
  /* static member */
  @JSImport("piscina", "move")
  @js.native
  def move(`val`: Transferable): ArrayBufferView | Transferable = js.native
  @JSImport("piscina", "move")
  @js.native
  def move(`val`: TransferListItem): ArrayBufferView | Transferable = js.native
  @JSImport("piscina", "move")
  @js.native
  def move(`val`: ArrayBufferView): ArrayBufferView | Transferable = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.piscina.mod.AbortSignalEventTarget
    - typings.piscina.mod.AbortSignalEventEmitter
  */
  trait AbortSignalAny extends StObject
  
  @js.native
  trait AbortSignalEventEmitter extends AbortSignalAny {
    
    @JSName("once")
    def once_abort(name: abort, listener: js.Function0[Unit]): Unit = js.native
  }
  object AbortSignalEventEmitter {
    
    @scala.inline
    def apply(once: (abort, js.Function0[Unit]) => Unit): AbortSignalEventEmitter = {
      val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[AbortSignalEventEmitter]
    }
    
    @scala.inline
    implicit class AbortSignalEventEmitterMutableBuilder[Self <: AbortSignalEventEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: (abort, js.Function0[Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait AbortSignalEventTarget extends AbortSignalAny {
    
    var aborted: js.UndefOr[Boolean] = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(name: abort, listener: js.Function0[Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(name: abort, listener: js.Function0[Unit], options: AbortSignalEventTargetAddOptions): Unit = js.native
  }
  
  @js.native
  trait AbortSignalEventTargetAddOptions extends StObject {
    
    var once: Boolean = js.native
  }
  object AbortSignalEventTargetAddOptions {
    
    @scala.inline
    def apply(once: Boolean): AbortSignalEventTargetAddOptions = {
      val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortSignalEventTargetAddOptions]
    }
    
    @scala.inline
    implicit class AbortSignalEventTargetAddOptionsMutableBuilder[Self <: AbortSignalEventTargetAddOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    }
  }
  
  type EnvSpecifier = js.Any
  
  @js.native
  trait FilledOptions extends Options {
    
    @JSName("concurrentTasksPerWorker")
    var concurrentTasksPerWorker_FilledOptions: Double = js.native
    
    @JSName("filename")
    var filename_FilledOptions: String | Null = js.native
    
    @JSName("idleTimeout")
    var idleTimeout_FilledOptions: Double = js.native
    
    @JSName("maxQueue")
    var maxQueue_FilledOptions: Double = js.native
    
    @JSName("maxThreads")
    var maxThreads_FilledOptions: Double = js.native
    
    @JSName("minThreads")
    var minThreads_FilledOptions: Double = js.native
    
    @JSName("niceIncrement")
    var niceIncrement_FilledOptions: Double = js.native
    
    @JSName("taskQueue")
    var taskQueue_FilledOptions: TaskQueue = js.native
    
    @JSName("useAtomics")
    var useAtomics_FilledOptions: Boolean = js.native
  }
  object FilledOptions {
    
    @scala.inline
    def apply(
      concurrentTasksPerWorker: Double,
      idleTimeout: Double,
      maxQueue: Double,
      maxThreads: Double,
      minThreads: Double,
      niceIncrement: Double,
      taskQueue: TaskQueue,
      useAtomics: Boolean
    ): FilledOptions = {
      val __obj = js.Dynamic.literal(concurrentTasksPerWorker = concurrentTasksPerWorker.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], maxQueue = maxQueue.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], minThreads = minThreads.asInstanceOf[js.Any], niceIncrement = niceIncrement.asInstanceOf[js.Any], taskQueue = taskQueue.asInstanceOf[js.Any], useAtomics = useAtomics.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilledOptions]
    }
    
    @scala.inline
    implicit class FilledOptionsMutableBuilder[Self <: FilledOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrentTasksPerWorker(value: Double): Self = StObject.set(x, "concurrentTasksPerWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxQueue(value: Double): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxThreads(value: Double): Self = StObject.set(x, "maxThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinThreads(value: Double): Self = StObject.set(x, "minThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceIncrement(value: Double): Self = StObject.set(x, "niceIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskQueue(value: TaskQueue): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAtomics(value: Boolean): Self = StObject.set(x, "useAtomics", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.native
    
    var concurrentTasksPerWorker: js.UndefOr[Double] = js.native
    
    var env: js.UndefOr[EnvSpecifier] = js.native
    
    var execArgv: js.UndefOr[js.Array[String]] = js.native
    
    var filename: js.UndefOr[String | Null] = js.native
    
    var idleTimeout: js.UndefOr[Double] = js.native
    
    var maxQueue: js.UndefOr[Double | auto] = js.native
    
    var maxThreads: js.UndefOr[Double] = js.native
    
    var minThreads: js.UndefOr[Double] = js.native
    
    var niceIncrement: js.UndefOr[Double] = js.native
    
    var resourceLimits: js.UndefOr[ResourceLimits] = js.native
    
    var taskQueue: js.UndefOr[TaskQueue] = js.native
    
    var useAtomics: js.UndefOr[Boolean] = js.native
    
    var workerData: js.UndefOr[js.Any] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setConcurrentTasksPerWorker(value: Double): Self = StObject.set(x, "concurrentTasksPerWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentTasksPerWorkerUndefined: Self = StObject.set(x, "concurrentTasksPerWorker", js.undefined)
      
      @scala.inline
      def setEnv(value: EnvSpecifier): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      @scala.inline
      def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      @scala.inline
      def setMaxQueue(value: Double | auto): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxQueueUndefined: Self = StObject.set(x, "maxQueue", js.undefined)
      
      @scala.inline
      def setMaxThreads(value: Double): Self = StObject.set(x, "maxThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxThreadsUndefined: Self = StObject.set(x, "maxThreads", js.undefined)
      
      @scala.inline
      def setMinThreads(value: Double): Self = StObject.set(x, "minThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinThreadsUndefined: Self = StObject.set(x, "minThreads", js.undefined)
      
      @scala.inline
      def setNiceIncrement(value: Double): Self = StObject.set(x, "niceIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceIncrementUndefined: Self = StObject.set(x, "niceIncrement", js.undefined)
      
      @scala.inline
      def setResourceLimits(value: ResourceLimits): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
      
      @scala.inline
      def setTaskQueue(value: TaskQueue): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskQueueUndefined: Self = StObject.set(x, "taskQueue", js.undefined)
      
      @scala.inline
      def setUseAtomics(value: Boolean): Self = StObject.set(x, "useAtomics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAtomicsUndefined: Self = StObject.set(x, "useAtomics", js.undefined)
      
      @scala.inline
      def setWorkerData(value: js.Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerDataUndefined: Self = StObject.set(x, "workerData", js.undefined)
    }
  }
  
  @js.native
  trait Piscina
    extends typings.eventemitterAsyncresource.mod.^ {
    
    def completed: Double = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def duration: Double = js.native
    
    def options: FilledOptions = js.native
    
    var `private`: js.Any = js.native
    
    def queueSize: Double = js.native
    
    def runTask(task: js.Any): js.Promise[_] = js.native
    def runTask(
      task: js.Any,
      transferList: js.UndefOr[scala.Nothing],
      filename: js.UndefOr[scala.Nothing],
      abortSignal: AbortSignalAny
    ): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: js.UndefOr[scala.Nothing], filename: String): js.Promise[_] = js.native
    def runTask(
      task: js.Any,
      transferList: js.UndefOr[scala.Nothing],
      filename: String,
      abortSignal: AbortSignalAny
    ): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: js.UndefOr[scala.Nothing], filename: AbortSignalAny): js.Promise[_] = js.native
    def runTask(
      task: js.Any,
      transferList: js.UndefOr[scala.Nothing],
      filename: AbortSignalAny,
      abortSignal: AbortSignalAny
    ): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: String): js.Promise[_] = js.native
    def runTask(
      task: js.Any,
      transferList: String,
      filename: js.UndefOr[scala.Nothing],
      abortSignal: AbortSignalAny
    ): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: String, filename: String): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: String, filename: String, abortSignal: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: String, filename: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: String, filename: AbortSignalAny, abortSignal: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny): js.Promise[_] = js.native
    def runTask(
      task: js.Any,
      transferList: AbortSignalAny,
      filename: js.UndefOr[scala.Nothing],
      abortSignal: AbortSignalAny
    ): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: String): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: String, abortSignal: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: AbortSignalAny, filename: AbortSignalAny, abortSignal: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: TransferList): js.Promise[_] = js.native
    def runTask(
      task: js.Any,
      transferList: TransferList,
      filename: js.UndefOr[scala.Nothing],
      abortSignal: AbortSignalAny
    ): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: String): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: String, abortSignal: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: AbortSignalAny): js.Promise[_] = js.native
    def runTask(task: js.Any, transferList: TransferList, filename: AbortSignalAny, abortSignal: AbortSignalAny): js.Promise[_] = js.native
    
    def runTime: js.Any = js.native
    
    def threads: js.Array[Worker] = js.native
    
    def utilization: Double = js.native
    
    def waitTime: js.Any = js.native
  }
  
  type ResourceLimits = js.Object
  
  type TransferList = js.Any
  
  type TransferListItem = js.Any
}
