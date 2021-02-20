package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePlayAnalytics extends StObject {
  
  /**
    * [AdWords autotagging parameter](https://support.google.com/analytics/answer/1033981?hl=en); used to measure Google AdWords ads. This value is generated dynamically and should never
    * be modified.
    */
  var gclid: js.UndefOr[String] = js.native
  
  /** Campaign name; used for keyword analysis to identify a specific product promotion or strategic campaign. */
  var utmCampaign: js.UndefOr[String] = js.native
  
  /** Campaign content; used for A/B testing and content-targeted ads to differentiate ads or links that point to the same URL. */
  var utmContent: js.UndefOr[String] = js.native
  
  /** Campaign medium; used to identify a medium such as email or cost-per-click. */
  var utmMedium: js.UndefOr[String] = js.native
  
  /** Campaign source; used to identify a search engine, newsletter, or other source. */
  var utmSource: js.UndefOr[String] = js.native
  
  /** Campaign term; used with paid search to supply the keywords for ads. */
  var utmTerm: js.UndefOr[String] = js.native
}
object GooglePlayAnalytics {
  
  @scala.inline
  def apply(): GooglePlayAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePlayAnalytics]
  }
  
  @scala.inline
  implicit class GooglePlayAnalyticsMutableBuilder[Self <: GooglePlayAnalytics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGclid(value: String): Self = StObject.set(x, "gclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGclidUndefined: Self = StObject.set(x, "gclid", js.undefined)
    
    @scala.inline
    def setUtmCampaign(value: String): Self = StObject.set(x, "utmCampaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmCampaignUndefined: Self = StObject.set(x, "utmCampaign", js.undefined)
    
    @scala.inline
    def setUtmContent(value: String): Self = StObject.set(x, "utmContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmContentUndefined: Self = StObject.set(x, "utmContent", js.undefined)
    
    @scala.inline
    def setUtmMedium(value: String): Self = StObject.set(x, "utmMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmMediumUndefined: Self = StObject.set(x, "utmMedium", js.undefined)
    
    @scala.inline
    def setUtmSource(value: String): Self = StObject.set(x, "utmSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmSourceUndefined: Self = StObject.set(x, "utmSource", js.undefined)
    
    @scala.inline
    def setUtmTerm(value: String): Self = StObject.set(x, "utmTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmTermUndefined: Self = StObject.set(x, "utmTerm", js.undefined)
  }
}
