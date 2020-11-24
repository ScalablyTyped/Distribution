package typings.node.wasiMod

import typings.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WASIOptions extends js.Object {
  
  /**
    * An array of strings that the WebAssembly application will
    * see as command line arguments. The first argument is the virtual path to the
    * WASI command itself.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
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
  var preopens: js.UndefOr[Dict[String]] = js.native
  
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
  implicit class WASIOptionsOps[Self <: WASIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Object): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setPreopens(value: Dict[String]): Self = this.set("preopens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreopens: Self = this.set("preopens", js.undefined)
    
    @scala.inline
    def setReturnOnExit(value: Boolean): Self = this.set("returnOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnOnExit: Self = this.set("returnOnExit", js.undefined)
    
    @scala.inline
    def setStderr(value: Double): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    
    @scala.inline
    def setStdin(value: Double): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    
    @scala.inline
    def setStdout(value: Double): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
  }
}
