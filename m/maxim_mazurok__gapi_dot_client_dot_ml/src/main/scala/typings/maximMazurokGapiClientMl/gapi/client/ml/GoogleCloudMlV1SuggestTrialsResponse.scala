package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1SuggestTrialsResponse extends js.Object {
  
  /** The time at which operation processing completed. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The time at which the operation was started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The state of the study. */
  var studyState: js.UndefOr[String] = js.native
  
  /** A list of trials. */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1Trial]] = js.native
}
object GoogleCloudMlV1SuggestTrialsResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1SuggestTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SuggestTrialsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1SuggestTrialsResponseOps[Self <: GoogleCloudMlV1SuggestTrialsResponse] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStudyState(value: String): Self = this.set("studyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudyState: Self = this.set("studyState", js.undefined)
    
    @scala.inline
    def setTrialsVarargs(value: GoogleCloudMlV1Trial*): Self = this.set("trials", js.Array(value :_*))
    
    @scala.inline
    def setTrials(value: js.Array[GoogleCloudMlV1Trial]): Self = this.set("trials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrials: Self = this.set("trials", js.undefined)
  }
}
