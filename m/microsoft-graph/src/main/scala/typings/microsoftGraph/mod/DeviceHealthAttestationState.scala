package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceHealthAttestationState extends StObject {
  
  /**
    * TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key
    * (EK) certificate.
    */
  var attestationIdentityKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // On or Off of BitLocker Drive Encryption
  var bitLockerStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The security version number of the Boot Application
  var bootAppSecurityVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When bootDebugging is enabled, the device is used in development and testing
  var bootDebugging: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The security version number of the Boot Application
  var bootManagerSecurityVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version of the Boot Manager
  var bootManagerVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Boot Revision List that was loaded during initial boot on the attested device
  var bootRevisionListInfo: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When code integrity is enabled, code execution is restricted to integrity verified code
  var codeIntegrity: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version of the Boot Manager
  var codeIntegrityCheckVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Code Integrity policy that is controlling the security of the boot environment
  var codeIntegrityPolicy: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The DHA report version. (Namespace version)
  var contentNamespaceUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The HealthAttestation state schema version
  var contentVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
  var dataExcutionPolicy: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The DHA report version. (Namespace version)
  var deviceHealthAttestationStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ELAM provides protection for the computers in your network when they start up
  var earlyLaunchAntiMalwareDriverProtection: js.UndefOr[NullableOption[String]] = js.undefined
  
  // This attribute indicates if DHA is supported for the device
  var healthAttestationSupportedStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // This attribute appears if DHA-Service detects an integrity issue
  var healthStatusMismatchInfo: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The DateTime when device was evaluated or issued to MDM
  var issuedDateTime: js.UndefOr[String] = js.undefined
  
  // The Timestamp of the last update.
  var lastUpdateDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When operatingSystemKernelDebugging is enabled, the device is used in development and testing
  var operatingSystemKernelDebugging: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Operating System Revision List that was loaded during initial boot on the attested device
  var operatingSystemRevListInfo: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The measurement that is captured in PCR[0]
  var pcr0: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Informational attribute that identifies the HASH algorithm that was used by TPM
  var pcrHashAlgorithm: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The number of times a PC device has hibernated or resumed
  var resetCount: js.UndefOr[Double] = js.undefined
  
  // The number of times a PC device has rebooted
  var restartCount: js.UndefOr[Double] = js.undefined
  
  // Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
  var safeMode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When Secure Boot is enabled, the core components must have the correct cryptographic signatures
  var secureBoot: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Fingerprint of the Custom Secure Boot Configuration Policy
  var secureBootConfigurationPolicyFingerPrint: js.UndefOr[NullableOption[String]] = js.undefined
  
  // When test signing is allowed, the device does not enforce signature validation during boot
  var testSigning: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The security version number of the Boot Application
  var tpmVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // VSM is a container that protects high value assets from a compromised kernel
  var virtualSecureMode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operating system running with limited services that is used to prepare a computer for Windows
  var windowsPE: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceHealthAttestationState {
  
  inline def apply(): DeviceHealthAttestationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceHealthAttestationState]
  }
  
  extension [Self <: DeviceHealthAttestationState](x: Self) {
    
    inline def setAttestationIdentityKey(value: NullableOption[String]): Self = StObject.set(x, "attestationIdentityKey", value.asInstanceOf[js.Any])
    
    inline def setAttestationIdentityKeyNull: Self = StObject.set(x, "attestationIdentityKey", null)
    
    inline def setAttestationIdentityKeyUndefined: Self = StObject.set(x, "attestationIdentityKey", js.undefined)
    
    inline def setBitLockerStatus(value: NullableOption[String]): Self = StObject.set(x, "bitLockerStatus", value.asInstanceOf[js.Any])
    
    inline def setBitLockerStatusNull: Self = StObject.set(x, "bitLockerStatus", null)
    
    inline def setBitLockerStatusUndefined: Self = StObject.set(x, "bitLockerStatus", js.undefined)
    
    inline def setBootAppSecurityVersion(value: NullableOption[String]): Self = StObject.set(x, "bootAppSecurityVersion", value.asInstanceOf[js.Any])
    
    inline def setBootAppSecurityVersionNull: Self = StObject.set(x, "bootAppSecurityVersion", null)
    
    inline def setBootAppSecurityVersionUndefined: Self = StObject.set(x, "bootAppSecurityVersion", js.undefined)
    
    inline def setBootDebugging(value: NullableOption[String]): Self = StObject.set(x, "bootDebugging", value.asInstanceOf[js.Any])
    
    inline def setBootDebuggingNull: Self = StObject.set(x, "bootDebugging", null)
    
    inline def setBootDebuggingUndefined: Self = StObject.set(x, "bootDebugging", js.undefined)
    
    inline def setBootManagerSecurityVersion(value: NullableOption[String]): Self = StObject.set(x, "bootManagerSecurityVersion", value.asInstanceOf[js.Any])
    
    inline def setBootManagerSecurityVersionNull: Self = StObject.set(x, "bootManagerSecurityVersion", null)
    
    inline def setBootManagerSecurityVersionUndefined: Self = StObject.set(x, "bootManagerSecurityVersion", js.undefined)
    
    inline def setBootManagerVersion(value: NullableOption[String]): Self = StObject.set(x, "bootManagerVersion", value.asInstanceOf[js.Any])
    
    inline def setBootManagerVersionNull: Self = StObject.set(x, "bootManagerVersion", null)
    
    inline def setBootManagerVersionUndefined: Self = StObject.set(x, "bootManagerVersion", js.undefined)
    
    inline def setBootRevisionListInfo(value: NullableOption[String]): Self = StObject.set(x, "bootRevisionListInfo", value.asInstanceOf[js.Any])
    
    inline def setBootRevisionListInfoNull: Self = StObject.set(x, "bootRevisionListInfo", null)
    
    inline def setBootRevisionListInfoUndefined: Self = StObject.set(x, "bootRevisionListInfo", js.undefined)
    
    inline def setCodeIntegrity(value: NullableOption[String]): Self = StObject.set(x, "codeIntegrity", value.asInstanceOf[js.Any])
    
    inline def setCodeIntegrityCheckVersion(value: NullableOption[String]): Self = StObject.set(x, "codeIntegrityCheckVersion", value.asInstanceOf[js.Any])
    
    inline def setCodeIntegrityCheckVersionNull: Self = StObject.set(x, "codeIntegrityCheckVersion", null)
    
    inline def setCodeIntegrityCheckVersionUndefined: Self = StObject.set(x, "codeIntegrityCheckVersion", js.undefined)
    
    inline def setCodeIntegrityNull: Self = StObject.set(x, "codeIntegrity", null)
    
    inline def setCodeIntegrityPolicy(value: NullableOption[String]): Self = StObject.set(x, "codeIntegrityPolicy", value.asInstanceOf[js.Any])
    
    inline def setCodeIntegrityPolicyNull: Self = StObject.set(x, "codeIntegrityPolicy", null)
    
    inline def setCodeIntegrityPolicyUndefined: Self = StObject.set(x, "codeIntegrityPolicy", js.undefined)
    
    inline def setCodeIntegrityUndefined: Self = StObject.set(x, "codeIntegrity", js.undefined)
    
    inline def setContentNamespaceUrl(value: NullableOption[String]): Self = StObject.set(x, "contentNamespaceUrl", value.asInstanceOf[js.Any])
    
    inline def setContentNamespaceUrlNull: Self = StObject.set(x, "contentNamespaceUrl", null)
    
    inline def setContentNamespaceUrlUndefined: Self = StObject.set(x, "contentNamespaceUrl", js.undefined)
    
    inline def setContentVersion(value: NullableOption[String]): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionNull: Self = StObject.set(x, "contentVersion", null)
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setDataExcutionPolicy(value: NullableOption[String]): Self = StObject.set(x, "dataExcutionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDataExcutionPolicyNull: Self = StObject.set(x, "dataExcutionPolicy", null)
    
    inline def setDataExcutionPolicyUndefined: Self = StObject.set(x, "dataExcutionPolicy", js.undefined)
    
    inline def setDeviceHealthAttestationStatus(value: NullableOption[String]): Self = StObject.set(x, "deviceHealthAttestationStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceHealthAttestationStatusNull: Self = StObject.set(x, "deviceHealthAttestationStatus", null)
    
    inline def setDeviceHealthAttestationStatusUndefined: Self = StObject.set(x, "deviceHealthAttestationStatus", js.undefined)
    
    inline def setEarlyLaunchAntiMalwareDriverProtection(value: NullableOption[String]): Self = StObject.set(x, "earlyLaunchAntiMalwareDriverProtection", value.asInstanceOf[js.Any])
    
    inline def setEarlyLaunchAntiMalwareDriverProtectionNull: Self = StObject.set(x, "earlyLaunchAntiMalwareDriverProtection", null)
    
    inline def setEarlyLaunchAntiMalwareDriverProtectionUndefined: Self = StObject.set(x, "earlyLaunchAntiMalwareDriverProtection", js.undefined)
    
    inline def setHealthAttestationSupportedStatus(value: NullableOption[String]): Self = StObject.set(x, "healthAttestationSupportedStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthAttestationSupportedStatusNull: Self = StObject.set(x, "healthAttestationSupportedStatus", null)
    
    inline def setHealthAttestationSupportedStatusUndefined: Self = StObject.set(x, "healthAttestationSupportedStatus", js.undefined)
    
    inline def setHealthStatusMismatchInfo(value: NullableOption[String]): Self = StObject.set(x, "healthStatusMismatchInfo", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusMismatchInfoNull: Self = StObject.set(x, "healthStatusMismatchInfo", null)
    
    inline def setHealthStatusMismatchInfoUndefined: Self = StObject.set(x, "healthStatusMismatchInfo", js.undefined)
    
    inline def setIssuedDateTime(value: String): Self = StObject.set(x, "issuedDateTime", value.asInstanceOf[js.Any])
    
    inline def setIssuedDateTimeUndefined: Self = StObject.set(x, "issuedDateTime", js.undefined)
    
    inline def setLastUpdateDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeNull: Self = StObject.set(x, "lastUpdateDateTime", null)
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    inline def setOperatingSystemKernelDebugging(value: NullableOption[String]): Self = StObject.set(x, "operatingSystemKernelDebugging", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemKernelDebuggingNull: Self = StObject.set(x, "operatingSystemKernelDebugging", null)
    
    inline def setOperatingSystemKernelDebuggingUndefined: Self = StObject.set(x, "operatingSystemKernelDebugging", js.undefined)
    
    inline def setOperatingSystemRevListInfo(value: NullableOption[String]): Self = StObject.set(x, "operatingSystemRevListInfo", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemRevListInfoNull: Self = StObject.set(x, "operatingSystemRevListInfo", null)
    
    inline def setOperatingSystemRevListInfoUndefined: Self = StObject.set(x, "operatingSystemRevListInfo", js.undefined)
    
    inline def setPcr0(value: NullableOption[String]): Self = StObject.set(x, "pcr0", value.asInstanceOf[js.Any])
    
    inline def setPcr0Null: Self = StObject.set(x, "pcr0", null)
    
    inline def setPcr0Undefined: Self = StObject.set(x, "pcr0", js.undefined)
    
    inline def setPcrHashAlgorithm(value: NullableOption[String]): Self = StObject.set(x, "pcrHashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPcrHashAlgorithmNull: Self = StObject.set(x, "pcrHashAlgorithm", null)
    
    inline def setPcrHashAlgorithmUndefined: Self = StObject.set(x, "pcrHashAlgorithm", js.undefined)
    
    inline def setResetCount(value: Double): Self = StObject.set(x, "resetCount", value.asInstanceOf[js.Any])
    
    inline def setResetCountUndefined: Self = StObject.set(x, "resetCount", js.undefined)
    
    inline def setRestartCount(value: Double): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
    
    inline def setRestartCountUndefined: Self = StObject.set(x, "restartCount", js.undefined)
    
    inline def setSafeMode(value: NullableOption[String]): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    inline def setSafeModeNull: Self = StObject.set(x, "safeMode", null)
    
    inline def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
    
    inline def setSecureBoot(value: NullableOption[String]): Self = StObject.set(x, "secureBoot", value.asInstanceOf[js.Any])
    
    inline def setSecureBootConfigurationPolicyFingerPrint(value: NullableOption[String]): Self = StObject.set(x, "secureBootConfigurationPolicyFingerPrint", value.asInstanceOf[js.Any])
    
    inline def setSecureBootConfigurationPolicyFingerPrintNull: Self = StObject.set(x, "secureBootConfigurationPolicyFingerPrint", null)
    
    inline def setSecureBootConfigurationPolicyFingerPrintUndefined: Self = StObject.set(x, "secureBootConfigurationPolicyFingerPrint", js.undefined)
    
    inline def setSecureBootNull: Self = StObject.set(x, "secureBoot", null)
    
    inline def setSecureBootUndefined: Self = StObject.set(x, "secureBoot", js.undefined)
    
    inline def setTestSigning(value: NullableOption[String]): Self = StObject.set(x, "testSigning", value.asInstanceOf[js.Any])
    
    inline def setTestSigningNull: Self = StObject.set(x, "testSigning", null)
    
    inline def setTestSigningUndefined: Self = StObject.set(x, "testSigning", js.undefined)
    
    inline def setTpmVersion(value: NullableOption[String]): Self = StObject.set(x, "tpmVersion", value.asInstanceOf[js.Any])
    
    inline def setTpmVersionNull: Self = StObject.set(x, "tpmVersion", null)
    
    inline def setTpmVersionUndefined: Self = StObject.set(x, "tpmVersion", js.undefined)
    
    inline def setVirtualSecureMode(value: NullableOption[String]): Self = StObject.set(x, "virtualSecureMode", value.asInstanceOf[js.Any])
    
    inline def setVirtualSecureModeNull: Self = StObject.set(x, "virtualSecureMode", null)
    
    inline def setVirtualSecureModeUndefined: Self = StObject.set(x, "virtualSecureMode", js.undefined)
    
    inline def setWindowsPE(value: NullableOption[String]): Self = StObject.set(x, "windowsPE", value.asInstanceOf[js.Any])
    
    inline def setWindowsPENull: Self = StObject.set(x, "windowsPE", null)
    
    inline def setWindowsPEUndefined: Self = StObject.set(x, "windowsPE", js.undefined)
  }
}
