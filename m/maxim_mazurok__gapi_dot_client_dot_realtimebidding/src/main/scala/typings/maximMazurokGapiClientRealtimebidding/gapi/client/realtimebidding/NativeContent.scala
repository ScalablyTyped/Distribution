package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeContent extends StObject {
  
  /** The name of the advertiser or sponsor, to be displayed in the ad creative. */
  var advertiserName: js.UndefOr[String] = js.native
  
  /** The app icon, for app download ads. */
  var appIcon: js.UndefOr[Image] = js.native
  
  /** A long description of the ad. */
  var body: js.UndefOr[String] = js.native
  
  /** A label for the button that the user is supposed to click. */
  var callToAction: js.UndefOr[String] = js.native
  
  /** The URL that the browser/SDK will load when the user clicks the ad. */
  var clickLinkUrl: js.UndefOr[String] = js.native
  
  /** The URL to use for click tracking. */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  
  /** A short title for the ad. */
  var headline: js.UndefOr[String] = js.native
  
  /** A large image. */
  var image: js.UndefOr[Image] = js.native
  
  /** A smaller image, for the advertiser's logo. */
  var logo: js.UndefOr[Image] = js.native
  
  /** The price of the promoted app including currency info. */
  var priceDisplayText: js.UndefOr[String] = js.native
  
  /** The app rating in the app store. Must be in the range [0-5]. */
  var starRating: js.UndefOr[Double] = js.native
  
  /** The URL to fetch a native video ad. */
  var videoUrl: js.UndefOr[String] = js.native
}
object NativeContent {
  
  @scala.inline
  def apply(): NativeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeContent]
  }
  
  @scala.inline
  implicit class NativeContentMutableBuilder[Self <: NativeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    @scala.inline
    def setAppIcon(value: Image): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIconUndefined: Self = StObject.set(x, "appIcon", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCallToAction(value: String): Self = StObject.set(x, "callToAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallToActionUndefined: Self = StObject.set(x, "callToAction", js.undefined)
    
    @scala.inline
    def setClickLinkUrl(value: String): Self = StObject.set(x, "clickLinkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickLinkUrlUndefined: Self = StObject.set(x, "clickLinkUrl", js.undefined)
    
    @scala.inline
    def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    @scala.inline
    def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLogo(value: Image): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setPriceDisplayText(value: String): Self = StObject.set(x, "priceDisplayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceDisplayTextUndefined: Self = StObject.set(x, "priceDisplayText", js.undefined)
    
    @scala.inline
    def setStarRating(value: Double): Self = StObject.set(x, "starRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarRatingUndefined: Self = StObject.set(x, "starRating", js.undefined)
    
    @scala.inline
    def setVideoUrl(value: String): Self = StObject.set(x, "videoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUrlUndefined: Self = StObject.set(x, "videoUrl", js.undefined)
  }
}
