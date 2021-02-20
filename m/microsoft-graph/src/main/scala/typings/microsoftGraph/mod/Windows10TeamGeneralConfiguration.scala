package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows10TeamGeneralConfiguration extends DeviceConfiguration {
  
  // Indicates whether or not to Block Azure Operational Insights.
  var azureOperationalInsightsBlockTelemetry: js.UndefOr[Boolean] = js.native
  
  // The Azure Operational Insights workspace id.
  var azureOperationalInsightsWorkspaceId: js.UndefOr[NullableOption[String]] = js.native
  
  // The Azure Operational Insights Workspace key.
  var azureOperationalInsightsWorkspaceKey: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies whether to automatically launch the Connect app whenever a projection is initiated.
  var connectAppBlockAutoLaunch: js.UndefOr[Boolean] = js.native
  
  // Indicates whether or not to Block setting a maintenance window for device updates.
  var maintenanceWindowBlocked: js.UndefOr[Boolean] = js.native
  
  // Maintenance window duration for device updates. Valid values 0 to 5
  var maintenanceWindowDurationInHours: js.UndefOr[NullableOption[Double]] = js.native
  
  // Maintenance window start time for device updates.
  var maintenanceWindowStartTime: js.UndefOr[NullableOption[String]] = js.native
  
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
  var settingsDefaultVolume: js.UndefOr[NullableOption[Double]] = js.native
  
  // Specifies the number of minutes until the Hub screen turns off.
  var settingsScreenTimeoutInMinutes: js.UndefOr[NullableOption[Double]] = js.native
  
  // Specifies the number of minutes until the session times out.
  var settingsSessionTimeoutInMinutes: js.UndefOr[NullableOption[Double]] = js.native
  
  // Specifies the number of minutes until the Hub enters sleep mode.
  var settingsSleepTimeoutInMinutes: js.UndefOr[NullableOption[Double]] = js.native
  
  // The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.
  var welcomeScreenBackgroundImageUrl: js.UndefOr[NullableOption[String]] = js.native
  
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
  implicit class Windows10TeamGeneralConfigurationMutableBuilder[Self <: Windows10TeamGeneralConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAzureOperationalInsightsBlockTelemetry(value: Boolean): Self = StObject.set(x, "azureOperationalInsightsBlockTelemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureOperationalInsightsBlockTelemetryUndefined: Self = StObject.set(x, "azureOperationalInsightsBlockTelemetry", js.undefined)
    
    @scala.inline
    def setAzureOperationalInsightsWorkspaceId(value: NullableOption[String]): Self = StObject.set(x, "azureOperationalInsightsWorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureOperationalInsightsWorkspaceIdNull: Self = StObject.set(x, "azureOperationalInsightsWorkspaceId", null)
    
    @scala.inline
    def setAzureOperationalInsightsWorkspaceIdUndefined: Self = StObject.set(x, "azureOperationalInsightsWorkspaceId", js.undefined)
    
    @scala.inline
    def setAzureOperationalInsightsWorkspaceKey(value: NullableOption[String]): Self = StObject.set(x, "azureOperationalInsightsWorkspaceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureOperationalInsightsWorkspaceKeyNull: Self = StObject.set(x, "azureOperationalInsightsWorkspaceKey", null)
    
    @scala.inline
    def setAzureOperationalInsightsWorkspaceKeyUndefined: Self = StObject.set(x, "azureOperationalInsightsWorkspaceKey", js.undefined)
    
    @scala.inline
    def setConnectAppBlockAutoLaunch(value: Boolean): Self = StObject.set(x, "connectAppBlockAutoLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectAppBlockAutoLaunchUndefined: Self = StObject.set(x, "connectAppBlockAutoLaunch", js.undefined)
    
    @scala.inline
    def setMaintenanceWindowBlocked(value: Boolean): Self = StObject.set(x, "maintenanceWindowBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowBlockedUndefined: Self = StObject.set(x, "maintenanceWindowBlocked", js.undefined)
    
    @scala.inline
    def setMaintenanceWindowDurationInHours(value: NullableOption[Double]): Self = StObject.set(x, "maintenanceWindowDurationInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowDurationInHoursNull: Self = StObject.set(x, "maintenanceWindowDurationInHours", null)
    
    @scala.inline
    def setMaintenanceWindowDurationInHoursUndefined: Self = StObject.set(x, "maintenanceWindowDurationInHours", js.undefined)
    
    @scala.inline
    def setMaintenanceWindowStartTime(value: NullableOption[String]): Self = StObject.set(x, "maintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowStartTimeNull: Self = StObject.set(x, "maintenanceWindowStartTime", null)
    
    @scala.inline
    def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "maintenanceWindowStartTime", js.undefined)
    
    @scala.inline
    def setMiracastBlocked(value: Boolean): Self = StObject.set(x, "miracastBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiracastBlockedUndefined: Self = StObject.set(x, "miracastBlocked", js.undefined)
    
    @scala.inline
    def setMiracastChannel(value: MiracastChannel): Self = StObject.set(x, "miracastChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiracastChannelUndefined: Self = StObject.set(x, "miracastChannel", js.undefined)
    
    @scala.inline
    def setMiracastRequirePin(value: Boolean): Self = StObject.set(x, "miracastRequirePin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiracastRequirePinUndefined: Self = StObject.set(x, "miracastRequirePin", js.undefined)
    
    @scala.inline
    def setSettingsBlockMyMeetingsAndFiles(value: Boolean): Self = StObject.set(x, "settingsBlockMyMeetingsAndFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockMyMeetingsAndFilesUndefined: Self = StObject.set(x, "settingsBlockMyMeetingsAndFiles", js.undefined)
    
    @scala.inline
    def setSettingsBlockSessionResume(value: Boolean): Self = StObject.set(x, "settingsBlockSessionResume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockSessionResumeUndefined: Self = StObject.set(x, "settingsBlockSessionResume", js.undefined)
    
    @scala.inline
    def setSettingsBlockSigninSuggestions(value: Boolean): Self = StObject.set(x, "settingsBlockSigninSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsBlockSigninSuggestionsUndefined: Self = StObject.set(x, "settingsBlockSigninSuggestions", js.undefined)
    
    @scala.inline
    def setSettingsDefaultVolume(value: NullableOption[Double]): Self = StObject.set(x, "settingsDefaultVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsDefaultVolumeNull: Self = StObject.set(x, "settingsDefaultVolume", null)
    
    @scala.inline
    def setSettingsDefaultVolumeUndefined: Self = StObject.set(x, "settingsDefaultVolume", js.undefined)
    
    @scala.inline
    def setSettingsScreenTimeoutInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "settingsScreenTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsScreenTimeoutInMinutesNull: Self = StObject.set(x, "settingsScreenTimeoutInMinutes", null)
    
    @scala.inline
    def setSettingsScreenTimeoutInMinutesUndefined: Self = StObject.set(x, "settingsScreenTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setSettingsSessionTimeoutInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "settingsSessionTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsSessionTimeoutInMinutesNull: Self = StObject.set(x, "settingsSessionTimeoutInMinutes", null)
    
    @scala.inline
    def setSettingsSessionTimeoutInMinutesUndefined: Self = StObject.set(x, "settingsSessionTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setSettingsSleepTimeoutInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "settingsSleepTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsSleepTimeoutInMinutesNull: Self = StObject.set(x, "settingsSleepTimeoutInMinutes", null)
    
    @scala.inline
    def setSettingsSleepTimeoutInMinutesUndefined: Self = StObject.set(x, "settingsSleepTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setWelcomeScreenBackgroundImageUrl(value: NullableOption[String]): Self = StObject.set(x, "welcomeScreenBackgroundImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomeScreenBackgroundImageUrlNull: Self = StObject.set(x, "welcomeScreenBackgroundImageUrl", null)
    
    @scala.inline
    def setWelcomeScreenBackgroundImageUrlUndefined: Self = StObject.set(x, "welcomeScreenBackgroundImageUrl", js.undefined)
    
    @scala.inline
    def setWelcomeScreenBlockAutomaticWakeUp(value: Boolean): Self = StObject.set(x, "welcomeScreenBlockAutomaticWakeUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomeScreenBlockAutomaticWakeUpUndefined: Self = StObject.set(x, "welcomeScreenBlockAutomaticWakeUp", js.undefined)
    
    @scala.inline
    def setWelcomeScreenMeetingInformation(value: WelcomeScreenMeetingInformation): Self = StObject.set(x, "welcomeScreenMeetingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomeScreenMeetingInformationUndefined: Self = StObject.set(x, "welcomeScreenMeetingInformation", js.undefined)
  }
}
