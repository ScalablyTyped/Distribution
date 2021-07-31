package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Creative extends StObject {
  
  /** Output only. ID of the buyer account that this creative is owned by. Can be used to filter the response of the creatives.list method with equality and inequality check. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The link to AdChoices destination page. This is only supported for native ads. */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.undefined
  
  /** The name of the company being advertised in the creative. Can be used to filter the response of the creatives.list method. */
  var advertiserName: js.UndefOr[String] = js.undefined
  
  /** The agency ID for this creative. */
  var agencyId: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of the creative via API. */
  var apiUpdateTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The format of this creative. Can be used to filter the response of the creatives.list method. */
  var creativeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Buyer-specific creative ID that references this creative in bid responses. This field is Ignored in update operations. Can be used to filter the response of the creatives.list
    * method. The maximum length of the creative ID is 128 bytes.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Top level status and detected attributes of a creative (for example domain, language, advertiser, product category, etc.) that affect whether (status) and where
    * (context) a creative will be allowed to serve.
    */
  var creativeServingDecision: js.UndefOr[CreativeServingDecision] = js.undefined
  
  /** Output only. IDs of all of the deals with which this creative has been used in bidding. Can be used to filter the response of the creatives.list method. */
  var dealIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * All declared attributes for the ads that may be shown from this creative. Can be used to filter the response of the creatives.list method. If the `excluded_attribute` field of a
    * [bid request](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto") contains one of the attributes that were declared or detected for a given
    * creative, and a bid is submitted with that creative, the bid will be filtered before the auction.
    */
  var declaredAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The set of declared destination URLs for the creative. Can be used to filter the response of the creatives.list method. */
  var declaredClickThroughUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** All declared restricted categories for the ads that may be shown from this creative. Can be used to filter the response of the creatives.list method. */
  var declaredRestrictedCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * IDs for the declared ad technology vendors that may be used by this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for possible values. Can be used to
    * filter the response of the creatives.list method.
    */
  var declaredVendorIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** An HTML creative. */
  var html: js.UndefOr[HtmlContent] = js.undefined
  
  /** The set of URLs to be called to record an impression. */
  var impressionTrackingUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. Name of the creative. Follows the pattern `buyers/{buyer}/creatives/{creative}`, where `{buyer}` represents the account ID of the buyer who owns the creative, and
    * `{creative}` is the buyer-specific creative ID that references this creative in the bid response.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** A native creative. */
  var native: js.UndefOr[NativeContent] = js.undefined
  
  /** All restricted categories for the ads that may be shown from this creative. */
  var restrictedCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The version of this creative. Version for a new creative is 1 and it increments during subsequent creative updates. */
  var version: js.UndefOr[Double] = js.undefined
  
  /** A video creative. */
  var video: js.UndefOr[VideoContent] = js.undefined
}
object Creative {
  
  @scala.inline
  def apply(): Creative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creative]
  }
  
  @scala.inline
  implicit class CreativeMutableBuilder[Self <: Creative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdChoicesDestinationUrl(value: String): Self = StObject.set(x, "adChoicesDestinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdChoicesDestinationUrlUndefined: Self = StObject.set(x, "adChoicesDestinationUrl", js.undefined)
    
    @scala.inline
    def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    @scala.inline
    def setApiUpdateTime(value: String): Self = StObject.set(x, "apiUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUpdateTimeUndefined: Self = StObject.set(x, "apiUpdateTime", js.undefined)
    
    @scala.inline
    def setCreativeFormat(value: String): Self = StObject.set(x, "creativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFormatUndefined: Self = StObject.set(x, "creativeFormat", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setCreativeServingDecision(value: CreativeServingDecision): Self = StObject.set(x, "creativeServingDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeServingDecisionUndefined: Self = StObject.set(x, "creativeServingDecision", js.undefined)
    
    @scala.inline
    def setDealIds(value: js.Array[String]): Self = StObject.set(x, "dealIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdsUndefined: Self = StObject.set(x, "dealIds", js.undefined)
    
    @scala.inline
    def setDealIdsVarargs(value: String*): Self = StObject.set(x, "dealIds", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredAttributes(value: js.Array[String]): Self = StObject.set(x, "declaredAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredAttributesUndefined: Self = StObject.set(x, "declaredAttributes", js.undefined)
    
    @scala.inline
    def setDeclaredAttributesVarargs(value: String*): Self = StObject.set(x, "declaredAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredClickThroughUrls(value: js.Array[String]): Self = StObject.set(x, "declaredClickThroughUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredClickThroughUrlsUndefined: Self = StObject.set(x, "declaredClickThroughUrls", js.undefined)
    
    @scala.inline
    def setDeclaredClickThroughUrlsVarargs(value: String*): Self = StObject.set(x, "declaredClickThroughUrls", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredRestrictedCategories(value: js.Array[String]): Self = StObject.set(x, "declaredRestrictedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredRestrictedCategoriesUndefined: Self = StObject.set(x, "declaredRestrictedCategories", js.undefined)
    
    @scala.inline
    def setDeclaredRestrictedCategoriesVarargs(value: String*): Self = StObject.set(x, "declaredRestrictedCategories", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredVendorIds(value: js.Array[Double]): Self = StObject.set(x, "declaredVendorIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredVendorIdsUndefined: Self = StObject.set(x, "declaredVendorIds", js.undefined)
    
    @scala.inline
    def setDeclaredVendorIdsVarargs(value: Double*): Self = StObject.set(x, "declaredVendorIds", js.Array(value :_*))
    
    @scala.inline
    def setHtml(value: HtmlContent): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrls(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionTrackingUrlsUndefined: Self = StObject.set(x, "impressionTrackingUrls", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrlsVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrls", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNative(value: NativeContent): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    @scala.inline
    def setRestrictedCategories(value: js.Array[String]): Self = StObject.set(x, "restrictedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedCategoriesUndefined: Self = StObject.set(x, "restrictedCategories", js.undefined)
    
    @scala.inline
    def setRestrictedCategoriesVarargs(value: String*): Self = StObject.set(x, "restrictedCategories", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVideo(value: VideoContent): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
