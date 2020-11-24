package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse extends js.Object {
  
  /** The time at which operation processing completed. */
  var endTime: js.UndefOr[String] = js.native
  
  /** True if the Trial should stop. */
  var shouldStop: js.UndefOr[Boolean] = js.native
  
  /** The time at which the operation was started. */
  var startTime: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1CheckTrialEarlyStoppingStateResponseOps[Self <: GoogleCloudMlV1CheckTrialEarlyStoppingStateResponse] (val x: Self) extends AnyVal {
    
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
    def setShouldStop(value: Boolean): Self = this.set("shouldStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldStop: Self = this.set("shouldStop", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
