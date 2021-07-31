package typings.node

import typings.node.NodeJS.Dict
import typings.node.anon.Message
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.nodeStrings.close
import typings.node.nodeStrings.error
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.message
import typings.node.nodeStrings.messageerror
import typings.node.nodeStrings.online
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import typings.node.vmMod.Context
import typings.std.ArrayBuffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerThreadsMod {
  
  @JSImport("worker_threads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("worker_threads", "MessageChannel")
  @js.native
  class MessageChannel () extends StObject {
    
    val port1: MessagePort = js.native
    
    val port2: MessagePort = js.native
  }
  
  @JSImport("worker_threads", "MessagePort")
  @js.native
  class MessagePort ()
    extends EventEmitter
       with _TransferListItem {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    def close(): Unit = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, value: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_messageerror(event: messageerror, error: Error): Boolean = js.native
    
    @JSName("off")
    def off_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("off")
    def off_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    def postMessage(value: js.Any): Unit = js.native
    def postMessage(value: js.Any, transferList: js.Array[TransferListItem]): Unit = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    def ref(): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    def start(): Unit = js.native
    
    def unref(): Unit = js.native
  }
  
  @JSImport("worker_threads", "SHARE_ENV")
  @js.native
  val SHARE_ENV: js.Symbol = js.native
  
  @JSImport("worker_threads", "Worker")
  @js.native
  class Worker protected () extends EventEmitter {
    /**
      * @param filename  The path to the Worker’s main script or module.
      *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
      *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
      */
    def this(filename: java.lang.String) = this()
    def this(filename: URL_) = this()
    def this(filename: java.lang.String, options: WorkerOptions) = this()
    def this(filename: URL_, options: WorkerOptions) = this()
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_exit(event: exit, exitCode: Double): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, value: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_messageerror(event: messageerror, error: Error): Boolean = js.native
    @JSName("emit")
    def emit_online(event: online): Boolean = js.native
    
    /**
      * Returns a readable stream for a V8 snapshot of the current state of the Worker.
      * See [`v8.getHeapSnapshot()`][] for more details.
      *
      * If the Worker thread is no longer running, which may occur before the
      * [`'exit'` event][] is emitted, the returned `Promise` will be rejected
      * immediately with an [`ERR_WORKER_NOT_RUNNING`][] error
      */
    def getHeapSnapshot(): js.Promise[Readable] = js.native
    
    @JSName("off")
    def off_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("off")
    def off_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("off")
    def off_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("off")
    def off_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("off")
    def off_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def postMessage(value: js.Any): Unit = js.native
    def postMessage(value: js.Any, transferList: js.Array[TransferListItem]): Unit = js.native
    
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def ref(): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, listener: js.Function1[/* value */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_messageerror(event: messageerror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    val resourceLimits: js.UndefOr[ResourceLimits_] = js.native
    
    val stderr: Readable = js.native
    
    val stdin: Writable | Null = js.native
    
    val stdout: Readable = js.native
    
    /**
      * Stop all JavaScript execution in the worker thread as soon as possible.
      * Returns a Promise for the exit code that is fulfilled when the `exit` event is emitted.
      */
    def terminate(): js.Promise[Double] = js.native
    
    val threadId: Double = js.native
    
    def unref(): Unit = js.native
  }
  
  @JSImport("worker_threads", "isMainThread")
  @js.native
  val isMainThread: Boolean = js.native
  
  /**
    * Mark an object as not transferable.
    * If `object` occurs in the transfer list of a `port.postMessage()` call, it will be ignored.
    *
    * In particular, this makes sense for objects that can be cloned, rather than transferred,
    * and which are used by other objects on the sending side. For example, Node.js marks
    * the `ArrayBuffer`s it uses for its Buffer pool with this.
    *
    * This operation cannot be undone.
    */
  @scala.inline
  def markAsUntransferable(`object`: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markAsUntransferable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Transfer a `MessagePort` to a different `vm` Context. The original `port`
    * object will be rendered unusable, and the returned `MessagePort` instance will
    * take its place.
    *
    * The returned `MessagePort` will be an object in the target context, and will
    * inherit from its global `Object` class. Objects passed to the
    * `port.onmessage()` listener will also be created in the target context
    * and inherit from its global `Object` class.
    *
    * However, the created `MessagePort` will no longer inherit from
    * `EventEmitter`, and only `port.onmessage()` can be used to receive
    * events using it.
    */
  @scala.inline
  def moveMessagePortToContext(port: MessagePort, context: Context): MessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("moveMessagePortToContext")(port.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[MessagePort]
  
  @JSImport("worker_threads", "parentPort")
  @js.native
  val parentPort: Null | MessagePort = js.native
  
  /**
    * Receive a single message from a given `MessagePort`. If no message is available,
    * `undefined` is returned, otherwise an object with a single `message` property
    * that contains the message payload, corresponding to the oldest message in the
    * `MessagePort`’s queue.
    */
  @scala.inline
  def receiveMessageOnPort(port: MessagePort): js.UndefOr[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("receiveMessageOnPort")(port.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Message]]
  
  @JSImport("worker_threads", "resourceLimits")
  @js.native
  val resourceLimits: ResourceLimits_ = js.native
  
  @JSImport("worker_threads", "threadId")
  @js.native
  val threadId: Double = js.native
  
  @JSImport("worker_threads", "workerData")
  @js.native
  val workerData: js.Any = js.native
  
  trait ResourceLimits_ extends StObject {
    
    /**
      * The size of a pre-allocated memory range used for generated code.
      */
    var codeRangeSizeMb: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size of the main heap in MB.
      */
    var maxOldGenerationSizeMb: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size of a heap space for recently created objects.
      */
    var maxYoungGenerationSizeMb: js.UndefOr[Double] = js.undefined
    
    /**
      * The default maximum stack size for the thread. Small values may lead to unusable Worker instances.
      * @default 4
      */
    var stackSizeMb: js.UndefOr[Double] = js.undefined
  }
  object ResourceLimits_ {
    
    @scala.inline
    def apply(): ResourceLimits_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceLimits_]
    }
    
    @scala.inline
    implicit class ResourceLimits_MutableBuilder[Self <: ResourceLimits_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeRangeSizeMb(value: Double): Self = StObject.set(x, "codeRangeSizeMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeRangeSizeMbUndefined: Self = StObject.set(x, "codeRangeSizeMb", js.undefined)
      
      @scala.inline
      def setMaxOldGenerationSizeMb(value: Double): Self = StObject.set(x, "maxOldGenerationSizeMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOldGenerationSizeMbUndefined: Self = StObject.set(x, "maxOldGenerationSizeMb", js.undefined)
      
      @scala.inline
      def setMaxYoungGenerationSizeMb(value: Double): Self = StObject.set(x, "maxYoungGenerationSizeMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxYoungGenerationSizeMbUndefined: Self = StObject.set(x, "maxYoungGenerationSizeMb", js.undefined)
      
      @scala.inline
      def setStackSizeMb(value: Double): Self = StObject.set(x, "stackSizeMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackSizeMbUndefined: Self = StObject.set(x, "stackSizeMb", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.ArrayBuffer
    - typings.node.workerThreadsMod.MessagePort
    - typings.node.promisesMod.FileHandle
  */
  type TransferListItem = _TransferListItem | ArrayBuffer
  
  trait WorkerOptions extends StObject {
    
    /**
      * List of arguments which would be stringified and appended to
      * `process.argv` in the worker. This is mostly similar to the `workerData`
      * but the values will be available on the global `process.argv` as if they
      * were passed as CLI options to the script.
      */
    var argv: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var env: js.UndefOr[Dict[java.lang.String] | js.Symbol] = js.undefined
    
    var eval: js.UndefOr[Boolean] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    
    var resourceLimits: js.UndefOr[ResourceLimits_] = js.undefined
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdin: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    var trackUnmanagedFds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional data to send in the first worker message.
      */
    var transferList: js.UndefOr[js.Array[TransferListItem]] = js.undefined
    
    var workerData: js.UndefOr[js.Any] = js.undefined
  }
  object WorkerOptions {
    
    @scala.inline
    def apply(): WorkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerOptions]
    }
    
    @scala.inline
    implicit class WorkerOptionsMutableBuilder[Self <: WorkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[js.Any]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      @scala.inline
      def setArgvVarargs(value: js.Any*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: Dict[java.lang.String] | js.Symbol): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      @scala.inline
      def setExecArgv(value: js.Array[java.lang.String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      @scala.inline
      def setExecArgvVarargs(value: java.lang.String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
      
      @scala.inline
      def setResourceLimits(value: ResourceLimits_): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
      
      @scala.inline
      def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setTrackUnmanagedFds(value: Boolean): Self = StObject.set(x, "trackUnmanagedFds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUnmanagedFdsUndefined: Self = StObject.set(x, "trackUnmanagedFds", js.undefined)
      
      @scala.inline
      def setTransferList(value: js.Array[TransferListItem]): Self = StObject.set(x, "transferList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferListUndefined: Self = StObject.set(x, "transferList", js.undefined)
      
      @scala.inline
      def setTransferListVarargs(value: TransferListItem*): Self = StObject.set(x, "transferList", js.Array(value :_*))
      
      @scala.inline
      def setWorkerData(value: js.Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerDataUndefined: Self = StObject.set(x, "workerData", js.undefined)
    }
  }
  
  trait _TransferListItem extends StObject
}
