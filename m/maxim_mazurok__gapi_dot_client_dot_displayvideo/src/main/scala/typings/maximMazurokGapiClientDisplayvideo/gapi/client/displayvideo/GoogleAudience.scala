package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAudience extends StObject {
  
  /** Output only. The display name of the Google audience. . */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the Google audience. Assigned by the system. */
  var googleAudienceId: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of Google audience. . */
  var googleAudienceType: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the google audience. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleAudience {
  
  inline def apply(): GoogleAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAudience]
  }
  
  extension [Self <: GoogleAudience](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGoogleAudienceId(value: String): Self = StObject.set(x, "googleAudienceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudienceIdUndefined: Self = StObject.set(x, "googleAudienceId", js.undefined)
    
    inline def setGoogleAudienceType(value: String): Self = StObject.set(x, "googleAudienceType", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudienceTypeUndefined: Self = StObject.set(x, "googleAudienceType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
