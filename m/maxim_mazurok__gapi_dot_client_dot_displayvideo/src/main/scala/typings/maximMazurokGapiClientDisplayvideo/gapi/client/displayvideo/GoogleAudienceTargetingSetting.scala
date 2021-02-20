package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudienceTargetingSetting extends StObject {
  
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
  implicit class GoogleAudienceTargetingSettingMutableBuilder[Self <: GoogleAudienceTargetingSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleAudienceId(value: String): Self = StObject.set(x, "googleAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAudienceIdUndefined: Self = StObject.set(x, "googleAudienceId", js.undefined)
  }
}
