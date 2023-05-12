package typings.node

import typings.node.NodeJS.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wasiMod {
  
  /**
    * The `WASI` class provides the WASI system call API and additional convenience
    * methods for working with WASI-based applications. Each `WASI` instance
    * represents a distinct sandbox environment. For security purposes, each `WASI`instance must have its command-line arguments, environment variables, and
    * sandbox directory structure configured explicitly.
    * @since v13.3.0, v12.16.0
    */
  @JSImport("wasi", "WASI")
  @js.native
  open class WASI () extends StObject {
    def this(options: WASIOptions) = this()
    
    // TODO: avoid DOM dependency until WASM moved to own lib.
    /**
      * Attempt to initialize `instance` as a WASI reactor by invoking its`_initialize()` export, if it is present. If `instance` contains a `_start()`export, then an exception is thrown.
      *
      * `initialize()` requires that `instance` exports a [`WebAssembly.Memory`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory) named`memory`.
      * If `instance` does not have a `memory` export an exception is thrown.
      *
      * If `initialize()` is called more than once, an exception is thrown.
      * @since v14.6.0, v12.19.0
      */
    def initialize(instance: js.Object): Unit = js.native
    
    /**
      * Attempt to begin execution of `instance` as a WASI command by invoking its`_start()` export. If `instance` does not contain a `_start()` export, or if`instance` contains an `_initialize()`
      * export, then an exception is thrown.
      *
      * `start()` requires that `instance` exports a [`WebAssembly.Memory`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Memory) named`memory`. If
      * `instance` does not have a `memory` export an exception is thrown.
      *
      * If `start()` is called more than once, an exception is thrown.
      * @since v13.3.0, v12.16.0
      */
    def start(instance: js.Object): Unit = js.native
    
    // TODO: avoid DOM dependency until WASM moved to own lib.
    /**
      * `wasiImport` is an object that implements the WASI system call API. This object
      * should be passed as the `wasi_snapshot_preview1` import during the instantiation
      * of a [`WebAssembly.Instance`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Instance).
      * @since v13.3.0, v12.16.0
      */
    val wasiImport: Dict[Any] = js.native
  }
  
  trait WASIOptions extends StObject {
    
    /**
      * An array of strings that the WebAssembly application will
      * see as command line arguments. The first argument is the virtual path to the
      * WASI command itself.
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An object similar to `process.env` that the WebAssembly
      * application will see as its environment.
      */
    var env: js.UndefOr[js.Object] = js.undefined
    
    /**
      * This object represents the WebAssembly application's
      * sandbox directory structure. The string keys of `preopens` are treated as
      * directories within the sandbox. The corresponding values in `preopens` are
      * the real paths to those directories on the host machine.
      */
    var preopens: js.UndefOr[Dict[String]] = js.undefined
    
    /**
      * By default, when WASI applications call `__wasi_proc_exit()`
      *  `wasi.start()` will return with the exit code specified rather than terminatng the process.
      * Setting this option to `false` will cause the Node.js process to exit with
      * the specified exit code instead.
      * @default true
      */
    var returnOnExit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file descriptor used as standard error in the WebAssembly application.
      * @default 2
      */
    var stderr: js.UndefOr[Double] = js.undefined
    
    /**
      * The file descriptor used as standard input in the WebAssembly application.
      * @default 0
      */
    var stdin: js.UndefOr[Double] = js.undefined
    
    /**
      * The file descriptor used as standard output in the WebAssembly application.
      * @default 1
      */
    var stdout: js.UndefOr[Double] = js.undefined
  }
  object WASIOptions {
    
    inline def apply(): WASIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WASIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WASIOptions] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setPreopens(value: Dict[String]): Self = StObject.set(x, "preopens", value.asInstanceOf[js.Any])
      
      inline def setPreopensUndefined: Self = StObject.set(x, "preopens", js.undefined)
      
      inline def setReturnOnExit(value: Boolean): Self = StObject.set(x, "returnOnExit", value.asInstanceOf[js.Any])
      
      inline def setReturnOnExitUndefined: Self = StObject.set(x, "returnOnExit", js.undefined)
      
      inline def setStderr(value: Double): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdin(value: Double): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: Double): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
