package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidManagedAppProtection extends TargetedManagedAppProtection {
  
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[NullableOption[js.Array[ManagedMobileApp]]] = js.native
  
  /**
    * Friendly name of the preferred custom browser to open weblink on Android. When this property is configured,
    * ManagedBrowserToOpenLinksRequired should be true.
    */
  var customBrowserDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Unique identifier of the preferred custom browser to open weblink on Android. When this property is configured,
    * ManagedBrowserToOpenLinksRequired should be true.
    */
  var customBrowserPackageId: js.UndefOr[NullableOption[String]] = js.native
  
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[NullableOption[ManagedAppPolicyDeploymentSummary]] = js.native
  
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.native
  
  // Indicates whether application data for managed apps should be encrypted
  var encryptAppData: js.UndefOr[Boolean] = js.native
  
  // Define the oldest required Android security patch level a user can have to gain secure access to the app.
  var minimumRequiredPatchVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Define the oldest recommended Android security patch level a user can have for secure access to the app.
  var minimumWarningPatchVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates whether a managed user can take screen captures of managed apps
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.native
}
object AndroidManagedAppProtection {
  
  @scala.inline
  def apply(): AndroidManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidManagedAppProtection]
  }
  
  @scala.inline
  implicit class AndroidManagedAppProtectionOps[Self <: AndroidManagedAppProtection] (val x: Self) extends AnyVal {
    
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
    def setAppsVarargs(value: ManagedMobileApp*): Self = this.set("apps", js.Array(value :_*))
    
    @scala.inline
    def setApps(value: NullableOption[js.Array[ManagedMobileApp]]): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApps: Self = this.set("apps", js.undefined)
    
    @scala.inline
    def setAppsNull: Self = this.set("apps", null)
    
    @scala.inline
    def setCustomBrowserDisplayName(value: NullableOption[String]): Self = this.set("customBrowserDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBrowserDisplayName: Self = this.set("customBrowserDisplayName", js.undefined)
    
    @scala.inline
    def setCustomBrowserDisplayNameNull: Self = this.set("customBrowserDisplayName", null)
    
    @scala.inline
    def setCustomBrowserPackageId(value: NullableOption[String]): Self = this.set("customBrowserPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBrowserPackageId: Self = this.set("customBrowserPackageId", js.undefined)
    
    @scala.inline
    def setCustomBrowserPackageIdNull: Self = this.set("customBrowserPackageId", null)
    
    @scala.inline
    def setDeployedAppCount(value: Double): Self = this.set("deployedAppCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployedAppCount: Self = this.set("deployedAppCount", js.undefined)
    
    @scala.inline
    def setDeploymentSummary(value: NullableOption[ManagedAppPolicyDeploymentSummary]): Self = this.set("deploymentSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentSummary: Self = this.set("deploymentSummary", js.undefined)
    
    @scala.inline
    def setDeploymentSummaryNull: Self = this.set("deploymentSummary", null)
    
    @scala.inline
    def setDisableAppEncryptionIfDeviceEncryptionIsEnabled(value: Boolean): Self = this.set("disableAppEncryptionIfDeviceEncryptionIsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAppEncryptionIfDeviceEncryptionIsEnabled: Self = this.set("disableAppEncryptionIfDeviceEncryptionIsEnabled", js.undefined)
    
    @scala.inline
    def setEncryptAppData(value: Boolean): Self = this.set("encryptAppData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptAppData: Self = this.set("encryptAppData", js.undefined)
    
    @scala.inline
    def setMinimumRequiredPatchVersion(value: NullableOption[String]): Self = this.set("minimumRequiredPatchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumRequiredPatchVersion: Self = this.set("minimumRequiredPatchVersion", js.undefined)
    
    @scala.inline
    def setMinimumRequiredPatchVersionNull: Self = this.set("minimumRequiredPatchVersion", null)
    
    @scala.inline
    def setMinimumWarningPatchVersion(value: NullableOption[String]): Self = this.set("minimumWarningPatchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumWarningPatchVersion: Self = this.set("minimumWarningPatchVersion", js.undefined)
    
    @scala.inline
    def setMinimumWarningPatchVersionNull: Self = this.set("minimumWarningPatchVersion", null)
    
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = this.set("screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenCaptureBlocked: Self = this.set("screenCaptureBlocked", js.undefined)
  }
}
