package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.Dict
import typings.node.NodeJS.Module
import typings.node.NodeJS.ReadWriteStream
import typings.node.anon.Cflags
import typings.node.anon.Clang
import typings.node.anon.Debug
import typings.node.anon.Fd
import typings.node.anon.SwallowErrors
import typings.node.anon.`4`
import typings.node.anon.`5`
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.nodeColonworkerThreadsMod.Worker
import typings.node.processMod.global.NodeJS.Process
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
      
      object Architecture {
        
        inline def arm: "arm" = "arm".asInstanceOf["arm"]
        
        inline def arm64: "arm64" = "arm64".asInstanceOf["arm64"]
        
        inline def ia32: "ia32" = "ia32".asInstanceOf["ia32"]
        
        inline def mips: "mips" = "mips".asInstanceOf["mips"]
        
        inline def mipsel: "mipsel" = "mipsel".asInstanceOf["mipsel"]
        
        inline def ppc: "ppc" = "ppc".asInstanceOf["ppc"]
        
        inline def ppc64: "ppc64" = "ppc64".asInstanceOf["ppc64"]
        
        inline def s390: "s390" = "s390".asInstanceOf["s390"]
        
        inline def s390x: "s390x" = "s390x".asInstanceOf["s390x"]
        
        inline def x64: "x64" = "x64".asInstanceOf["x64"]
      }
      type Architecture = "arm" | "arm64" | "ia32" | "mips" | "mipsel" | "ppc" | "ppc64" | "s390" | "s390x" | "x64"
      
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
      
      trait EmitWarningOptions extends StObject {
        
        /**
          * A unique identifier for the warning instance being emitted.
          */
        var code: js.UndefOr[String] = js.undefined
        
        /**
          * When `warning` is a `string`, `ctor` is an optional function used to limit the generated stack trace.
          *
          * @default process.emitWarning
          */
        var ctor: js.UndefOr[js.Function] = js.undefined
        
        /**
          * Additional text to include with the error.
          */
        var detail: js.UndefOr[String] = js.undefined
        
        /**
          * When `warning` is a `string`, `type` is the name to use for the _type_ of warning being emitted.
          *
          * @default 'Warning'
          */
        var `type`: js.UndefOr[String] = js.undefined
      }
      object EmitWarningOptions {
        
        inline def apply(): EmitWarningOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[EmitWarningOptions]
        }
        
        extension [Self <: EmitWarningOptions](x: Self) {
          
          inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
          
          inline def setCtor(value: js.Function): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
          
          inline def setCtorUndefined: Self = StObject.set(x, "ctor", js.undefined)
          
          inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
          
          inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      type ExitListener = js.Function1[/* code */ Double, Unit]
      
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
      
      @js.native
      trait MemoryUsageFn extends StObject {
        
        /**
          * The `process.memoryUsage()` method iterate over each page to gather informations about memory
          * usage which can be slow depending on the program memory allocations.
          */
        def apply(): MemoryUsage = js.native
        
        /**
          * method returns an integer representing the Resident Set Size (RSS) in bytes.
          */
        def rss(): Double = js.native
      }
      
      type MessageListener = js.Function2[/* message */ Any, /* sendHandle */ Any, Unit]
      
      type MultipleResolveListener = js.Function3[/* type */ MultipleResolveType, /* promise */ js.Promise[Any], /* value */ Any, Unit]
      
      object MultipleResolveType {
        
        inline def reject: "reject" = "reject".asInstanceOf["reject"]
        
        inline def resolve: "resolve" = "resolve".asInstanceOf["resolve"]
      }
      type MultipleResolveType = "resolve" | "reject"
      
      object Platform {
        
        inline def aix: "aix" = "aix".asInstanceOf["aix"]
        
        inline def android: "android" = "android".asInstanceOf["android"]
        
        inline def cygwin: "cygwin" = "cygwin".asInstanceOf["cygwin"]
        
        inline def darwin: "darwin" = "darwin".asInstanceOf["darwin"]
        
        inline def freebsd: "freebsd" = "freebsd".asInstanceOf["freebsd"]
        
        inline def haiku: "haiku" = "haiku".asInstanceOf["haiku"]
        
        inline def linux: "linux" = "linux".asInstanceOf["linux"]
        
        inline def netbsd: "netbsd" = "netbsd".asInstanceOf["netbsd"]
        
        inline def openbsd: "openbsd" = "openbsd".asInstanceOf["openbsd"]
        
        inline def sunos: "sunos" = "sunos".asInstanceOf["sunos"]
        
        inline def win32: "win32" = "win32".asInstanceOf["win32"]
      }
      type Platform = "aix" | "android" | "darwin" | "freebsd" | "haiku" | "linux" | "openbsd" | "sunos" | "win32" | "cygwin" | "netbsd"
      
      @js.native
      trait Process
        extends StObject
           with EventEmitter {
        
        /**
          * The `process.abort()` method causes the Node.js process to exit immediately and
          * generate a core file.
          *
          * This feature is not available in `Worker` threads.
          * @since v0.7.0
          */
        def abort(): scala.Nothing = js.native
        
        /* EventEmitter */
        @JSName("addListener")
        @scala.annotation.targetName("addListener_beforeExit")
        def addListener(event: "beforeExit", listener: BeforeExitListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_disconnect")
        def addListener(event: "disconnect", listener: DisconnectListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_exit")
        def addListener(event: "exit", listener: ExitListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_message")
        def addListener(event: "message", listener: MessageListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_multipleResolves")
        def addListener(event: "multipleResolves", listener: MultipleResolveListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_rejectionHandled")
        def addListener(event: "rejectionHandled", listener: RejectionHandledListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_uncaughtException")
        def addListener(event: "uncaughtException", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_uncaughtExceptionMonitor")
        def addListener(event: "uncaughtExceptionMonitor", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_unhandledRejection")
        def addListener(event: "unhandledRejection", listener: UnhandledRejectionListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_warning")
        def addListener(event: "warning", listener: WarningListener): this.type = js.native
        @JSName("addListener")
        @scala.annotation.targetName("addListener_worker")
        def addListener(event: "worker", listener: WorkerListener): this.type = js.native
        
        /**
          * The `process.allowedNodeEnvironmentFlags` property is a special,
          * read-only `Set` of flags allowable within the `NODE_OPTIONS` environment variable.
          *
          * `process.allowedNodeEnvironmentFlags` extends `Set`, but overrides`Set.prototype.has` to recognize several different possible flag
          * representations. `process.allowedNodeEnvironmentFlags.has()` will
          * return `true` in the following cases:
          *
          * * Flags may omit leading single (`-`) or double (`--`) dashes; e.g.,`inspect-brk` for `--inspect-brk`, or `r` for `-r`.
          * * Flags passed through to V8 (as listed in `--v8-options`) may replace
          * one or more _non-leading_ dashes for an underscore, or vice-versa;
          * e.g., `--perf_basic_prof`, `--perf-basic-prof`, `--perf_basic-prof`,
          * etc.
          * * Flags may contain one or more equals (`=`) characters; all
          * characters after and including the first equals will be ignored;
          * e.g., `--stack-trace-limit=100`.
          * * Flags _must_ be allowable within `NODE_OPTIONS`.
          *
          * When iterating over `process.allowedNodeEnvironmentFlags`, flags will
          * appear only _once_; each will begin with one or more dashes. Flags
          * passed through to V8 will contain underscores instead of non-leading
          * dashes:
          *
          * ```js
          * import { allowedNodeEnvironmentFlags } from 'process';
          *
          * allowedNodeEnvironmentFlags.forEach((flag) => {
          *   // -r
          *   // --inspect-brk
          *   // --abort_on_uncaught_exception
          *   // ...
          * });
          * ```
          *
          * The methods `add()`, `clear()`, and `delete()` of`process.allowedNodeEnvironmentFlags` do nothing, and will fail
          * silently.
          *
          * If Node.js was compiled _without_ `NODE_OPTIONS` support (shown in {@link config}), `process.allowedNodeEnvironmentFlags` will
          * contain what _would have_ been allowable.
          * @since v10.10.0
          */
        var allowedNodeEnvironmentFlags: ReadonlySet[String] = js.native
        
        /**
          * The operating system CPU architecture for which the Node.js binary was compiled.
          * Possible values are: `'arm'`, `'arm64'`, `'ia32'`, `'mips'`,`'mipsel'`, `'ppc'`,`'ppc64'`, `'s390'`, `'s390x'`, and `'x64'`.
          *
          * ```js
          * import { arch } from 'process';
          *
          * console.log(`This processor architecture is ${arch}`);
          * ```
          * @since v0.5.0
          */
        val arch: Architecture = js.native
        
        /**
          * The `process.argv` property returns an array containing the command-line
          * arguments passed when the Node.js process was launched. The first element will
          * be {@link execPath}. See `process.argv0` if access to the original value
          * of `argv[0]` is needed. The second element will be the path to the JavaScript
          * file being executed. The remaining elements will be any additional command-line
          * arguments.
          *
          * For example, assuming the following script for `process-args.js`:
          *
          * ```js
          * import { argv } from 'process';
          *
          * // print process.argv
          * argv.forEach((val, index) => {
          *   console.log(`${index}: ${val}`);
          * });
          * ```
          *
          * Launching the Node.js process as:
          *
          * ```console
          * $ node process-args.js one two=three four
          * ```
          *
          * Would generate the output:
          *
          * ```text
          * 0: /usr/local/bin/node
          * 1: /Users/mjr/work/node/process-args.js
          * 2: one
          * 3: two=three
          * 4: four
          * ```
          * @since v0.1.27
          */
        var argv: js.Array[String] = js.native
        
        /**
          * The `process.argv0` property stores a read-only copy of the original value of`argv[0]` passed when Node.js starts.
          *
          * ```console
          * $ bash -c 'exec -a customArgv0 ./node'
          * > process.argv[0]
          * '/Volumes/code/external/node/out/Release/node'
          * > process.argv0
          * 'customArgv0'
          * ```
          * @since v6.4.0
          */
        var argv0: String = js.native
        
        /**
          * The `process.chdir()` method changes the current working directory of the
          * Node.js process or throws an exception if doing so fails (for instance, if
          * the specified `directory` does not exist).
          *
          * ```js
          * import { chdir, cwd } from 'process';
          *
          * console.log(`Starting directory: ${cwd()}`);
          * try {
          *   chdir('/tmp');
          *   console.log(`New directory: ${cwd()}`);
          * } catch (err) {
          *   console.error(`chdir: ${err}`);
          * }
          * ```
          *
          * This feature is not available in `Worker` threads.
          * @since v0.1.17
          */
        def chdir(directory: String): Unit = js.native
        
        /**
          * The `process.config` property returns an `Object` containing the JavaScript
          * representation of the configure options used to compile the current Node.js
          * executable. This is the same as the `config.gypi` file that was produced when
          * running the `./configure` script.
          *
          * An example of the possible output looks like:
          *
          * ```js
          * {
          *   target_defaults:
          *    { cflags: [],
          *      default_configuration: 'Release',
          *      defines: [],
          *      include_dirs: [],
          *      libraries: [] },
          *   variables:
          *    {
          *      host_arch: 'x64',
          *      napi_build_version: 5,
          *      node_install_npm: 'true',
          *      node_prefix: '',
          *      node_shared_cares: 'false',
          *      node_shared_http_parser: 'false',
          *      node_shared_libuv: 'false',
          *      node_shared_zlib: 'false',
          *      node_use_dtrace: 'false',
          *      node_use_openssl: 'true',
          *      node_shared_openssl: 'false',
          *      strict_aliasing: 'true',
          *      target_arch: 'x64',
          *      v8_use_snapshot: 1
          *    }
          * }
          * ```
          *
          * The `process.config` property is **not** read-only and there are existing
          * modules in the ecosystem that are known to extend, modify, or entirely replace
          * the value of `process.config`.
          *
          * Modifying the `process.config` property, or any child-property of the`process.config` object has been deprecated. The `process.config` will be made
          * read-only in a future release.
          * @since v0.7.7
          */
        val config: ProcessConfig = js.native
        
        /**
          * If the Node.js process is spawned with an IPC channel (see the `Child Process` and `Cluster` documentation), the `process.connected` property will return`true` so long as the IPC
          * channel is connected and will return `false` after`process.disconnect()` is called.
          *
          * Once `process.connected` is `false`, it is no longer possible to send messages
          * over the IPC channel using `process.send()`.
          * @since v0.7.2
          */
        var connected: Boolean = js.native
        
        /**
          * The `process.cpuUsage()` method returns the user and system CPU time usage of
          * the current process, in an object with properties `user` and `system`, whose
          * values are microsecond values (millionth of a second). These values measure time
          * spent in user and system code respectively, and may end up being greater than
          * actual elapsed time if multiple CPU cores are performing work for this process.
          *
          * The result of a previous call to `process.cpuUsage()` can be passed as the
          * argument to the function, to get a diff reading.
          *
          * ```js
          * import { cpuUsage } from 'process';
          *
          * const startUsage = cpuUsage();
          * // { user: 38579, system: 6986 }
          *
          * // spin the CPU for 500 milliseconds
          * const now = Date.now();
          * while (Date.now() - now < 500);
          *
          * console.log(cpuUsage(startUsage));
          * // { user: 514883, system: 11226 }
          * ```
          * @since v6.1.0
          * @param previousValue A previous return value from calling `process.cpuUsage()`
          */
        def cpuUsage(): CpuUsage = js.native
        def cpuUsage(previousValue: CpuUsage): CpuUsage = js.native
        
        /**
          * The `process.cwd()` method returns the current working directory of the Node.js
          * process.
          *
          * ```js
          * import { cwd } from 'process';
          *
          * console.log(`Current directory: ${cwd()}`);
          * ```
          * @since v0.1.8
          */
        def cwd(): String = js.native
        
        /**
          * The port used by the Node.js debugger when enabled.
          *
          * ```js
          * import process from 'process';
          *
          * process.debugPort = 5858;
          * ```
          * @since v0.7.2
          */
        var debugPort: Double = js.native
        
        /**
          * If the Node.js process is spawned with an IPC channel (see the `Child Process` and `Cluster` documentation), the `process.disconnect()` method will close the
          * IPC channel to the parent process, allowing the child process to exit gracefully
          * once there are no other connections keeping it alive.
          *
          * The effect of calling `process.disconnect()` is the same as calling `ChildProcess.disconnect()` from the parent process.
          *
          * If the Node.js process was not spawned with an IPC channel,`process.disconnect()` will be `undefined`.
          * @since v0.7.2
          */
        def disconnect(): Unit = js.native
        
        @JSName("emit")
        @scala.annotation.targetName("emit_disconnect")
        def emit(event: "disconnect"): Boolean = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_beforeExit")
        def emit(event: "beforeExit", code: Double): Boolean = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_exit")
        def emit(event: "exit", code: Double): Boolean = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_uncaughtException")
        def emit(event: "uncaughtException", error: js.Error): Boolean = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_uncaughtExceptionMonitor")
        def emit(event: "uncaughtExceptionMonitor", error: js.Error): Boolean = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_worker")
        def emit(event: "worker", listener: WorkerListener): this.type = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_message")
        def emit(event: "message", message: Any, sendHandle: Any): this.type = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_rejectionHandled")
        def emit(event: "rejectionHandled", promise: js.Promise[Any]): Boolean = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_unhandledRejection")
        def emit(event: "unhandledRejection", reason: Any, promise: js.Promise[Any]): Boolean = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_multipleResolves")
        def emit(event: "multipleResolves", `type`: MultipleResolveType, promise: js.Promise[Any], value: Any): this.type = js.native
        @JSName("emit")
        @scala.annotation.targetName("emit_warning")
        def emit(event: "warning", warning: js.Error): Boolean = js.native
        def emit(event: Signals): Boolean = js.native
        def emit(event: Signals, signal: Signals): Boolean = js.native
        
        /**
          * The `process.emitWarning()` method can be used to emit custom or application
          * specific process warnings. These can be listened for by adding a handler to the `'warning'` event.
          *
          * ```js
          * import { emitWarning } from 'process';
          *
          * // Emit a warning with a code and additional detail.
          * emitWarning('Something happened!', {
          *   code: 'MY_WARNING',
          *   detail: 'This is some additional information'
          * });
          * // Emits:
          * // (node:56338) [MY_WARNING] Warning: Something happened!
          * // This is some additional information
          * ```
          *
          * In this example, an `Error` object is generated internally by`process.emitWarning()` and passed through to the `'warning'` handler.
          *
          * ```js
          * import process from 'process';
          *
          * process.on('warning', (warning) => {
          *   console.warn(warning.name);    // 'Warning'
          *   console.warn(warning.message); // 'Something happened!'
          *   console.warn(warning.code);    // 'MY_WARNING'
          *   console.warn(warning.stack);   // Stack trace
          *   console.warn(warning.detail);  // 'This is some additional information'
          * });
          * ```
          *
          * If `warning` is passed as an `Error` object, the `options` argument is ignored.
          * @since v8.0.0
          * @param warning The warning to emit.
          */
        def emitWarning(warning: String): Unit = js.native
        def emitWarning(warning: String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: String, options: EmitWarningOptions): Unit = js.native
        def emitWarning(warning: String, `type`: String): Unit = js.native
        def emitWarning(warning: String, `type`: String, code: String): Unit = js.native
        def emitWarning(warning: String, `type`: String, code: String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: String, `type`: String, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: String, `type`: String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: String, `type`: Unit, code: String): Unit = js.native
        def emitWarning(warning: String, `type`: Unit, code: String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: String, `type`: Unit, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: String, `type`: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error): Unit = js.native
        def emitWarning(warning: js.Error, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, options: EmitWarningOptions): Unit = js.native
        def emitWarning(warning: js.Error, `type`: String): Unit = js.native
        def emitWarning(warning: js.Error, `type`: String, code: String): Unit = js.native
        def emitWarning(warning: js.Error, `type`: String, code: String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: String, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, code: String): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, code: String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, ctor: js.Function): Unit = js.native
        
        /**
          * The `process.env` property returns an object containing the user environment.
          * See [`environ(7)`](http://man7.org/linux/man-pages/man7/environ.7.html).
          *
          * An example of this object looks like:
          *
          * ```js
          * {
          *   TERM: 'xterm-256color',
          *   SHELL: '/usr/local/bin/bash',
          *   USER: 'maciej',
          *   PATH: '~/.bin/:/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin',
          *   PWD: '/Users/maciej',
          *   EDITOR: 'vim',
          *   SHLVL: '1',
          *   HOME: '/Users/maciej',
          *   LOGNAME: 'maciej',
          *   _: '/usr/local/bin/node'
          * }
          * ```
          *
          * It is possible to modify this object, but such modifications will not be
          * reflected outside the Node.js process, or (unless explicitly requested)
          * to other `Worker` threads.
          * In other words, the following example would not work:
          *
          * ```console
          * $ node -e 'process.env.foo = "bar"' &#x26;&#x26; echo $foo
          * ```
          *
          * While the following will:
          *
          * ```js
          * import { env } from 'process';
          *
          * env.foo = 'bar';
          * console.log(env.foo);
          * ```
          *
          * Assigning a property on `process.env` will implicitly convert the value
          * to a string. **This behavior is deprecated.** Future versions of Node.js may
          * throw an error when the value is not a string, number, or boolean.
          *
          * ```js
          * import { env } from 'process';
          *
          * env.test = null;
          * console.log(env.test);
          * // => 'null'
          * env.test = undefined;
          * console.log(env.test);
          * // => 'undefined'
          * ```
          *
          * Use `delete` to delete a property from `process.env`.
          *
          * ```js
          * import { env } from 'process';
          *
          * env.TEST = 1;
          * delete env.TEST;
          * console.log(env.TEST);
          * // => undefined
          * ```
          *
          * On Windows operating systems, environment variables are case-insensitive.
          *
          * ```js
          * import { env } from 'process';
          *
          * env.TEST = 1;
          * console.log(env.test);
          * // => 1
          * ```
          *
          * Unless explicitly specified when creating a `Worker` instance,
          * each `Worker` thread has its own copy of `process.env`, based on its
          * parent thread’s `process.env`, or whatever was specified as the `env` option
          * to the `Worker` constructor. Changes to `process.env` will not be visible
          * across `Worker` threads, and only the main thread can make changes that
          * are visible to the operating system or to native add-ons.
          * @since v0.1.27
          */
        var env: ProcessEnv = js.native
        
        /**
          * The `process.execArgv` property returns the set of Node.js-specific command-line
          * options passed when the Node.js process was launched. These options do not
          * appear in the array returned by the {@link argv} property, and do not
          * include the Node.js executable, the name of the script, or any options following
          * the script name. These options are useful in order to spawn child processes with
          * the same execution environment as the parent.
          *
          * ```console
          * $ node --harmony script.js --version
          * ```
          *
          * Results in `process.execArgv`:
          *
          * ```js
          * ['--harmony']
          * ```
          *
          * And `process.argv`:
          *
          * ```js
          * ['/usr/local/bin/node', 'script.js', '--version']
          * ```
          *
          * Refer to `Worker constructor` for the detailed behavior of worker
          * threads with this property.
          * @since v0.7.7
          */
        var execArgv: js.Array[String] = js.native
        
        /**
          * The `process.execPath` property returns the absolute pathname of the executable
          * that started the Node.js process. Symbolic links, if any, are resolved.
          *
          * ```js
          * '/usr/local/bin/node'
          * ```
          * @since v0.1.100
          */
        var execPath: String = js.native
        
        /**
          * The `process.exit()` method instructs Node.js to terminate the process
          * synchronously with an exit status of `code`. If `code` is omitted, exit uses
          * either the 'success' code `0` or the value of `process.exitCode` if it has been
          * set. Node.js will not terminate until all the `'exit'` event listeners are
          * called.
          *
          * To exit with a 'failure' code:
          *
          * ```js
          * import { exit } from 'process';
          *
          * exit(1);
          * ```
          *
          * The shell that executed Node.js should see the exit code as `1`.
          *
          * Calling `process.exit()` will force the process to exit as quickly as possible
          * even if there are still asynchronous operations pending that have not yet
          * completed fully, including I/O operations to `process.stdout` and`process.stderr`.
          *
          * In most situations, it is not actually necessary to call `process.exit()`explicitly. The Node.js process will exit on its own _if there is no additional_
          * _work pending_ in the event loop. The `process.exitCode` property can be set to
          * tell the process which exit code to use when the process exits gracefully.
          *
          * For instance, the following example illustrates a _misuse_ of the`process.exit()` method that could lead to data printed to stdout being
          * truncated and lost:
          *
          * ```js
          * import { exit } from 'process';
          *
          * // This is an example of what *not* to do:
          * if (someConditionNotMet()) {
          *   printUsageToStdout();
          *   exit(1);
          * }
          * ```
          *
          * The reason this is problematic is because writes to `process.stdout` in Node.js
          * are sometimes _asynchronous_ and may occur over multiple ticks of the Node.js
          * event loop. Calling `process.exit()`, however, forces the process to exit _before_ those additional writes to `stdout` can be performed.
          *
          * Rather than calling `process.exit()` directly, the code _should_ set the`process.exitCode` and allow the process to exit naturally by avoiding
          * scheduling any additional work for the event loop:
          *
          * ```js
          * import process from 'process';
          *
          * // How to properly set the exit code while letting
          * // the process exit gracefully.
          * if (someConditionNotMet()) {
          *   printUsageToStdout();
          *   process.exitCode = 1;
          * }
          * ```
          *
          * If it is necessary to terminate the Node.js process due to an error condition,
          * throwing an _uncaught_ error and allowing the process to terminate accordingly
          * is safer than calling `process.exit()`.
          *
          * In `Worker` threads, this function stops the current thread rather
          * than the current process.
          * @since v0.1.13
          * @param [code=0] The exit code.
          */
        def exit(): scala.Nothing = js.native
        def exit(code: Double): scala.Nothing = js.native
        
        /**
          * A number which will be the process exit code, when the process either
          * exits gracefully, or is exited via {@link exit} without specifying
          * a code.
          *
          * Specifying a code to {@link exit} will override any
          * previous setting of `process.exitCode`.
          * @since v0.11.8
          */
        var exitCode: js.UndefOr[Double] = js.native
        
        var features: Debug = js.native
        
        /**
          * The `process.getegid()` method returns the numerical effective group identity
          * of the Node.js process. (See [`getegid(2)`](http://man7.org/linux/man-pages/man2/getegid.2.html).)
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getegid) {
          *   console.log(`Current gid: ${process.getegid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v2.0.0
          */
        var getegid: js.UndefOr[js.Function0[Double]] = js.native
        
        /**
          * The `process.geteuid()` method returns the numerical effective user identity of
          * the process. (See [`geteuid(2)`](http://man7.org/linux/man-pages/man2/geteuid.2.html).)
          *
          * ```js
          * import process from 'process';
          *
          * if (process.geteuid) {
          *   console.log(`Current uid: ${process.geteuid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v2.0.0
          */
        var geteuid: js.UndefOr[js.Function0[Double]] = js.native
        
        /**
          * The `process.getgid()` method returns the numerical group identity of the
          * process. (See [`getgid(2)`](http://man7.org/linux/man-pages/man2/getgid.2.html).)
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getgid) {
          *   console.log(`Current gid: ${process.getgid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v0.1.31
          */
        var getgid: js.UndefOr[js.Function0[Double]] = js.native
        
        /**
          * The `process.getgroups()` method returns an array with the supplementary group
          * IDs. POSIX leaves it unspecified if the effective group ID is included but
          * Node.js ensures it always is.
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getgroups) {
          *   console.log(process.getgroups()); // [ 16, 21, 297 ]
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v0.9.4
          */
        var getgroups: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
        
        /**
          * The `process.getuid()` method returns the numeric user identity of the process.
          * (See [`getuid(2)`](http://man7.org/linux/man-pages/man2/getuid.2.html).)
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getuid) {
          *   console.log(`Current uid: ${process.getuid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v0.1.28
          */
        var getuid: js.UndefOr[js.Function0[Double]] = js.native
        
        /**
          * Indicates whether a callback has been set using {@link setUncaughtExceptionCaptureCallback}.
          * @since v9.3.0
          */
        def hasUncaughtExceptionCaptureCallback(): Boolean = js.native
        
        def hrtime(): js.Tuple2[Double, Double] = js.native
        def hrtime(time: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
        @JSName("hrtime")
        var hrtime_Original: HRTime = js.native
        
        /**
          * The `process.kill()` method sends the `signal` to the process identified by`pid`.
          *
          * Signal names are strings such as `'SIGINT'` or `'SIGHUP'`. See `Signal Events` and [`kill(2)`](http://man7.org/linux/man-pages/man2/kill.2.html) for more information.
          *
          * This method will throw an error if the target `pid` does not exist. As a special
          * case, a signal of `0` can be used to test for the existence of a process.
          * Windows platforms will throw an error if the `pid` is used to kill a process
          * group.
          *
          * Even though the name of this function is `process.kill()`, it is really just a
          * signal sender, like the `kill` system call. The signal sent may do something
          * other than kill the target process.
          *
          * ```js
          * import process, { kill } from 'process';
          *
          * process.on('SIGHUP', () => {
          *   console.log('Got SIGHUP signal.');
          * });
          *
          * setTimeout(() => {
          *   console.log('Exiting.');
          *   process.exit(0);
          * }, 100);
          *
          * kill(process.pid, 'SIGHUP');
          * ```
          *
          * When `SIGUSR1` is received by a Node.js process, Node.js will start the
          * debugger. See `Signal Events`.
          * @since v0.0.6
          * @param pid A process ID
          * @param [signal='SIGTERM'] The signal to send, either as a string or number.
          */
        def kill(pid: Double): true = js.native
        def kill(pid: Double, signal: String): true = js.native
        def kill(pid: Double, signal: Double): true = js.native
        
        @JSName("listeners")
        @scala.annotation.targetName("listeners_exit")
        def listeners(event: "exit"): js.Array[ExitListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_disconnect")
        def listeners(event: "disconnect"): js.Array[DisconnectListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_beforeExit")
        def listeners(event: "beforeExit"): js.Array[BeforeExitListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_uncaughtExceptionMonitor")
        def listeners(event: "uncaughtExceptionMonitor"): js.Array[UncaughtExceptionListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_worker")
        def listeners(event: "worker"): js.Array[WorkerListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_unhandledRejection")
        def listeners(event: "unhandledRejection"): js.Array[UnhandledRejectionListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_message")
        def listeners(event: "message"): js.Array[MessageListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_warning")
        def listeners(event: "warning"): js.Array[WarningListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_rejectionHandled")
        def listeners(event: "rejectionHandled"): js.Array[RejectionHandledListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_multipleResolves")
        def listeners(event: "multipleResolves"): js.Array[MultipleResolveListener] = js.native
        @JSName("listeners")
        @scala.annotation.targetName("listeners_uncaughtException")
        def listeners(event: "uncaughtException"): js.Array[UncaughtExceptionListener] = js.native
        
        /**
          * The `process.mainModule` property provides an alternative way of retrieving `require.main`. The difference is that if the main module changes at
          * runtime, `require.main` may still refer to the original main module in
          * modules that were required before the change occurred. Generally, it's
          * safe to assume that the two refer to the same module.
          *
          * As with `require.main`, `process.mainModule` will be `undefined` if there
          * is no entry script.
          * @since v0.1.17
          * @deprecated Since v14.0.0 - Use `main` instead.
          */
        var mainModule: js.UndefOr[Module] = js.native
        
        /**
          * The `process.memoryUsage()` method iterate over each page to gather informations about memory
          * usage which can be slow depending on the program memory allocations.
          */
        def memoryUsage(): MemoryUsage = js.native
        @JSName("memoryUsage")
        var memoryUsage_Original: MemoryUsageFn = js.native
        
        /**
          * `process.nextTick()` adds `callback` to the "next tick queue". This queue is
          * fully drained after the current operation on the JavaScript stack runs to
          * completion and before the event loop is allowed to continue. It's possible to
          * create an infinite loop if one were to recursively call `process.nextTick()`.
          * See the [Event Loop](https://nodejs.org/en/docs/guides/event-loop-timers-and-nexttick/#process-nexttick) guide for more background.
          *
          * ```js
          * import { nextTick } from 'process';
          *
          * console.log('start');
          * nextTick(() => {
          *   console.log('nextTick callback');
          * });
          * console.log('scheduled');
          * // Output:
          * // start
          * // scheduled
          * // nextTick callback
          * ```
          *
          * This is important when developing APIs in order to give users the opportunity
          * to assign event handlers _after_ an object has been constructed but before any
          * I/O has occurred:
          *
          * ```js
          * import { nextTick } from 'process';
          *
          * function MyThing(options) {
          *   this.setupOptions(options);
          *
          *   nextTick(() => {
          *     this.startDoingStuff();
          *   });
          * }
          *
          * const thing = new MyThing();
          * thing.getReadyForStuff();
          *
          * // thing.startDoingStuff() gets called now, not before.
          * ```
          *
          * It is very important for APIs to be either 100% synchronous or 100%
          * asynchronous. Consider this example:
          *
          * ```js
          * // WARNING!  DO NOT USE!  BAD UNSAFE HAZARD!
          * function maybeSync(arg, cb) {
          *   if (arg) {
          *     cb();
          *     return;
          *   }
          *
          *   fs.stat('file', cb);
          * }
          * ```
          *
          * This API is hazardous because in the following case:
          *
          * ```js
          * const maybeTrue = Math.random() > 0.5;
          *
          * maybeSync(maybeTrue, () => {
          *   foo();
          * });
          *
          * bar();
          * ```
          *
          * It is not clear whether `foo()` or `bar()` will be called first.
          *
          * The following approach is much better:
          *
          * ```js
          * import { nextTick } from 'process';
          *
          * function definitelyAsync(arg, cb) {
          *   if (arg) {
          *     nextTick(cb);
          *     return;
          *   }
          *
          *   fs.stat('file', cb);
          * }
          * ```
          * @since v0.1.26
          * @param args Additional arguments to pass when invoking the `callback`
          */
        def nextTick(callback: js.Function, args: Any*): Unit = js.native
        
        @JSName("on")
        @scala.annotation.targetName("on_beforeExit")
        def on(event: "beforeExit", listener: BeforeExitListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_disconnect")
        def on(event: "disconnect", listener: DisconnectListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_exit")
        def on(event: "exit", listener: ExitListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_message")
        def on(event: "message", listener: MessageListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_multipleResolves")
        def on(event: "multipleResolves", listener: MultipleResolveListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_rejectionHandled")
        def on(event: "rejectionHandled", listener: RejectionHandledListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_uncaughtException")
        def on(event: "uncaughtException", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_uncaughtExceptionMonitor")
        def on(event: "uncaughtExceptionMonitor", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_unhandledRejection")
        def on(event: "unhandledRejection", listener: UnhandledRejectionListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_warning")
        def on(event: "warning", listener: WarningListener): this.type = js.native
        @JSName("on")
        @scala.annotation.targetName("on_worker")
        def on(event: "worker", listener: WorkerListener): this.type = js.native
        
        @JSName("once")
        @scala.annotation.targetName("once_beforeExit")
        def once(event: "beforeExit", listener: BeforeExitListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_disconnect")
        def once(event: "disconnect", listener: DisconnectListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_exit")
        def once(event: "exit", listener: ExitListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_message")
        def once(event: "message", listener: MessageListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_multipleResolves")
        def once(event: "multipleResolves", listener: MultipleResolveListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_rejectionHandled")
        def once(event: "rejectionHandled", listener: RejectionHandledListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_uncaughtException")
        def once(event: "uncaughtException", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_uncaughtExceptionMonitor")
        def once(event: "uncaughtExceptionMonitor", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_unhandledRejection")
        def once(event: "unhandledRejection", listener: UnhandledRejectionListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_warning")
        def once(event: "warning", listener: WarningListener): this.type = js.native
        @JSName("once")
        @scala.annotation.targetName("once_worker")
        def once(event: "worker", listener: WorkerListener): this.type = js.native
        
        def openStdin(): Socket = js.native
        
        /**
          * The `process.pid` property returns the PID of the process.
          *
          * ```js
          * import { pid } from 'process';
          *
          * console.log(`This process is pid ${pid}`);
          * ```
          * @since v0.1.15
          */
        val pid: Double = js.native
        
        /**
          * The `process.platform` property returns a string identifying the operating
          * system platform for which the Node.js binary was compiled.
          *
          * Currently possible values are:
          *
          * * `'aix'`
          * * `'darwin'`
          * * `'freebsd'`
          * * `'linux'`
          * * `'openbsd'`
          * * `'sunos'`
          * * `'win32'`
          *
          * ```js
          * import { platform } from 'process';
          *
          * console.log(`This platform is ${platform}`);
          * ```
          *
          * The value `'android'` may also be returned if the Node.js is built on the
          * Android operating system. However, Android support in Node.js [is experimental](https://github.com/nodejs/node/blob/HEAD/BUILDING.md#androidandroid-based-devices-eg-firefox-os).
          * @since v0.1.16
          */
        val platform: Platform = js.native
        
        /**
          * The `process.ppid` property returns the PID of the parent of the
          * current process.
          *
          * ```js
          * import { ppid } from 'process';
          *
          * console.log(`The parent process is pid ${ppid}`);
          * ```
          * @since v9.2.0, v8.10.0, v6.13.0
          */
        val ppid: Double = js.native
        
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_beforeExit")
        def prependListener(event: "beforeExit", listener: BeforeExitListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_disconnect")
        def prependListener(event: "disconnect", listener: DisconnectListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_exit")
        def prependListener(event: "exit", listener: ExitListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_message")
        def prependListener(event: "message", listener: MessageListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_multipleResolves")
        def prependListener(event: "multipleResolves", listener: MultipleResolveListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_rejectionHandled")
        def prependListener(event: "rejectionHandled", listener: RejectionHandledListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_uncaughtException")
        def prependListener(event: "uncaughtException", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_uncaughtExceptionMonitor")
        def prependListener(event: "uncaughtExceptionMonitor", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_unhandledRejection")
        def prependListener(event: "unhandledRejection", listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_warning")
        def prependListener(event: "warning", listener: WarningListener): this.type = js.native
        @JSName("prependListener")
        @scala.annotation.targetName("prependListener_worker")
        def prependListener(event: "worker", listener: WorkerListener): this.type = js.native
        
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_beforeExit")
        def prependOnceListener(event: "beforeExit", listener: BeforeExitListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_disconnect")
        def prependOnceListener(event: "disconnect", listener: DisconnectListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_exit")
        def prependOnceListener(event: "exit", listener: ExitListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_message")
        def prependOnceListener(event: "message", listener: MessageListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_multipleResolves")
        def prependOnceListener(event: "multipleResolves", listener: MultipleResolveListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_rejectionHandled")
        def prependOnceListener(event: "rejectionHandled", listener: RejectionHandledListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_uncaughtException")
        def prependOnceListener(event: "uncaughtException", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_uncaughtExceptionMonitor")
        def prependOnceListener(event: "uncaughtExceptionMonitor", listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_unhandledRejection")
        def prependOnceListener(event: "unhandledRejection", listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_warning")
        def prependOnceListener(event: "warning", listener: WarningListener): this.type = js.native
        @JSName("prependOnceListener")
        @scala.annotation.targetName("prependOnceListener_worker")
        def prependOnceListener(event: "worker", listener: WorkerListener): this.type = js.native
        
        /**
          * The `process.release` property returns an `Object` containing metadata related
          * to the current release, including URLs for the source tarball and headers-only
          * tarball.
          *
          * `process.release` contains the following properties:
          *
          * ```js
          * {
          *   name: 'node',
          *   lts: 'Erbium',
          *   sourceUrl: 'https://nodejs.org/download/release/v12.18.1/node-v12.18.1.tar.gz',
          *   headersUrl: 'https://nodejs.org/download/release/v12.18.1/node-v12.18.1-headers.tar.gz',
          *   libUrl: 'https://nodejs.org/download/release/v12.18.1/win-x64/node.lib'
          * }
          * ```
          *
          * In custom builds from non-release versions of the source tree, only the`name` property may be present. The additional properties should not be
          * relied upon to exist.
          * @since v3.0.0
          */
        val release: ProcessRelease = js.native
        
        /**
          * `process.report` is an object whose methods are used to generate diagnostic
          * reports for the current process. Additional documentation is available in the `report documentation`.
          * @since v11.8.0
          */
        var report: js.UndefOr[ProcessReport] = js.native
        
        /**
          * ```js
          * import { resourceUsage } from 'process';
          *
          * console.log(resourceUsage());
          * / *
          *   Will output:
          *   {
          *     userCPUTime: 82872,
          *     systemCPUTime: 4143,
          *     maxRSS: 33164,
          *     sharedMemorySize: 0,
          *     unsharedDataSize: 0,
          *     unsharedStackSize: 0,
          *     minorPageFault: 2469,
          *     majorPageFault: 0,
          *     swappedOut: 0,
          *     fsRead: 0,
          *     fsWrite: 8,
          *     ipcSent: 0,
          *     ipcReceived: 0,
          *     signalsCount: 0,
          *     voluntaryContextSwitches: 79,
          *     involuntaryContextSwitches: 1
          *   }
          *
          * ```
          * @since v12.6.0
          * @return the resource usage for the current process. All of these values come from the `uv_getrusage` call which returns a [`uv_rusage_t` struct][uv_rusage_t].
          */
        def resourceUsage(): ResourceUsage = js.native
        
        /**
          * If Node.js is spawned with an IPC channel, the `process.send()` method can be
          * used to send messages to the parent process. Messages will be received as a `'message'` event on the parent's `ChildProcess` object.
          *
          * If Node.js was not spawned with an IPC channel, `process.send` will be`undefined`.
          *
          * The message goes through serialization and parsing. The resulting message might
          * not be the same as what is originally sent.
          * @since v0.5.9
          * @param options used to parameterize the sending of certain types of handles.`options` supports the following properties:
          */
        var send: js.UndefOr[
                js.Function4[
                  /* message */ Any, 
                  /* sendHandle */ js.UndefOr[Any], 
                  /* options */ js.UndefOr[SwallowErrors], 
                  /* callback */ js.UndefOr[js.Function1[/* error */ js.Error | Null, Unit]], 
                  Boolean
                ]
              ] = js.native
        
        /**
          * The `process.setUncaughtExceptionCaptureCallback()` function sets a function
          * that will be invoked when an uncaught exception occurs, which will receive the
          * exception value itself as its first argument.
          *
          * If such a function is set, the `'uncaughtException'` event will
          * not be emitted. If `--abort-on-uncaught-exception` was passed from the
          * command line or set through `v8.setFlagsFromString()`, the process will
          * not abort. Actions configured to take place on exceptions such as report
          * generations will be affected too
          *
          * To unset the capture function,`process.setUncaughtExceptionCaptureCallback(null)` may be used. Calling this
          * method with a non-`null` argument while another capture function is set will
          * throw an error.
          *
          * Using this function is mutually exclusive with using the deprecated `domain` built-in module.
          * @since v9.3.0
          */
        def setUncaughtExceptionCaptureCallback(): Unit = js.native
        def setUncaughtExceptionCaptureCallback(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
        
        /**
          * The `process.setegid()` method sets the effective group identity of the process.
          * (See [`setegid(2)`](http://man7.org/linux/man-pages/man2/setegid.2.html).) The `id` can be passed as either a numeric ID or a group
          * name string. If a group name is specified, this method blocks while resolving
          * the associated a numeric ID.
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getegid &#x26;&#x26; process.setegid) {
          *   console.log(`Current gid: ${process.getegid()}`);
          *   try {
          *     process.setegid(501);
          *     console.log(`New gid: ${process.getegid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set gid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v2.0.0
          * @param id A group name or ID
          */
        var setegid: js.UndefOr[js.Function1[/* id */ Double | String, Unit]] = js.native
        
        /**
          * The `process.seteuid()` method sets the effective user identity of the process.
          * (See [`seteuid(2)`](http://man7.org/linux/man-pages/man2/seteuid.2.html).) The `id` can be passed as either a numeric ID or a username
          * string. If a username is specified, the method blocks while resolving the
          * associated numeric ID.
          *
          * ```js
          * import process from 'process';
          *
          * if (process.geteuid &#x26;&#x26; process.seteuid) {
          *   console.log(`Current uid: ${process.geteuid()}`);
          *   try {
          *     process.seteuid(501);
          *     console.log(`New uid: ${process.geteuid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set uid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v2.0.0
          * @param id A user name or ID
          */
        var seteuid: js.UndefOr[js.Function1[/* id */ Double | String, Unit]] = js.native
        
        /**
          * The `process.setgid()` method sets the group identity of the process. (See [`setgid(2)`](http://man7.org/linux/man-pages/man2/setgid.2.html).) The `id` can be passed as either a
          * numeric ID or a group name
          * string. If a group name is specified, this method blocks while resolving the
          * associated numeric ID.
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getgid &#x26;&#x26; process.setgid) {
          *   console.log(`Current gid: ${process.getgid()}`);
          *   try {
          *     process.setgid(501);
          *     console.log(`New gid: ${process.getgid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set gid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v0.1.31
          * @param id The group name or ID
          */
        var setgid: js.UndefOr[js.Function1[/* id */ Double | String, Unit]] = js.native
        
        /**
          * The `process.setgroups()` method sets the supplementary group IDs for the
          * Node.js process. This is a privileged operation that requires the Node.js
          * process to have `root` or the `CAP_SETGID` capability.
          *
          * The `groups` array can contain numeric group IDs, group names, or both.
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getgroups &#x26;&#x26; process.setgroups) {
          *   try {
          *     process.setgroups([501]);
          *     console.log(process.getgroups()); // new groups
          *   } catch (err) {
          *     console.log(`Failed to set groups: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v0.9.4
          */
        var setgroups: js.UndefOr[js.Function1[/* groups */ js.Array[String | Double], Unit]] = js.native
        
        /**
          * The `process.setuid(id)` method sets the user identity of the process. (See [`setuid(2)`](http://man7.org/linux/man-pages/man2/setuid.2.html).) The `id` can be passed as either a
          * numeric ID or a username string.
          * If a username is specified, the method blocks while resolving the associated
          * numeric ID.
          *
          * ```js
          * import process from 'process';
          *
          * if (process.getuid &#x26;&#x26; process.setuid) {
          *   console.log(`Current uid: ${process.getuid()}`);
          *   try {
          *     process.setuid(501);
          *     console.log(`New uid: ${process.getuid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set uid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v0.1.28
          */
        var setuid: js.UndefOr[js.Function1[/* id */ Double | String, Unit]] = js.native
        
        /**
          * The `process.stderr` property returns a stream connected to`stderr` (fd `2`). It is a `net.Socket` (which is a `Duplex` stream) unless fd `2` refers to a file, in which case it is
          * a `Writable` stream.
          *
          * `process.stderr` differs from other Node.js streams in important ways. See `note on process I/O` for more information.
          */
        var stderr: WriteStream & `4` = js.native
        
        /**
          * The `process.stdin` property returns a stream connected to`stdin` (fd `0`). It is a `net.Socket` (which is a `Duplex` stream) unless fd `0` refers to a file, in which case it is
          * a `Readable` stream.
          *
          * For details of how to read from `stdin` see `readable.read()`.
          *
          * As a `Duplex` stream, `process.stdin` can also be used in "old" mode that
          * is compatible with scripts written for Node.js prior to v0.10\.
          * For more information see `Stream compatibility`.
          *
          * In "old" streams mode the `stdin` stream is paused by default, so one
          * must call `process.stdin.resume()` to read from it. Note also that calling`process.stdin.resume()` itself would switch stream to "old" mode.
          */
        var stdin: ReadStream & `5` = js.native
        
        /**
          * The `process.stdout` property returns a stream connected to`stdout` (fd `1`). It is a `net.Socket` (which is a `Duplex` stream) unless fd `1` refers to a file, in which case it is
          * a `Writable` stream.
          *
          * For example, to copy `process.stdin` to `process.stdout`:
          *
          * ```js
          * import { stdin, stdout } from 'process';
          *
          * stdin.pipe(stdout);
          * ```
          *
          * `process.stdout` differs from other Node.js streams in important ways. See `note on process I/O` for more information.
          */
        var stdout: WriteStream & Fd = js.native
        
        /**
          * The `process.title` property returns the current process title (i.e. returns
          * the current value of `ps`). Assigning a new value to `process.title` modifies
          * the current value of `ps`.
          *
          * When a new value is assigned, different platforms will impose different maximum
          * length restrictions on the title. Usually such restrictions are quite limited.
          * For instance, on Linux and macOS, `process.title` is limited to the size of the
          * binary name plus the length of the command-line arguments because setting the`process.title` overwrites the `argv` memory of the process. Node.js v0.8
          * allowed for longer process title strings by also overwriting the `environ`memory but that was potentially insecure and confusing in some (rather obscure)
          * cases.
          *
          * Assigning a value to `process.title` might not result in an accurate label
          * within process manager applications such as macOS Activity Monitor or Windows
          * Services Manager.
          * @since v0.1.104
          */
        var title: String = js.native
        
        /**
          * The `process.traceDeprecation` property indicates whether the`--trace-deprecation` flag is set on the current Node.js process. See the
          * documentation for the `'warning' event` and the `emitWarning() method` for more information about this
          * flag's behavior.
          * @since v0.8.0
          */
        var traceDeprecation: Boolean = js.native
        
        /**
          * `process.umask()` returns the Node.js process's file mode creation mask. Child
          * processes inherit the mask from the parent process.
          * @since v0.1.19
          * @deprecated Calling `process.umask()` with no argument causes the process-wide umask to be written twice. This introduces a race condition between threads, and is a potential   *
          * security vulnerability. There is no safe, cross-platform alternative API.
          */
        def umask(): Double = js.native
        /**
          * Can only be set if not in worker thread.
          */
        def umask(mask: String): Double = js.native
        def umask(mask: Double): Double = js.native
        
        /**
          * The `process.uptime()` method returns the number of seconds the current Node.js
          * process has been running.
          *
          * The return value includes fractions of a second. Use `Math.floor()` to get whole
          * seconds.
          * @since v0.5.0
          */
        def uptime(): Double = js.native
        
        /**
          * The `process.version` property contains the Node.js version string.
          *
          * ```js
          * import { version } from 'process';
          *
          * console.log(`Version: ${version}`);
          * // Version: v14.8.0
          * ```
          *
          * To get the version string without the prepended _v_, use`process.versions.node`.
          * @since v0.1.3
          */
        val version: String = js.native
        
        /**
          * The `process.versions` property returns an object listing the version strings of
          * Node.js and its dependencies. `process.versions.modules` indicates the current
          * ABI version, which is increased whenever a C++ API changes. Node.js will refuse
          * to load modules that were compiled against a different module ABI version.
          *
          * ```js
          * import { versions } from 'process';
          *
          * console.log(versions);
          * ```
          *
          * Will generate an object similar to:
          *
          * ```console
          * { node: '11.13.0',
          *   v8: '7.0.276.38-node.18',
          *   uv: '1.27.0',
          *   zlib: '1.2.11',
          *   brotli: '1.0.7',
          *   ares: '1.15.0',
          *   modules: '67',
          *   nghttp2: '1.34.0',
          *   napi: '4',
          *   llhttp: '1.1.1',
          *   openssl: '1.1.1b',
          *   cldr: '34.0',
          *   icu: '63.1',
          *   tz: '2018e',
          *   unicode: '11.0' }
          * ```
          * @since v0.2.0
          */
        val versions: ProcessVersions = js.native
      }
      
      trait ProcessConfig extends StObject {
        
        val target_defaults: Cflags
        
        val variables: Clang
      }
      object ProcessConfig {
        
        inline def apply(target_defaults: Cflags, variables: Clang): ProcessConfig = {
          val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessConfig]
        }
        
        extension [Self <: ProcessConfig](x: Self) {
          
          inline def setTarget_defaults(value: Cflags): Self = StObject.set(x, "target_defaults", value.asInstanceOf[js.Any])
          
          inline def setVariables(value: Clang): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
        }
      }
      
      // Alias for compatibility
      trait ProcessEnv
        extends StObject
           with Dict[String] {
        
        /**
          * Can be used to change the default timezone at runtime
          */
        var TZ: js.UndefOr[String] = js.undefined
      }
      object ProcessEnv {
        
        inline def apply(): ProcessEnv = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProcessEnv]
        }
        
        extension [Self <: ProcessEnv](x: Self) {
          
          inline def setTZ(value: String): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
          
          inline def setTZUndefined: Self = StObject.set(x, "TZ", js.undefined)
        }
      }
      
      trait ProcessRelease extends StObject {
        
        var headersUrl: js.UndefOr[String] = js.undefined
        
        var libUrl: js.UndefOr[String] = js.undefined
        
        var lts: js.UndefOr[String] = js.undefined
        
        var name: String
        
        var sourceUrl: js.UndefOr[String] = js.undefined
      }
      object ProcessRelease {
        
        inline def apply(name: String): ProcessRelease = {
          val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessRelease]
        }
        
        extension [Self <: ProcessRelease](x: Self) {
          
          inline def setHeadersUrl(value: String): Self = StObject.set(x, "headersUrl", value.asInstanceOf[js.Any])
          
          inline def setHeadersUrlUndefined: Self = StObject.set(x, "headersUrl", js.undefined)
          
          inline def setLibUrl(value: String): Self = StObject.set(x, "libUrl", value.asInstanceOf[js.Any])
          
          inline def setLibUrlUndefined: Self = StObject.set(x, "libUrl", js.undefined)
          
          inline def setLts(value: String): Self = StObject.set(x, "lts", value.asInstanceOf[js.Any])
          
          inline def setLtsUndefined: Self = StObject.set(x, "lts", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
          
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
        var directory: String = js.native
        
        /**
          * Filename where the report is written.
          * The default value is the empty string.
          * @default '' the output filename will be comprised of a timestamp,
          * PID, and sequence number.
          */
        var filename: String = js.native
        
        /**
          * Returns a JSON-formatted diagnostic report for the running process.
          * The report's JavaScript stack trace is taken from err, if present.
          */
        def getReport(): String = js.native
        def getReport(err: js.Error): String = js.native
        
        /**
          * If true, a diagnostic report is generated on fatal errors,
          * such as out of memory errors or failed C++ assertions.
          * @default false
          */
        var reportOnFatalError: Boolean = js.native
        
        /**
          * If true, a diagnostic report is generated when the process
          * receives the signal specified by process.report.signal.
          * @default false
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
        def writeReport(): String = js.native
        def writeReport(error: js.Error): String = js.native
        def writeReport(fileName: String): String = js.native
        def writeReport(fileName: String, err: js.Error): String = js.native
        def writeReport(fileName: Unit, err: js.Error): String = js.native
      }
      
      trait ProcessVersions
        extends StObject
           with Dict[String] {
        
        var ares: String
        
        var http_parser: String
        
        var modules: String
        
        var node: String
        
        var openssl: String
        
        var uv: String
        
        var v8: String
        
        var zlib: String
      }
      object ProcessVersions {
        
        inline def apply(
          ares: String,
          http_parser: String,
          modules: String,
          node: String,
          openssl: String,
          uv: String,
          v8: String,
          zlib: String
        ): ProcessVersions = {
          val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessVersions]
        }
        
        extension [Self <: ProcessVersions](x: Self) {
          
          inline def setAres(value: String): Self = StObject.set(x, "ares", value.asInstanceOf[js.Any])
          
          inline def setHttp_parser(value: String): Self = StObject.set(x, "http_parser", value.asInstanceOf[js.Any])
          
          inline def setModules(value: String): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
          
          inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
          
          inline def setOpenssl(value: String): Self = StObject.set(x, "openssl", value.asInstanceOf[js.Any])
          
          inline def setUv(value: String): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
          
          inline def setV8(value: String): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
          
          inline def setZlib(value: String): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
        }
      }
      
      // this namespace merge is here because these are specifically used
      // as the type for process.stdin, process.stdout, and process.stderr.
      // they can't live in tty.d.ts because we need to disambiguate the imported name.
      type ReadStream = typings.node.nodeColonttyMod.ReadStream
      
      type RejectionHandledListener = js.Function1[/* promise */ js.Promise[Any], Unit]
      
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
      
      object Signals {
        
        inline def SIGABRT: "SIGABRT" = "SIGABRT".asInstanceOf["SIGABRT"]
        
        inline def SIGALRM: "SIGALRM" = "SIGALRM".asInstanceOf["SIGALRM"]
        
        inline def SIGBREAK: "SIGBREAK" = "SIGBREAK".asInstanceOf["SIGBREAK"]
        
        inline def SIGBUS: "SIGBUS" = "SIGBUS".asInstanceOf["SIGBUS"]
        
        inline def SIGCHLD: "SIGCHLD" = "SIGCHLD".asInstanceOf["SIGCHLD"]
        
        inline def SIGCONT: "SIGCONT" = "SIGCONT".asInstanceOf["SIGCONT"]
        
        inline def SIGFPE: "SIGFPE" = "SIGFPE".asInstanceOf["SIGFPE"]
        
        inline def SIGHUP: "SIGHUP" = "SIGHUP".asInstanceOf["SIGHUP"]
        
        inline def SIGILL: "SIGILL" = "SIGILL".asInstanceOf["SIGILL"]
        
        inline def SIGINFO: "SIGINFO" = "SIGINFO".asInstanceOf["SIGINFO"]
        
        inline def SIGINT: "SIGINT" = "SIGINT".asInstanceOf["SIGINT"]
        
        inline def SIGIO: "SIGIO" = "SIGIO".asInstanceOf["SIGIO"]
        
        inline def SIGIOT: "SIGIOT" = "SIGIOT".asInstanceOf["SIGIOT"]
        
        inline def SIGKILL: "SIGKILL" = "SIGKILL".asInstanceOf["SIGKILL"]
        
        inline def SIGLOST: "SIGLOST" = "SIGLOST".asInstanceOf["SIGLOST"]
        
        inline def SIGPIPE: "SIGPIPE" = "SIGPIPE".asInstanceOf["SIGPIPE"]
        
        inline def SIGPOLL: "SIGPOLL" = "SIGPOLL".asInstanceOf["SIGPOLL"]
        
        inline def SIGPROF: "SIGPROF" = "SIGPROF".asInstanceOf["SIGPROF"]
        
        inline def SIGPWR: "SIGPWR" = "SIGPWR".asInstanceOf["SIGPWR"]
        
        inline def SIGQUIT: "SIGQUIT" = "SIGQUIT".asInstanceOf["SIGQUIT"]
        
        inline def SIGSEGV: "SIGSEGV" = "SIGSEGV".asInstanceOf["SIGSEGV"]
        
        inline def SIGSTKFLT: "SIGSTKFLT" = "SIGSTKFLT".asInstanceOf["SIGSTKFLT"]
        
        inline def SIGSTOP: "SIGSTOP" = "SIGSTOP".asInstanceOf["SIGSTOP"]
        
        inline def SIGSYS: "SIGSYS" = "SIGSYS".asInstanceOf["SIGSYS"]
        
        inline def SIGTERM: "SIGTERM" = "SIGTERM".asInstanceOf["SIGTERM"]
        
        inline def SIGTRAP: "SIGTRAP" = "SIGTRAP".asInstanceOf["SIGTRAP"]
        
        inline def SIGTSTP: "SIGTSTP" = "SIGTSTP".asInstanceOf["SIGTSTP"]
        
        inline def SIGTTIN: "SIGTTIN" = "SIGTTIN".asInstanceOf["SIGTTIN"]
        
        inline def SIGTTOU: "SIGTTOU" = "SIGTTOU".asInstanceOf["SIGTTOU"]
        
        inline def SIGUNUSED: "SIGUNUSED" = "SIGUNUSED".asInstanceOf["SIGUNUSED"]
        
        inline def SIGURG: "SIGURG" = "SIGURG".asInstanceOf["SIGURG"]
        
        inline def SIGUSR1: "SIGUSR1" = "SIGUSR1".asInstanceOf["SIGUSR1"]
        
        inline def SIGUSR2: "SIGUSR2" = "SIGUSR2".asInstanceOf["SIGUSR2"]
        
        inline def SIGVTALRM: "SIGVTALRM" = "SIGVTALRM".asInstanceOf["SIGVTALRM"]
        
        inline def SIGWINCH: "SIGWINCH" = "SIGWINCH".asInstanceOf["SIGWINCH"]
        
        inline def SIGXCPU: "SIGXCPU" = "SIGXCPU".asInstanceOf["SIGXCPU"]
        
        inline def SIGXFSZ: "SIGXFSZ" = "SIGXFSZ".asInstanceOf["SIGXFSZ"]
      }
      type Signals = "SIGABRT" | "SIGALRM" | "SIGBUS" | "SIGCHLD" | "SIGCONT" | "SIGFPE" | "SIGHUP" | "SIGILL" | "SIGINT" | "SIGIO" | "SIGIOT" | "SIGKILL" | "SIGPIPE" | "SIGPOLL" | "SIGPROF" | "SIGPWR" | "SIGQUIT" | "SIGSEGV" | "SIGSTKFLT" | "SIGSTOP" | "SIGSYS" | "SIGTERM" | "SIGTRAP" | "SIGTSTP" | "SIGTTIN" | "SIGTTOU" | "SIGUNUSED" | "SIGURG" | "SIGUSR1" | "SIGUSR2" | "SIGVTALRM" | "SIGWINCH" | "SIGXCPU" | "SIGXFSZ" | "SIGBREAK" | "SIGLOST" | "SIGINFO"
      
      type SignalsListener = js.Function1[/* signal */ Signals, Unit]
      
      @js.native
      trait Socket
        extends StObject
           with ReadWriteStream {
        
        var isTTY: js.UndefOr[true] = js.native
      }
      
      type UncaughtExceptionListener = js.Function2[/* error */ js.Error, /* origin */ UncaughtExceptionOrigin, Unit]
      
      object UncaughtExceptionOrigin {
        
        inline def uncaughtException: "uncaughtException" = "uncaughtException".asInstanceOf["uncaughtException"]
        
        inline def unhandledRejection: "unhandledRejection" = "unhandledRejection".asInstanceOf["unhandledRejection"]
      }
      type UncaughtExceptionOrigin = "uncaughtException" | "unhandledRejection"
      
      /**
        * Most of the time the unhandledRejection will be an Error, but this should not be relied upon
        * as *anything* can be thrown/rejected, it is therefore unsafe to assume that the value is an Error.
        */
      type UnhandledRejectionListener = js.Function2[/* reason */ Any, /* promise */ js.Promise[Any], Unit]
      
      type WarningListener = js.Function1[/* warning */ js.Error, Unit]
      
      type WorkerListener = js.Function1[/* worker */ Worker, Unit]
      
      type WriteStream = typings.node.nodeColonttyMod.WriteStream
    }
  }
  
  type _To = Process
  
  /* This means you don't have to write `^`, but can instead just say `processMod.foo` */
  override def _to: Process = ^
}
