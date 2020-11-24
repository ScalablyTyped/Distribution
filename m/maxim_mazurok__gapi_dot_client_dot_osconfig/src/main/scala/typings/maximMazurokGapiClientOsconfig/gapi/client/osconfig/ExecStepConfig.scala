package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecStepConfig extends js.Object {
  
  /** Defaults to [0]. A list of possible return values that the execution can return to indicate a success. */
  var allowedSuccessCodes: js.UndefOr[js.Array[Double]] = js.native
  
  /** A Cloud Storage object containing the executable. */
  var gcsObject: js.UndefOr[GcsObject] = js.native
  
  /**
    * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines]
    * (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
    */
  var interpreter: js.UndefOr[String] = js.native
  
  /** An absolute path to the executable on the VM. */
  var localPath: js.UndefOr[String] = js.native
}
object ExecStepConfig {
  
  @scala.inline
  def apply(): ExecStepConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecStepConfig]
  }
  
  @scala.inline
  implicit class ExecStepConfigOps[Self <: ExecStepConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowedSuccessCodesVarargs(value: Double*): Self = this.set("allowedSuccessCodes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedSuccessCodes(value: js.Array[Double]): Self = this.set("allowedSuccessCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedSuccessCodes: Self = this.set("allowedSuccessCodes", js.undefined)
    
    @scala.inline
    def setGcsObject(value: GcsObject): Self = this.set("gcsObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsObject: Self = this.set("gcsObject", js.undefined)
    
    @scala.inline
    def setInterpreter(value: String): Self = this.set("interpreter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpreter: Self = this.set("interpreter", js.undefined)
    
    @scala.inline
    def setLocalPath(value: String): Self = this.set("localPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalPath: Self = this.set("localPath", js.undefined)
  }
}
