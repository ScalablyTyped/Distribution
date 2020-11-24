package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Creative extends js.Object {
  
  /** Output only. ID of the buyer account that this creative is owned by. Can be used to filter the response of the creatives.list method with equality and inequality check. */
  var accountId: js.UndefOr[String] = js.native
  
  /** The link to AdChoices destination page. This is only supported for native ads. */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.native
  
  /** The name of the company being advertised in the creative. Can be used to filter the response of the creatives.list method. */
  var advertiserName: js.UndefOr[String] = js.native
  
  /** The agency ID for this creative. */
  var agencyId: js.UndefOr[String] = js.native
  
  /** Output only. The last update timestamp of the creative via API. */
  var apiUpdateTime: js.UndefOr[String] = js.native
  
  /** Output only. The format of this creative. Can be used to filter the response of the creatives.list method. */
  var creativeFormat: js.UndefOr[String] = js.native
  
  /**
    * Buyer-specific creative ID that references this creative in bid responses. This field is Ignored in update operations. Can be used to filter the response of the creatives.list
    * method. The maximum length of the creative ID is 128 bytes.
    */
  var creativeId: js.UndefOr[String] = js.native
  
  /**
    * Output only. Top level status and detected attributes of a creative (for example domain, language, advertiser, product category, etc.) that affect whether (status) and where
    * (context) a creative will be allowed to serve.
    */
  var creativeServingDecision: js.UndefOr[CreativeServingDecision] = js.native
  
  /** Output only. IDs of all of the deals with which this creative has been used in bidding. Can be used to filter the response of the creatives.list method. */
  var dealIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * All declared attributes for the ads that may be shown from this creative. Can be used to filter the response of the creatives.list method. If the `excluded_attribute` field of a
    * [bid request](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto") contains one of the attributes that were declared or detected for a given
    * creative, and a bid is submitted with that creative, the bid will be filtered before the auction.
    */
  var declaredAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /** The set of declared destination URLs for the creative. Can be used to filter the response of the creatives.list method. */
  var declaredClickThroughUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** All declared restricted categories for the ads that may be shown from this creative. Can be used to filter the response of the creatives.list method. */
  var declaredRestrictedCategories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * IDs for the declared ad technology vendors that may be used by this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for possible values. Can be used to
    * filter the response of the creatives.list method.
    */
  var declaredVendorIds: js.UndefOr[js.Array[Double]] = js.native
  
  /** An HTML creative. */
  var html: js.UndefOr[HtmlContent] = js.native
  
  /** The set of URLs to be called to record an impression. */
  var impressionTrackingUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. Name of the creative. Follows the pattern `buyers/{buyer}/creatives/{creative}`, where `{buyer}` represents the account ID of the buyer who owns the creative, and
    * `{creative}` is the buyer-specific creative ID that references this creative in the bid response.
    */
  var name: js.UndefOr[String] = js.native
  
  /** A native creative. */
  var native: js.UndefOr[NativeContent] = js.native
  
  /** All restricted categories for the ads that may be shown from this creative. */
  var restrictedCategories: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. The version of this creative. Version for a new creative is 1 and it increments during subsequent creative updates. */
  var version: js.UndefOr[Double] = js.native
  
  /** A video creative. */
  var video: js.UndefOr[VideoContent] = js.native
}
object Creative {
  
  @scala.inline
  def apply(): Creative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creative]
  }
  
  @scala.inline
  implicit class CreativeOps[Self <: Creative] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdChoicesDestinationUrl(value: String): Self = this.set("adChoicesDestinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdChoicesDestinationUrl: Self = this.set("adChoicesDestinationUrl", js.undefined)
    
    @scala.inline
    def setAdvertiserName(value: String): Self = this.set("advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserName: Self = this.set("advertiserName", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgencyId: Self = this.set("agencyId", js.undefined)
    
    @scala.inline
    def setApiUpdateTime(value: String): Self = this.set("apiUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiUpdateTime: Self = this.set("apiUpdateTime", js.undefined)
    
    @scala.inline
    def setCreativeFormat(value: String): Self = this.set("creativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeFormat: Self = this.set("creativeFormat", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setCreativeServingDecision(value: CreativeServingDecision): Self = this.set("creativeServingDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeServingDecision: Self = this.set("creativeServingDecision", js.undefined)
    
    @scala.inline
    def setDealIdsVarargs(value: String*): Self = this.set("dealIds", js.Array(value :_*))
    
    @scala.inline
    def setDealIds(value: js.Array[String]): Self = this.set("dealIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealIds: Self = this.set("dealIds", js.undefined)
    
    @scala.inline
    def setDeclaredAttributesVarargs(value: String*): Self = this.set("declaredAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredAttributes(value: js.Array[String]): Self = this.set("declaredAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaredAttributes: Self = this.set("declaredAttributes", js.undefined)
    
    @scala.inline
    def setDeclaredClickThroughUrlsVarargs(value: String*): Self = this.set("declaredClickThroughUrls", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredClickThroughUrls(value: js.Array[String]): Self = this.set("declaredClickThroughUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaredClickThroughUrls: Self = this.set("declaredClickThroughUrls", js.undefined)
    
    @scala.inline
    def setDeclaredRestrictedCategoriesVarargs(value: String*): Self = this.set("declaredRestrictedCategories", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredRestrictedCategories(value: js.Array[String]): Self = this.set("declaredRestrictedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaredRestrictedCategories: Self = this.set("declaredRestrictedCategories", js.undefined)
    
    @scala.inline
    def setDeclaredVendorIdsVarargs(value: Double*): Self = this.set("declaredVendorIds", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredVendorIds(value: js.Array[Double]): Self = this.set("declaredVendorIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaredVendorIds: Self = this.set("declaredVendorIds", js.undefined)
    
    @scala.inline
    def setHtml(value: HtmlContent): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrlsVarargs(value: String*): Self = this.set("impressionTrackingUrls", js.Array(value :_*))
    
    @scala.inline
    def setImpressionTrackingUrls(value: js.Array[String]): Self = this.set("impressionTrackingUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionTrackingUrls: Self = this.set("impressionTrackingUrls", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNative(value: NativeContent): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    
    @scala.inline
    def setRestrictedCategoriesVarargs(value: String*): Self = this.set("restrictedCategories", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedCategories(value: js.Array[String]): Self = this.set("restrictedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedCategories: Self = this.set("restrictedCategories", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVideo(value: VideoContent): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
