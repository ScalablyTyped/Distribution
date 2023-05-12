package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEvidence
  extends StObject
     with AlertEvidence {
  
  // A unique identifier assigned to a device by Azure Active Directory (Azure AD) when device is Azure AD-joined.
  var azureAdDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * State of the Defender AntiMalware engine. The possible values are: notReporting, disabled, notUpdated, updated,
    * unknown, notSupported, unknownFutureValue.
    */
  var defenderAvStatus: js.UndefOr[NullableOption[DefenderAvStatus]] = js.undefined
  
  // The fully qualified domain name (FQDN) for the device.
  var deviceDnsName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time when the device was first seen.
  var firstSeenDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The health state of the device.The possible values are: active, inactive, impairedCommunication, noSensorData,
    * noSensorDataImpairedCommunication, unknown, unknownFutureValue.
    */
  var healthStatus: js.UndefOr[NullableOption[DeviceHealthStatus]] = js.undefined
  
  // Users that were logged on the machine during the time of the alert.
  var loggedOnUsers: js.UndefOr[NullableOption[js.Array[LoggedOnUser]]] = js.undefined
  
  // A unique identifier assigned to a device by Microsoft Defender for Endpoint.
  var mdeDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The status of the machine onboarding to Microsoft Defender for Endpoint.The possible values are: insufficientInfo,
    * onboarded, canBeOnboarded, unsupported, unknownFutureValue.
    */
  var onboardingStatus: js.UndefOr[NullableOption[OnboardingStatus]] = js.undefined
  
  // The build version for the operating system the device is running.
  var osBuild: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The operating system platform the device is running.
  var osPlatform: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the role-based access control (RBAC) device group.
  var rbacGroupId: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The name of the RBAC device group.
  var rbacGroupName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Risk score as evaluated by Microsoft Defender for Endpoint. The possible values are: none, informational, low, medium,
    * high, unknownFutureValue.
    */
  var riskScore: js.UndefOr[NullableOption[DeviceRiskScore]] = js.undefined
  
  // The version of the operating system platform.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Metadata of the virtual machine (VM) on which Microsoft Defender for Endpoint is running.
  var vmMetadata: js.UndefOr[NullableOption[VmMetadata]] = js.undefined
}
object DeviceEvidence {
  
  inline def apply(): DeviceEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceEvidence] (val x: Self) extends AnyVal {
    
    inline def setAzureAdDeviceId(value: NullableOption[String]): Self = StObject.set(x, "azureAdDeviceId", value.asInstanceOf[js.Any])
    
    inline def setAzureAdDeviceIdNull: Self = StObject.set(x, "azureAdDeviceId", null)
    
    inline def setAzureAdDeviceIdUndefined: Self = StObject.set(x, "azureAdDeviceId", js.undefined)
    
    inline def setDefenderAvStatus(value: NullableOption[DefenderAvStatus]): Self = StObject.set(x, "defenderAvStatus", value.asInstanceOf[js.Any])
    
    inline def setDefenderAvStatusNull: Self = StObject.set(x, "defenderAvStatus", null)
    
    inline def setDefenderAvStatusUndefined: Self = StObject.set(x, "defenderAvStatus", js.undefined)
    
    inline def setDeviceDnsName(value: NullableOption[String]): Self = StObject.set(x, "deviceDnsName", value.asInstanceOf[js.Any])
    
    inline def setDeviceDnsNameNull: Self = StObject.set(x, "deviceDnsName", null)
    
    inline def setDeviceDnsNameUndefined: Self = StObject.set(x, "deviceDnsName", js.undefined)
    
    inline def setFirstSeenDateTime(value: NullableOption[String]): Self = StObject.set(x, "firstSeenDateTime", value.asInstanceOf[js.Any])
    
    inline def setFirstSeenDateTimeNull: Self = StObject.set(x, "firstSeenDateTime", null)
    
    inline def setFirstSeenDateTimeUndefined: Self = StObject.set(x, "firstSeenDateTime", js.undefined)
    
    inline def setHealthStatus(value: NullableOption[DeviceHealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusNull: Self = StObject.set(x, "healthStatus", null)
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setLoggedOnUsers(value: NullableOption[js.Array[LoggedOnUser]]): Self = StObject.set(x, "loggedOnUsers", value.asInstanceOf[js.Any])
    
    inline def setLoggedOnUsersNull: Self = StObject.set(x, "loggedOnUsers", null)
    
    inline def setLoggedOnUsersUndefined: Self = StObject.set(x, "loggedOnUsers", js.undefined)
    
    inline def setLoggedOnUsersVarargs(value: LoggedOnUser*): Self = StObject.set(x, "loggedOnUsers", js.Array(value*))
    
    inline def setMdeDeviceId(value: NullableOption[String]): Self = StObject.set(x, "mdeDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMdeDeviceIdNull: Self = StObject.set(x, "mdeDeviceId", null)
    
    inline def setMdeDeviceIdUndefined: Self = StObject.set(x, "mdeDeviceId", js.undefined)
    
    inline def setOnboardingStatus(value: NullableOption[OnboardingStatus]): Self = StObject.set(x, "onboardingStatus", value.asInstanceOf[js.Any])
    
    inline def setOnboardingStatusNull: Self = StObject.set(x, "onboardingStatus", null)
    
    inline def setOnboardingStatusUndefined: Self = StObject.set(x, "onboardingStatus", js.undefined)
    
    inline def setOsBuild(value: NullableOption[Double]): Self = StObject.set(x, "osBuild", value.asInstanceOf[js.Any])
    
    inline def setOsBuildNull: Self = StObject.set(x, "osBuild", null)
    
    inline def setOsBuildUndefined: Self = StObject.set(x, "osBuild", js.undefined)
    
    inline def setOsPlatform(value: NullableOption[String]): Self = StObject.set(x, "osPlatform", value.asInstanceOf[js.Any])
    
    inline def setOsPlatformNull: Self = StObject.set(x, "osPlatform", null)
    
    inline def setOsPlatformUndefined: Self = StObject.set(x, "osPlatform", js.undefined)
    
    inline def setRbacGroupId(value: NullableOption[Double]): Self = StObject.set(x, "rbacGroupId", value.asInstanceOf[js.Any])
    
    inline def setRbacGroupIdNull: Self = StObject.set(x, "rbacGroupId", null)
    
    inline def setRbacGroupIdUndefined: Self = StObject.set(x, "rbacGroupId", js.undefined)
    
    inline def setRbacGroupName(value: NullableOption[String]): Self = StObject.set(x, "rbacGroupName", value.asInstanceOf[js.Any])
    
    inline def setRbacGroupNameNull: Self = StObject.set(x, "rbacGroupName", null)
    
    inline def setRbacGroupNameUndefined: Self = StObject.set(x, "rbacGroupName", js.undefined)
    
    inline def setRiskScore(value: NullableOption[DeviceRiskScore]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    inline def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    inline def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVmMetadata(value: NullableOption[VmMetadata]): Self = StObject.set(x, "vmMetadata", value.asInstanceOf[js.Any])
    
    inline def setVmMetadataNull: Self = StObject.set(x, "vmMetadata", null)
    
    inline def setVmMetadataUndefined: Self = StObject.set(x, "vmMetadata", js.undefined)
  }
}
