package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends EventEmitter {
  /**
    * The `process.allowedNodeEnvironmentFlags` property is a special,
    * read-only `Set` of flags allowable within the [`NODE_OPTIONS`][]
    * environment variable.
    */
  var allowedNodeEnvironmentFlags: nodeLib.ReadonlySet[java.lang.String] = js.native
  var arch: java.lang.String = js.native
  var argv: js.Array[java.lang.String] = js.native
  var argv0: java.lang.String = js.native
  var config: nodeLib.Anon_Targetdefaults = js.native
  var connected: scala.Boolean = js.native
  var debugPort: scala.Double = js.native
  var domain: Domain = js.native
  var env: ProcessEnv = js.native
  var execArgv: js.Array[java.lang.String] = js.native
  var execPath: java.lang.String = js.native
  var exitCode: js.UndefOr[scala.Double] = js.native
  var features: nodeLib.Anon_Debug = js.native
  @JSName("hrtime")
  var hrtime_Original: HRTime = js.native
  var mainModule: js.UndefOr[nodeLib.NodeModule] = js.native
  var pid: scala.Double = js.native
  var platform: Platform = js.native
  var ppid: scala.Double = js.native
  var release: ProcessRelease = js.native
  /**
    * Only available with `--experimental-report`
    */
  var report: js.UndefOr[ProcessReport] = js.native
  // Worker
  var send: js.UndefOr[
    js.Function4[
      /* message */ js.Any, 
      /* sendHandle */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[nodeLib.Anon_SwallowErrors], 
      /* callback */ js.UndefOr[js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]], 
      scala.Boolean
    ]
  ] = js.native
  /**
    * Can also be a tty.WriteStream, not typed due to limitation.s
    */
  var stderr: WriteStream = js.native
  var stdin: ReadStream = js.native
  /**
    * Can also be a tty.WriteStream, not typed due to limitation.s
    */
  var stdout: WriteStream = js.native
  var title: java.lang.String = js.native
  var version: java.lang.String = js.native
  var versions: ProcessVersions = js.native
  def abort(): scala.Unit = js.native
  def addListener(event: Signals, listener: SignalsListener): this.type = js.native
  /**
    * EventEmitter
    *   1. beforeExit
    *   2. disconnect
    *   3. exit
    *   4. message
    *   5. rejectionHandled
    *   6. uncaughtException
    *   7. unhandledRejection
    *   8. warning
    *   9. message
    *  10. <All OS Signals>
    *  11. newListener/removeListener inherited from EventEmitter
    */
  @JSName("addListener")
  def addListener_beforeExit(event: nodeLib.nodeLibStrings.beforeExit, listener: BeforeExitListener): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: DisconnectListener): this.type = js.native
  @JSName("addListener")
  def addListener_exit(event: nodeLib.nodeLibStrings.exit, listener: ExitListener): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: nodeLib.nodeLibStrings.message, listener: MessageListener): this.type = js.native
  @JSName("addListener")
  def addListener_multipleResolves(event: nodeLib.nodeLibStrings.multipleResolves, listener: MultipleResolveListener): this.type = js.native
  @JSName("addListener")
  def addListener_newListener(event: nodeLib.nodeLibStrings.newListener, listener: NewListenerListener): this.type = js.native
  @JSName("addListener")
  def addListener_rejectionHandled(event: nodeLib.nodeLibStrings.rejectionHandled, listener: RejectionHandledListener): this.type = js.native
  @JSName("addListener")
  def addListener_removeListener(event: nodeLib.nodeLibStrings.removeListener, listener: RemoveListenerListener): this.type = js.native
  @JSName("addListener")
  def addListener_uncaughtException(event: nodeLib.nodeLibStrings.uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
  @JSName("addListener")
  def addListener_unhandledRejection(event: nodeLib.nodeLibStrings.unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
  @JSName("addListener")
  def addListener_warning(event: nodeLib.nodeLibStrings.warning, listener: WarningListener): this.type = js.native
  def chdir(directory: java.lang.String): scala.Unit = js.native
  def cpuUsage(): CpuUsage = js.native
  def cpuUsage(previousValue: CpuUsage): CpuUsage = js.native
  def cwd(): java.lang.String = js.native
  def disconnect(): scala.Unit = js.native
  def emit(event: Signals, signal: Signals): scala.Boolean = js.native
  def emitWarning(warning: java.lang.String): scala.Unit = js.native
  def emitWarning(warning: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def emitWarning(warning: java.lang.String, name: java.lang.String, ctor: js.Function): scala.Unit = js.native
  def emitWarning(warning: nodeLib.Error): scala.Unit = js.native
  def emitWarning(warning: nodeLib.Error, name: java.lang.String): scala.Unit = js.native
  def emitWarning(warning: nodeLib.Error, name: java.lang.String, ctor: js.Function): scala.Unit = js.native
  @JSName("emit")
  def emit_beforeExit(event: nodeLib.nodeLibStrings.beforeExit, code: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: nodeLib.nodeLibStrings.disconnect): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, code: scala.Double): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(event: nodeLib.nodeLibStrings.message, message: js.Any, sendHandle: js.Any): this.type = js.native
  @JSName("emit")
  def emit_multipleResolves(event: nodeLib.nodeLibStrings.multipleResolves, listener: MultipleResolveListener): this.type = js.native
  @JSName("emit")
  def emit_newListener(
    event: nodeLib.nodeLibStrings.newListener,
    eventName: java.lang.String,
    listener: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_newListener(
    event: nodeLib.nodeLibStrings.newListener,
    eventName: js.Symbol,
    listener: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_rejectionHandled(event: nodeLib.nodeLibStrings.rejectionHandled, promise: js.Promise[_]): scala.Boolean = js.native
  @JSName("emit")
  def emit_removeListener(
    event: nodeLib.nodeLibStrings.removeListener,
    eventName: java.lang.String,
    listener: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_uncaughtException(event: nodeLib.nodeLibStrings.uncaughtException, error: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_unhandledRejection(event: nodeLib.nodeLibStrings.unhandledRejection, reason: js.Any, promise: js.Promise[_]): scala.Boolean = js.native
  @JSName("emit")
  def emit_warning(event: nodeLib.nodeLibStrings.warning, warning: nodeLib.Error): scala.Boolean = js.native
  def exit(): scala.Nothing = js.native
  def exit(code: scala.Double): scala.Nothing = js.native
  def getegid(): scala.Double = js.native
  def geteuid(): scala.Double = js.native
  def getgid(): scala.Double = js.native
  def getgroups(): js.Array[scala.Double] = js.native
  def getuid(): scala.Double = js.native
  def hasUncaughtExceptionCaptureCallback(): scala.Boolean = js.native
  def hrtime(): js.Tuple2[scala.Double, scala.Double] = js.native
  def hrtime(time: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def kill(pid: scala.Double): scala.Unit = js.native
  def kill(pid: scala.Double, signal: java.lang.String): scala.Unit = js.native
  def kill(pid: scala.Double, signal: scala.Double): scala.Unit = js.native
  def listeners(event: Signals): js.Array[SignalsListener] = js.native
  @JSName("listeners")
  def listeners_beforeExit(event: nodeLib.nodeLibStrings.beforeExit): js.Array[BeforeExitListener] = js.native
  @JSName("listeners")
  def listeners_disconnect(event: nodeLib.nodeLibStrings.disconnect): js.Array[DisconnectListener] = js.native
  @JSName("listeners")
  def listeners_exit(event: nodeLib.nodeLibStrings.exit): js.Array[ExitListener] = js.native
  @JSName("listeners")
  def listeners_message(event: nodeLib.nodeLibStrings.message): js.Array[MessageListener] = js.native
  @JSName("listeners")
  def listeners_multipleResolves(event: nodeLib.nodeLibStrings.multipleResolves): js.Array[MultipleResolveListener] = js.native
  @JSName("listeners")
  def listeners_newListener(event: nodeLib.nodeLibStrings.newListener): js.Array[NewListenerListener] = js.native
  @JSName("listeners")
  def listeners_rejectionHandled(event: nodeLib.nodeLibStrings.rejectionHandled): js.Array[RejectionHandledListener] = js.native
  @JSName("listeners")
  def listeners_removeListener(event: nodeLib.nodeLibStrings.removeListener): js.Array[RemoveListenerListener] = js.native
  @JSName("listeners")
  def listeners_uncaughtException(event: nodeLib.nodeLibStrings.uncaughtException): js.Array[UncaughtExceptionListener] = js.native
  @JSName("listeners")
  def listeners_unhandledRejection(event: nodeLib.nodeLibStrings.unhandledRejection): js.Array[UnhandledRejectionListener] = js.native
  @JSName("listeners")
  def listeners_warning(event: nodeLib.nodeLibStrings.warning): js.Array[WarningListener] = js.native
  def memoryUsage(): MemoryUsage = js.native
  def nextTick(callback: js.Function, args: js.Any*): scala.Unit = js.native
  def on(event: Signals, listener: SignalsListener): this.type = js.native
  @JSName("on")
  def on_beforeExit(event: nodeLib.nodeLibStrings.beforeExit, listener: BeforeExitListener): this.type = js.native
  @JSName("on")
  def on_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: DisconnectListener): this.type = js.native
  @JSName("on")
  def on_exit(event: nodeLib.nodeLibStrings.exit, listener: ExitListener): this.type = js.native
  @JSName("on")
  def on_message(event: nodeLib.nodeLibStrings.message, listener: MessageListener): this.type = js.native
  @JSName("on")
  def on_multipleResolves(event: nodeLib.nodeLibStrings.multipleResolves, listener: MultipleResolveListener): this.type = js.native
  @JSName("on")
  def on_newListener(event: nodeLib.nodeLibStrings.newListener, listener: NewListenerListener): this.type = js.native
  @JSName("on")
  def on_rejectionHandled(event: nodeLib.nodeLibStrings.rejectionHandled, listener: RejectionHandledListener): this.type = js.native
  @JSName("on")
  def on_removeListener(event: nodeLib.nodeLibStrings.removeListener, listener: RemoveListenerListener): this.type = js.native
  @JSName("on")
  def on_uncaughtException(event: nodeLib.nodeLibStrings.uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
  @JSName("on")
  def on_unhandledRejection(event: nodeLib.nodeLibStrings.unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
  @JSName("on")
  def on_warning(event: nodeLib.nodeLibStrings.warning, listener: WarningListener): this.type = js.native
  def once(event: Signals, listener: SignalsListener): this.type = js.native
  @JSName("once")
  def once_beforeExit(event: nodeLib.nodeLibStrings.beforeExit, listener: BeforeExitListener): this.type = js.native
  @JSName("once")
  def once_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: DisconnectListener): this.type = js.native
  @JSName("once")
  def once_exit(event: nodeLib.nodeLibStrings.exit, listener: ExitListener): this.type = js.native
  @JSName("once")
  def once_message(event: nodeLib.nodeLibStrings.message, listener: MessageListener): this.type = js.native
  @JSName("once")
  def once_multipleResolves(event: nodeLib.nodeLibStrings.multipleResolves, listener: MultipleResolveListener): this.type = js.native
  @JSName("once")
  def once_newListener(event: nodeLib.nodeLibStrings.newListener, listener: NewListenerListener): this.type = js.native
  @JSName("once")
  def once_rejectionHandled(event: nodeLib.nodeLibStrings.rejectionHandled, listener: RejectionHandledListener): this.type = js.native
  @JSName("once")
  def once_removeListener(event: nodeLib.nodeLibStrings.removeListener, listener: RemoveListenerListener): this.type = js.native
  @JSName("once")
  def once_uncaughtException(event: nodeLib.nodeLibStrings.uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
  @JSName("once")
  def once_unhandledRejection(event: nodeLib.nodeLibStrings.unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
  @JSName("once")
  def once_warning(event: nodeLib.nodeLibStrings.warning, listener: WarningListener): this.type = js.native
  def openStdin(): Socket = js.native
  def prependListener(event: Signals, listener: SignalsListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_beforeExit(event: nodeLib.nodeLibStrings.beforeExit, listener: BeforeExitListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: DisconnectListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: nodeLib.nodeLibStrings.exit, listener: ExitListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: nodeLib.nodeLibStrings.message, listener: MessageListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_multipleResolves(event: nodeLib.nodeLibStrings.multipleResolves, listener: MultipleResolveListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_newListener(event: nodeLib.nodeLibStrings.newListener, listener: NewListenerListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_rejectionHandled(event: nodeLib.nodeLibStrings.rejectionHandled, listener: RejectionHandledListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_removeListener(event: nodeLib.nodeLibStrings.removeListener, listener: RemoveListenerListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_uncaughtException(event: nodeLib.nodeLibStrings.uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_unhandledRejection(event: nodeLib.nodeLibStrings.unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
  @JSName("prependListener")
  def prependListener_warning(event: nodeLib.nodeLibStrings.warning, listener: WarningListener): this.type = js.native
  def prependOnceListener(event: Signals, listener: SignalsListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_beforeExit(event: nodeLib.nodeLibStrings.beforeExit, listener: BeforeExitListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: DisconnectListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: nodeLib.nodeLibStrings.exit, listener: ExitListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: nodeLib.nodeLibStrings.message, listener: MessageListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_multipleResolves(event: nodeLib.nodeLibStrings.multipleResolves, listener: MultipleResolveListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_newListener(event: nodeLib.nodeLibStrings.newListener, listener: NewListenerListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_rejectionHandled(event: nodeLib.nodeLibStrings.rejectionHandled, listener: RejectionHandledListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_removeListener(event: nodeLib.nodeLibStrings.removeListener, listener: RemoveListenerListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_uncaughtException(event: nodeLib.nodeLibStrings.uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unhandledRejection(event: nodeLib.nodeLibStrings.unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_warning(event: nodeLib.nodeLibStrings.warning, listener: WarningListener): this.type = js.native
  def resourceUsage(): ResourceUsage = js.native
  def setUncaughtExceptionCaptureCallback(): scala.Unit = js.native
  def setUncaughtExceptionCaptureCallback(cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def setegid(id: java.lang.String): scala.Unit = js.native
  def setegid(id: scala.Double): scala.Unit = js.native
  def seteuid(id: java.lang.String): scala.Unit = js.native
  def seteuid(id: scala.Double): scala.Unit = js.native
  def setgid(id: java.lang.String): scala.Unit = js.native
  def setgid(id: scala.Double): scala.Unit = js.native
  def setgroups(groups: js.Array[java.lang.String | scala.Double]): scala.Unit = js.native
  def setuid(id: java.lang.String): scala.Unit = js.native
  def setuid(id: scala.Double): scala.Unit = js.native
  /**
    * Can only be set if not in worker thread.
    */
  def umask(): scala.Double = js.native
  def umask(mask: scala.Double): scala.Double = js.native
  def uptime(): scala.Double = js.native
}

