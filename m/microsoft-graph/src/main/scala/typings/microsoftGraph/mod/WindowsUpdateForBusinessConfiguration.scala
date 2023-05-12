package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdateForBusinessConfiguration
  extends StObject
     with DeviceConfiguration {
  
  /**
    * When TRUE, allows eligible Windows 10 devices to upgrade to Windows 11. When FALSE, implies the device stays on the
    * existing operating system. Returned by default. Query parameters are not supported.
    */
  var allowWindows11Upgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the method by which the auto-restart required notification is dismissed. Possible values are: NotConfigured,
    * Automatic, User. Returned by default. Query parameters are not supported. Possible values are: notConfigured,
    * automatic, user, unknownFutureValue.
    */
  var autoRestartNotificationDismissal: js.UndefOr[AutoRestartNotificationDismissalMethod] = js.undefined
  
  /**
    * The Automatic Update Mode. Possible values are: UserDefined, NotifyDownload, AutoInstallAtMaintenanceTime,
    * AutoInstallAndRebootAtMaintenanceTime, AutoInstallAndRebootAtScheduledTime, AutoInstallAndRebootWithoutEndUserControl,
    * WindowsDefault. UserDefined is the default value, no intent. Returned by default. Query parameters are not supported.
    * Possible values are: userDefined, notifyDownload, autoInstallAtMaintenanceTime, autoInstallAndRebootAtMaintenanceTime,
    * autoInstallAndRebootAtScheduledTime, autoInstallAndRebootWithoutEndUserControl.
    */
  var automaticUpdateMode: js.UndefOr[AutomaticUpdateMode] = js.undefined
  
  /**
    * Determines which branch devices will receive their updates from. Possible values are: UserDefined, All,
    * BusinessReadyOnly, WindowsInsiderBuildFast, WindowsInsiderBuildSlow, WindowsInsiderBuildRelease. Returned by default.
    * Query parameters are not supported. Possible values are: userDefined, all, businessReadyOnly, windowsInsiderBuildFast,
    * windowsInsiderBuildSlow, windowsInsiderBuildRelease.
    */
  var businessReadyUpdatesOnly: js.UndefOr[WindowsUpdateType] = js.undefined
  
  /**
    * Number of days before feature updates are installed automatically with valid range from 0 to 30 days. Returned by
    * default. Query parameters are not supported.
    */
  var deadlineForFeatureUpdatesInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Number of days before quality updates are installed automatically with valid range from 0 to 30 days. Returned by
    * default. Query parameters are not supported.
    */
  var deadlineForQualityUpdatesInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Number of days after deadline until restarts occur automatically with valid range from 0 to 7 days. Returned by
    * default. Query parameters are not supported.
    */
  var deadlineGracePeriodInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The Delivery Optimization Mode. Possible values are: UserDefined, HttpOnly, HttpWithPeeringNat,
    * HttpWithPeeringPrivateGroup, HttpWithInternetPeering, SimpleDownload, BypassMode. UserDefined allows the user to set.
    * Returned by default. Query parameters are not supported. Possible values are: userDefined, httpOnly,
    * httpWithPeeringNat, httpWithPeeringPrivateGroup, httpWithInternetPeering, simpleDownload, bypassMode.
    */
  var deliveryOptimizationMode: js.UndefOr[WindowsDeliveryOptimizationMode] = js.undefined
  
  /**
    * When TRUE, excludes Windows update Drivers. When FALSE, does not exclude Windows update Drivers. Returned by default.
    * Query parameters are not supported.
    */
  var driversExcluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid
    * range from 2 to 30 days. Returned by default. Query parameters are not supported.
    */
  var engagedRestartDeadlineInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days. Returned by
    * default. Query parameters are not supported.
    */
  var engagedRestartSnoozeScheduleInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which
    * requires the user to schedule, with valid range from 0 to 30 days. Returned by default. Query parameters are not
    * supported.
    */
  var engagedRestartTransitionScheduleInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Defer Feature Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are
    * not supported.
    */
  var featureUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * The Feature Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for
    * the ring. Returned by default. Query parameters are not supported.
    */
  var featureUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The Feature Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring.
    * Returned by default. Query parameters are not supported. This property is read-only.
    */
  var featureUpdatesPauseStartDate: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * When TRUE, assigned devices are paused from receiving feature updates for up to 35 days from the time you pause the
    * ring. When FALSE, does not pause Feature Updates. Returned by default. Query parameters are not supported.s
    */
  var featureUpdatesPaused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Feature Updates Rollback Start datetime.This value is the time when the admin rolled back the Feature update for
    * the ring.Returned by default.Query parameters are not supported.
    */
  var featureUpdatesRollbackStartDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days after a Feature Update for which a rollback is valid with valid range from 2 to 60 days. Returned by
    * default. Query parameters are not supported.
    */
  var featureUpdatesRollbackWindowInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * When TRUE, rollback Feature Updates on the next device check in. When FALSE, do not rollback Feature Updates on the
    * next device check in. Returned by default.Query parameters are not supported.
    */
  var featureUpdatesWillBeRolledBack: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The Installation Schedule. Possible values are: ActiveHoursStart, ActiveHoursEnd, ScheduledInstallDay,
    * ScheduledInstallTime. Returned by default. Query parameters are not supported.
    */
  var installationSchedule: js.UndefOr[NullableOption[WindowsUpdateInstallScheduleType]] = js.undefined
  
  /**
    * When TRUE, allows Microsoft Update Service. When FALSE, does not allow Microsoft Update Service. Returned by default.
    * Query parameters are not supported.
    */
  var microsoftUpdateServiceAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE the device should wait until deadline for rebooting outside of active hours. When FALSE the device should not
    * wait until deadline for rebooting outside of active hours. Returned by default. Query parameters are not supported.
    */
  var postponeRebootUntilAfterDeadline: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The Pre-Release Features. Possible values are: UserDefined, SettingsOnly, SettingsAndExperimentations, NotAllowed.
    * UserDefined is the default value, no intent. Returned by default. Query parameters are not supported. Possible values
    * are: userDefined, settingsOnly, settingsAndExperimentations, notAllowed.
    */
  var prereleaseFeatures: js.UndefOr[PrereleaseFeatures] = js.undefined
  
  /**
    * Defer Quality Updates by these many days with valid range from 0 to 30 days. Returned by default. Query parameters are
    * not supported.
    */
  var qualityUpdatesDeferralPeriodInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * The Quality Updates Pause Expiry datetime. This value is 35 days from the time admin paused or extended the pause for
    * the ring. Returned by default. Query parameters are not supported.
    */
  var qualityUpdatesPauseExpiryDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The Quality Updates Pause start date. This value is the time when the admin paused or extended the pause for the ring.
    * Returned by default. Query parameters are not supported. This property is read-only.
    */
  var qualityUpdatesPauseStartDate: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * When TRUE, assigned devices are paused from receiving quality updates for up to 35 days from the time you pause the
    * ring. When FALSE, does not pause Quality Updates. Returned by default. Query parameters are not supported.
    */
  var qualityUpdatesPaused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Quality Updates Rollback Start datetime. This value is the time when the admin rolled back the Quality update for
    * the ring. Returned by default. Query parameters are not supported.
    */
  var qualityUpdatesRollbackStartDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When TRUE, rollback Quality Updates on the next device check in. When FALSE, do not rollback Quality Updates on the
    * next device check in. Returned by default. Query parameters are not supported.
    */
  var qualityUpdatesWillBeRolledBack: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes). Returned
    * by default. Query parameters are not supported.
    */
  var scheduleImminentRestartWarningInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours).
    * Returned by default. Query parameters are not supported.
    */
  var scheduleRestartWarningInHours: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * When TRUE, skips all checks before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full
    * screen mode, phone call state, game mode etc. When FALSE, does not skip all checks before restart. Returned by default.
    * Query parameters are not supported.
    */
  var skipChecksBeforeRestart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies what Windows Update notifications users see. Possible values are: NotConfigured, DefaultNotifications,
    * RestartWarningsOnly, DisableAllNotifications. Returned by default. Query parameters are not supported. Possible values
    * are: notConfigured, defaultNotifications, restartWarningsOnly, disableAllNotifications, unknownFutureValue.
    */
  var updateNotificationLevel: js.UndefOr[WindowsUpdateNotificationDisplayOption] = js.undefined
  
  /**
    * Schedule the update installation on the weeks of the month. Possible values are: UserDefined, FirstWeek, SecondWeek,
    * ThirdWeek, FourthWeek, EveryWeek. Returned by default. Query parameters are not supported. Possible values are:
    * userDefined, firstWeek, secondWeek, thirdWeek, fourthWeek, everyWeek, unknownFutureValue.
    */
  var updateWeeks: js.UndefOr[NullableOption[WindowsUpdateForBusinessUpdateWeeks]] = js.undefined
  
  /**
    * Specifies whether to enable end user’s access to pause software updates. Possible values are: NotConfigured, Enabled,
    * Disabled. Returned by default. Query parameters are not supported. Possible values are: notConfigured, enabled,
    * disabled.
    */
  var userPauseAccess: js.UndefOr[Enablement] = js.undefined
  
  /**
    * Specifies whether to disable user’s access to scan Windows Update. Possible values are: NotConfigured, Enabled,
    * Disabled. Returned by default. Query parameters are not supported. Possible values are: notConfigured, enabled,
    * disabled.
    */
  var userWindowsUpdateScanAccess: js.UndefOr[Enablement] = js.undefined
}
object WindowsUpdateForBusinessConfiguration {
  
  inline def apply(): WindowsUpdateForBusinessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateForBusinessConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsUpdateForBusinessConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowWindows11Upgrade(value: Boolean): Self = StObject.set(x, "allowWindows11Upgrade", value.asInstanceOf[js.Any])
    
    inline def setAllowWindows11UpgradeUndefined: Self = StObject.set(x, "allowWindows11Upgrade", js.undefined)
    
    inline def setAutoRestartNotificationDismissal(value: AutoRestartNotificationDismissalMethod): Self = StObject.set(x, "autoRestartNotificationDismissal", value.asInstanceOf[js.Any])
    
    inline def setAutoRestartNotificationDismissalUndefined: Self = StObject.set(x, "autoRestartNotificationDismissal", js.undefined)
    
    inline def setAutomaticUpdateMode(value: AutomaticUpdateMode): Self = StObject.set(x, "automaticUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setAutomaticUpdateModeUndefined: Self = StObject.set(x, "automaticUpdateMode", js.undefined)
    
    inline def setBusinessReadyUpdatesOnly(value: WindowsUpdateType): Self = StObject.set(x, "businessReadyUpdatesOnly", value.asInstanceOf[js.Any])
    
    inline def setBusinessReadyUpdatesOnlyUndefined: Self = StObject.set(x, "businessReadyUpdatesOnly", js.undefined)
    
    inline def setDeadlineForFeatureUpdatesInDays(value: NullableOption[Double]): Self = StObject.set(x, "deadlineForFeatureUpdatesInDays", value.asInstanceOf[js.Any])
    
    inline def setDeadlineForFeatureUpdatesInDaysNull: Self = StObject.set(x, "deadlineForFeatureUpdatesInDays", null)
    
    inline def setDeadlineForFeatureUpdatesInDaysUndefined: Self = StObject.set(x, "deadlineForFeatureUpdatesInDays", js.undefined)
    
    inline def setDeadlineForQualityUpdatesInDays(value: NullableOption[Double]): Self = StObject.set(x, "deadlineForQualityUpdatesInDays", value.asInstanceOf[js.Any])
    
    inline def setDeadlineForQualityUpdatesInDaysNull: Self = StObject.set(x, "deadlineForQualityUpdatesInDays", null)
    
    inline def setDeadlineForQualityUpdatesInDaysUndefined: Self = StObject.set(x, "deadlineForQualityUpdatesInDays", js.undefined)
    
    inline def setDeadlineGracePeriodInDays(value: NullableOption[Double]): Self = StObject.set(x, "deadlineGracePeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setDeadlineGracePeriodInDaysNull: Self = StObject.set(x, "deadlineGracePeriodInDays", null)
    
    inline def setDeadlineGracePeriodInDaysUndefined: Self = StObject.set(x, "deadlineGracePeriodInDays", js.undefined)
    
    inline def setDeliveryOptimizationMode(value: WindowsDeliveryOptimizationMode): Self = StObject.set(x, "deliveryOptimizationMode", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptimizationModeUndefined: Self = StObject.set(x, "deliveryOptimizationMode", js.undefined)
    
    inline def setDriversExcluded(value: Boolean): Self = StObject.set(x, "driversExcluded", value.asInstanceOf[js.Any])
    
    inline def setDriversExcludedUndefined: Self = StObject.set(x, "driversExcluded", js.undefined)
    
    inline def setEngagedRestartDeadlineInDays(value: NullableOption[Double]): Self = StObject.set(x, "engagedRestartDeadlineInDays", value.asInstanceOf[js.Any])
    
    inline def setEngagedRestartDeadlineInDaysNull: Self = StObject.set(x, "engagedRestartDeadlineInDays", null)
    
    inline def setEngagedRestartDeadlineInDaysUndefined: Self = StObject.set(x, "engagedRestartDeadlineInDays", js.undefined)
    
    inline def setEngagedRestartSnoozeScheduleInDays(value: NullableOption[Double]): Self = StObject.set(x, "engagedRestartSnoozeScheduleInDays", value.asInstanceOf[js.Any])
    
    inline def setEngagedRestartSnoozeScheduleInDaysNull: Self = StObject.set(x, "engagedRestartSnoozeScheduleInDays", null)
    
    inline def setEngagedRestartSnoozeScheduleInDaysUndefined: Self = StObject.set(x, "engagedRestartSnoozeScheduleInDays", js.undefined)
    
    inline def setEngagedRestartTransitionScheduleInDays(value: NullableOption[Double]): Self = StObject.set(x, "engagedRestartTransitionScheduleInDays", value.asInstanceOf[js.Any])
    
    inline def setEngagedRestartTransitionScheduleInDaysNull: Self = StObject.set(x, "engagedRestartTransitionScheduleInDays", null)
    
    inline def setEngagedRestartTransitionScheduleInDaysUndefined: Self = StObject.set(x, "engagedRestartTransitionScheduleInDays", js.undefined)
    
    inline def setFeatureUpdatesDeferralPeriodInDays(value: Double): Self = StObject.set(x, "featureUpdatesDeferralPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesDeferralPeriodInDaysUndefined: Self = StObject.set(x, "featureUpdatesDeferralPeriodInDays", js.undefined)
    
    inline def setFeatureUpdatesPauseExpiryDateTime(value: String): Self = StObject.set(x, "featureUpdatesPauseExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesPauseExpiryDateTimeUndefined: Self = StObject.set(x, "featureUpdatesPauseExpiryDateTime", js.undefined)
    
    inline def setFeatureUpdatesPauseStartDate(value: NullableOption[String]): Self = StObject.set(x, "featureUpdatesPauseStartDate", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesPauseStartDateNull: Self = StObject.set(x, "featureUpdatesPauseStartDate", null)
    
    inline def setFeatureUpdatesPauseStartDateUndefined: Self = StObject.set(x, "featureUpdatesPauseStartDate", js.undefined)
    
    inline def setFeatureUpdatesPaused(value: Boolean): Self = StObject.set(x, "featureUpdatesPaused", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesPausedUndefined: Self = StObject.set(x, "featureUpdatesPaused", js.undefined)
    
    inline def setFeatureUpdatesRollbackStartDateTime(value: String): Self = StObject.set(x, "featureUpdatesRollbackStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesRollbackStartDateTimeUndefined: Self = StObject.set(x, "featureUpdatesRollbackStartDateTime", js.undefined)
    
    inline def setFeatureUpdatesRollbackWindowInDays(value: NullableOption[Double]): Self = StObject.set(x, "featureUpdatesRollbackWindowInDays", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesRollbackWindowInDaysNull: Self = StObject.set(x, "featureUpdatesRollbackWindowInDays", null)
    
    inline def setFeatureUpdatesRollbackWindowInDaysUndefined: Self = StObject.set(x, "featureUpdatesRollbackWindowInDays", js.undefined)
    
    inline def setFeatureUpdatesWillBeRolledBack(value: NullableOption[Boolean]): Self = StObject.set(x, "featureUpdatesWillBeRolledBack", value.asInstanceOf[js.Any])
    
    inline def setFeatureUpdatesWillBeRolledBackNull: Self = StObject.set(x, "featureUpdatesWillBeRolledBack", null)
    
    inline def setFeatureUpdatesWillBeRolledBackUndefined: Self = StObject.set(x, "featureUpdatesWillBeRolledBack", js.undefined)
    
    inline def setInstallationSchedule(value: NullableOption[WindowsUpdateInstallScheduleType]): Self = StObject.set(x, "installationSchedule", value.asInstanceOf[js.Any])
    
    inline def setInstallationScheduleNull: Self = StObject.set(x, "installationSchedule", null)
    
    inline def setInstallationScheduleUndefined: Self = StObject.set(x, "installationSchedule", js.undefined)
    
    inline def setMicrosoftUpdateServiceAllowed(value: Boolean): Self = StObject.set(x, "microsoftUpdateServiceAllowed", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftUpdateServiceAllowedUndefined: Self = StObject.set(x, "microsoftUpdateServiceAllowed", js.undefined)
    
    inline def setPostponeRebootUntilAfterDeadline(value: NullableOption[Boolean]): Self = StObject.set(x, "postponeRebootUntilAfterDeadline", value.asInstanceOf[js.Any])
    
    inline def setPostponeRebootUntilAfterDeadlineNull: Self = StObject.set(x, "postponeRebootUntilAfterDeadline", null)
    
    inline def setPostponeRebootUntilAfterDeadlineUndefined: Self = StObject.set(x, "postponeRebootUntilAfterDeadline", js.undefined)
    
    inline def setPrereleaseFeatures(value: PrereleaseFeatures): Self = StObject.set(x, "prereleaseFeatures", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseFeaturesUndefined: Self = StObject.set(x, "prereleaseFeatures", js.undefined)
    
    inline def setQualityUpdatesDeferralPeriodInDays(value: Double): Self = StObject.set(x, "qualityUpdatesDeferralPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesDeferralPeriodInDaysUndefined: Self = StObject.set(x, "qualityUpdatesDeferralPeriodInDays", js.undefined)
    
    inline def setQualityUpdatesPauseExpiryDateTime(value: String): Self = StObject.set(x, "qualityUpdatesPauseExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesPauseExpiryDateTimeUndefined: Self = StObject.set(x, "qualityUpdatesPauseExpiryDateTime", js.undefined)
    
    inline def setQualityUpdatesPauseStartDate(value: NullableOption[String]): Self = StObject.set(x, "qualityUpdatesPauseStartDate", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesPauseStartDateNull: Self = StObject.set(x, "qualityUpdatesPauseStartDate", null)
    
    inline def setQualityUpdatesPauseStartDateUndefined: Self = StObject.set(x, "qualityUpdatesPauseStartDate", js.undefined)
    
    inline def setQualityUpdatesPaused(value: Boolean): Self = StObject.set(x, "qualityUpdatesPaused", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesPausedUndefined: Self = StObject.set(x, "qualityUpdatesPaused", js.undefined)
    
    inline def setQualityUpdatesRollbackStartDateTime(value: String): Self = StObject.set(x, "qualityUpdatesRollbackStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesRollbackStartDateTimeUndefined: Self = StObject.set(x, "qualityUpdatesRollbackStartDateTime", js.undefined)
    
    inline def setQualityUpdatesWillBeRolledBack(value: NullableOption[Boolean]): Self = StObject.set(x, "qualityUpdatesWillBeRolledBack", value.asInstanceOf[js.Any])
    
    inline def setQualityUpdatesWillBeRolledBackNull: Self = StObject.set(x, "qualityUpdatesWillBeRolledBack", null)
    
    inline def setQualityUpdatesWillBeRolledBackUndefined: Self = StObject.set(x, "qualityUpdatesWillBeRolledBack", js.undefined)
    
    inline def setScheduleImminentRestartWarningInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "scheduleImminentRestartWarningInMinutes", value.asInstanceOf[js.Any])
    
    inline def setScheduleImminentRestartWarningInMinutesNull: Self = StObject.set(x, "scheduleImminentRestartWarningInMinutes", null)
    
    inline def setScheduleImminentRestartWarningInMinutesUndefined: Self = StObject.set(x, "scheduleImminentRestartWarningInMinutes", js.undefined)
    
    inline def setScheduleRestartWarningInHours(value: NullableOption[Double]): Self = StObject.set(x, "scheduleRestartWarningInHours", value.asInstanceOf[js.Any])
    
    inline def setScheduleRestartWarningInHoursNull: Self = StObject.set(x, "scheduleRestartWarningInHours", null)
    
    inline def setScheduleRestartWarningInHoursUndefined: Self = StObject.set(x, "scheduleRestartWarningInHours", js.undefined)
    
    inline def setSkipChecksBeforeRestart(value: Boolean): Self = StObject.set(x, "skipChecksBeforeRestart", value.asInstanceOf[js.Any])
    
    inline def setSkipChecksBeforeRestartUndefined: Self = StObject.set(x, "skipChecksBeforeRestart", js.undefined)
    
    inline def setUpdateNotificationLevel(value: WindowsUpdateNotificationDisplayOption): Self = StObject.set(x, "updateNotificationLevel", value.asInstanceOf[js.Any])
    
    inline def setUpdateNotificationLevelUndefined: Self = StObject.set(x, "updateNotificationLevel", js.undefined)
    
    inline def setUpdateWeeks(value: NullableOption[WindowsUpdateForBusinessUpdateWeeks]): Self = StObject.set(x, "updateWeeks", value.asInstanceOf[js.Any])
    
    inline def setUpdateWeeksNull: Self = StObject.set(x, "updateWeeks", null)
    
    inline def setUpdateWeeksUndefined: Self = StObject.set(x, "updateWeeks", js.undefined)
    
    inline def setUserPauseAccess(value: Enablement): Self = StObject.set(x, "userPauseAccess", value.asInstanceOf[js.Any])
    
    inline def setUserPauseAccessUndefined: Self = StObject.set(x, "userPauseAccess", js.undefined)
    
    inline def setUserWindowsUpdateScanAccess(value: Enablement): Self = StObject.set(x, "userWindowsUpdateScanAccess", value.asInstanceOf[js.Any])
    
    inline def setUserWindowsUpdateScanAccessUndefined: Self = StObject.set(x, "userWindowsUpdateScanAccess", js.undefined)
  }
}
