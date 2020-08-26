package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosManagedAppProtection extends TargetedManagedAppProtection {
  /**
    * Type of encryption which should be used for data in a managed app. Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.native
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.native
  /**
    * A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired
    * should be true.
    */
  var customBrowserProtocol: js.UndefOr[String] = js.native
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.native
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
  var faceIdBlocked: js.UndefOr[Boolean] = js.native
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredSdkVersion: js.UndefOr[String] = js.native
}

object IosManagedAppProtection {
  @scala.inline
  def apply(): IosManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosManagedAppProtection]
  }
  @scala.inline
  implicit class IosManagedAppProtectionOps[Self <: IosManagedAppProtection] (val x: Self) extends AnyVal {
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
    def setCustomBrowserProtocol(value: String): Self = this.set("customBrowserProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomBrowserProtocol: Self = this.set("customBrowserProtocol", js.undefined)
    @scala.inline
    def setDeployedAppCount(value: Double): Self = this.set("deployedAppCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployedAppCount: Self = this.set("deployedAppCount", js.undefined)
    @scala.inline
    def setDeploymentSummary(value: ManagedAppPolicyDeploymentSummary): Self = this.set("deploymentSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentSummary: Self = this.set("deploymentSummary", js.undefined)
    @scala.inline
    def setFaceIdBlocked(value: Boolean): Self = this.set("faceIdBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceIdBlocked: Self = this.set("faceIdBlocked", js.undefined)
    @scala.inline
    def setMinimumRequiredSdkVersion(value: String): Self = this.set("minimumRequiredSdkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumRequiredSdkVersion: Self = this.set("minimumRequiredSdkVersion", js.undefined)
  }
  
}

