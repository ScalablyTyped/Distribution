package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultManagedAppProtection extends ManagedAppProtection {
  /**
    * Type of encryption which should be used for data in a managed app. (iOS Only). Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.native
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.native
  // A set of string key and string value pairs to be sent to the affected users, unalterned by this service
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.native
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.native
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.native
  // Indicates whether managed-app data should be encrypted. (Android only)
  var encryptAppData: js.UndefOr[Boolean] = js.native
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
  var faceIdBlocked: js.UndefOr[Boolean] = js.native
  /**
    * Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android
    * only)
    */
  var minimumRequiredPatchVersion: js.UndefOr[String] = js.native
  // Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
  var minimumRequiredSdkVersion: js.UndefOr[String] = js.native
  // Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
  var minimumWarningPatchVersion: js.UndefOr[String] = js.native
  // Indicates whether screen capture is blocked. (Android only)
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
}

object DefaultManagedAppProtection {
  @scala.inline
  def apply(): DefaultManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultManagedAppProtection]
  }
  @scala.inline
  implicit class DefaultManagedAppProtectionOps[Self <: DefaultManagedAppProtection] (val x: Self) extends AnyVal {
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
    def setAppDataEncryptionType(value: ManagedAppDataEncryptionType): Self = this.set("appDataEncryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppDataEncryptionType: Self = this.set("appDataEncryptionType", js.undefined)
    @scala.inline
    def setAppsVarargs(value: ManagedMobileApp*): Self = this.set("apps", js.Array(value :_*))
    @scala.inline
    def setApps(value: js.Array[ManagedMobileApp]): Self = this.set("apps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
    @scala.inline
    def setCustomSettingsVarargs(value: KeyValuePair*): Self = this.set("customSettings", js.Array(value :_*))
    @scala.inline
    def setCustomSettings(value: js.Array[KeyValuePair]): Self = this.set("customSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSettings: Self = this.set("customSettings", js.undefined)
    @scala.inline
    def setDeployedAppCount(value: Double): Self = this.set("deployedAppCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployedAppCount: Self = this.set("deployedAppCount", js.undefined)
    @scala.inline
    def setDeploymentSummary(value: ManagedAppPolicyDeploymentSummary): Self = this.set("deploymentSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentSummary: Self = this.set("deploymentSummary", js.undefined)
    @scala.inline
    def setDisableAppEncryptionIfDeviceEncryptionIsEnabled(value: Boolean): Self = this.set("disableAppEncryptionIfDeviceEncryptionIsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAppEncryptionIfDeviceEncryptionIsEnabled: Self = this.set("disableAppEncryptionIfDeviceEncryptionIsEnabled", js.undefined)
    @scala.inline
    def setEncryptAppData(value: Boolean): Self = this.set("encryptAppData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptAppData: Self = this.set("encryptAppData", js.undefined)
    @scala.inline
    def setFaceIdBlocked(value: Boolean): Self = this.set("faceIdBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceIdBlocked: Self = this.set("faceIdBlocked", js.undefined)
    @scala.inline
    def setMinimumRequiredPatchVersion(value: String): Self = this.set("minimumRequiredPatchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumRequiredPatchVersion: Self = this.set("minimumRequiredPatchVersion", js.undefined)
    @scala.inline
    def setMinimumRequiredSdkVersion(value: String): Self = this.set("minimumRequiredSdkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumRequiredSdkVersion: Self = this.set("minimumRequiredSdkVersion", js.undefined)
    @scala.inline
    def setMinimumWarningPatchVersion(value: String): Self = this.set("minimumWarningPatchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumWarningPatchVersion: Self = this.set("minimumWarningPatchVersion", js.undefined)
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = this.set("screenCaptureBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenCaptureBlocked: Self = this.set("screenCaptureBlocked", js.undefined)
  }
  
}

