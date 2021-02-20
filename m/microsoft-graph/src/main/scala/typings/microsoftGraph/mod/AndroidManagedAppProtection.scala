package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class AndroidManagedAppProtectionMutableBuilder[Self <: AndroidManagedAppProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: NullableOption[js.Array[ManagedMobileApp]]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsNull: Self = StObject.set(x, "apps", null)
    
    @scala.inline
    def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    @scala.inline
    def setAppsVarargs(value: ManagedMobileApp*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setCustomBrowserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "customBrowserDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBrowserDisplayNameNull: Self = StObject.set(x, "customBrowserDisplayName", null)
    
    @scala.inline
    def setCustomBrowserDisplayNameUndefined: Self = StObject.set(x, "customBrowserDisplayName", js.undefined)
    
    @scala.inline
    def setCustomBrowserPackageId(value: NullableOption[String]): Self = StObject.set(x, "customBrowserPackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBrowserPackageIdNull: Self = StObject.set(x, "customBrowserPackageId", null)
    
    @scala.inline
    def setCustomBrowserPackageIdUndefined: Self = StObject.set(x, "customBrowserPackageId", js.undefined)
    
    @scala.inline
    def setDeployedAppCount(value: Double): Self = StObject.set(x, "deployedAppCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedAppCountUndefined: Self = StObject.set(x, "deployedAppCount", js.undefined)
    
    @scala.inline
    def setDeploymentSummary(value: NullableOption[ManagedAppPolicyDeploymentSummary]): Self = StObject.set(x, "deploymentSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentSummaryNull: Self = StObject.set(x, "deploymentSummary", null)
    
    @scala.inline
    def setDeploymentSummaryUndefined: Self = StObject.set(x, "deploymentSummary", js.undefined)
    
    @scala.inline
    def setDisableAppEncryptionIfDeviceEncryptionIsEnabled(value: Boolean): Self = StObject.set(x, "disableAppEncryptionIfDeviceEncryptionIsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAppEncryptionIfDeviceEncryptionIsEnabledUndefined: Self = StObject.set(x, "disableAppEncryptionIfDeviceEncryptionIsEnabled", js.undefined)
    
    @scala.inline
    def setEncryptAppData(value: Boolean): Self = StObject.set(x, "encryptAppData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptAppDataUndefined: Self = StObject.set(x, "encryptAppData", js.undefined)
    
    @scala.inline
    def setMinimumRequiredPatchVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredPatchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRequiredPatchVersionNull: Self = StObject.set(x, "minimumRequiredPatchVersion", null)
    
    @scala.inline
    def setMinimumRequiredPatchVersionUndefined: Self = StObject.set(x, "minimumRequiredPatchVersion", js.undefined)
    
    @scala.inline
    def setMinimumWarningPatchVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumWarningPatchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWarningPatchVersionNull: Self = StObject.set(x, "minimumWarningPatchVersion", null)
    
    @scala.inline
    def setMinimumWarningPatchVersionUndefined: Self = StObject.set(x, "minimumWarningPatchVersion", js.undefined)
    
    @scala.inline
    def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
  }
}
