package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAudienceTargetingSetting extends StObject {
  
  /** Required. Google audience id of the Google audience targeting setting. This id is google_audience_id. */
  var googleAudienceId: js.UndefOr[String] = js.undefined
}
object GoogleAudienceTargetingSetting {
  
  inline def apply(): GoogleAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAudienceTargetingSetting]
  }
  
  extension [Self <: GoogleAudienceTargetingSetting](x: Self) {
    
    inline def setGoogleAudienceId(value: String): Self = StObject.set(x, "googleAudienceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudienceIdUndefined: Self = StObject.set(x, "googleAudienceId", js.undefined)
  }
}
