package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecStepConfig extends StObject {
  
  /** Defaults to [0]. A list of possible return values that the execution can return to indicate a success. */
  var allowedSuccessCodes: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** A Cloud Storage object containing the executable. */
  var gcsObject: js.UndefOr[GcsObject] = js.undefined
  
  /**
    * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines]
    * (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
    */
  var interpreter: js.UndefOr[String] = js.undefined
  
  /** An absolute path to the executable on the VM. */
  var localPath: js.UndefOr[String] = js.undefined
}
object ExecStepConfig {
  
  inline def apply(): ExecStepConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecStepConfig]
  }
  
  extension [Self <: ExecStepConfig](x: Self) {
    
    inline def setAllowedSuccessCodes(value: js.Array[Double]): Self = StObject.set(x, "allowedSuccessCodes", value.asInstanceOf[js.Any])
    
    inline def setAllowedSuccessCodesUndefined: Self = StObject.set(x, "allowedSuccessCodes", js.undefined)
    
    inline def setAllowedSuccessCodesVarargs(value: Double*): Self = StObject.set(x, "allowedSuccessCodes", js.Array(value*))
    
    inline def setGcsObject(value: GcsObject): Self = StObject.set(x, "gcsObject", value.asInstanceOf[js.Any])
    
    inline def setGcsObjectUndefined: Self = StObject.set(x, "gcsObject", js.undefined)
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "localPath", js.undefined)
  }
}
