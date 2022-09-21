package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosManagedAppProtection
  extends StObject
     with TargetedManagedAppProtection {
  
  /**
    * Type of encryption which should be used for data in a managed app. Possible values are: useDeviceSettings,
    * afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
    */
  var appDataEncryptionType: js.UndefOr[ManagedAppDataEncryptionType] = js.undefined
  
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[NullableOption[js.Array[ManagedMobileApp]]] = js.undefined
  
  /**
    * A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired
    * should be true.
    */
  var customBrowserProtocol: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.undefined
  
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[NullableOption[ManagedAppPolicyDeploymentSummary]] = js.undefined
  
  // Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.
  var faceIdBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Versions less than the specified version will block the managed app from accessing company data.
  var minimumRequiredSdkVersion: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosManagedAppProtection {
  
  inline def apply(): IosManagedAppProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosManagedAppProtection]
  }
  
  extension [Self <: IosManagedAppProtection](x: Self) {
    
    inline def setAppDataEncryptionType(value: ManagedAppDataEncryptionType): Self = StObject.set(x, "appDataEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setAppDataEncryptionTypeUndefined: Self = StObject.set(x, "appDataEncryptionType", js.undefined)
    
    inline def setApps(value: NullableOption[js.Array[ManagedMobileApp]]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsNull: Self = StObject.set(x, "apps", null)
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: ManagedMobileApp*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setCustomBrowserProtocol(value: NullableOption[String]): Self = StObject.set(x, "customBrowserProtocol", value.asInstanceOf[js.Any])
    
    inline def setCustomBrowserProtocolNull: Self = StObject.set(x, "customBrowserProtocol", null)
    
    inline def setCustomBrowserProtocolUndefined: Self = StObject.set(x, "customBrowserProtocol", js.undefined)
    
    inline def setDeployedAppCount(value: Double): Self = StObject.set(x, "deployedAppCount", value.asInstanceOf[js.Any])
    
    inline def setDeployedAppCountUndefined: Self = StObject.set(x, "deployedAppCount", js.undefined)
    
    inline def setDeploymentSummary(value: NullableOption[ManagedAppPolicyDeploymentSummary]): Self = StObject.set(x, "deploymentSummary", value.asInstanceOf[js.Any])
    
    inline def setDeploymentSummaryNull: Self = StObject.set(x, "deploymentSummary", null)
    
    inline def setDeploymentSummaryUndefined: Self = StObject.set(x, "deploymentSummary", js.undefined)
    
    inline def setFaceIdBlocked(value: Boolean): Self = StObject.set(x, "faceIdBlocked", value.asInstanceOf[js.Any])
    
    inline def setFaceIdBlockedUndefined: Self = StObject.set(x, "faceIdBlocked", js.undefined)
    
    inline def setMinimumRequiredSdkVersion(value: NullableOption[String]): Self = StObject.set(x, "minimumRequiredSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumRequiredSdkVersionNull: Self = StObject.set(x, "minimumRequiredSdkVersion", null)
    
    inline def setMinimumRequiredSdkVersionUndefined: Self = StObject.set(x, "minimumRequiredSdkVersion", js.undefined)
  }
}
