package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1SuggestTrialsResponse extends StObject {
  
  /** The time at which operation processing completed. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The time at which the operation was started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The state of the study. */
  var studyState: js.UndefOr[String] = js.undefined
  
  /** A list of trials. */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1Trial]] = js.undefined
}
object GoogleCloudMlV1SuggestTrialsResponse {
  
  inline def apply(): GoogleCloudMlV1SuggestTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SuggestTrialsResponse]
  }
  
  extension [Self <: GoogleCloudMlV1SuggestTrialsResponse](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStudyState(value: String): Self = StObject.set(x, "studyState", value.asInstanceOf[js.Any])
    
    inline def setStudyStateUndefined: Self = StObject.set(x, "studyState", js.undefined)
    
    inline def setTrials(value: js.Array[GoogleCloudMlV1Trial]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    inline def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    inline def setTrialsVarargs(value: GoogleCloudMlV1Trial*): Self = StObject.set(x, "trials", js.Array(value :_*))
  }
}
