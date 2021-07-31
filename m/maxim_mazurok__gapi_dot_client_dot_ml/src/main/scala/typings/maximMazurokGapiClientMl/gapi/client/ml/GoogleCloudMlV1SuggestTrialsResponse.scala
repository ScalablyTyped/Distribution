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
  
  @scala.inline
  def apply(): GoogleCloudMlV1SuggestTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SuggestTrialsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1SuggestTrialsResponseMutableBuilder[Self <: GoogleCloudMlV1SuggestTrialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStudyState(value: String): Self = StObject.set(x, "studyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyStateUndefined: Self = StObject.set(x, "studyState", js.undefined)
    
    @scala.inline
    def setTrials(value: js.Array[GoogleCloudMlV1Trial]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    @scala.inline
    def setTrialsVarargs(value: GoogleCloudMlV1Trial*): Self = StObject.set(x, "trials", js.Array(value :_*))
  }
}
