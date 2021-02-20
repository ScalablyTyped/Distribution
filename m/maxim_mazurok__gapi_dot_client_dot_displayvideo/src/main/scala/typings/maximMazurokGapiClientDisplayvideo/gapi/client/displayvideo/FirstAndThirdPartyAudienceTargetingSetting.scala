package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstAndThirdPartyAudienceTargetingSetting extends StObject {
  
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
  implicit class FirstAndThirdPartyAudienceTargetingSettingMutableBuilder[Self <: FirstAndThirdPartyAudienceTargetingSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
    
    @scala.inline
    def setRecency(value: String): Self = StObject.set(x, "recency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecencyUndefined: Self = StObject.set(x, "recency", js.undefined)
  }
}
