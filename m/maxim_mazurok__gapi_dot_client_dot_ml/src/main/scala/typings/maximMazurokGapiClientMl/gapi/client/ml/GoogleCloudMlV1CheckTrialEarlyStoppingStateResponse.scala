package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse extends StObject {
  
  /** The time at which operation processing completed. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** True if the Trial should stop. */
  var shouldStop: js.UndefOr[Boolean] = js.undefined
  
  /** The time at which the operation was started. */
  var startTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse {
  
  inline def apply(): GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse]
  }
  
  extension [Self <: GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setShouldStop(value: Boolean): Self = StObject.set(x, "shouldStop", value.asInstanceOf[js.Any])
    
    inline def setShouldStopUndefined: Self = StObject.set(x, "shouldStop", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
