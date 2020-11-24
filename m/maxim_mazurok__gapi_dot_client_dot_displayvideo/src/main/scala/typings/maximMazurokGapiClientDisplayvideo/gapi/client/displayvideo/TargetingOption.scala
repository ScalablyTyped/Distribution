package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingOption extends js.Object {
  
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
  implicit class TargetingOptionOps[Self <: TargetingOption] (val x: Self) extends AnyVal {
    
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
    def setAgeRangeDetails(value: AgeRangeTargetingOptionDetails): Self = this.set("ageRangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeRangeDetails: Self = this.set("ageRangeDetails", js.undefined)
    
    @scala.inline
    def setAppCategoryDetails(value: AppCategoryTargetingOptionDetails): Self = this.set("appCategoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppCategoryDetails: Self = this.set("appCategoryDetails", js.undefined)
    
    @scala.inline
    def setAuthorizedSellerStatusDetails(value: AuthorizedSellerStatusTargetingOptionDetails): Self = this.set("authorizedSellerStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedSellerStatusDetails: Self = this.set("authorizedSellerStatusDetails", js.undefined)
    
    @scala.inline
    def setBrowserDetails(value: BrowserTargetingOptionDetails): Self = this.set("browserDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserDetails: Self = this.set("browserDetails", js.undefined)
    
    @scala.inline
    def setCarrierAndIspDetails(value: CarrierAndIspTargetingOptionDetails): Self = this.set("carrierAndIspDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierAndIspDetails: Self = this.set("carrierAndIspDetails", js.undefined)
    
    @scala.inline
    def setCategoryDetails(value: CategoryTargetingOptionDetails): Self = this.set("categoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryDetails: Self = this.set("categoryDetails", js.undefined)
    
    @scala.inline
    def setContentInstreamPositionDetails(value: ContentInstreamPositionTargetingOptionDetails): Self = this.set("contentInstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInstreamPositionDetails: Self = this.set("contentInstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setContentOutstreamPositionDetails(value: ContentOutstreamPositionTargetingOptionDetails): Self = this.set("contentOutstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOutstreamPositionDetails: Self = this.set("contentOutstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setDeviceMakeModelDetails(value: DeviceMakeModelTargetingOptionDetails): Self = this.set("deviceMakeModelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMakeModelDetails: Self = this.set("deviceMakeModelDetails", js.undefined)
    
    @scala.inline
    def setDeviceTypeDetails(value: DeviceTypeTargetingOptionDetails): Self = this.set("deviceTypeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceTypeDetails: Self = this.set("deviceTypeDetails", js.undefined)
    
    @scala.inline
    def setDigitalContentLabelDetails(value: DigitalContentLabelTargetingOptionDetails): Self = this.set("digitalContentLabelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigitalContentLabelDetails: Self = this.set("digitalContentLabelDetails", js.undefined)
    
    @scala.inline
    def setEnvironmentDetails(value: EnvironmentTargetingOptionDetails): Self = this.set("environmentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentDetails: Self = this.set("environmentDetails", js.undefined)
    
    @scala.inline
    def setExchangeDetails(value: ExchangeTargetingOptionDetails): Self = this.set("exchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeDetails: Self = this.set("exchangeDetails", js.undefined)
    
    @scala.inline
    def setGenderDetails(value: GenderTargetingOptionDetails): Self = this.set("genderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenderDetails: Self = this.set("genderDetails", js.undefined)
    
    @scala.inline
    def setGeoRegionDetails(value: GeoRegionTargetingOptionDetails): Self = this.set("geoRegionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoRegionDetails: Self = this.set("geoRegionDetails", js.undefined)
    
    @scala.inline
    def setHouseholdIncomeDetails(value: HouseholdIncomeTargetingOptionDetails): Self = this.set("householdIncomeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHouseholdIncomeDetails: Self = this.set("householdIncomeDetails", js.undefined)
    
    @scala.inline
    def setLanguageDetails(value: LanguageTargetingOptionDetails): Self = this.set("languageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageDetails: Self = this.set("languageDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnScreenPositionDetails(value: OnScreenPositionTargetingOptionDetails): Self = this.set("onScreenPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScreenPositionDetails: Self = this.set("onScreenPositionDetails", js.undefined)
    
    @scala.inline
    def setOperatingSystemDetails(value: OperatingSystemTargetingOptionDetails): Self = this.set("operatingSystemDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemDetails: Self = this.set("operatingSystemDetails", js.undefined)
    
    @scala.inline
    def setParentalStatusDetails(value: ParentalStatusTargetingOptionDetails): Self = this.set("parentalStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentalStatusDetails: Self = this.set("parentalStatusDetails", js.undefined)
    
    @scala.inline
    def setSensitiveCategoryDetails(value: SensitiveCategoryTargetingOptionDetails): Self = this.set("sensitiveCategoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveCategoryDetails: Self = this.set("sensitiveCategoryDetails", js.undefined)
    
    @scala.inline
    def setSubExchangeDetails(value: SubExchangeTargetingOptionDetails): Self = this.set("subExchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubExchangeDetails: Self = this.set("subExchangeDetails", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
    
    @scala.inline
    def setTargetingType(value: String): Self = this.set("targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingType: Self = this.set("targetingType", js.undefined)
    
    @scala.inline
    def setUserRewardedContentDetails(value: UserRewardedContentTargetingOptionDetails): Self = this.set("userRewardedContentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRewardedContentDetails: Self = this.set("userRewardedContentDetails", js.undefined)
    
    @scala.inline
    def setVideoPlayerSizeDetails(value: VideoPlayerSizeTargetingOptionDetails): Self = this.set("videoPlayerSizeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPlayerSizeDetails: Self = this.set("videoPlayerSizeDetails", js.undefined)
    
    @scala.inline
    def setViewabilityDetails(value: ViewabilityTargetingOptionDetails): Self = this.set("viewabilityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewabilityDetails: Self = this.set("viewabilityDetails", js.undefined)
  }
}
