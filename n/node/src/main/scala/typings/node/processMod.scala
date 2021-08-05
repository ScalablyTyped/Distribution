package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.Dict
import typings.node.NodeJS.Module
import typings.node.NodeJS.ReadWriteStream
import typings.node.anon.Debug
import typings.node.anon.ReadStreamfd0
import typings.node.anon.SwallowErrors
import typings.node.anon.Targetdefaults
import typings.node.anon.WriteStreamfd1
import typings.node.anon.WriteStreamfd2
import typings.node.domainMod.global.NodeJS.Domain
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.nodeBooleans.`true`
import typings.node.nodeStrings.beforeExit
import typings.node.nodeStrings.disconnect
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.message
import typings.node.nodeStrings.multipleResolves
import typings.node.nodeStrings.newListener
import typings.node.nodeStrings.rejectionHandled
import typings.node.nodeStrings.removeListener
import typings.node.nodeStrings.uncaughtException
import typings.node.nodeStrings.uncaughtExceptionMonitor
import typings.node.nodeStrings.unhandledRejection
import typings.node.nodeStrings.warning
import typings.node.processMod.global.NodeJS.Process
import typings.std.Error
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processMod extends Shortcut {
  
  @JSImport("process", JSImport.Namespace)
  @js.native
  val ^ : Process = js.native
  
  object global {
    
    @JSGlobal("process")
    @js.native
    def process: Process = js.native
    inline def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
    
    object NodeJS {
      
      type BeforeExitListener = js.Function1[/* code */ Double, Unit]
      
      trait CpuUsage extends StObject {
        
        var system: Double
        
        var user: Double
      }
      object CpuUsage {
        
        inline def apply(system: Double, user: Double): CpuUsage = {
          val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
          __obj.asInstanceOf[CpuUsage]
        }
        
        extension [Self <: CpuUsage](x: Self) {
          
          inline def setSystem(value: Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
          
          inline def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        }
      }
      
      type DisconnectListener = js.Function0[Unit]
      
      type ExitListener = js.Function1[/* code */ Double, Unit]
      
      trait Global extends StObject {
        
        var process: Process
      }
      object Global {
        
        inline def apply(process: Process): Global = {
          val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        extension [Self <: Global](x: Self) {
          
          inline def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait HRTime extends StObject {
        
        def apply(): js.Tuple2[Double, Double] = js.native
        def apply(time: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
        
        def bigint(): js.BigInt = js.native
      }
      
      trait MemoryUsage extends StObject {
        
        var arrayBuffers: Double
        
        var external: Double
        
        var heapTotal: Double
        
        var heapUsed: Double
        
        var rss: Double
      }
      object MemoryUsage {
        
        inline def apply(arrayBuffers: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): MemoryUsage = {
          val __obj = js.Dynamic.literal(arrayBuffers = arrayBuffers.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
          __obj.asInstanceOf[MemoryUsage]
        }
        
        extension [Self <: MemoryUsage](x: Self) {
          
          inline def setArrayBuffers(value: Double): Self = StObject.set(x, "arrayBuffers", value.asInstanceOf[js.Any])
          
          inline def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
          
          inline def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
          
          inline def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
          
          inline def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
        }
      }
      
      type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, Unit]
      
      type MultipleResolveListener = js.Function3[
            /* type */ MultipleResolveType, 
            /* promise */ js.Promise[js.Any], 
            /* value */ js.Any, 
            Unit
          ]
      
      /* Rewritten from type alias, can be one of: 
        - typings.node.nodeStrings.resolve
        - typings.node.nodeStrings.reject
      */
      trait MultipleResolveType extends StObject
      object MultipleResolveType {
        
        inline def reject: typings.node.nodeStrings.reject = "reject".asInstanceOf[typings.node.nodeStrings.reject]
        
        inline def resolve: typings.node.nodeStrings.resolve = "resolve".asInstanceOf[typings.node.nodeStrings.resolve]
      }
      
      type NewListenerListener = js.Function2[
            /* type */ java.lang.String | js.Symbol, 
            /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
            Unit
          ]
      
      /* Rewritten from type alias, can be one of: 
        - typings.node.nodeStrings.aix
        - typings.node.nodeStrings.android
        - typings.node.nodeStrings.darwin
        - typings.node.nodeStrings.freebsd
        - typings.node.nodeStrings.linux
        - typings.node.nodeStrings.openbsd
        - typings.node.nodeStrings.sunos
        - typings.node.nodeStrings.win32
        - typings.node.nodeStrings.cygwin
        - typings.node.nodeStrings.netbsd
      */
      trait Platform extends StObject
      object Platform {
        
        inline def aix: typings.node.nodeStrings.aix = "aix".asInstanceOf[typings.node.nodeStrings.aix]
        
        inline def android: typings.node.nodeStrings.android = "android".asInstanceOf[typings.node.nodeStrings.android]
        
        inline def cygwin: typings.node.nodeStrings.cygwin = "cygwin".asInstanceOf[typings.node.nodeStrings.cygwin]
        
        inline def darwin: typings.node.nodeStrings.darwin = "darwin".asInstanceOf[typings.node.nodeStrings.darwin]
        
        inline def freebsd: typings.node.nodeStrings.freebsd = "freebsd".asInstanceOf[typings.node.nodeStrings.freebsd]
        
        inline def linux: typings.node.nodeStrings.linux = "linux".asInstanceOf[typings.node.nodeStrings.linux]
        
        inline def netbsd: typings.node.nodeStrings.netbsd = "netbsd".asInstanceOf[typings.node.nodeStrings.netbsd]
        
        inline def openbsd: typings.node.nodeStrings.openbsd = "openbsd".asInstanceOf[typings.node.nodeStrings.openbsd]
        
        inline def sunos: typings.node.nodeStrings.sunos = "sunos".asInstanceOf[typings.node.nodeStrings.sunos]
        
        inline def win32: typings.node.nodeStrings.win32 = "win32".asInstanceOf[typings.node.nodeStrings.win32]
      }
      
      @js.native
      trait Process
        extends StObject
           with EventEmitter {
        
        def abort(): scala.Nothing = js.native
        
        def addListener(event: Signals, listener: SignalsListener): this.type = js.native
        /* EventEmitter */
        @JSName("addListener")
        def addListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("addListener")
        def addListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("addListener")
        def addListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("addListener")
        def addListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("addListener")
        def addListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("addListener")
        def addListener_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("addListener")
        def addListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("addListener")
        def addListener_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("addListener")
        def addListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        def addListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        def addListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("addListener")
        def addListener_warning(event: warning, listener: WarningListener): this.type = js.native
        
        /**
          * The `process.allowedNodeEnvironmentFlags` property is a special,
          * read-only `Set` of flags allowable within the [`NODE_OPTIONS`][]
          * environment variable.
          */
        var allowedNodeEnvironmentFlags: ReadonlySet[java.lang.String] = js.native
        
        var arch: java.lang.String = js.native
        
        var argv: js.Array[java.lang.String] = js.native
        
        var argv0: java.lang.String = js.native
        
        def chdir(directory: java.lang.String): Unit = js.native
        
        var config: Targetdefaults = js.native
        
        var connected: Boolean = js.native
        
        def cpuUsage(): CpuUsage = js.native
        def cpuUsage(previousValue: CpuUsage): CpuUsage = js.native
        
        def cwd(): java.lang.String = js.native
        
        var debugPort: Double = js.native
        
        def disconnect(): Unit = js.native
        
        var domain: Domain = js.native
        
        def emit(event: Signals, signal: Signals): Boolean = js.native
        
        def emitWarning(warning: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, name: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, name: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, name: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: Error): Unit = js.native
        def emitWarning(warning: Error, name: java.lang.String): Unit = js.native
        def emitWarning(warning: Error, name: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: Error, name: Unit, ctor: js.Function): Unit = js.native
        
        @JSName("emit")
        def emit_beforeExit(event: beforeExit, code: Double): Boolean = js.native
        @JSName("emit")
        def emit_disconnect(event: disconnect): Boolean = js.native
        @JSName("emit")
        def emit_exit(event: exit, code: Double): Boolean = js.native
        @JSName("emit")
        def emit_message(event: message, message: js.Any, sendHandle: js.Any): this.type = js.native
        @JSName("emit")
        def emit_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("emit")
        def emit_newListener(
          event: newListener,
          eventName: java.lang.String,
          listener: js.Function1[/* repeated */ js.Any, Unit]
        ): this.type = js.native
        @JSName("emit")
        def emit_newListener(event: newListener, eventName: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        @JSName("emit")
        def emit_rejectionHandled(event: rejectionHandled, promise: js.Promise[js.Any]): Boolean = js.native
        @JSName("emit")
        def emit_removeListener(
          event: removeListener,
          eventName: java.lang.String,
          listener: js.Function1[/* repeated */ js.Any, Unit]
        ): this.type = js.native
        @JSName("emit")
        def emit_uncaughtException(event: uncaughtException, error: Error): Boolean = js.native
        @JSName("emit")
        def emit_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, error: Error): Boolean = js.native
        @JSName("emit")
        def emit_unhandledRejection(event: unhandledRejection, reason: js.Any, promise: js.Promise[js.Any]): Boolean = js.native
        @JSName("emit")
        def emit_warning(event: warning, warning: Error): Boolean = js.native
        
        var env: ProcessEnv = js.native
        
        var execArgv: js.Array[java.lang.String] = js.native
        
        var execPath: java.lang.String = js.native
        
        def exit(): scala.Nothing = js.native
        def exit(code: Double): scala.Nothing = js.native
        
        var exitCode: js.UndefOr[Double] = js.native
        
        var features: Debug = js.native
        
        def getegid(): Double = js.native
        
        def geteuid(): Double = js.native
        
        def getgid(): Double = js.native
        
        def getgroups(): js.Array[Double] = js.native
        
        def getuid(): Double = js.native
        
        def hasUncaughtExceptionCaptureCallback(): Boolean = js.native
        
        def hrtime(): js.Tuple2[Double, Double] = js.native
        def hrtime(time: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
        @JSName("hrtime")
        var hrtime_Original: HRTime = js.native
        
        def kill(pid: Double): `true` = js.native
        def kill(pid: Double, signal: java.lang.String): `true` = js.native
        def kill(pid: Double, signal: Double): `true` = js.native
        
        def listeners(event: Signals): js.Array[SignalsListener] = js.native
        @JSName("listeners")
        def listeners_beforeExit(event: beforeExit): js.Array[BeforeExitListener] = js.native
        @JSName("listeners")
        def listeners_disconnect(event: disconnect): js.Array[DisconnectListener] = js.native
        @JSName("listeners")
        def listeners_exit(event: exit): js.Array[ExitListener] = js.native
        @JSName("listeners")
        def listeners_message(event: message): js.Array[MessageListener] = js.native
        @JSName("listeners")
        def listeners_multipleResolves(event: multipleResolves): js.Array[MultipleResolveListener] = js.native
        @JSName("listeners")
        def listeners_newListener(event: newListener): js.Array[NewListenerListener] = js.native
        @JSName("listeners")
        def listeners_rejectionHandled(event: rejectionHandled): js.Array[RejectionHandledListener] = js.native
        @JSName("listeners")
        def listeners_removeListener(event: removeListener): js.Array[RemoveListenerListener] = js.native
        @JSName("listeners")
        def listeners_uncaughtException(event: uncaughtException): js.Array[UncaughtExceptionListener] = js.native
        @JSName("listeners")
        def listeners_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor): js.Array[UncaughtExceptionListener] = js.native
        @JSName("listeners")
        def listeners_unhandledRejection(event: unhandledRejection): js.Array[UnhandledRejectionListener] = js.native
        @JSName("listeners")
        def listeners_warning(event: warning): js.Array[WarningListener] = js.native
        
        /** @deprecated since v14.0.0 - use `require.main` instead. */
        var mainModule: js.UndefOr[Module] = js.native
        
        def memoryUsage(): MemoryUsage = js.native
        
        def nextTick(callback: js.Function, args: js.Any*): Unit = js.native
        
        def on(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("on")
        def on_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("on")
        def on_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("on")
        def on_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("on")
        def on_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("on")
        def on_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("on")
        def on_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("on")
        def on_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("on")
        def on_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("on")
        def on_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        def on_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        def on_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("on")
        def on_warning(event: warning, listener: WarningListener): this.type = js.native
        
        def once(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("once")
        def once_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("once")
        def once_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("once")
        def once_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("once")
        def once_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("once")
        def once_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("once")
        def once_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("once")
        def once_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("once")
        def once_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("once")
        def once_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        def once_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        def once_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("once")
        def once_warning(event: warning, listener: WarningListener): this.type = js.native
        
        def openStdin(): Socket = js.native
        
        var pid: Double = js.native
        
        var platform: Platform = js.native
        
        var ppid: Double = js.native
        
        def prependListener(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_warning(event: warning, listener: WarningListener): this.type = js.native
        
        def prependOnceListener(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_newListener(event: newListener, listener: NewListenerListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_removeListener(event: removeListener, listener: RemoveListenerListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_warning(event: warning, listener: WarningListener): this.type = js.native
        
        var release: ProcessRelease = js.native
        
        /**
          * Only available with `--experimental-report`
          */
        var report: js.UndefOr[ProcessReport] = js.native
        
        def resourceUsage(): ResourceUsage = js.native
        
        // Worker
        var send: js.UndefOr[
                js.Function4[
                  /* message */ js.Any, 
                  /* sendHandle */ js.UndefOr[js.Any], 
                  /* options */ js.UndefOr[SwallowErrors], 
                  /* callback */ js.UndefOr[js.Function1[/* error */ Error | Null, Unit]], 
                  Boolean
                ]
              ] = js.native
        
        def setUncaughtExceptionCaptureCallback(): Unit = js.native
        def setUncaughtExceptionCaptureCallback(cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
        
        def setegid(id: java.lang.String): Unit = js.native
        def setegid(id: Double): Unit = js.native
        
        def seteuid(id: java.lang.String): Unit = js.native
        def seteuid(id: Double): Unit = js.native
        
        def setgid(id: java.lang.String): Unit = js.native
        def setgid(id: Double): Unit = js.native
        
        def setgroups(groups: js.Array[java.lang.String | Double]): Unit = js.native
        
        def setuid(id: java.lang.String): Unit = js.native
        def setuid(id: Double): Unit = js.native
        
        /**
          * Can also be a tty.WriteStream, not typed due to limitations.
          */
        var stderr: WriteStreamfd2 = js.native
        
        var stdin: ReadStreamfd0 = js.native
        
        /**
          * Can also be a tty.WriteStream, not typed due to limitations.
          */
        var stdout: WriteStreamfd1 = js.native
        
        var title: java.lang.String = js.native
        
        var traceDeprecation: Boolean = js.native
        
        /**
          * @deprecated since v14.0.0 - Calling process.umask() with no argument causes
          * the process-wide umask to be written twice. This introduces a race condition between threads,
          * and is a potential security vulnerability. There is no safe, cross-platform alternative API.
          */
        def umask(): Double = js.native
        /**
          * Can only be set if not in worker thread.
          */
        def umask(mask: java.lang.String): Double = js.native
        def umask(mask: Double): Double = js.native
        
        def uptime(): Double = js.native
        
        var version: java.lang.String = js.native
        
        var versions: ProcessVersions = js.native
      }
      
      // Alias for compatibility
      type ProcessEnv = Dict[java.lang.String]
      
      trait ProcessRelease extends StObject {
        
        var headersUrl: js.UndefOr[java.lang.String] = js.undefined
        
        var libUrl: js.UndefOr[java.lang.String] = js.undefined
        
        var lts: js.UndefOr[java.lang.String] = js.undefined
        
        var name: java.lang.String
        
        var sourceUrl: js.UndefOr[java.lang.String] = js.undefined
      }
      object ProcessRelease {
        
        inline def apply(name: java.lang.String): ProcessRelease = {
          val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessRelease]
        }
        
        extension [Self <: ProcessRelease](x: Self) {
          
          inline def setHeadersUrl(value: java.lang.String): Self = StObject.set(x, "headersUrl", value.asInstanceOf[js.Any])
          
          inline def setHeadersUrlUndefined: Self = StObject.set(x, "headersUrl", js.undefined)
          
          inline def setLibUrl(value: java.lang.String): Self = StObject.set(x, "libUrl", value.asInstanceOf[js.Any])
          
          inline def setLibUrlUndefined: Self = StObject.set(x, "libUrl", js.undefined)
          
          inline def setLts(value: java.lang.String): Self = StObject.set(x, "lts", value.asInstanceOf[js.Any])
          
          inline def setLtsUndefined: Self = StObject.set(x, "lts", js.undefined)
          
          inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setSourceUrl(value: java.lang.String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
          
          inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
        }
      }
      
      @js.native
      trait ProcessReport extends StObject {
        
        /**
          * Directory where the report is written.
          * working directory of the Node.js process.
          * @default '' indicating that reports are written to the current
          */
        var directory: java.lang.String = js.native
        
        /**
          * Filename where the report is written.
          * The default value is the empty string.
          * @default '' the output filename will be comprised of a timestamp,
          * PID, and sequence number.
          */
        var filename: java.lang.String = js.native
        
        /**
          * Returns a JSON-formatted diagnostic report for the running process.
          * The report's JavaScript stack trace is taken from err, if present.
          */
        def getReport(): java.lang.String = js.native
        def getReport(err: Error): java.lang.String = js.native
        
        /**
          * If true, a diagnostic report is generated on fatal errors,
          * such as out of memory errors or failed C++ assertions.
          * @default false
          */
        var reportOnFatalError: Boolean = js.native
        
        /**
          * If true, a diagnostic report is generated when the process
          * receives the signal specified by process.report.signal.
          * @defaul false
          */
        var reportOnSignal: Boolean = js.native
        
        /**
          * If true, a diagnostic report is generated on uncaught exception.
          * @default false
          */
        var reportOnUncaughtException: Boolean = js.native
        
        /**
          * The signal used to trigger the creation of a diagnostic report.
          * @default 'SIGUSR2'
          */
        var signal: Signals = js.native
        
        /**
          * Writes a diagnostic report to a file. If filename is not provided, the default filename
          * includes the date, time, PID, and a sequence number.
          * The report's JavaScript stack trace is taken from err, if present.
          *
          * @param fileName Name of the file where the report is written.
          * This should be a relative path, that will be appended to the directory specified in
          * `process.report.directory`, or the current working directory of the Node.js process,
          * if unspecified.
          * @param error A custom error used for reporting the JavaScript stack.
          * @return Filename of the generated report.
          */
        def writeReport(): java.lang.String = js.native
        def writeReport(error: Error): java.lang.String = js.native
        def writeReport(fileName: java.lang.String): java.lang.String = js.native
        def writeReport(fileName: java.lang.String, err: Error): java.lang.String = js.native
        def writeReport(fileName: Unit, err: Error): java.lang.String = js.native
      }
      
      trait ProcessVersions
        extends StObject
           with Dict[java.lang.String] {
        
        var ares: java.lang.String
        
        var http_parser: java.lang.String
        
        var modules: java.lang.String
        
        var node: java.lang.String
        
        var openssl: java.lang.String
        
        var uv: java.lang.String
        
        var v8: java.lang.String
        
        var zlib: java.lang.String
      }
      object ProcessVersions {
        
        inline def apply(
          ares: java.lang.String,
          http_parser: java.lang.String,
          modules: java.lang.String,
          node: java.lang.String,
          openssl: java.lang.String,
          uv: java.lang.String,
          v8: java.lang.String,
          zlib: java.lang.String
        ): ProcessVersions = {
          val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessVersions]
        }
        
        extension [Self <: ProcessVersions](x: Self) {
          
          inline def setAres(value: java.lang.String): Self = StObject.set(x, "ares", value.asInstanceOf[js.Any])
          
          inline def setHttp_parser(value: java.lang.String): Self = StObject.set(x, "http_parser", value.asInstanceOf[js.Any])
          
          inline def setModules(value: java.lang.String): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
          
          inline def setNode(value: java.lang.String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
          
          inline def setOpenssl(value: java.lang.String): Self = StObject.set(x, "openssl", value.asInstanceOf[js.Any])
          
          inline def setUv(value: java.lang.String): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
          
          inline def setV8(value: java.lang.String): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
          
          inline def setZlib(value: java.lang.String): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
        }
      }
      
      // this namespace merge is here because these are specifically used
      // as the type for process.stdin, process.stdout, and process.stderr.
      // they can't live in tty.d.ts because we need to disambiguate the imported name.
      type ReadStream = typings.node.ttyMod.ReadStream
      
      type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], Unit]
      
      type RemoveListenerListener = js.Function2[
            /* type */ java.lang.String | js.Symbol, 
            /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
            Unit
          ]
      
      trait ResourceUsage extends StObject {
        
        var fsRead: Double
        
        var fsWrite: Double
        
        var involuntaryContextSwitches: Double
        
        var ipcReceived: Double
        
        var ipcSent: Double
        
        var majorPageFault: Double
        
        var maxRSS: Double
        
        var minorPageFault: Double
        
        var sharedMemorySize: Double
        
        var signalsCount: Double
        
        var swappedOut: Double
        
        var systemCPUTime: Double
        
        var unsharedDataSize: Double
        
        var unsharedStackSize: Double
        
        var userCPUTime: Double
        
        var voluntaryContextSwitches: Double
      }
      object ResourceUsage {
        
        inline def apply(
          fsRead: Double,
          fsWrite: Double,
          involuntaryContextSwitches: Double,
          ipcReceived: Double,
          ipcSent: Double,
          majorPageFault: Double,
          maxRSS: Double,
          minorPageFault: Double,
          sharedMemorySize: Double,
          signalsCount: Double,
          swappedOut: Double,
          systemCPUTime: Double,
          unsharedDataSize: Double,
          unsharedStackSize: Double,
          userCPUTime: Double,
          voluntaryContextSwitches: Double
        ): ResourceUsage = {
          val __obj = js.Dynamic.literal(fsRead = fsRead.asInstanceOf[js.Any], fsWrite = fsWrite.asInstanceOf[js.Any], involuntaryContextSwitches = involuntaryContextSwitches.asInstanceOf[js.Any], ipcReceived = ipcReceived.asInstanceOf[js.Any], ipcSent = ipcSent.asInstanceOf[js.Any], majorPageFault = majorPageFault.asInstanceOf[js.Any], maxRSS = maxRSS.asInstanceOf[js.Any], minorPageFault = minorPageFault.asInstanceOf[js.Any], sharedMemorySize = sharedMemorySize.asInstanceOf[js.Any], signalsCount = signalsCount.asInstanceOf[js.Any], swappedOut = swappedOut.asInstanceOf[js.Any], systemCPUTime = systemCPUTime.asInstanceOf[js.Any], unsharedDataSize = unsharedDataSize.asInstanceOf[js.Any], unsharedStackSize = unsharedStackSize.asInstanceOf[js.Any], userCPUTime = userCPUTime.asInstanceOf[js.Any], voluntaryContextSwitches = voluntaryContextSwitches.asInstanceOf[js.Any])
          __obj.asInstanceOf[ResourceUsage]
        }
        
        extension [Self <: ResourceUsage](x: Self) {
          
          inline def setFsRead(value: Double): Self = StObject.set(x, "fsRead", value.asInstanceOf[js.Any])
          
          inline def setFsWrite(value: Double): Self = StObject.set(x, "fsWrite", value.asInstanceOf[js.Any])
          
          inline def setInvoluntaryContextSwitches(value: Double): Self = StObject.set(x, "involuntaryContextSwitches", value.asInstanceOf[js.Any])
          
          inline def setIpcReceived(value: Double): Self = StObject.set(x, "ipcReceived", value.asInstanceOf[js.Any])
          
          inline def setIpcSent(value: Double): Self = StObject.set(x, "ipcSent", value.asInstanceOf[js.Any])
          
          inline def setMajorPageFault(value: Double): Self = StObject.set(x, "majorPageFault", value.asInstanceOf[js.Any])
          
          inline def setMaxRSS(value: Double): Self = StObject.set(x, "maxRSS", value.asInstanceOf[js.Any])
          
          inline def setMinorPageFault(value: Double): Self = StObject.set(x, "minorPageFault", value.asInstanceOf[js.Any])
          
          inline def setSharedMemorySize(value: Double): Self = StObject.set(x, "sharedMemorySize", value.asInstanceOf[js.Any])
          
          inline def setSignalsCount(value: Double): Self = StObject.set(x, "signalsCount", value.asInstanceOf[js.Any])
          
          inline def setSwappedOut(value: Double): Self = StObject.set(x, "swappedOut", value.asInstanceOf[js.Any])
          
          inline def setSystemCPUTime(value: Double): Self = StObject.set(x, "systemCPUTime", value.asInstanceOf[js.Any])
          
          inline def setUnsharedDataSize(value: Double): Self = StObject.set(x, "unsharedDataSize", value.asInstanceOf[js.Any])
          
          inline def setUnsharedStackSize(value: Double): Self = StObject.set(x, "unsharedStackSize", value.asInstanceOf[js.Any])
          
          inline def setUserCPUTime(value: Double): Self = StObject.set(x, "userCPUTime", value.asInstanceOf[js.Any])
          
          inline def setVoluntaryContextSwitches(value: Double): Self = StObject.set(x, "voluntaryContextSwitches", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.node.nodeStrings.SIGABRT
        - typings.node.nodeStrings.SIGALRM
        - typings.node.nodeStrings.SIGBUS
        - typings.node.nodeStrings.SIGCHLD
        - typings.node.nodeStrings.SIGCONT
        - typings.node.nodeStrings.SIGFPE
        - typings.node.nodeStrings.SIGHUP
        - typings.node.nodeStrings.SIGILL
        - typings.node.nodeStrings.SIGINT
        - typings.node.nodeStrings.SIGIO
        - typings.node.nodeStrings.SIGIOT
        - typings.node.nodeStrings.SIGKILL
        - typings.node.nodeStrings.SIGPIPE
        - typings.node.nodeStrings.SIGPOLL
        - typings.node.nodeStrings.SIGPROF
        - typings.node.nodeStrings.SIGPWR
        - typings.node.nodeStrings.SIGQUIT
        - typings.node.nodeStrings.SIGSEGV
        - typings.node.nodeStrings.SIGSTKFLT
        - typings.node.nodeStrings.SIGSTOP
        - typings.node.nodeStrings.SIGSYS
        - typings.node.nodeStrings.SIGTERM
        - typings.node.nodeStrings.SIGTRAP
        - typings.node.nodeStrings.SIGTSTP
        - typings.node.nodeStrings.SIGTTIN
        - typings.node.nodeStrings.SIGTTOU
        - typings.node.nodeStrings.SIGUNUSED
        - typings.node.nodeStrings.SIGURG
        - typings.node.nodeStrings.SIGUSR1
        - typings.node.nodeStrings.SIGUSR2
        - typings.node.nodeStrings.SIGVTALRM
        - typings.node.nodeStrings.SIGWINCH
        - typings.node.nodeStrings.SIGXCPU
        - typings.node.nodeStrings.SIGXFSZ
        - typings.node.nodeStrings.SIGBREAK
        - typings.node.nodeStrings.SIGLOST
        - typings.node.nodeStrings.SIGINFO
      */
      trait Signals extends StObject
      object Signals {
        
        inline def SIGABRT: typings.node.nodeStrings.SIGABRT = "SIGABRT".asInstanceOf[typings.node.nodeStrings.SIGABRT]
        
        inline def SIGALRM: typings.node.nodeStrings.SIGALRM = "SIGALRM".asInstanceOf[typings.node.nodeStrings.SIGALRM]
        
        inline def SIGBREAK: typings.node.nodeStrings.SIGBREAK = "SIGBREAK".asInstanceOf[typings.node.nodeStrings.SIGBREAK]
        
        inline def SIGBUS: typings.node.nodeStrings.SIGBUS = "SIGBUS".asInstanceOf[typings.node.nodeStrings.SIGBUS]
        
        inline def SIGCHLD: typings.node.nodeStrings.SIGCHLD = "SIGCHLD".asInstanceOf[typings.node.nodeStrings.SIGCHLD]
        
        inline def SIGCONT: typings.node.nodeStrings.SIGCONT = "SIGCONT".asInstanceOf[typings.node.nodeStrings.SIGCONT]
        
        inline def SIGFPE: typings.node.nodeStrings.SIGFPE = "SIGFPE".asInstanceOf[typings.node.nodeStrings.SIGFPE]
        
        inline def SIGHUP: typings.node.nodeStrings.SIGHUP = "SIGHUP".asInstanceOf[typings.node.nodeStrings.SIGHUP]
        
        inline def SIGILL: typings.node.nodeStrings.SIGILL = "SIGILL".asInstanceOf[typings.node.nodeStrings.SIGILL]
        
        inline def SIGINFO: typings.node.nodeStrings.SIGINFO = "SIGINFO".asInstanceOf[typings.node.nodeStrings.SIGINFO]
        
        inline def SIGINT: typings.node.nodeStrings.SIGINT = "SIGINT".asInstanceOf[typings.node.nodeStrings.SIGINT]
        
        inline def SIGIO: typings.node.nodeStrings.SIGIO = "SIGIO".asInstanceOf[typings.node.nodeStrings.SIGIO]
        
        inline def SIGIOT: typings.node.nodeStrings.SIGIOT = "SIGIOT".asInstanceOf[typings.node.nodeStrings.SIGIOT]
        
        inline def SIGKILL: typings.node.nodeStrings.SIGKILL = "SIGKILL".asInstanceOf[typings.node.nodeStrings.SIGKILL]
        
        inline def SIGLOST: typings.node.nodeStrings.SIGLOST = "SIGLOST".asInstanceOf[typings.node.nodeStrings.SIGLOST]
        
        inline def SIGPIPE: typings.node.nodeStrings.SIGPIPE = "SIGPIPE".asInstanceOf[typings.node.nodeStrings.SIGPIPE]
        
        inline def SIGPOLL: typings.node.nodeStrings.SIGPOLL = "SIGPOLL".asInstanceOf[typings.node.nodeStrings.SIGPOLL]
        
        inline def SIGPROF: typings.node.nodeStrings.SIGPROF = "SIGPROF".asInstanceOf[typings.node.nodeStrings.SIGPROF]
        
        inline def SIGPWR: typings.node.nodeStrings.SIGPWR = "SIGPWR".asInstanceOf[typings.node.nodeStrings.SIGPWR]
        
        inline def SIGQUIT: typings.node.nodeStrings.SIGQUIT = "SIGQUIT".asInstanceOf[typings.node.nodeStrings.SIGQUIT]
        
        inline def SIGSEGV: typings.node.nodeStrings.SIGSEGV = "SIGSEGV".asInstanceOf[typings.node.nodeStrings.SIGSEGV]
        
        inline def SIGSTKFLT: typings.node.nodeStrings.SIGSTKFLT = "SIGSTKFLT".asInstanceOf[typings.node.nodeStrings.SIGSTKFLT]
        
        inline def SIGSTOP: typings.node.nodeStrings.SIGSTOP = "SIGSTOP".asInstanceOf[typings.node.nodeStrings.SIGSTOP]
        
        inline def SIGSYS: typings.node.nodeStrings.SIGSYS = "SIGSYS".asInstanceOf[typings.node.nodeStrings.SIGSYS]
        
        inline def SIGTERM: typings.node.nodeStrings.SIGTERM = "SIGTERM".asInstanceOf[typings.node.nodeStrings.SIGTERM]
        
        inline def SIGTRAP: typings.node.nodeStrings.SIGTRAP = "SIGTRAP".asInstanceOf[typings.node.nodeStrings.SIGTRAP]
        
        inline def SIGTSTP: typings.node.nodeStrings.SIGTSTP = "SIGTSTP".asInstanceOf[typings.node.nodeStrings.SIGTSTP]
        
        inline def SIGTTIN: typings.node.nodeStrings.SIGTTIN = "SIGTTIN".asInstanceOf[typings.node.nodeStrings.SIGTTIN]
        
        inline def SIGTTOU: typings.node.nodeStrings.SIGTTOU = "SIGTTOU".asInstanceOf[typings.node.nodeStrings.SIGTTOU]
        
        inline def SIGUNUSED: typings.node.nodeStrings.SIGUNUSED = "SIGUNUSED".asInstanceOf[typings.node.nodeStrings.SIGUNUSED]
        
        inline def SIGURG: typings.node.nodeStrings.SIGURG = "SIGURG".asInstanceOf[typings.node.nodeStrings.SIGURG]
        
        inline def SIGUSR1: typings.node.nodeStrings.SIGUSR1 = "SIGUSR1".asInstanceOf[typings.node.nodeStrings.SIGUSR1]
        
        inline def SIGUSR2: typings.node.nodeStrings.SIGUSR2 = "SIGUSR2".asInstanceOf[typings.node.nodeStrings.SIGUSR2]
        
        inline def SIGVTALRM: typings.node.nodeStrings.SIGVTALRM = "SIGVTALRM".asInstanceOf[typings.node.nodeStrings.SIGVTALRM]
        
        inline def SIGWINCH: typings.node.nodeStrings.SIGWINCH = "SIGWINCH".asInstanceOf[typings.node.nodeStrings.SIGWINCH]
        
        inline def SIGXCPU: typings.node.nodeStrings.SIGXCPU = "SIGXCPU".asInstanceOf[typings.node.nodeStrings.SIGXCPU]
        
        inline def SIGXFSZ: typings.node.nodeStrings.SIGXFSZ = "SIGXFSZ".asInstanceOf[typings.node.nodeStrings.SIGXFSZ]
      }
      
      type SignalsListener = js.Function1[/* signal */ Signals, Unit]
      
      @js.native
      trait Socket
        extends StObject
           with ReadWriteStream {
        
        var isTTY: js.UndefOr[`true`] = js.native
      }
      
      type UncaughtExceptionListener = js.Function1[/* error */ Error, Unit]
      
      type UnhandledRejectionListener = js.Function2[/* reason */ js.UndefOr[js.Object | Null], /* promise */ js.Promise[js.Any], Unit]
      
      type WarningListener = js.Function1[/* warning */ Error, Unit]
      
      type WriteStream = typings.node.ttyMod.WriteStream
    }
  }
  
  type _To = Process
  
  /* This means you don't have to write `^`, but can instead just say `processMod.foo` */
  override def _to: Process = ^
}
