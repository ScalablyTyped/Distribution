package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePlayAnalytics extends StObject {
  
  /** Deprecated; FDL SDK does not process nor log it. */
  var gclid: js.UndefOr[String] = js.undefined
  
  /** Campaign name; used for keyword analysis to identify a specific product promotion or strategic campaign. */
  var utmCampaign: js.UndefOr[String] = js.undefined
  
  /** Campaign content; used for A/B testing and content-targeted ads to differentiate ads or links that point to the same URL. */
  var utmContent: js.UndefOr[String] = js.undefined
  
  /** Campaign medium; used to identify a medium such as email or cost-per-click. */
  var utmMedium: js.UndefOr[String] = js.undefined
  
  /** Campaign source; used to identify a search engine, newsletter, or other source. */
  var utmSource: js.UndefOr[String] = js.undefined
  
  /** Campaign term; used with paid search to supply the keywords for ads. */
  var utmTerm: js.UndefOr[String] = js.undefined
}
object GooglePlayAnalytics {
  
  inline def apply(): GooglePlayAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePlayAnalytics]
  }
  
  extension [Self <: GooglePlayAnalytics](x: Self) {
    
    inline def setGclid(value: String): Self = StObject.set(x, "gclid", value.asInstanceOf[js.Any])
    
    inline def setGclidUndefined: Self = StObject.set(x, "gclid", js.undefined)
    
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
