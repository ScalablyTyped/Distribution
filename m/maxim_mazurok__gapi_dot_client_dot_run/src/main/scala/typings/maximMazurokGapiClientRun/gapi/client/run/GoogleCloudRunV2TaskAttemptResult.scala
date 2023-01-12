package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2TaskAttemptResult extends StObject {
  
  /**
    * Output only. The exit code of this attempt. This may be unset if the container was unable to exit cleanly with a code due to some other failure. See status field for possible
    * failure details.
    */
  var exitCode: js.UndefOr[Double] = js.undefined
  
  /** Output only. The status of this attempt. If the status code is OK, then the attempt succeeded. */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
}
object GoogleCloudRunV2TaskAttemptResult {
  
  inline def apply(): GoogleCloudRunV2TaskAttemptResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2TaskAttemptResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2TaskAttemptResult] (val x: Self) extends AnyVal {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
