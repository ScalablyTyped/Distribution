package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidManagedAppProtection
  extends StObject
     with TargetedManagedAppProtection {
  
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[NullableOption[js.Array[ManagedMobileApp]]] = js.undefined
  
  /**
    * Friendly name of the preferred custom browser to open weblink on Android. When this property is configured,
    * ManagedBrowserToOpenLinksRequired should be true.
    */
  var customBrowserDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Unique identifier of the preferred custom browser to open weblink on Android. When this property is configured,
    * ManagedBrowserToOpenLinksRequired should be true.
    */
  var customBrowserPackageId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.undefined
  
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[NullableOption[ManagedAppPolicyDeploymentSummary]] = js.undefined
  
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether application data for managed apps should be encrypted
  var encryptAppData: js.UndefOr[Boolean] = js.undefined
  
  // Define the oldest required Android security patch level a user can have to gain secure access to the app.
  var minimumRequiredPatchVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Define the oldest recommended Android security patch level a user can have for secure access to the app.
  var minimumWarningPatchVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether a managed user can take screen captures of managed apps
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
}
object AndroidManagedAppProtection {
  
  inline def apply(): AndroidManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidManagedAppProtection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidManagedAppProtection] (val x: Self) extends AnyVal {
    
    inline def setApps(value: NullableOption[js.Array[ManagedMobileApp]]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsNull: Self = StObject.set(x, "apps", null)
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: ManagedMobileApp*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setCustomBrowserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "customBrowserDisplayName", value.asInstanceOf[js.Any])
    
    inline def setCustomBrowserDisplayNameNull: Self = StObject.set(x, "customBrowserDisplayName", null)
    
    inline def setCustomBrowserDisplayNameUndefined: Self = StObject.set(x, "customBrowserDisplayName", js.undefined)
    
    inline def setCustomBrowserPackageId(value: NullableOption[String]): Self = StObject.set(x, "customBrowserPackageId", value.asInstanceOf[js.Any])
    
    inline def setCustomBrowserPackageIdNull: Self = StObject.set(x, "customBrowserPackageId", null)
    
    inline def setCustomBrowserPackageIdUndefined: Self = StObject.set(x, "customBrowserPackageId", js.undefined)
    
    inline def setDeployedAppCount(value: Double): Self = StObject.set(x, "deployedAppCount", value.asInstanceOf[js.Any])
    
    inline def setDeployedAppCountUndefined: Self = StObject.set(x, "deployedAppCount", js.undefined)
    
    inline def setDeploymentSummary(value: NullableOption[ManagedAppPolicyDeploymentSummary]): Self = StObject.set(x, "deploymentSummary", value.asInstanceOf[js.Any])
    
    inline def setDeploymentSummaryNull: Self = StObject.set(x, "deploymentSummary", null)
    
    inline def setDeploymentSummaryUndefined: Self = StObject.set(x, "deploymentSummary", js.undefined)
    
    inline def setDisableAppEncryptionIfDeviceEncryptionIsEnabled(value: Boolean): Self = StObject.set(x, "disableAppEncryptionIfDeviceEncryptionIsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDisableAppEncryptionIfDeviceEncryptionIsEnabledUndefined: Self = StObject.set(x, "disableAppEncryptionIfDeviceEncryptionIsEnabled", js.undefined)
    
    inline def setEncryptAppData(value: Boolean): Self = StObject.set(x, "encryptAppData", value.asInstanceOf[js.Any])
    
    inline def setEncryptAppDataUndefined: Self = StObject.set(x, "encryptAppData", js.undefined)
    
    inline def setMinimumRequiredPatchVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredPatchVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumRequiredPatchVersionNull: Self = StObject.set(x, "minimumRequiredPatchVersion", null)
    
    inline def setMinimumRequiredPatchVersionUndefined: Self = StObject.set(x, "minimumRequiredPatchVersion", js.undefined)
    
    inline def setMinimumWarningPatchVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumWarningPatchVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumWarningPatchVersionNull: Self = StObject.set(x, "minimumWarningPatchVersion", null)
    
    inline def setMinimumWarningPatchVersionUndefined: Self = StObject.set(x, "minimumWarningPatchVersion", js.undefined)
    
    inline def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    inline def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
  }
}
