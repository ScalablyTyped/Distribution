package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PretargetingConfig extends StObject {
  
  /**
    * Targeting modes included by this configuration. A bid request must allow all the specified targeting modes. An unset value allows all bid requests to be sent, regardless of which
    * targeting modes they allow.
    */
  var allowedUserTargetingModes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Targeting on a subset of app inventory. If APP is listed in targeted_environments, the specified targeting is applied. A maximum of 30,000 app IDs can be targeted. An unset value
    * for targeting allows all app-based bid requests to be sent. Apps can either be targeting positively (bid requests will be sent only if the destination app is listed in the targeting
    * dimension) or negatively (bid requests will be sent only if the destination app is not listed in the targeting dimension).
    */
  var appTargeting: js.UndefOr[AppTargeting] = js.native
  
  /**
    * Output only. The identifier that corresponds to this pretargeting configuration that helps buyers track and attribute their spend across their own arbitrary divisions. If a bid
    * request matches more than one configuration, the buyer chooses which billing_id to attribute each of their bids.
    */
  var billingId: js.UndefOr[String] = js.native
  
  /** The diplay name associated with this configuration. This name must be unique among all the pretargeting configurations a bidder has. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The sensitive content category label IDs excluded in this configuration. Bid requests for inventory with any of the specified content label IDs will not be sent. Refer to this file
    * https://storage.googleapis.com/adx-rtb-dictionaries/content-labels.txt for category IDs.
    */
  var excludedContentLabelIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The geos included or excluded in this configuration defined in https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv */
  var geoTargeting: js.UndefOr[NumericTargetingDimension] = js.native
  
  /**
    * Creative dimensions included by this configuration. Only bid requests eligible for at least one of the specified creative dimensions will be sent. An unset value allows all bid
    * requests to be sent, regardless of creative dimension.
    */
  var includedCreativeDimensions: js.UndefOr[js.Array[CreativeDimensions]] = js.native
  
  /**
    * Environments that are being included. Bid requests will not be sent for a given environment if it is not included. Further restrictions can be applied to included environments to
    * target only a subset of its inventory. An unset value includes all environments.
    */
  var includedEnvironments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Creative formats included by this configuration. Only bid requests eligible for at least one of the specified creative formats will be sent. An unset value will allow all bid
    * requests to be sent, regardless of format.
    */
  var includedFormats: js.UndefOr[js.Array[String]] = js.native
  
  /** The languages included in this configuration, represented by their language code. See https://developers.google.com/adwords/api/docs/appendix/languagecodes. */
  var includedLanguages: js.UndefOr[js.Array[String]] = js.native
  
  /** The mobile operating systems included in this configuration as defined in https://storage.googleapis.com/adx-rtb-dictionaries/mobile-os.csv */
  var includedMobileOperatingSystemIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The platforms included by this configration. Bid requests for devices with the specified platform types will be sent. An unset value allows all bid requests to be sent, regardless
    * of platform.
    */
  var includedPlatforms: js.UndefOr[js.Array[String]] = js.native
  
  /** User identifier types included in this configuration. At least one of the user identifier types specified in this list must be available for the bid request to be sent. */
  var includedUserIdTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** The interstitial targeting specified for this configuration. The unset value will allow bid requests to be sent regardless of whether they are for interstitials or not. */
  var interstitialTargeting: js.UndefOr[String] = js.native
  
  /** Output only. Existing included or excluded geos that are invalid. Previously targeted geos may become invalid due to privacy restrictions. */
  var invalidGeoIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The maximum QPS threshold for this configuration. The bidder should receive no more than this number of bid requests matching this configuration per second across all their bidding
    * endpoints among all trading locations. Further information available at https://developers.google.com/authorized-buyers/rtb/peer-guide
    */
  var maximumQps: js.UndefOr[String] = js.native
  
  /**
    * The targeted minimum viewability decile, ranging in values [0, 10]. A value of 5 means that the configuration will only match adslots for which we predict at least 50% viewability.
    * Values > 10 will be rounded down to 10. An unset value or a value of 0 indicates that bid requests will be sent regardless of viewability.
    */
  var minimumViewabilityDecile: js.UndefOr[Double] = js.native
  
  /** Output only. Name of the pretargeting configuration that must follow the pattern `bidders/{bidder_account_id}/pretargetingConfigs/{config_id}` */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Targeting on a subset of publisher inventory. Publishers can either be targeted positively (bid requests will be sent only if the publisher is listed in the targeting dimension) or
    * negatively (bid requests will be sent only if the publisher is not listed in the targeting dimension). A maximum of 10,000 publisher IDs can be targeted. Publisher IDs are found in
    * [ads.txt](https://iabtechlab.com/ads-txt/) / [app-ads.txt](https://iabtechlab.com/app-ads-txt/) and in bid requests in the `BidRequest.publisher_id` field on the [Google RTB
    * protocol](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto) or the `BidRequest.site.publisher.id` / `BidRequest.app.publisher.id` field on the
    * [OpenRTB protocol](https://developers.google.com/authorized-buyers/rtb/downloads/openrtb-adx-proto).
    */
  var publisherTargeting: js.UndefOr[StringTargetingDimension] = js.native
  
  /** Output only. The state of this pretargeting configuration. */
  var state: js.UndefOr[String] = js.native
  
  /** The remarketing lists included or excluded in this configuration as defined in UserList. */
  var userListTargeting: js.UndefOr[NumericTargetingDimension] = js.native
  
  /** The verticals included or excluded in this configuration as defined in https://developers.google.com/authorized-buyers/rtb/downloads/publisher-verticals */
  var verticalTargeting: js.UndefOr[NumericTargetingDimension] = js.native
  
  /**
    * Targeting on a subset of site inventory. If WEB is listed in included_environments, the specified targeting is applied. A maximum of 50,000 site URLs can be targeted. An unset value
    * for targeting allows all web-based bid requests to be sent. Sites can either be targeting positively (bid requests will be sent only if the destination site is listed in the
    * targeting dimension) or negatively (bid requests will be sent only if the destination site is not listed in the pretargeting configuration).
    */
  var webTargeting: js.UndefOr[StringTargetingDimension] = js.native
}
object PretargetingConfig {
  
  @scala.inline
  def apply(): PretargetingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PretargetingConfig]
  }
  
  @scala.inline
  implicit class PretargetingConfigMutableBuilder[Self <: PretargetingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedUserTargetingModes(value: js.Array[String]): Self = StObject.set(x, "allowedUserTargetingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUserTargetingModesUndefined: Self = StObject.set(x, "allowedUserTargetingModes", js.undefined)
    
    @scala.inline
    def setAllowedUserTargetingModesVarargs(value: String*): Self = StObject.set(x, "allowedUserTargetingModes", js.Array(value :_*))
    
    @scala.inline
    def setAppTargeting(value: AppTargeting): Self = StObject.set(x, "appTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTargetingUndefined: Self = StObject.set(x, "appTargeting", js.undefined)
    
    @scala.inline
    def setBillingId(value: String): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExcludedContentLabelIds(value: js.Array[String]): Self = StObject.set(x, "excludedContentLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedContentLabelIdsUndefined: Self = StObject.set(x, "excludedContentLabelIds", js.undefined)
    
    @scala.inline
    def setExcludedContentLabelIdsVarargs(value: String*): Self = StObject.set(x, "excludedContentLabelIds", js.Array(value :_*))
    
    @scala.inline
    def setGeoTargeting(value: NumericTargetingDimension): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    @scala.inline
    def setIncludedCreativeDimensions(value: js.Array[CreativeDimensions]): Self = StObject.set(x, "includedCreativeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedCreativeDimensionsUndefined: Self = StObject.set(x, "includedCreativeDimensions", js.undefined)
    
    @scala.inline
    def setIncludedCreativeDimensionsVarargs(value: CreativeDimensions*): Self = StObject.set(x, "includedCreativeDimensions", js.Array(value :_*))
    
    @scala.inline
    def setIncludedEnvironments(value: js.Array[String]): Self = StObject.set(x, "includedEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedEnvironmentsUndefined: Self = StObject.set(x, "includedEnvironments", js.undefined)
    
    @scala.inline
    def setIncludedEnvironmentsVarargs(value: String*): Self = StObject.set(x, "includedEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setIncludedFormats(value: js.Array[String]): Self = StObject.set(x, "includedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedFormatsUndefined: Self = StObject.set(x, "includedFormats", js.undefined)
    
    @scala.inline
    def setIncludedFormatsVarargs(value: String*): Self = StObject.set(x, "includedFormats", js.Array(value :_*))
    
    @scala.inline
    def setIncludedLanguages(value: js.Array[String]): Self = StObject.set(x, "includedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedLanguagesUndefined: Self = StObject.set(x, "includedLanguages", js.undefined)
    
    @scala.inline
    def setIncludedLanguagesVarargs(value: String*): Self = StObject.set(x, "includedLanguages", js.Array(value :_*))
    
    @scala.inline
    def setIncludedMobileOperatingSystemIds(value: js.Array[String]): Self = StObject.set(x, "includedMobileOperatingSystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedMobileOperatingSystemIdsUndefined: Self = StObject.set(x, "includedMobileOperatingSystemIds", js.undefined)
    
    @scala.inline
    def setIncludedMobileOperatingSystemIdsVarargs(value: String*): Self = StObject.set(x, "includedMobileOperatingSystemIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludedPlatforms(value: js.Array[String]): Self = StObject.set(x, "includedPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedPlatformsUndefined: Self = StObject.set(x, "includedPlatforms", js.undefined)
    
    @scala.inline
    def setIncludedPlatformsVarargs(value: String*): Self = StObject.set(x, "includedPlatforms", js.Array(value :_*))
    
    @scala.inline
    def setIncludedUserIdTypes(value: js.Array[String]): Self = StObject.set(x, "includedUserIdTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedUserIdTypesUndefined: Self = StObject.set(x, "includedUserIdTypes", js.undefined)
    
    @scala.inline
    def setIncludedUserIdTypesVarargs(value: String*): Self = StObject.set(x, "includedUserIdTypes", js.Array(value :_*))
    
    @scala.inline
    def setInterstitialTargeting(value: String): Self = StObject.set(x, "interstitialTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterstitialTargetingUndefined: Self = StObject.set(x, "interstitialTargeting", js.undefined)
    
    @scala.inline
    def setInvalidGeoIds(value: js.Array[String]): Self = StObject.set(x, "invalidGeoIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidGeoIdsUndefined: Self = StObject.set(x, "invalidGeoIds", js.undefined)
    
    @scala.inline
    def setInvalidGeoIdsVarargs(value: String*): Self = StObject.set(x, "invalidGeoIds", js.Array(value :_*))
    
    @scala.inline
    def setMaximumQps(value: String): Self = StObject.set(x, "maximumQps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumQpsUndefined: Self = StObject.set(x, "maximumQps", js.undefined)
    
    @scala.inline
    def setMinimumViewabilityDecile(value: Double): Self = StObject.set(x, "minimumViewabilityDecile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumViewabilityDecileUndefined: Self = StObject.set(x, "minimumViewabilityDecile", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublisherTargeting(value: StringTargetingDimension): Self = StObject.set(x, "publisherTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherTargetingUndefined: Self = StObject.set(x, "publisherTargeting", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUserListTargeting(value: NumericTargetingDimension): Self = StObject.set(x, "userListTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserListTargetingUndefined: Self = StObject.set(x, "userListTargeting", js.undefined)
    
    @scala.inline
    def setVerticalTargeting(value: NumericTargetingDimension): Self = StObject.set(x, "verticalTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalTargetingUndefined: Self = StObject.set(x, "verticalTargeting", js.undefined)
    
    @scala.inline
    def setWebTargeting(value: StringTargetingDimension): Self = StObject.set(x, "webTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebTargetingUndefined: Self = StObject.set(x, "webTargeting", js.undefined)
  }
}
