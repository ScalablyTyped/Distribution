package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PretargetingConfig extends js.Object {
  
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
  implicit class PretargetingConfigOps[Self <: PretargetingConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowedUserTargetingModesVarargs(value: String*): Self = this.set("allowedUserTargetingModes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedUserTargetingModes(value: js.Array[String]): Self = this.set("allowedUserTargetingModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedUserTargetingModes: Self = this.set("allowedUserTargetingModes", js.undefined)
    
    @scala.inline
    def setAppTargeting(value: AppTargeting): Self = this.set("appTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppTargeting: Self = this.set("appTargeting", js.undefined)
    
    @scala.inline
    def setBillingId(value: String): Self = this.set("billingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingId: Self = this.set("billingId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExcludedContentLabelIdsVarargs(value: String*): Self = this.set("excludedContentLabelIds", js.Array(value :_*))
    
    @scala.inline
    def setExcludedContentLabelIds(value: js.Array[String]): Self = this.set("excludedContentLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedContentLabelIds: Self = this.set("excludedContentLabelIds", js.undefined)
    
    @scala.inline
    def setGeoTargeting(value: NumericTargetingDimension): Self = this.set("geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoTargeting: Self = this.set("geoTargeting", js.undefined)
    
    @scala.inline
    def setIncludedCreativeDimensionsVarargs(value: CreativeDimensions*): Self = this.set("includedCreativeDimensions", js.Array(value :_*))
    
    @scala.inline
    def setIncludedCreativeDimensions(value: js.Array[CreativeDimensions]): Self = this.set("includedCreativeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedCreativeDimensions: Self = this.set("includedCreativeDimensions", js.undefined)
    
    @scala.inline
    def setIncludedEnvironmentsVarargs(value: String*): Self = this.set("includedEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setIncludedEnvironments(value: js.Array[String]): Self = this.set("includedEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedEnvironments: Self = this.set("includedEnvironments", js.undefined)
    
    @scala.inline
    def setIncludedFormatsVarargs(value: String*): Self = this.set("includedFormats", js.Array(value :_*))
    
    @scala.inline
    def setIncludedFormats(value: js.Array[String]): Self = this.set("includedFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedFormats: Self = this.set("includedFormats", js.undefined)
    
    @scala.inline
    def setIncludedLanguagesVarargs(value: String*): Self = this.set("includedLanguages", js.Array(value :_*))
    
    @scala.inline
    def setIncludedLanguages(value: js.Array[String]): Self = this.set("includedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedLanguages: Self = this.set("includedLanguages", js.undefined)
    
    @scala.inline
    def setIncludedMobileOperatingSystemIdsVarargs(value: String*): Self = this.set("includedMobileOperatingSystemIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludedMobileOperatingSystemIds(value: js.Array[String]): Self = this.set("includedMobileOperatingSystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedMobileOperatingSystemIds: Self = this.set("includedMobileOperatingSystemIds", js.undefined)
    
    @scala.inline
    def setIncludedPlatformsVarargs(value: String*): Self = this.set("includedPlatforms", js.Array(value :_*))
    
    @scala.inline
    def setIncludedPlatforms(value: js.Array[String]): Self = this.set("includedPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedPlatforms: Self = this.set("includedPlatforms", js.undefined)
    
    @scala.inline
    def setIncludedUserIdTypesVarargs(value: String*): Self = this.set("includedUserIdTypes", js.Array(value :_*))
    
    @scala.inline
    def setIncludedUserIdTypes(value: js.Array[String]): Self = this.set("includedUserIdTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedUserIdTypes: Self = this.set("includedUserIdTypes", js.undefined)
    
    @scala.inline
    def setInterstitialTargeting(value: String): Self = this.set("interstitialTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterstitialTargeting: Self = this.set("interstitialTargeting", js.undefined)
    
    @scala.inline
    def setInvalidGeoIdsVarargs(value: String*): Self = this.set("invalidGeoIds", js.Array(value :_*))
    
    @scala.inline
    def setInvalidGeoIds(value: js.Array[String]): Self = this.set("invalidGeoIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidGeoIds: Self = this.set("invalidGeoIds", js.undefined)
    
    @scala.inline
    def setMaximumQps(value: String): Self = this.set("maximumQps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumQps: Self = this.set("maximumQps", js.undefined)
    
    @scala.inline
    def setMinimumViewabilityDecile(value: Double): Self = this.set("minimumViewabilityDecile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumViewabilityDecile: Self = this.set("minimumViewabilityDecile", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublisherTargeting(value: StringTargetingDimension): Self = this.set("publisherTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherTargeting: Self = this.set("publisherTargeting", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUserListTargeting(value: NumericTargetingDimension): Self = this.set("userListTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserListTargeting: Self = this.set("userListTargeting", js.undefined)
    
    @scala.inline
    def setVerticalTargeting(value: NumericTargetingDimension): Self = this.set("verticalTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalTargeting: Self = this.set("verticalTargeting", js.undefined)
    
    @scala.inline
    def setWebTargeting(value: StringTargetingDimension): Self = this.set("webTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebTargeting: Self = this.set("webTargeting", js.undefined)
  }
}
