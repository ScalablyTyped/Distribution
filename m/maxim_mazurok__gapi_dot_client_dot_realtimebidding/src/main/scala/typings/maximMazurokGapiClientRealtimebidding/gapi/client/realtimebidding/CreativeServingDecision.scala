package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeServingDecision extends js.Object {
  
  /**
    * The policy compliance of this creative in China. When approved or disapproved, this applies to both deals and open auction in China. When pending review, this creative is allowed to
    * serve for deals but not for open auction.
    */
  var chinaPolicyCompliance: js.UndefOr[PolicyCompliance] = js.native
  
  /** Policy compliance of this creative when bidding on Programmatic Guaranteed and Preferred Deals (outside of Russia and China). */
  var dealsPolicyCompliance: js.UndefOr[PolicyCompliance] = js.native
  
  /** Detected advertisers and brands. */
  var detectedAdvertisers: js.UndefOr[js.Array[AdvertiserAndBrand]] = js.native
  
  /**
    * Publisher-excludable attributes that were detected for this creative. Can be used to filter the response of the creatives.list method. If the `excluded_attribute` field of a [bid
    * request](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto) contains one of the attributes that were declared or detected for a given creative,
    * and a bid is submitted with that creative, the bid will be filtered before the auction.
    */
  var detectedAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /** The set of detected destination URLs for the creative. Can be used to filter the response of the creatives.list method. */
  var detectedClickThroughUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** The detected domains for this creative. */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The detected languages for this creative. The order is arbitrary. The codes are 2 or 5 characters and are documented at
    * https://developers.google.com/adwords/api/docs/appendix/languagecodes. Can be used to filter the response of the creatives.list method.
    */
  var detectedLanguages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Detected product categories, if any. See the ad-product-categories.txt file in the technical documentation for a list of IDs. Can be used to filter the response of the
    * creatives.list method.
    */
  var detectedProductCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Detected sensitive categories, if any. Can be used to filter the response of the creatives.list method. See the ad-sensitive-categories.txt file in the technical documentation for a
    * list of IDs. You should use these IDs along with the excluded-sensitive-category field in the bid request to filter your bids.
    */
  var detectedSensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * IDs of the ad technology vendors that were detected to be used by this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for possible values. Can be used
    * to filter the response of the creatives.list method. If the `allowed_vendor_type` field of a [bid
    * request](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto) does not contain one of the vendor type IDs that were declared or detected for a given
    * creative, and a bid is submitted with that creative, the bid will be filtered before the auction.
    */
  var detectedVendorIds: js.UndefOr[js.Array[Double]] = js.native
  
  /** The last time the creative status was updated. Can be used to filter the response of the creatives.list method. */
  var lastStatusUpdate: js.UndefOr[String] = js.native
  
  /** Policy compliance of this creative when bidding in open auction, private auction, or auction packages (outside of Russia and China). */
  var networkPolicyCompliance: js.UndefOr[PolicyCompliance] = js.native
  
  /**
    * Policy compliance of this creative when bidding in Open Bidding (outside of Russia and China). For the list of platform policies, see:
    * https://support.google.com/platformspolicy/answer/3013851.
    */
  var platformPolicyCompliance: js.UndefOr[PolicyCompliance] = js.native
  
  /**
    * The policy compliance of this creative in Russia. When approved or disapproved, this applies to both deals and open auction in Russia. When pending review, this creative is allowed
    * to serve for deals but not for open auction.
    */
  var russiaPolicyCompliance: js.UndefOr[PolicyCompliance] = js.native
}
object CreativeServingDecision {
  
  @scala.inline
  def apply(): CreativeServingDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeServingDecision]
  }
  
  @scala.inline
  implicit class CreativeServingDecisionOps[Self <: CreativeServingDecision] (val x: Self) extends AnyVal {
    
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
    def setChinaPolicyCompliance(value: PolicyCompliance): Self = this.set("chinaPolicyCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChinaPolicyCompliance: Self = this.set("chinaPolicyCompliance", js.undefined)
    
    @scala.inline
    def setDealsPolicyCompliance(value: PolicyCompliance): Self = this.set("dealsPolicyCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealsPolicyCompliance: Self = this.set("dealsPolicyCompliance", js.undefined)
    
    @scala.inline
    def setDetectedAdvertisersVarargs(value: AdvertiserAndBrand*): Self = this.set("detectedAdvertisers", js.Array(value :_*))
    
    @scala.inline
    def setDetectedAdvertisers(value: js.Array[AdvertiserAndBrand]): Self = this.set("detectedAdvertisers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedAdvertisers: Self = this.set("detectedAdvertisers", js.undefined)
    
    @scala.inline
    def setDetectedAttributesVarargs(value: String*): Self = this.set("detectedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDetectedAttributes(value: js.Array[String]): Self = this.set("detectedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedAttributes: Self = this.set("detectedAttributes", js.undefined)
    
    @scala.inline
    def setDetectedClickThroughUrlsVarargs(value: String*): Self = this.set("detectedClickThroughUrls", js.Array(value :_*))
    
    @scala.inline
    def setDetectedClickThroughUrls(value: js.Array[String]): Self = this.set("detectedClickThroughUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedClickThroughUrls: Self = this.set("detectedClickThroughUrls", js.undefined)
    
    @scala.inline
    def setDetectedDomainsVarargs(value: String*): Self = this.set("detectedDomains", js.Array(value :_*))
    
    @scala.inline
    def setDetectedDomains(value: js.Array[String]): Self = this.set("detectedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedDomains: Self = this.set("detectedDomains", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: String*): Self = this.set("detectedLanguages", js.Array(value :_*))
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[String]): Self = this.set("detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedLanguages: Self = this.set("detectedLanguages", js.undefined)
    
    @scala.inline
    def setDetectedProductCategoriesVarargs(value: Double*): Self = this.set("detectedProductCategories", js.Array(value :_*))
    
    @scala.inline
    def setDetectedProductCategories(value: js.Array[Double]): Self = this.set("detectedProductCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedProductCategories: Self = this.set("detectedProductCategories", js.undefined)
    
    @scala.inline
    def setDetectedSensitiveCategoriesVarargs(value: Double*): Self = this.set("detectedSensitiveCategories", js.Array(value :_*))
    
    @scala.inline
    def setDetectedSensitiveCategories(value: js.Array[Double]): Self = this.set("detectedSensitiveCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedSensitiveCategories: Self = this.set("detectedSensitiveCategories", js.undefined)
    
    @scala.inline
    def setDetectedVendorIdsVarargs(value: Double*): Self = this.set("detectedVendorIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectedVendorIds(value: js.Array[Double]): Self = this.set("detectedVendorIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedVendorIds: Self = this.set("detectedVendorIds", js.undefined)
    
    @scala.inline
    def setLastStatusUpdate(value: String): Self = this.set("lastStatusUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatusUpdate: Self = this.set("lastStatusUpdate", js.undefined)
    
    @scala.inline
    def setNetworkPolicyCompliance(value: PolicyCompliance): Self = this.set("networkPolicyCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPolicyCompliance: Self = this.set("networkPolicyCompliance", js.undefined)
    
    @scala.inline
    def setPlatformPolicyCompliance(value: PolicyCompliance): Self = this.set("platformPolicyCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformPolicyCompliance: Self = this.set("platformPolicyCompliance", js.undefined)
    
    @scala.inline
    def setRussiaPolicyCompliance(value: PolicyCompliance): Self = this.set("russiaPolicyCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRussiaPolicyCompliance: Self = this.set("russiaPolicyCompliance", js.undefined)
  }
}
