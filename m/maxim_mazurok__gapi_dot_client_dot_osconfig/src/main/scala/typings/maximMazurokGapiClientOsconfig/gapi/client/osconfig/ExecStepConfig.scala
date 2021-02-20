package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecStepConfig extends StObject {
  
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
  implicit class ExecStepConfigMutableBuilder[Self <: ExecStepConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedSuccessCodes(value: js.Array[Double]): Self = StObject.set(x, "allowedSuccessCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedSuccessCodesUndefined: Self = StObject.set(x, "allowedSuccessCodes", js.undefined)
    
    @scala.inline
    def setAllowedSuccessCodesVarargs(value: Double*): Self = StObject.set(x, "allowedSuccessCodes", js.Array(value :_*))
    
    @scala.inline
    def setGcsObject(value: GcsObject): Self = StObject.set(x, "gcsObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsObjectUndefined: Self = StObject.set(x, "gcsObject", js.undefined)
    
    @scala.inline
    def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    @scala.inline
    def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPathUndefined: Self = StObject.set(x, "localPath", js.undefined)
  }
}
