package typings.node

import typings.node.NodeJS.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wasiMod {
  
  @JSImport("wasi", "WASI")
  @js.native
  class WASI () extends StObject {
    def this(options: WASIOptions) = this()
    
    // TODO: avoid DOM dependency until WASM moved to own lib.
    /**
      * Attempt to initialize `instance` as a WASI reactor by invoking its `_initialize()` export, if it is present.
      * If `instance` contains a `_start()` export, then an exception is thrown.
      *
      * `start()` requires that `instance` exports a [`WebAssembly.Memory`][] named
      * `memory`. If `instance` does not have a `memory` export an exception is thrown.
      *
      * If `initialize()` is called more than once, an exception is thrown.
      */
    def initialize(instance: js.Object): Unit = js.native
    
    /**
      *
      * Attempt to begin execution of `instance` by invoking its `_start()` export.
      * If `instance` does not contain a `_start()` export, then `start()` attempts to
      * invoke the `__wasi_unstable_reactor_start()` export. If neither of those exports
      * is present on `instance`, then `start()` does nothing.
      *
      * `start()` requires that `instance` exports a [`WebAssembly.Memory`][] named
      * `memory`. If `instance` does not have a `memory` export an exception is thrown.
      *
      * If `start()` is called more than once, an exception is thrown.
      */
    def start(instance: js.Object): Unit = js.native
    
    // TODO: avoid DOM dependency until WASM moved to own lib.
    /**
      * Is an object that implements the WASI system call API. This object
      * should be passed as the `wasi_snapshot_preview1` import during the instantiation of a
      * [`WebAssembly.Instance`][].
      */
    val wasiImport: Dict[_] = js.native
  }
  
  @js.native
  trait WASIOptions extends StObject {
    
    /**
      * An array of strings that the WebAssembly application will
      * see as command line arguments. The first argument is the virtual path to the
      * WASI command itself.
      */
    var args: js.UndefOr[js.Array[java.lang.String]] = js.native
    
    /**
      * An object similar to `process.env` that the WebAssembly
      * application will see as its environment.
      */
    var env: js.UndefOr[js.Object] = js.native
    
    /**
      * This object represents the WebAssembly application's
      * sandbox directory structure. The string keys of `preopens` are treated as
      * directories within the sandbox. The corresponding values in `preopens` are
      * the real paths to those directories on the host machine.
      */
    var preopens: js.UndefOr[Dict[java.lang.String]] = js.native
    
    /**
      * By default, WASI applications terminate the Node.js
      * process via the `__wasi_proc_exit()` function. Setting this option to `true`
      * causes `wasi.start()` to return the exit code rather than terminate the
      * process.
      * @default false
      */
    var returnOnExit: js.UndefOr[Boolean] = js.native
    
    /**
      * The file descriptor used as standard error in the WebAssembly application.
      * @default 2
      */
    var stderr: js.UndefOr[Double] = js.native
    
    /**
      * The file descriptor used as standard input in the WebAssembly application.
      * @default 0
      */
    var stdin: js.UndefOr[Double] = js.native
    
    /**
      * The file descriptor used as standard output in the WebAssembly application.
      * @default 1
      */
    var stdout: js.UndefOr[Double] = js.native
  }
  object WASIOptions {
    
    @scala.inline
    def apply(): WASIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WASIOptions]
    }
    
    @scala.inline
    implicit class WASIOptionsMutableBuilder[Self <: WASIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[java.lang.String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: java.lang.String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setPreopens(value: Dict[java.lang.String]): Self = StObject.set(x, "preopens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreopensUndefined: Self = StObject.set(x, "preopens", js.undefined)
      
      @scala.inline
      def setReturnOnExit(value: Boolean): Self = StObject.set(x, "returnOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnOnExitUndefined: Self = StObject.set(x, "returnOnExit", js.undefined)
      
      @scala.inline
      def setStderr(value: Double): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdin(value: Double): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: Double): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
