package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstAndThirdPartyAudienceTargetingSetting extends js.Object {
  
  /** Required. First and third party audience id of the first and third party audience targeting setting. This id is first_and_third_party_audience_id. */
  var firstAndThirdPartyAudienceId: js.UndefOr[String] = js.native
  
  /**
    * The recency of the first and third party audience targeting setting. Only applicable to first party audiences, otherwise will be ignored. For more info, refer to
    * https://support.google.com/displayvideo/answer/2949947#recency When unspecified, no recency limit will be used.
    */
  var recency: js.UndefOr[String] = js.native
}
object FirstAndThirdPartyAudienceTargetingSetting {
  
  @scala.inline
  def apply(): FirstAndThirdPartyAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstAndThirdPartyAudienceTargetingSetting]
  }
  
  @scala.inline
  implicit class FirstAndThirdPartyAudienceTargetingSettingOps[Self <: FirstAndThirdPartyAudienceTargetingSetting] (val x: Self) extends AnyVal {
    
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
    def setFirstAndThirdPartyAudienceId(value: String): Self = this.set("firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstAndThirdPartyAudienceId: Self = this.set("firstAndThirdPartyAudienceId", js.undefined)
    
    @scala.inline
    def setRecency(value: String): Self = this.set("recency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecency: Self = this.set("recency", js.undefined)
  }
}
