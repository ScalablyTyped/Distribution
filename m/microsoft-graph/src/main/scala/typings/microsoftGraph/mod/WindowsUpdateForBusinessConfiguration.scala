package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdateForBusinessConfiguration
  extends StObject
     with DeviceConfiguration {
  
  /**
    * Automatic update mode. Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime,
    * autoInstallAndRebootAtMaintenanceTime, autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
    */
  var automaticUpdateMode: js.UndefOr[AutomaticUpdateMode] = js.undefined
  
  /**
    * Determines which branch devices will receive their updates from. Possible values are: userDefined, all,
    * businessReadyOnly, windowsInsiderBuildFast, windowsInsiderBuildSlow, windowsInsiderBuildRelease.
    */
  var businessReadyUpdatesOnly: js.UndefOr[WindowsUpdateType] = js.undefined
  
  /**
    * Delivery Optimization Mode. Possible values are: userDefined, httpOnly, httpWithPeeringNat,
    * httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
    */
  var deliveryOptimizationMode: js.UndefOr[WindowsDeliveryOptimizationMode] = js.undefined
  
  // Exclude Windows update Drivers
  var driversExcluded: js.UndefOr[Boolean] = js.undefined
  
  // Defer Feature Updates by these many days
  var featureUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.undefined
  
  // Feature Updates Pause Expiry datetime
  var featureUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.undefined
  
  // Pause Feature Updates
  var featureUpdatesPaused: js.UndefOr[Boolean] = js.undefined
  
  // Installation schedule
  var installationSchedule: js.UndefOr[NullableOption[WindowsUpdateInstallScheduleType]] = js.undefined
  
  // Allow Microsoft Update Service
  var microsoftUpdateServiceAllowed: js.UndefOr[Boolean] = js.undefined
  
  // The pre-release features. Possible values are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
  var prereleaseFeatures: js.UndefOr[PrereleaseFeatures] = js.undefined
  
  // Defer Quality Updates by these many days
  var qualityUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.undefined
  
  // Quality Updates Pause Expiry datetime
  var qualityUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.undefined
  
  // Pause Quality Updates
  var qualityUpdatesPaused: js.UndefOr[Boolean] = js.undefined
}
object WindowsUpdateForBusinessConfiguration {
  
  inline def apply(): WindowsUpdateForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateForBusinessConfiguration]
  }
  
  extension [Self <: WindowsUpdateForBusinessConfiguration](x: Self) {
    
    inline def setAutomaticUpdateMode(value: AutomaticUpdateMode): Self = StObject.set(x, "automaticUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUpdateModeUndefined: Self = StObject.set(x, "automaticUpdateMode", js.undefined)
    
    inline def setBusinessReadyUpdatesOnly(value: WindowsUpdateType): Self = StObject.set(x, "businessReadyUpdatesOnly", value.asInstanceOf[js.Any])
    
    inline def setBusinessReadyUpdatesOnlyUndefined: Self = StObject.set(x, "businessReadyUpdatesOnly", js.undefined)
    
    inline def setDeliveryOptimizationMode(value: WindowsDeliveryOptimizationMode): Self = StObject.set(x, "deliveryOptimizationMode", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptimizationModeUndefined: Self = StObject.set(x, "deliveryOptimizationMode", js.undefined)
    
    inline def setDriversExcluded(value: Boolean): Self = StObject.set(x, "driversExcluded", value.asInstanceOf[js.Any])
    
    inline def setDriversExcludedUndefined: Self = StObject.set(x, "driversExcluded", js.undefined)
    
    inline def setFeatureUpdatesDeferralPeriodInDays(value: Double): Self = StObject.set(x, "featureUpdatesDeferralPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesDeferralPeriodInDaysUndefined: Self = StObject.set(x, "featureUpdatesDeferralPeriodInDays", js.undefined)
    
    inline def setFeatureUpdatesPauseExpiryDateTime(value: String): Self = StObject.set(x, "featureUpdatesPauseExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesPauseExpiryDateTimeUndefined: Self = StObject.set(x, "featureUpdatesPauseExpiryDateTime", js.undefined)
    
    inline def setFeatureUpdatesPaused(value: Boolean): Self = StObject.set(x, "featureUpdatesPaused", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesPausedUndefined: Self = StObject.set(x, "featureUpdatesPaused", js.undefined)
    
    inline def setInstallationSchedule(value: NullableOption[WindowsUpdateInstallScheduleType]): Self = StObject.set(x, "installationSchedule", value.asInstanceOf[js.Any])
    
    inline def setInstallationScheduleNull: Self = StObject.set(x, "installationSchedule", null)
    
    inline def setInstallationScheduleUndefined: Self = StObject.set(x, "installationSchedule", js.undefined)
    
    inline def setMicrosoftUpdateServiceAllowed(value: Boolean): Self = StObject.set(x, "microsoftUpdateServiceAllowed", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftUpdateServiceAllowedUndefined: Self = StObject.set(x, "microsoftUpdateServiceAllowed", js.undefined)
    
    inline def setPrereleaseFeatures(value: PrereleaseFeatures): Self = StObject.set(x, "prereleaseFeatures", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseFeaturesUndefined: Self = StObject.set(x, "prereleaseFeatures", js.undefined)
    
    inline def setQualityUpdatesDeferralPeriodInDays(value: Double): Self = StObject.set(x, "qualityUpdatesDeferralPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesDeferralPeriodInDaysUndefined: Self = StObject.set(x, "qualityUpdatesDeferralPeriodInDays", js.undefined)
    
    inline def setQualityUpdatesPauseExpiryDateTime(value: String): Self = StObject.set(x, "qualityUpdatesPauseExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesPauseExpiryDateTimeUndefined: Self = StObject.set(x, "qualityUpdatesPauseExpiryDateTime", js.undefined)
    
    inline def setQualityUpdatesPaused(value: Boolean): Self = StObject.set(x, "qualityUpdatesPaused", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesPausedUndefined: Self = StObject.set(x, "qualityUpdatesPaused", js.undefined)
  }
}
