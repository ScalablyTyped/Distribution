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
  
  @scala.inline
  def apply(): DeviceHealthAttestationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceHealthAttestationState]
  }
  
  @scala.inline
  implicit class DeviceHealthAttestationStateMutableBuilder[Self <: DeviceHealthAttestationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttestationIdentityKey(value: NullableOption[String]): Self = StObject.set(x, "attestationIdentityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttestationIdentityKeyNull: Self = StObject.set(x, "attestationIdentityKey", null)
    
    @scala.inline
    def setAttestationIdentityKeyUndefined: Self = StObject.set(x, "attestationIdentityKey", js.undefined)
    
    @scala.inline
    def setBitLockerStatus(value: NullableOption[String]): Self = StObject.set(x, "bitLockerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitLockerStatusNull: Self = StObject.set(x, "bitLockerStatus", null)
    
    @scala.inline
    def setBitLockerStatusUndefined: Self = StObject.set(x, "bitLockerStatus", js.undefined)
    
    @scala.inline
    def setBootAppSecurityVersion(value: NullableOption[String]): Self = StObject.set(x, "bootAppSecurityVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootAppSecurityVersionNull: Self = StObject.set(x, "bootAppSecurityVersion", null)
    
    @scala.inline
    def setBootAppSecurityVersionUndefined: Self = StObject.set(x, "bootAppSecurityVersion", js.undefined)
    
    @scala.inline
    def setBootDebugging(value: NullableOption[String]): Self = StObject.set(x, "bootDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDebuggingNull: Self = StObject.set(x, "bootDebugging", null)
    
    @scala.inline
    def setBootDebuggingUndefined: Self = StObject.set(x, "bootDebugging", js.undefined)
    
    @scala.inline
    def setBootManagerSecurityVersion(value: NullableOption[String]): Self = StObject.set(x, "bootManagerSecurityVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootManagerSecurityVersionNull: Self = StObject.set(x, "bootManagerSecurityVersion", null)
    
    @scala.inline
    def setBootManagerSecurityVersionUndefined: Self = StObject.set(x, "bootManagerSecurityVersion", js.undefined)
    
    @scala.inline
    def setBootManagerVersion(value: NullableOption[String]): Self = StObject.set(x, "bootManagerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootManagerVersionNull: Self = StObject.set(x, "bootManagerVersion", null)
    
    @scala.inline
    def setBootManagerVersionUndefined: Self = StObject.set(x, "bootManagerVersion", js.undefined)
    
    @scala.inline
    def setBootRevisionListInfo(value: NullableOption[String]): Self = StObject.set(x, "bootRevisionListInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootRevisionListInfoNull: Self = StObject.set(x, "bootRevisionListInfo", null)
    
    @scala.inline
    def setBootRevisionListInfoUndefined: Self = StObject.set(x, "bootRevisionListInfo", js.undefined)
    
    @scala.inline
    def setCodeIntegrity(value: NullableOption[String]): Self = StObject.set(x, "codeIntegrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeIntegrityCheckVersion(value: NullableOption[String]): Self = StObject.set(x, "codeIntegrityCheckVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeIntegrityCheckVersionNull: Self = StObject.set(x, "codeIntegrityCheckVersion", null)
    
    @scala.inline
    def setCodeIntegrityCheckVersionUndefined: Self = StObject.set(x, "codeIntegrityCheckVersion", js.undefined)
    
    @scala.inline
    def setCodeIntegrityNull: Self = StObject.set(x, "codeIntegrity", null)
    
    @scala.inline
    def setCodeIntegrityPolicy(value: NullableOption[String]): Self = StObject.set(x, "codeIntegrityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeIntegrityPolicyNull: Self = StObject.set(x, "codeIntegrityPolicy", null)
    
    @scala.inline
    def setCodeIntegrityPolicyUndefined: Self = StObject.set(x, "codeIntegrityPolicy", js.undefined)
    
    @scala.inline
    def setCodeIntegrityUndefined: Self = StObject.set(x, "codeIntegrity", js.undefined)
    
    @scala.inline
    def setContentNamespaceUrl(value: NullableOption[String]): Self = StObject.set(x, "contentNamespaceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNamespaceUrlNull: Self = StObject.set(x, "contentNamespaceUrl", null)
    
    @scala.inline
    def setContentNamespaceUrlUndefined: Self = StObject.set(x, "contentNamespaceUrl", js.undefined)
    
    @scala.inline
    def setContentVersion(value: NullableOption[String]): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionNull: Self = StObject.set(x, "contentVersion", null)
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setDataExcutionPolicy(value: NullableOption[String]): Self = StObject.set(x, "dataExcutionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExcutionPolicyNull: Self = StObject.set(x, "dataExcutionPolicy", null)
    
    @scala.inline
    def setDataExcutionPolicyUndefined: Self = StObject.set(x, "dataExcutionPolicy", js.undefined)
    
    @scala.inline
    def setDeviceHealthAttestationStatus(value: NullableOption[String]): Self = StObject.set(x, "deviceHealthAttestationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceHealthAttestationStatusNull: Self = StObject.set(x, "deviceHealthAttestationStatus", null)
    
    @scala.inline
    def setDeviceHealthAttestationStatusUndefined: Self = StObject.set(x, "deviceHealthAttestationStatus", js.undefined)
    
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverProtection(value: NullableOption[String]): Self = StObject.set(x, "earlyLaunchAntiMalwareDriverProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverProtectionNull: Self = StObject.set(x, "earlyLaunchAntiMalwareDriverProtection", null)
    
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverProtectionUndefined: Self = StObject.set(x, "earlyLaunchAntiMalwareDriverProtection", js.undefined)
    
    @scala.inline
    def setHealthAttestationSupportedStatus(value: NullableOption[String]): Self = StObject.set(x, "healthAttestationSupportedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthAttestationSupportedStatusNull: Self = StObject.set(x, "healthAttestationSupportedStatus", null)
    
    @scala.inline
    def setHealthAttestationSupportedStatusUndefined: Self = StObject.set(x, "healthAttestationSupportedStatus", js.undefined)
    
    @scala.inline
    def setHealthStatusMismatchInfo(value: NullableOption[String]): Self = StObject.set(x, "healthStatusMismatchInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusMismatchInfoNull: Self = StObject.set(x, "healthStatusMismatchInfo", null)
    
    @scala.inline
    def setHealthStatusMismatchInfoUndefined: Self = StObject.set(x, "healthStatusMismatchInfo", js.undefined)
    
    @scala.inline
    def setIssuedDateTime(value: String): Self = StObject.set(x, "issuedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedDateTimeUndefined: Self = StObject.set(x, "issuedDateTime", js.undefined)
    
    @scala.inline
    def setLastUpdateDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDateTimeNull: Self = StObject.set(x, "lastUpdateDateTime", null)
    
    @scala.inline
    def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    @scala.inline
    def setOperatingSystemKernelDebugging(value: NullableOption[String]): Self = StObject.set(x, "operatingSystemKernelDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemKernelDebuggingNull: Self = StObject.set(x, "operatingSystemKernelDebugging", null)
    
    @scala.inline
    def setOperatingSystemKernelDebuggingUndefined: Self = StObject.set(x, "operatingSystemKernelDebugging", js.undefined)
    
    @scala.inline
    def setOperatingSystemRevListInfo(value: NullableOption[String]): Self = StObject.set(x, "operatingSystemRevListInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemRevListInfoNull: Self = StObject.set(x, "operatingSystemRevListInfo", null)
    
    @scala.inline
    def setOperatingSystemRevListInfoUndefined: Self = StObject.set(x, "operatingSystemRevListInfo", js.undefined)
    
    @scala.inline
    def setPcr0(value: NullableOption[String]): Self = StObject.set(x, "pcr0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcr0Null: Self = StObject.set(x, "pcr0", null)
    
    @scala.inline
    def setPcr0Undefined: Self = StObject.set(x, "pcr0", js.undefined)
    
    @scala.inline
    def setPcrHashAlgorithm(value: NullableOption[String]): Self = StObject.set(x, "pcrHashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcrHashAlgorithmNull: Self = StObject.set(x, "pcrHashAlgorithm", null)
    
    @scala.inline
    def setPcrHashAlgorithmUndefined: Self = StObject.set(x, "pcrHashAlgorithm", js.undefined)
    
    @scala.inline
    def setResetCount(value: Double): Self = StObject.set(x, "resetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetCountUndefined: Self = StObject.set(x, "resetCount", js.undefined)
    
    @scala.inline
    def setRestartCount(value: Double): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartCountUndefined: Self = StObject.set(x, "restartCount", js.undefined)
    
    @scala.inline
    def setSafeMode(value: NullableOption[String]): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeModeNull: Self = StObject.set(x, "safeMode", null)
    
    @scala.inline
    def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
    
    @scala.inline
    def setSecureBoot(value: NullableOption[String]): Self = StObject.set(x, "secureBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureBootConfigurationPolicyFingerPrint(value: NullableOption[String]): Self = StObject.set(x, "secureBootConfigurationPolicyFingerPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureBootConfigurationPolicyFingerPrintNull: Self = StObject.set(x, "secureBootConfigurationPolicyFingerPrint", null)
    
    @scala.inline
    def setSecureBootConfigurationPolicyFingerPrintUndefined: Self = StObject.set(x, "secureBootConfigurationPolicyFingerPrint", js.undefined)
    
    @scala.inline
    def setSecureBootNull: Self = StObject.set(x, "secureBoot", null)
    
    @scala.inline
    def setSecureBootUndefined: Self = StObject.set(x, "secureBoot", js.undefined)
    
    @scala.inline
    def setTestSigning(value: NullableOption[String]): Self = StObject.set(x, "testSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSigningNull: Self = StObject.set(x, "testSigning", null)
    
    @scala.inline
    def setTestSigningUndefined: Self = StObject.set(x, "testSigning", js.undefined)
    
    @scala.inline
    def setTpmVersion(value: NullableOption[String]): Self = StObject.set(x, "tpmVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpmVersionNull: Self = StObject.set(x, "tpmVersion", null)
    
    @scala.inline
    def setTpmVersionUndefined: Self = StObject.set(x, "tpmVersion", js.undefined)
    
    @scala.inline
    def setVirtualSecureMode(value: NullableOption[String]): Self = StObject.set(x, "virtualSecureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualSecureModeNull: Self = StObject.set(x, "virtualSecureMode", null)
    
    @scala.inline
    def setVirtualSecureModeUndefined: Self = StObject.set(x, "virtualSecureMode", js.undefined)
    
    @scala.inline
    def setWindowsPE(value: NullableOption[String]): Self = StObject.set(x, "windowsPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsPENull: Self = StObject.set(x, "windowsPE", null)
    
    @scala.inline
    def setWindowsPEUndefined: Self = StObject.set(x, "windowsPE", js.undefined)
  }
}
