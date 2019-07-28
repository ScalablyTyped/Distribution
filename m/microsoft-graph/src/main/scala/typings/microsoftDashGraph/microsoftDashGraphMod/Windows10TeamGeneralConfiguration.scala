package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10TeamGeneralConfiguration extends DeviceConfiguration {
  // Indicates whether or not to Block Azure Operational Insights.
  var azureOperationalInsightsBlockTelemetry: js.UndefOr[Boolean] = js.undefined
  // The Azure Operational Insights workspace id.
  var azureOperationalInsightsWorkspaceId: js.UndefOr[String] = js.undefined
  // The Azure Operational Insights Workspace key.
  var azureOperationalInsightsWorkspaceKey: js.UndefOr[String] = js.undefined
  // Specifies whether to automatically launch the Connect app whenever a projection is initiated.
  var connectAppBlockAutoLaunch: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to Block setting a maintenance window for device updates.
  var maintenanceWindowBlocked: js.UndefOr[Boolean] = js.undefined
  // Maintenance window duration for device updates. Valid values 0 to 5
  var maintenanceWindowDurationInHours: js.UndefOr[Double] = js.undefined
  // Maintenance window start time for device updates.
  var maintenanceWindowStartTime: js.UndefOr[String] = js.undefined
  // Indicates whether or not to Block wireless projection.
  var miracastBlocked: js.UndefOr[Boolean] = js.undefined
  /**
    * The channel. Possible values are: userDefined, one, two, three, four, five, six, seven, eight, nine, ten, eleven,
    * thirtySix, forty, fortyFour, fortyEight, oneHundredFortyNine, oneHundredFiftyThree, oneHundredFiftySeven,
    * oneHundredSixtyOne, oneHundredSixtyFive.
    */
  var miracastChannel: js.UndefOr[MiracastChannel] = js.undefined
  // Indicates whether or not to require a pin for wireless projection.
  var miracastRequirePin: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's
    * meetings and files from Office 365.
    */
  var settingsBlockMyMeetingsAndFiles: js.UndefOr[Boolean] = js.undefined
  // Specifies whether to allow the ability to resume a session when the session times out.
  var settingsBlockSessionResume: js.UndefOr[Boolean] = js.undefined
  // Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
  var settingsBlockSigninSuggestions: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to
    * 100
    */
  var settingsDefaultVolume: js.UndefOr[Double] = js.undefined
  // Specifies the number of minutes until the Hub screen turns off.
  var settingsScreenTimeoutInMinutes: js.UndefOr[Double] = js.undefined
  // Specifies the number of minutes until the session times out.
  var settingsSessionTimeoutInMinutes: js.UndefOr[Double] = js.undefined
  // Specifies the number of minutes until the Hub enters sleep mode.
  var settingsSleepTimeoutInMinutes: js.UndefOr[Double] = js.undefined
  // The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
  var welcomeScreenBackgroundImageUrl: js.UndefOr[String] = js.undefined
  // Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
  var welcomeScreenBlockAutomaticWakeUp: js.UndefOr[Boolean] = js.undefined
  /**
    * The welcome screen meeting information shown. Possible values are: userDefined, showOrganizerAndTimeOnly,
    * showOrganizerAndTimeAndSubject.
    */
  var welcomeScreenMeetingInformation: js.UndefOr[WelcomeScreenMeetingInformation] = js.undefined
}

object Windows10TeamGeneralConfiguration {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    azureOperationalInsightsBlockTelemetry: js.UndefOr[Boolean] = js.undefined,
    azureOperationalInsightsWorkspaceId: String = null,
    azureOperationalInsightsWorkspaceKey: String = null,
    connectAppBlockAutoLaunch: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    maintenanceWindowBlocked: js.UndefOr[Boolean] = js.undefined,
    maintenanceWindowDurationInHours: Int | Double = null,
    maintenanceWindowStartTime: String = null,
    miracastBlocked: js.UndefOr[Boolean] = js.undefined,
    miracastChannel: MiracastChannel = null,
    miracastRequirePin: js.UndefOr[Boolean] = js.undefined,
    settingsBlockMyMeetingsAndFiles: js.UndefOr[Boolean] = js.undefined,
    settingsBlockSessionResume: js.UndefOr[Boolean] = js.undefined,
    settingsBlockSigninSuggestions: js.UndefOr[Boolean] = js.undefined,
    settingsDefaultVolume: Int | Double = null,
    settingsScreenTimeoutInMinutes: Int | Double = null,
    settingsSessionTimeoutInMinutes: Int | Double = null,
    settingsSleepTimeoutInMinutes: Int | Double = null,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null,
    welcomeScreenBackgroundImageUrl: String = null,
    welcomeScreenBlockAutomaticWakeUp: js.UndefOr[Boolean] = js.undefined,
    welcomeScreenMeetingInformation: WelcomeScreenMeetingInformation = null
  ): Windows10TeamGeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(azureOperationalInsightsBlockTelemetry)) __obj.updateDynamic("azureOperationalInsightsBlockTelemetry")(azureOperationalInsightsBlockTelemetry)
    if (azureOperationalInsightsWorkspaceId != null) __obj.updateDynamic("azureOperationalInsightsWorkspaceId")(azureOperationalInsightsWorkspaceId)
    if (azureOperationalInsightsWorkspaceKey != null) __obj.updateDynamic("azureOperationalInsightsWorkspaceKey")(azureOperationalInsightsWorkspaceKey)
    if (!js.isUndefined(connectAppBlockAutoLaunch)) __obj.updateDynamic("connectAppBlockAutoLaunch")(connectAppBlockAutoLaunch)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(maintenanceWindowBlocked)) __obj.updateDynamic("maintenanceWindowBlocked")(maintenanceWindowBlocked)
    if (maintenanceWindowDurationInHours != null) __obj.updateDynamic("maintenanceWindowDurationInHours")(maintenanceWindowDurationInHours.asInstanceOf[js.Any])
    if (maintenanceWindowStartTime != null) __obj.updateDynamic("maintenanceWindowStartTime")(maintenanceWindowStartTime)
    if (!js.isUndefined(miracastBlocked)) __obj.updateDynamic("miracastBlocked")(miracastBlocked)
    if (miracastChannel != null) __obj.updateDynamic("miracastChannel")(miracastChannel)
    if (!js.isUndefined(miracastRequirePin)) __obj.updateDynamic("miracastRequirePin")(miracastRequirePin)
    if (!js.isUndefined(settingsBlockMyMeetingsAndFiles)) __obj.updateDynamic("settingsBlockMyMeetingsAndFiles")(settingsBlockMyMeetingsAndFiles)
    if (!js.isUndefined(settingsBlockSessionResume)) __obj.updateDynamic("settingsBlockSessionResume")(settingsBlockSessionResume)
    if (!js.isUndefined(settingsBlockSigninSuggestions)) __obj.updateDynamic("settingsBlockSigninSuggestions")(settingsBlockSigninSuggestions)
    if (settingsDefaultVolume != null) __obj.updateDynamic("settingsDefaultVolume")(settingsDefaultVolume.asInstanceOf[js.Any])
    if (settingsScreenTimeoutInMinutes != null) __obj.updateDynamic("settingsScreenTimeoutInMinutes")(settingsScreenTimeoutInMinutes.asInstanceOf[js.Any])
    if (settingsSessionTimeoutInMinutes != null) __obj.updateDynamic("settingsSessionTimeoutInMinutes")(settingsSessionTimeoutInMinutes.asInstanceOf[js.Any])
    if (settingsSleepTimeoutInMinutes != null) __obj.updateDynamic("settingsSleepTimeoutInMinutes")(settingsSleepTimeoutInMinutes.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (welcomeScreenBackgroundImageUrl != null) __obj.updateDynamic("welcomeScreenBackgroundImageUrl")(welcomeScreenBackgroundImageUrl)
    if (!js.isUndefined(welcomeScreenBlockAutomaticWakeUp)) __obj.updateDynamic("welcomeScreenBlockAutomaticWakeUp")(welcomeScreenBlockAutomaticWakeUp)
    if (welcomeScreenMeetingInformation != null) __obj.updateDynamic("welcomeScreenMeetingInformation")(welcomeScreenMeetingInformation)
    __obj.asInstanceOf[Windows10TeamGeneralConfiguration]
  }
}

