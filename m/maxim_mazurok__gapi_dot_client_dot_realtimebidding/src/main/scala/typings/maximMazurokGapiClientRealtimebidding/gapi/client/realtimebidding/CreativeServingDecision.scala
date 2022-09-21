package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeServingDecision extends StObject {
  
  /** The detected ad technology providers. */
  var adTechnologyProviders: js.UndefOr[AdTechnologyProviders] = js.undefined
  
  /**
    * The policy compliance of this creative in China. When approved or disapproved, this applies to both deals and open auction in China. When pending review, this creative is allowed to
    * serve for deals but not for open auction.
    */
  var chinaPolicyCompliance: js.UndefOr[PolicyCompliance] = js.undefined
  
  /** Policy compliance of this creative when bidding on Programmatic Guaranteed and Preferred Deals (outside of Russia and China). */
  var dealsPolicyCompliance: js.UndefOr[PolicyCompliance] = js.undefined
  
  /** Detected advertisers and brands. */
  var detectedAdvertisers: js.UndefOr[js.Array[AdvertiserAndBrand]] = js.undefined
  
  /**
    * Publisher-excludable attributes that were detected for this creative. Can be used to filter the response of the creatives.list method. If the `excluded_attribute` field of a [bid
    * request](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto) contains one of the attributes that were declared or detected for a given creative,
    * and a bid is submitted with that creative, the bid will be filtered before the auction.
    */
  var detectedAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The set of detected destination URLs for the creative. Can be used to filter the response of the creatives.list method. */
  var detectedClickThroughUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The detected domains for this creative. */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The detected languages for this creative. The order is arbitrary. The codes are 2 or 5 characters and are documented at
    * https://developers.google.com/adwords/api/docs/appendix/languagecodes. Can be used to filter the response of the creatives.list method.
    */
  var detectedLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Detected product categories, if any. See the ad-product-categories.txt file in the technical documentation for a list of IDs. Can be used to filter the response of the
    * creatives.list method.
    */
  var detectedProductCategories: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Detected sensitive categories, if any. Can be used to filter the response of the creatives.list method. See the ad-sensitive-categories.txt file in the technical documentation for a
    * list of IDs. You should use these IDs along with the excluded-sensitive-category field in the bid request to filter your bids.
    */
  var detectedSensitiveCategories: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * IDs of the ad technology vendors that were detected to be used by this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for possible values. Can be used
    * to filter the response of the creatives.list method. If the `allowed_vendor_type` field of a [bid
    * request](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto) does not contain one of the vendor type IDs that were declared or detected for a given
    * creative, and a bid is submitted with that creative, the bid will be filtered before the auction.
    */
  var detectedVendorIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The last time the creative status was updated. Can be used to filter the response of the creatives.list method. */
  var lastStatusUpdate: js.UndefOr[String] = js.undefined
  
  /** Policy compliance of this creative when bidding in open auction, private auction, or auction packages (outside of Russia and China). */
  var networkPolicyCompliance: js.UndefOr[PolicyCompliance] = js.undefined
  
  /**
    * Policy compliance of this creative when bidding in Open Bidding (outside of Russia and China). For the list of platform policies, see:
    * https://support.google.com/platformspolicy/answer/3013851.
    */
  var platformPolicyCompliance: js.UndefOr[PolicyCompliance] = js.undefined
  
  /**
    * The policy compliance of this creative in Russia. When approved or disapproved, this applies to both deals and open auction in Russia. When pending review, this creative is allowed
    * to serve for deals but not for open auction.
    */
  var russiaPolicyCompliance: js.UndefOr[PolicyCompliance] = js.undefined
}
object CreativeServingDecision {
  
  inline def apply(): CreativeServingDecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeServingDecision]
  }
  
  extension [Self <: CreativeServingDecision](x: Self) {
    
    inline def setAdTechnologyProviders(value: AdTechnologyProviders): Self = StObject.set(x, "adTechnologyProviders", value.asInstanceOf[js.Any])
    
    inline def setAdTechnologyProvidersUndefined: Self = StObject.set(x, "adTechnologyProviders", js.undefined)
    
    inline def setChinaPolicyCompliance(value: PolicyCompliance): Self = StObject.set(x, "chinaPolicyCompliance", value.asInstanceOf[js.Any])
    
    inline def setChinaPolicyComplianceUndefined: Self = StObject.set(x, "chinaPolicyCompliance", js.undefined)
    
    inline def setDealsPolicyCompliance(value: PolicyCompliance): Self = StObject.set(x, "dealsPolicyCompliance", value.asInstanceOf[js.Any])
    
    inline def setDealsPolicyComplianceUndefined: Self = StObject.set(x, "dealsPolicyCompliance", js.undefined)
    
    inline def setDetectedAdvertisers(value: js.Array[AdvertiserAndBrand]): Self = StObject.set(x, "detectedAdvertisers", value.asInstanceOf[js.Any])
    
    inline def setDetectedAdvertisersUndefined: Self = StObject.set(x, "detectedAdvertisers", js.undefined)
    
    inline def setDetectedAdvertisersVarargs(value: AdvertiserAndBrand*): Self = StObject.set(x, "detectedAdvertisers", js.Array(value*))
    
    inline def setDetectedAttributes(value: js.Array[String]): Self = StObject.set(x, "detectedAttributes", value.asInstanceOf[js.Any])
    
    inline def setDetectedAttributesUndefined: Self = StObject.set(x, "detectedAttributes", js.undefined)
    
    inline def setDetectedAttributesVarargs(value: String*): Self = StObject.set(x, "detectedAttributes", js.Array(value*))
    
    inline def setDetectedClickThroughUrls(value: js.Array[String]): Self = StObject.set(x, "detectedClickThroughUrls", value.asInstanceOf[js.Any])
    
    inline def setDetectedClickThroughUrlsUndefined: Self = StObject.set(x, "detectedClickThroughUrls", js.undefined)
    
    inline def setDetectedClickThroughUrlsVarargs(value: String*): Self = StObject.set(x, "detectedClickThroughUrls", js.Array(value*))
    
    inline def setDetectedDomains(value: js.Array[String]): Self = StObject.set(x, "detectedDomains", value.asInstanceOf[js.Any])
    
    inline def setDetectedDomainsUndefined: Self = StObject.set(x, "detectedDomains", js.undefined)
    
    inline def setDetectedDomainsVarargs(value: String*): Self = StObject.set(x, "detectedDomains", js.Array(value*))
    
    inline def setDetectedLanguages(value: js.Array[String]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: String*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setDetectedProductCategories(value: js.Array[Double]): Self = StObject.set(x, "detectedProductCategories", value.asInstanceOf[js.Any])
    
    inline def setDetectedProductCategoriesUndefined: Self = StObject.set(x, "detectedProductCategories", js.undefined)
    
    inline def setDetectedProductCategoriesVarargs(value: Double*): Self = StObject.set(x, "detectedProductCategories", js.Array(value*))
    
    inline def setDetectedSensitiveCategories(value: js.Array[Double]): Self = StObject.set(x, "detectedSensitiveCategories", value.asInstanceOf[js.Any])
    
    inline def setDetectedSensitiveCategoriesUndefined: Self = StObject.set(x, "detectedSensitiveCategories", js.undefined)
    
    inline def setDetectedSensitiveCategoriesVarargs(value: Double*): Self = StObject.set(x, "detectedSensitiveCategories", js.Array(value*))
    
    inline def setDetectedVendorIds(value: js.Array[Double]): Self = StObject.set(x, "detectedVendorIds", value.asInstanceOf[js.Any])
    
    inline def setDetectedVendorIdsUndefined: Self = StObject.set(x, "detectedVendorIds", js.undefined)
    
    inline def setDetectedVendorIdsVarargs(value: Double*): Self = StObject.set(x, "detectedVendorIds", js.Array(value*))
    
    inline def setLastStatusUpdate(value: String): Self = StObject.set(x, "lastStatusUpdate", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUpdateUndefined: Self = StObject.set(x, "lastStatusUpdate", js.undefined)
    
    inline def setNetworkPolicyCompliance(value: PolicyCompliance): Self = StObject.set(x, "networkPolicyCompliance", value.asInstanceOf[js.Any])
    
    inline def setNetworkPolicyComplianceUndefined: Self = StObject.set(x, "networkPolicyCompliance", js.undefined)
    
    inline def setPlatformPolicyCompliance(value: PolicyCompliance): Self = StObject.set(x, "platformPolicyCompliance", value.asInstanceOf[js.Any])
    
    inline def setPlatformPolicyComplianceUndefined: Self = StObject.set(x, "platformPolicyCompliance", js.undefined)
    
    inline def setRussiaPolicyCompliance(value: PolicyCompliance): Self = StObject.set(x, "russiaPolicyCompliance", value.asInstanceOf[js.Any])
    
    inline def setRussiaPolicyComplianceUndefined: Self = StObject.set(x, "russiaPolicyCompliance", js.undefined)
  }
}
