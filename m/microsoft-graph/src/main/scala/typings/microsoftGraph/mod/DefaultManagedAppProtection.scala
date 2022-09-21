package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultManagedAppProtection
  extends StObject
     with ManagedAppProtection {
  
  /**
    * Type of encryption which should be used for data in a managed app. (iOS Only). Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.undefined
  
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[NullableOption[js.Array[ManagedMobileApp]]] = js.undefined
  
  // A set of string key and string value pairs to be sent to the affected users, unalterned by this service
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
  
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.undefined
  
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[NullableOption[ManagedAppPolicyDeploymentSummary]] = js.undefined
  
  // When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
  var disableAppEncryptionIfDeviceEncryptionIsEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether managed-app data should be encrypted. (Android only)
  var encryptAppData: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
  var faceIdBlocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android
    * only)
    */
  var minimumRequiredPatchVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
  var minimumRequiredSdkVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
  var minimumWarningPatchVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether screen capture is blocked. (Android only)
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
}
object DefaultManagedAppProtection {
  
  inline def apply(): DefaultManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultManagedAppProtection]
  }
  
  extension [Self <: DefaultManagedAppProtection](x: Self) {
    
    inline def setAppDataEncryptionType(value: ManagedAppDataEncryptionType): Self = StObject.set(x, "appDataEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setAppDataEncryptionTypeUndefined: Self = StObject.set(x, "appDataEncryptionType", js.undefined)
    
    inline def setApps(value: NullableOption[js.Array[ManagedMobileApp]]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsNull: Self = StObject.set(x, "apps", null)
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: ManagedMobileApp*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setCustomSettings(value: js.Array[KeyValuePair]): Self = StObject.set(x, "customSettings", value.asInstanceOf[js.Any])
    
    inline def setCustomSettingsUndefined: Self = StObject.set(x, "customSettings", js.undefined)
    
    inline def setCustomSettingsVarargs(value: KeyValuePair*): Self = StObject.set(x, "customSettings", js.Array(value*))
    
    inline def setDeployedAppCount(value: Double): Self = StObject.set(x, "deployedAppCount", value.asInstanceOf[js.Any])
    
    inline def setDeployedAppCountUndefined: Self = StObject.set(x, "deployedAppCount", js.undefined)
    
    inline def setDeploymentSummary(value: NullableOption[ManagedAppPolicyDeploymentSummary]): Self = StObject.set(x, "deploymentSummary", value.asInstanceOf[js.Any])
    
    inline def setDeploymentSummaryNull: Self = StObject.set(x, "deploymentSummary", null)
    
    inline def setDeploymentSummaryUndefined: Self = StObject.set(x, "deploymentSummary", js.undefined)
    
    inline def setDisableAppEncryptionIfDeviceEncryptionIsEnabled(value: Boolean): Self = StObject.set(x, "disableAppEncryptionIfDeviceEncryptionIsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDisableAppEncryptionIfDeviceEncryptionIsEnabledUndefined: Self = StObject.set(x, "disableAppEncryptionIfDeviceEncryptionIsEnabled", js.undefined)
    
    inline def setEncryptAppData(value: Boolean): Self = StObject.set(x, "encryptAppData", value.asInstanceOf[js.Any])
    
    inline def setEncryptAppDataUndefined: Self = StObject.set(x, "encryptAppData", js.undefined)
    
    inline def setFaceIdBlocked(value: Boolean): Self = StObject.set(x, "faceIdBlocked", value.asInstanceOf[js.Any])
    
    inline def setFaceIdBlockedUndefined: Self = StObject.set(x, "faceIdBlocked", js.undefined)
    
    inline def setMinimumRequiredPatchVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredPatchVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumRequiredPatchVersionNull: Self = StObject.set(x, "minimumRequiredPatchVersion", null)
    
    inline def setMinimumRequiredPatchVersionUndefined: Self = StObject.set(x, "minimumRequiredPatchVersion", js.undefined)
    
    inline def setMinimumRequiredSdkVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumRequiredSdkVersionNull: Self = StObject.set(x, "minimumRequiredSdkVersion", null)
    
    inline def setMinimumRequiredSdkVersionUndefined: Self = StObject.set(x, "minimumRequiredSdkVersion", js.undefined)
    
    inline def setMinimumWarningPatchVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumWarningPatchVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumWarningPatchVersionNull: Self = StObject.set(x, "minimumWarningPatchVersion", null)
    
    inline def setMinimumWarningPatchVersionUndefined: Self = StObject.set(x, "minimumWarningPatchVersion", js.undefined)
    
    inline def setScreenCaptureBlocked(value: Boolean): Self = StObject.set(x, "screenCaptureBlocked", value.asInstanceOf[js.Any])
    
    inline def setScreenCaptureBlockedUndefined: Self = StObject.set(x, "screenCaptureBlocked", js.undefined)
  }
}
