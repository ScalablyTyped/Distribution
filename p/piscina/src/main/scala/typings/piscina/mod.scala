package typings.piscina

import typings.node.workerThreadsMod.MessagePort
import typings.node.workerThreadsMod.Worker
import typings.piscina.distSrcCommonMod.TaskQueue
import typings.piscina.distSrcCommonMod.Transferable
import typings.piscina.piscinaStrings.abort
import typings.piscina.piscinaStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("piscina", JSImport.Namespace)
  @js.native
  open class ^ () extends Piscina {
    def this(options: Options) = this()
  }
  @JSImport("piscina", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def move(`val`: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable]
  inline def move(`val`: js.typedarray.ArrayBufferView): js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable]
  inline def move(`val`: MessagePort): js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable]
  /* static member */
  inline def move(`val`: Transferable): js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable]
  inline def move(`val`: TransferListItem): js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | MessagePort | Transferable]
  
  /* Rewritten from type alias, can be one of: 
    - typings.piscina.mod.AbortSignalEventTarget
    - typings.piscina.mod.AbortSignalEventEmitter
  */
  trait AbortSignalAny extends StObject
  
  trait AbortSignalEventEmitter
    extends StObject
       with AbortSignalAny {
    
    @JSName("off")
    def off_abort(name: abort, listener: js.Function0[Unit]): Unit
    
    @JSName("once")
    def once_abort(name: abort, listener: js.Function0[Unit]): Unit
  }
  object AbortSignalEventEmitter {
    
    inline def apply(off: (abort, js.Function0[Unit]) => Unit, once: (abort, js.Function0[Unit]) => Unit): AbortSignalEventEmitter = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[AbortSignalEventEmitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortSignalEventEmitter] (val x: Self) extends AnyVal {
      
      inline def setOff(value: (abort, js.Function0[Unit]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
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
    
    @JSName("removeEventListener")
    def removeEventListener_abort(name: abort, listener: js.Function0[Unit]): Unit = js.native
  }
  
  trait AbortSignalEventTargetAddOptions extends StObject {
    
    var once: Boolean
  }
  object AbortSignalEventTargetAddOptions {
    
    inline def apply(once: Boolean): AbortSignalEventTargetAddOptions = {
      val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortSignalEventTargetAddOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortSignalEventTargetAddOptions] (val x: Self) extends AnyVal {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    new (filename : string): node.worker_threads.Worker extends {new (filename : never): std.Worker, new (filename : never, options : {  env :infer T}): std.Worker} ? T : never
    }}}
    */
  @js.native
  trait EnvSpecifier extends StObject
  
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
    
    @JSName("name")
    var name_FilledOptions: String
    
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
      name: String,
      niceIncrement: Double,
      taskQueue: TaskQueue,
      useAtomics: Boolean
    ): FilledOptions = {
      val __obj = js.Dynamic.literal(concurrentTasksPerWorker = concurrentTasksPerWorker.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], maxQueue = maxQueue.asInstanceOf[js.Any], maxThreads = maxThreads.asInstanceOf[js.Any], minThreads = minThreads.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], niceIncrement = niceIncrement.asInstanceOf[js.Any], taskQueue = taskQueue.asInstanceOf[js.Any], useAtomics = useAtomics.asInstanceOf[js.Any], filename = null)
      __obj.asInstanceOf[FilledOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilledOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrentTasksPerWorker(value: Double): Self = StObject.set(x, "concurrentTasksPerWorker", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxQueue(value: Double): Self = StObject.set(x, "maxQueue", value.asInstanceOf[js.Any])
      
      inline def setMaxThreads(value: Double): Self = StObject.set(x, "maxThreads", value.asInstanceOf[js.Any])
      
      inline def setMinThreads(value: Double): Self = StObject.set(x, "minThreads", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
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
    
    var name: js.UndefOr[String] = js.undefined
    
    var niceIncrement: js.UndefOr[Double] = js.undefined
    
    var resourceLimits: js.UndefOr[ResourceLimits] = js.undefined
    
    var taskQueue: js.UndefOr[TaskQueue] = js.undefined
    
    var trackUnmanagedFds: js.UndefOr[Boolean] = js.undefined
    
    var useAtomics: js.UndefOr[Boolean] = js.undefined
    
    var workerData: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setConcurrentTasksPerWorker(value: Double): Self = StObject.set(x, "concurrentTasksPerWorker", value.asInstanceOf[js.Any])
      
      inline def setConcurrentTasksPerWorkerUndefined: Self = StObject.set(x, "concurrentTasksPerWorker", js.undefined)
      
      inline def setEnv(value: EnvSpecifier): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
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
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNiceIncrement(value: Double): Self = StObject.set(x, "niceIncrement", value.asInstanceOf[js.Any])
      
      inline def setNiceIncrementUndefined: Self = StObject.set(x, "niceIncrement", js.undefined)
      
      inline def setResourceLimits(value: ResourceLimits): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      inline def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
      
      inline def setTaskQueue(value: TaskQueue): Self = StObject.set(x, "taskQueue", value.asInstanceOf[js.Any])
      
      inline def setTaskQueueUndefined: Self = StObject.set(x, "taskQueue", js.undefined)
      
      inline def setTrackUnmanagedFds(value: Boolean): Self = StObject.set(x, "trackUnmanagedFds", value.asInstanceOf[js.Any])
      
      inline def setTrackUnmanagedFdsUndefined: Self = StObject.set(x, "trackUnmanagedFds", js.undefined)
      
      inline def setUseAtomics(value: Boolean): Self = StObject.set(x, "useAtomics", value.asInstanceOf[js.Any])
      
      inline def setUseAtomicsUndefined: Self = StObject.set(x, "useAtomics", js.undefined)
      
      inline def setWorkerData(value: Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
      
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
    
    /* private */ var `private`: Any = js.native
    
    def queueSize: Double = js.native
    
    def run(task: Any): js.Promise[Any] = js.native
    def run(task: Any, options: RunOptions): js.Promise[Any] = js.native
    
    /** @deprecated Use run(task, options) instead **/
    def runTask(task: Any): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: String): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: String, filename: AbortSignalAny): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: Unit, filename: String): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: Unit, filename: String, abortSignal: AbortSignalAny): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: Unit, filename: Unit, abortSignal: AbortSignalAny): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: Unit, filename: AbortSignalAny): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: AbortSignalAny): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: TransferList): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: TransferList, filename: String): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: TransferList, filename: String, abortSignal: AbortSignalAny): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: TransferList, filename: Unit, abortSignal: AbortSignalAny): js.Promise[Any] = js.native
    def runTask(task: Any, transferList: TransferList, filename: AbortSignalAny): js.Promise[Any] = js.native
    
    def runTime: Any = js.native
    
    def threads: js.Array[Worker] = js.native
    
    def utilization: Double = js.native
    
    def waitTime: Any = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    std.Worker extends {  resourceLimits :infer T | undefined} ? T : {}
    }}}
    */
  @js.native
  trait ResourceLimits extends StObject
  
  trait RunOptions extends StObject {
    
    var filename: js.UndefOr[String | Null] = js.undefined
    
    var name: js.UndefOr[String | Null] = js.undefined
    
    var signal: js.UndefOr[AbortSignalAny | Null] = js.undefined
    
    var transferList: js.UndefOr[TransferList] = js.undefined
  }
  object RunOptions {
    
    inline def apply(): RunOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSignal(value: AbortSignalAny): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTransferList(value: TransferList): Self = StObject.set(x, "transferList", value.asInstanceOf[js.Any])
      
      inline def setTransferListUndefined: Self = StObject.set(x, "transferList", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    std.MessagePort extends {postMessage (value : any, transferList : infer T): any} ? T : never
    }}}
    */
  @js.native
  trait TransferList extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    piscina.piscina.TransferList extends std.Array<infer T> ? T : never
    }}}
    */
  @js.native
  trait TransferListItem extends StObject
}
