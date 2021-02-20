package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingOption extends StObject {
  
  /** Age range details. */
  var ageRangeDetails: js.UndefOr[AgeRangeTargetingOptionDetails] = js.native
  
  /** App category details. */
  var appCategoryDetails: js.UndefOr[AppCategoryTargetingOptionDetails] = js.native
  
  /** Authorized seller status resource details. */
  var authorizedSellerStatusDetails: js.UndefOr[AuthorizedSellerStatusTargetingOptionDetails] = js.native
  
  /** Browser details. */
  var browserDetails: js.UndefOr[BrowserTargetingOptionDetails] = js.native
  
  /** Carrier and ISP details. */
  var carrierAndIspDetails: js.UndefOr[CarrierAndIspTargetingOptionDetails] = js.native
  
  /** Category resource details. */
  var categoryDetails: js.UndefOr[CategoryTargetingOptionDetails] = js.native
  
  /** Content instream position details. */
  var contentInstreamPositionDetails: js.UndefOr[ContentInstreamPositionTargetingOptionDetails] = js.native
  
  /** Content outstream position details. */
  var contentOutstreamPositionDetails: js.UndefOr[ContentOutstreamPositionTargetingOptionDetails] = js.native
  
  /** Device make and model resource details. */
  var deviceMakeModelDetails: js.UndefOr[DeviceMakeModelTargetingOptionDetails] = js.native
  
  /** Device type details. */
  var deviceTypeDetails: js.UndefOr[DeviceTypeTargetingOptionDetails] = js.native
  
  /** Digital content label details. */
  var digitalContentLabelDetails: js.UndefOr[DigitalContentLabelTargetingOptionDetails] = js.native
  
  /** Environment details. */
  var environmentDetails: js.UndefOr[EnvironmentTargetingOptionDetails] = js.native
  
  /** Exchange details. */
  var exchangeDetails: js.UndefOr[ExchangeTargetingOptionDetails] = js.native
  
  /** Gender details. */
  var genderDetails: js.UndefOr[GenderTargetingOptionDetails] = js.native
  
  /** Geographic region resource details. */
  var geoRegionDetails: js.UndefOr[GeoRegionTargetingOptionDetails] = js.native
  
  /** Household income details. */
  var householdIncomeDetails: js.UndefOr[HouseholdIncomeTargetingOptionDetails] = js.native
  
  /** Language resource details. */
  var languageDetails: js.UndefOr[LanguageTargetingOptionDetails] = js.native
  
  /** Output only. The resource name for this targeting option. */
  var name: js.UndefOr[String] = js.native
  
  /** On screen position details. */
  var onScreenPositionDetails: js.UndefOr[OnScreenPositionTargetingOptionDetails] = js.native
  
  /** Operating system resources details. */
  var operatingSystemDetails: js.UndefOr[OperatingSystemTargetingOptionDetails] = js.native
  
  /** Parental status details. */
  var parentalStatusDetails: js.UndefOr[ParentalStatusTargetingOptionDetails] = js.native
  
  /** Sensitive Category details. */
  var sensitiveCategoryDetails: js.UndefOr[SensitiveCategoryTargetingOptionDetails] = js.native
  
  /** Sub-exchange details. */
  var subExchangeDetails: js.UndefOr[SubExchangeTargetingOptionDetails] = js.native
  
  /** Output only. A unique identifier for this targeting option. The tuple {`targeting_type`, `targeting_option_id`} will be unique. */
  var targetingOptionId: js.UndefOr[String] = js.native
  
  /** Output only. The type of this targeting option. */
  var targetingType: js.UndefOr[String] = js.native
  
  /** User rewarded content details. */
  var userRewardedContentDetails: js.UndefOr[UserRewardedContentTargetingOptionDetails] = js.native
  
  /** Video player size details. */
  var videoPlayerSizeDetails: js.UndefOr[VideoPlayerSizeTargetingOptionDetails] = js.native
  
  /** Viewability resource details. */
  var viewabilityDetails: js.UndefOr[ViewabilityTargetingOptionDetails] = js.native
}
object TargetingOption {
  
  @scala.inline
  def apply(): TargetingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingOption]
  }
  
  @scala.inline
  implicit class TargetingOptionMutableBuilder[Self <: TargetingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeRangeDetails(value: AgeRangeTargetingOptionDetails): Self = StObject.set(x, "ageRangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRangeDetailsUndefined: Self = StObject.set(x, "ageRangeDetails", js.undefined)
    
    @scala.inline
    def setAppCategoryDetails(value: AppCategoryTargetingOptionDetails): Self = StObject.set(x, "appCategoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppCategoryDetailsUndefined: Self = StObject.set(x, "appCategoryDetails", js.undefined)
    
    @scala.inline
    def setAuthorizedSellerStatusDetails(value: AuthorizedSellerStatusTargetingOptionDetails): Self = StObject.set(x, "authorizedSellerStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedSellerStatusDetailsUndefined: Self = StObject.set(x, "authorizedSellerStatusDetails", js.undefined)
    
    @scala.inline
    def setBrowserDetails(value: BrowserTargetingOptionDetails): Self = StObject.set(x, "browserDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDetailsUndefined: Self = StObject.set(x, "browserDetails", js.undefined)
    
    @scala.inline
    def setCarrierAndIspDetails(value: CarrierAndIspTargetingOptionDetails): Self = StObject.set(x, "carrierAndIspDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierAndIspDetailsUndefined: Self = StObject.set(x, "carrierAndIspDetails", js.undefined)
    
    @scala.inline
    def setCategoryDetails(value: CategoryTargetingOptionDetails): Self = StObject.set(x, "categoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryDetailsUndefined: Self = StObject.set(x, "categoryDetails", js.undefined)
    
    @scala.inline
    def setContentInstreamPositionDetails(value: ContentInstreamPositionTargetingOptionDetails): Self = StObject.set(x, "contentInstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInstreamPositionDetailsUndefined: Self = StObject.set(x, "contentInstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setContentOutstreamPositionDetails(value: ContentOutstreamPositionTargetingOptionDetails): Self = StObject.set(x, "contentOutstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOutstreamPositionDetailsUndefined: Self = StObject.set(x, "contentOutstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setDeviceMakeModelDetails(value: DeviceMakeModelTargetingOptionDetails): Self = StObject.set(x, "deviceMakeModelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMakeModelDetailsUndefined: Self = StObject.set(x, "deviceMakeModelDetails", js.undefined)
    
    @scala.inline
    def setDeviceTypeDetails(value: DeviceTypeTargetingOptionDetails): Self = StObject.set(x, "deviceTypeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeDetailsUndefined: Self = StObject.set(x, "deviceTypeDetails", js.undefined)
    
    @scala.inline
    def setDigitalContentLabelDetails(value: DigitalContentLabelTargetingOptionDetails): Self = StObject.set(x, "digitalContentLabelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitalContentLabelDetailsUndefined: Self = StObject.set(x, "digitalContentLabelDetails", js.undefined)
    
    @scala.inline
    def setEnvironmentDetails(value: EnvironmentTargetingOptionDetails): Self = StObject.set(x, "environmentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentDetailsUndefined: Self = StObject.set(x, "environmentDetails", js.undefined)
    
    @scala.inline
    def setExchangeDetails(value: ExchangeTargetingOptionDetails): Self = StObject.set(x, "exchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeDetailsUndefined: Self = StObject.set(x, "exchangeDetails", js.undefined)
    
    @scala.inline
    def setGenderDetails(value: GenderTargetingOptionDetails): Self = StObject.set(x, "genderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderDetailsUndefined: Self = StObject.set(x, "genderDetails", js.undefined)
    
    @scala.inline
    def setGeoRegionDetails(value: GeoRegionTargetingOptionDetails): Self = StObject.set(x, "geoRegionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoRegionDetailsUndefined: Self = StObject.set(x, "geoRegionDetails", js.undefined)
    
    @scala.inline
    def setHouseholdIncomeDetails(value: HouseholdIncomeTargetingOptionDetails): Self = StObject.set(x, "householdIncomeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHouseholdIncomeDetailsUndefined: Self = StObject.set(x, "householdIncomeDetails", js.undefined)
    
    @scala.inline
    def setLanguageDetails(value: LanguageTargetingOptionDetails): Self = StObject.set(x, "languageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDetailsUndefined: Self = StObject.set(x, "languageDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnScreenPositionDetails(value: OnScreenPositionTargetingOptionDetails): Self = StObject.set(x, "onScreenPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScreenPositionDetailsUndefined: Self = StObject.set(x, "onScreenPositionDetails", js.undefined)
    
    @scala.inline
    def setOperatingSystemDetails(value: OperatingSystemTargetingOptionDetails): Self = StObject.set(x, "operatingSystemDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemDetailsUndefined: Self = StObject.set(x, "operatingSystemDetails", js.undefined)
    
    @scala.inline
    def setParentalStatusDetails(value: ParentalStatusTargetingOptionDetails): Self = StObject.set(x, "parentalStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentalStatusDetailsUndefined: Self = StObject.set(x, "parentalStatusDetails", js.undefined)
    
    @scala.inline
    def setSensitiveCategoryDetails(value: SensitiveCategoryTargetingOptionDetails): Self = StObject.set(x, "sensitiveCategoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveCategoryDetailsUndefined: Self = StObject.set(x, "sensitiveCategoryDetails", js.undefined)
    
    @scala.inline
    def setSubExchangeDetails(value: SubExchangeTargetingOptionDetails): Self = StObject.set(x, "subExchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubExchangeDetailsUndefined: Self = StObject.set(x, "subExchangeDetails", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    @scala.inline
    def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
    
    @scala.inline
    def setUserRewardedContentDetails(value: UserRewardedContentTargetingOptionDetails): Self = StObject.set(x, "userRewardedContentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRewardedContentDetailsUndefined: Self = StObject.set(x, "userRewardedContentDetails", js.undefined)
    
    @scala.inline
    def setVideoPlayerSizeDetails(value: VideoPlayerSizeTargetingOptionDetails): Self = StObject.set(x, "videoPlayerSizeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPlayerSizeDetailsUndefined: Self = StObject.set(x, "videoPlayerSizeDetails", js.undefined)
    
    @scala.inline
    def setViewabilityDetails(value: ViewabilityTargetingOptionDetails): Self = StObject.set(x, "viewabilityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityDetailsUndefined: Self = StObject.set(x, "viewabilityDetails", js.undefined)
  }
}
