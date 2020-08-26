package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10TeamGeneralConfiguration extends DeviceConfiguration {
  // Indicates whether or not to Block Azure Operational Insights.
  var azureOperationalInsightsBlockTelemetry: js.UndefOr[Boolean] = js.native
  // The Azure Operational Insights workspace id.
  var azureOperationalInsightsWorkspaceId: js.UndefOr[String] = js.native
  // The Azure Operational Insights Workspace key.
  var azureOperationalInsightsWorkspaceKey: js.UndefOr[String] = js.native
  // Specifies whether to automatically launch the Connect app whenever a projection is initiated.
  var connectAppBlockAutoLaunch: js.UndefOr[Boolean] = js.native
  // Indicates whether or not to Block setting a maintenance window for device updates.
  var maintenanceWindowBlocked: js.UndefOr[Boolean] = js.native
  // Maintenance window duration for device updates. Valid values 0 to 5
  var maintenanceWindowDurationInHours: js.UndefOr[Double] = js.native
  // Maintenance window start time for device updates.
  var maintenanceWindowStartTime: js.UndefOr[String] = js.native
  // Indicates whether or not to Block wireless projection.
  var miracastBlocked: js.UndefOr[Boolean] = js.native
  /**
    * The channel. Possible values are: userDefined, one, two, three, four, five, six, seven, eight, nine, ten, eleven,
    * thirtySix, forty, fortyFour, fortyEight, oneHundredFortyNine, oneHundredFiftyThree, oneHundredFiftySeven,
    * oneHundredSixtyOne, oneHundredSixtyFive.
    */
  var miracastChannel: js.UndefOr[MiracastChannel] = js.native
  // Indicates whether or not to require a pin for wireless projection.
  var miracastRequirePin: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether to disable the 'My meetings and files' feature in the Start menu, which shows the signed-in user's
    * meetings and files from Office 365.
    */
  var settingsBlockMyMeetingsAndFiles: js.UndefOr[Boolean] = js.native
  // Specifies whether to allow the ability to resume a session when the session times out.
  var settingsBlockSessionResume: js.UndefOr[Boolean] = js.native
  // Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.
  var settingsBlockSigninSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to
    * 100
    */
  var settingsDefaultVolume: js.UndefOr[Double] = js.native
  // Specifies the number of minutes until the Hub screen turns off.
  var settingsScreenTimeoutInMinutes: js.UndefOr[Double] = js.native
  // Specifies the number of minutes until the session times out.
  var settingsSessionTimeoutInMinutes: js.UndefOr[Double] = js.native
  // Specifies the number of minutes until the Hub enters sleep mode.
  var settingsSleepTimeoutInMinutes: js.UndefOr[Double] = js.native
  // The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
  var welcomeScreenBackgroundImageUrl: js.UndefOr[String] = js.native
  // Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.
  var welcomeScreenBlockAutomaticWakeUp: js.UndefOr[Boolean] = js.native
  /**
    * The welcome screen meeting information shown. Possible values are: userDefined, showOrganizerAndTimeOnly,
    * showOrganizerAndTimeAndSubject.
    */
  var welcomeScreenMeetingInformation: js.UndefOr[WelcomeScreenMeetingInformation] = js.native
}

object Windows10TeamGeneralConfiguration {
  @scala.inline
  def apply(): Windows10TeamGeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10TeamGeneralConfiguration]
  }
  @scala.inline
  implicit class Windows10TeamGeneralConfigurationOps[Self <: Windows10TeamGeneralConfiguration] (val x: Self) extends AnyVal {
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
    def setAzureOperationalInsightsBlockTelemetry(value: Boolean): Self = this.set("azureOperationalInsightsBlockTelemetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureOperationalInsightsBlockTelemetry: Self = this.set("azureOperationalInsightsBlockTelemetry", js.undefined)
    @scala.inline
    def setAzureOperationalInsightsWorkspaceId(value: String): Self = this.set("azureOperationalInsightsWorkspaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureOperationalInsightsWorkspaceId: Self = this.set("azureOperationalInsightsWorkspaceId", js.undefined)
    @scala.inline
    def setAzureOperationalInsightsWorkspaceKey(value: String): Self = this.set("azureOperationalInsightsWorkspaceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureOperationalInsightsWorkspaceKey: Self = this.set("azureOperationalInsightsWorkspaceKey", js.undefined)
    @scala.inline
    def setConnectAppBlockAutoLaunch(value: Boolean): Self = this.set("connectAppBlockAutoLaunch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectAppBlockAutoLaunch: Self = this.set("connectAppBlockAutoLaunch", js.undefined)
    @scala.inline
    def setMaintenanceWindowBlocked(value: Boolean): Self = this.set("maintenanceWindowBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceWindowBlocked: Self = this.set("maintenanceWindowBlocked", js.undefined)
    @scala.inline
    def setMaintenanceWindowDurationInHours(value: Double): Self = this.set("maintenanceWindowDurationInHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceWindowDurationInHours: Self = this.set("maintenanceWindowDurationInHours", js.undefined)
    @scala.inline
    def setMaintenanceWindowStartTime(value: String): Self = this.set("maintenanceWindowStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceWindowStartTime: Self = this.set("maintenanceWindowStartTime", js.undefined)
    @scala.inline
    def setMiracastBlocked(value: Boolean): Self = this.set("miracastBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiracastBlocked: Self = this.set("miracastBlocked", js.undefined)
    @scala.inline
    def setMiracastChannel(value: MiracastChannel): Self = this.set("miracastChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiracastChannel: Self = this.set("miracastChannel", js.undefined)
    @scala.inline
    def setMiracastRequirePin(value: Boolean): Self = this.set("miracastRequirePin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiracastRequirePin: Self = this.set("miracastRequirePin", js.undefined)
    @scala.inline
    def setSettingsBlockMyMeetingsAndFiles(value: Boolean): Self = this.set("settingsBlockMyMeetingsAndFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsBlockMyMeetingsAndFiles: Self = this.set("settingsBlockMyMeetingsAndFiles", js.undefined)
    @scala.inline
    def setSettingsBlockSessionResume(value: Boolean): Self = this.set("settingsBlockSessionResume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsBlockSessionResume: Self = this.set("settingsBlockSessionResume", js.undefined)
    @scala.inline
    def setSettingsBlockSigninSuggestions(value: Boolean): Self = this.set("settingsBlockSigninSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsBlockSigninSuggestions: Self = this.set("settingsBlockSigninSuggestions", js.undefined)
    @scala.inline
    def setSettingsDefaultVolume(value: Double): Self = this.set("settingsDefaultVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsDefaultVolume: Self = this.set("settingsDefaultVolume", js.undefined)
    @scala.inline
    def setSettingsScreenTimeoutInMinutes(value: Double): Self = this.set("settingsScreenTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsScreenTimeoutInMinutes: Self = this.set("settingsScreenTimeoutInMinutes", js.undefined)
    @scala.inline
    def setSettingsSessionTimeoutInMinutes(value: Double): Self = this.set("settingsSessionTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsSessionTimeoutInMinutes: Self = this.set("settingsSessionTimeoutInMinutes", js.undefined)
    @scala.inline
    def setSettingsSleepTimeoutInMinutes(value: Double): Self = this.set("settingsSleepTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsSleepTimeoutInMinutes: Self = this.set("settingsSleepTimeoutInMinutes", js.undefined)
    @scala.inline
    def setWelcomeScreenBackgroundImageUrl(value: String): Self = this.set("welcomeScreenBackgroundImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWelcomeScreenBackgroundImageUrl: Self = this.set("welcomeScreenBackgroundImageUrl", js.undefined)
    @scala.inline
    def setWelcomeScreenBlockAutomaticWakeUp(value: Boolean): Self = this.set("welcomeScreenBlockAutomaticWakeUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWelcomeScreenBlockAutomaticWakeUp: Self = this.set("welcomeScreenBlockAutomaticWakeUp", js.undefined)
    @scala.inline
    def setWelcomeScreenMeetingInformation(value: WelcomeScreenMeetingInformation): Self = this.set("welcomeScreenMeetingInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWelcomeScreenMeetingInformation: Self = this.set("welcomeScreenMeetingInformation", js.undefined)
  }
  
}

