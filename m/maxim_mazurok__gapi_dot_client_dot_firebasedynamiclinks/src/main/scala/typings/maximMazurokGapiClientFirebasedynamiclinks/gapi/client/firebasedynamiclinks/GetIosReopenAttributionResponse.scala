package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIosReopenAttributionResponse extends StObject {
  
  /** The deep-link attributed the app universal link open. For both regular FDL links and invite FDL links. */
  var deepLink: js.UndefOr[String] = js.undefined
  
  /** Optional invitation ID, for only invite typed requested FDL links. */
  var invitationId: js.UndefOr[String] = js.undefined
  
  /** FDL input value of the "&imv=" parameter, minimum app version to be returned to Google Firebase SDK running on iOS-9. */
  var iosMinAppVersion: js.UndefOr[String] = js.undefined
  
  /** The entire FDL, expanded from a short link. It is the same as the requested_link, if it is long. */
  var resolvedLink: js.UndefOr[String] = js.undefined
  
  /** Scion campaign value to be propagated by iSDK to Scion at app-reopen. */
  var utmCampaign: js.UndefOr[String] = js.undefined
  
  /** Scion content value to be propagated by iSDK to Scion at app-reopen. */
  var utmContent: js.UndefOr[String] = js.undefined
  
  /** Scion medium value to be propagated by iSDK to Scion at app-reopen. */
  var utmMedium: js.UndefOr[String] = js.undefined
  
  /** Scion source value to be propagated by iSDK to Scion at app-reopen. */
  var utmSource: js.UndefOr[String] = js.undefined
  
  /** Scion term value to be propagated by iSDK to Scion at app-reopen. */
  var utmTerm: js.UndefOr[String] = js.undefined
}
object GetIosReopenAttributionResponse {
  
  inline def apply(): GetIosReopenAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIosReopenAttributionResponse]
  }
  
  extension [Self <: GetIosReopenAttributionResponse](x: Self) {
    
    inline def setDeepLink(value: String): Self = StObject.set(x, "deepLink", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkUndefined: Self = StObject.set(x, "deepLink", js.undefined)
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    inline def setIosMinAppVersion(value: String): Self = StObject.set(x, "iosMinAppVersion", value.asInstanceOf[js.Any])
    
    inline def setIosMinAppVersionUndefined: Self = StObject.set(x, "iosMinAppVersion", js.undefined)
    
    inline def setResolvedLink(value: String): Self = StObject.set(x, "resolvedLink", value.asInstanceOf[js.Any])
    
    inline def setResolvedLinkUndefined: Self = StObject.set(x, "resolvedLink", js.undefined)
    
    inline def setUtmCampaign(value: String): Self = StObject.set(x, "utmCampaign", value.asInstanceOf[js.Any])
    
    inline def setUtmCampaignUndefined: Self = StObject.set(x, "utmCampaign", js.undefined)
    
    inline def setUtmContent(value: String): Self = StObject.set(x, "utmContent", value.asInstanceOf[js.Any])
    
    inline def setUtmContentUndefined: Self = StObject.set(x, "utmContent", js.undefined)
    
    inline def setUtmMedium(value: String): Self = StObject.set(x, "utmMedium", value.asInstanceOf[js.Any])
    
    inline def setUtmMediumUndefined: Self = StObject.set(x, "utmMedium", js.undefined)
    
    inline def setUtmSource(value: String): Self = StObject.set(x, "utmSource", value.asInstanceOf[js.Any])
    
    inline def setUtmSourceUndefined: Self = StObject.set(x, "utmSource", js.undefined)
    
    inline def setUtmTerm(value: String): Self = StObject.set(x, "utmTerm", value.asInstanceOf[js.Any])
    
    inline def setUtmTermUndefined: Self = StObject.set(x, "utmTerm", js.undefined)
  }
}
