package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudienceTargetingSetting extends js.Object {
  
  /** Required. Google audience id of the Google audience targeting setting. This id is google_audience_id. */
  var googleAudienceId: js.UndefOr[String] = js.native
}
object GoogleAudienceTargetingSetting {
  
  @scala.inline
  def apply(): GoogleAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAudienceTargetingSetting]
  }
  
  @scala.inline
  implicit class GoogleAudienceTargetingSettingOps[Self <: GoogleAudienceTargetingSetting] (val x: Self) extends AnyVal {
    
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
    def setGoogleAudienceId(value: String): Self = this.set("googleAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAudienceId: Self = this.set("googleAudienceId", js.undefined)
  }
}
