package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsUpdateForBusinessConfiguration extends DeviceConfiguration {
  
  /**
    * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime,
    * autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
    */
  var automaticUpdateMode: js.UndefOr[AutomaticUpdateMode] = js.native
  
  /**
    * Determines which branch devices will receive their updates from. Possible values are: userDefined, all,
    * businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
    */
  var businessReadyUpdatesOnly: js.UndefOr[WindowsUpdateType] = js.native
  
  /**
    * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat,
    * httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
    */
  var deliveryOptimizationMode: js.UndefOr[WindowsDeliveryOptimizationMode] = js.native
  
  // Exclude Windows update Drivers
  var driversExcluded: js.UndefOr[Boolean] = js.native
  
  // Defer Feature Updates by these many days
  var featureUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.native
  
  // Feature Updates Pause Expiry datetime
  var featureUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.native
  
  // Pause Feature Updates
  var featureUpdatesPaused: js.UndefOr[Boolean] = js.native
  
  // Installation schedule
  var installationSchedule: js.UndefOr[NullableOption[WindowsUpdateInstallScheduleType]] = js.native
  
  // Allow Microsoft Update Service
  var microsoftUpdateServiceAllowed: js.UndefOr[Boolean] = js.native
  
  // The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
  var prereleaseFeatures: js.UndefOr[PrereleaseFeatures] = js.native
  
  // Defer Quality Updates by these many days
  var qualityUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.native
  
  // Quality Updates Pause Expiry datetime
  var qualityUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.native
  
  // Pause Quality Updates
  var qualityUpdatesPaused: js.UndefOr[Boolean] = js.native
}
object WindowsUpdateForBusinessConfiguration {
  
  @scala.inline
  def apply(): WindowsUpdateForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateForBusinessConfiguration]
  }
  
  @scala.inline
  implicit class WindowsUpdateForBusinessConfigurationOps[Self <: WindowsUpdateForBusinessConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAutomaticUpdateMode(value: AutomaticUpdateMode): Self = this.set("automaticUpdateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticUpdateMode: Self = this.set("automaticUpdateMode", js.undefined)
    
    @scala.inline
    def setBusinessReadyUpdatesOnly(value: WindowsUpdateType): Self = this.set("businessReadyUpdatesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessReadyUpdatesOnly: Self = this.set("businessReadyUpdatesOnly", js.undefined)
    
    @scala.inline
    def setDeliveryOptimizationMode(value: WindowsDeliveryOptimizationMode): Self = this.set("deliveryOptimizationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryOptimizationMode: Self = this.set("deliveryOptimizationMode", js.undefined)
    
    @scala.inline
    def setDriversExcluded(value: Boolean): Self = this.set("driversExcluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriversExcluded: Self = this.set("driversExcluded", js.undefined)
    
    @scala.inline
    def setFeatureUpdatesDeferralPeriodInDays(value: Double): Self = this.set("featureUpdatesDeferralPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureUpdatesDeferralPeriodInDays: Self = this.set("featureUpdatesDeferralPeriodInDays", js.undefined)
    
    @scala.inline
    def setFeatureUpdatesPauseExpiryDateTime(value: String): Self = this.set("featureUpdatesPauseExpiryDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureUpdatesPauseExpiryDateTime: Self = this.set("featureUpdatesPauseExpiryDateTime", js.undefined)
    
    @scala.inline
    def setFeatureUpdatesPaused(value: Boolean): Self = this.set("featureUpdatesPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureUpdatesPaused: Self = this.set("featureUpdatesPaused", js.undefined)
    
    @scala.inline
    def setInstallationSchedule(value: NullableOption[WindowsUpdateInstallScheduleType]): Self = this.set("installationSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallationSchedule: Self = this.set("installationSchedule", js.undefined)
    
    @scala.inline
    def setInstallationScheduleNull: Self = this.set("installationSchedule", null)
    
    @scala.inline
    def setMicrosoftUpdateServiceAllowed(value: Boolean): Self = this.set("microsoftUpdateServiceAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMicrosoftUpdateServiceAllowed: Self = this.set("microsoftUpdateServiceAllowed", js.undefined)
    
    @scala.inline
    def setPrereleaseFeatures(value: PrereleaseFeatures): Self = this.set("prereleaseFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrereleaseFeatures: Self = this.set("prereleaseFeatures", js.undefined)
    
    @scala.inline
    def setQualityUpdatesDeferralPeriodInDays(value: Double): Self = this.set("qualityUpdatesDeferralPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityUpdatesDeferralPeriodInDays: Self = this.set("qualityUpdatesDeferralPeriodInDays", js.undefined)
    
    @scala.inline
    def setQualityUpdatesPauseExpiryDateTime(value: String): Self = this.set("qualityUpdatesPauseExpiryDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityUpdatesPauseExpiryDateTime: Self = this.set("qualityUpdatesPauseExpiryDateTime", js.undefined)
    
    @scala.inline
    def setQualityUpdatesPaused(value: Boolean): Self = this.set("qualityUpdatesPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityUpdatesPaused: Self = this.set("qualityUpdatesPaused", js.undefined)
  }
}
