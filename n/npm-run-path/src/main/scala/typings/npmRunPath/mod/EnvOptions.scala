package typings.npmRunPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvOptions extends js.Object {
  
  /**
  		Working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.native
  
  /**
  		Accepts an object of environment variables, like `process.env`, and modifies the PATH using the correct [PATH key](https://github.com/sindresorhus/path-key). Use this if you're modifying the PATH for use in the `child_process` options.
  		*/
  val env: js.UndefOr[ProcessEnv] = js.native
  
  /**
  		Path to the current Node.js executable. Its directory is pushed to the front of PATH.
  		This can be either an absolute path or a path relative to the `cwd` option.
  		@default process.execPath
  		*/
  val execPath: js.UndefOr[String] = js.native
}
object EnvOptions {
  
  @scala.inline
  def apply(): EnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvOptions]
  }
  
  @scala.inline
  implicit class EnvOptionsOps[Self <: EnvOptions] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecPath: Self = this.set("execPath", js.undefined)
  }
}
