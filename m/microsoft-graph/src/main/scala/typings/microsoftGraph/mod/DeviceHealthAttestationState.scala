package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceHealthAttestationState extends js.Object {
  
  /**
    * TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key
    * (EK) certificate.
    */
  var attestationIdentityKey: js.UndefOr[NullableOption[String]] = js.native
  
  // On or Off of BitLocker Drive Encryption
  var bitLockerStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // The security version number of the Boot Application
  var bootAppSecurityVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // When bootDebugging is enabled, the device is used in development and testing
  var bootDebugging: js.UndefOr[NullableOption[String]] = js.native
  
  // The security version number of the Boot Application
  var bootManagerSecurityVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // The version of the Boot Manager
  var bootManagerVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // The Boot Revision List that was loaded during initial boot on the attested device
  var bootRevisionListInfo: js.UndefOr[NullableOption[String]] = js.native
  
  // When code integrity is enabled, code execution is restricted to integrity verified code
  var codeIntegrity: js.UndefOr[NullableOption[String]] = js.native
  
  // The version of the Boot Manager
  var codeIntegrityCheckVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // The Code Integrity policy that is controlling the security of the boot environment
  var codeIntegrityPolicy: js.UndefOr[NullableOption[String]] = js.native
  
  // The DHA report version. (Namespace version)
  var contentNamespaceUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The HealthAttestation state schema version
  var contentVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
  var dataExcutionPolicy: js.UndefOr[NullableOption[String]] = js.native
  
  // The DHA report version. (Namespace version)
  var deviceHealthAttestationStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // ELAM provides protection for the computers in your network when they start up
  var earlyLaunchAntiMalwareDriverProtection: js.UndefOr[NullableOption[String]] = js.native
  
  // This attribute indicates if DHA is supported for the device
  var healthAttestationSupportedStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // This attribute appears if DHA-Service detects an integrity issue
  var healthStatusMismatchInfo: js.UndefOr[NullableOption[String]] = js.native
  
  // The DateTime when device was evaluated or issued to MDM
  var issuedDateTime: js.UndefOr[String] = js.native
  
  // The Timestamp of the last update.
  var lastUpdateDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // When operatingSystemKernelDebugging is enabled, the device is used in development and testing
  var operatingSystemKernelDebugging: js.UndefOr[NullableOption[String]] = js.native
  
  // The Operating System Revision List that was loaded during initial boot on the attested device
  var operatingSystemRevListInfo: js.UndefOr[NullableOption[String]] = js.native
  
  // The measurement that is captured in PCR[0]
  var pcr0: js.UndefOr[NullableOption[String]] = js.native
  
  // Informational attribute that identifies the HASH algorithm that was used by TPM
  var pcrHashAlgorithm: js.UndefOr[NullableOption[String]] = js.native
  
  // The number of times a PC device has hibernated or resumed
  var resetCount: js.UndefOr[Double] = js.native
  
  // The number of times a PC device has rebooted
  var restartCount: js.UndefOr[Double] = js.native
  
  // Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
  var safeMode: js.UndefOr[NullableOption[String]] = js.native
  
  // When Secure Boot is enabled, the core components must have the correct cryptographic signatures
  var secureBoot: js.UndefOr[NullableOption[String]] = js.native
  
  // Fingerprint of the Custom Secure Boot Configuration Policy
  var secureBootConfigurationPolicyFingerPrint: js.UndefOr[NullableOption[String]] = js.native
  
  // When test signing is allowed, the device does not enforce signature validation during boot
  var testSigning: js.UndefOr[NullableOption[String]] = js.native
  
  // The security version number of the Boot Application
  var tpmVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // VSM is a container that protects high value assets from a compromised kernel
  var virtualSecureMode: js.UndefOr[NullableOption[String]] = js.native
  
  // Operating system running with limited services that is used to prepare a computer for Windows
  var windowsPE: js.UndefOr[NullableOption[String]] = js.native
}
object DeviceHealthAttestationState {
  
  @scala.inline
  def apply(): DeviceHealthAttestationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceHealthAttestationState]
  }
  
  @scala.inline
  implicit class DeviceHealthAttestationStateOps[Self <: DeviceHealthAttestationState] (val x: Self) extends AnyVal {
    
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
    def setAttestationIdentityKey(value: NullableOption[String]): Self = this.set("attestationIdentityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttestationIdentityKey: Self = this.set("attestationIdentityKey", js.undefined)
    
    @scala.inline
    def setAttestationIdentityKeyNull: Self = this.set("attestationIdentityKey", null)
    
    @scala.inline
    def setBitLockerStatus(value: NullableOption[String]): Self = this.set("bitLockerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitLockerStatus: Self = this.set("bitLockerStatus", js.undefined)
    
    @scala.inline
    def setBitLockerStatusNull: Self = this.set("bitLockerStatus", null)
    
    @scala.inline
    def setBootAppSecurityVersion(value: NullableOption[String]): Self = this.set("bootAppSecurityVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootAppSecurityVersion: Self = this.set("bootAppSecurityVersion", js.undefined)
    
    @scala.inline
    def setBootAppSecurityVersionNull: Self = this.set("bootAppSecurityVersion", null)
    
    @scala.inline
    def setBootDebugging(value: NullableOption[String]): Self = this.set("bootDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDebugging: Self = this.set("bootDebugging", js.undefined)
    
    @scala.inline
    def setBootDebuggingNull: Self = this.set("bootDebugging", null)
    
    @scala.inline
    def setBootManagerSecurityVersion(value: NullableOption[String]): Self = this.set("bootManagerSecurityVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootManagerSecurityVersion: Self = this.set("bootManagerSecurityVersion", js.undefined)
    
    @scala.inline
    def setBootManagerSecurityVersionNull: Self = this.set("bootManagerSecurityVersion", null)
    
    @scala.inline
    def setBootManagerVersion(value: NullableOption[String]): Self = this.set("bootManagerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootManagerVersion: Self = this.set("bootManagerVersion", js.undefined)
    
    @scala.inline
    def setBootManagerVersionNull: Self = this.set("bootManagerVersion", null)
    
    @scala.inline
    def setBootRevisionListInfo(value: NullableOption[String]): Self = this.set("bootRevisionListInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootRevisionListInfo: Self = this.set("bootRevisionListInfo", js.undefined)
    
    @scala.inline
    def setBootRevisionListInfoNull: Self = this.set("bootRevisionListInfo", null)
    
    @scala.inline
    def setCodeIntegrity(value: NullableOption[String]): Self = this.set("codeIntegrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeIntegrity: Self = this.set("codeIntegrity", js.undefined)
    
    @scala.inline
    def setCodeIntegrityNull: Self = this.set("codeIntegrity", null)
    
    @scala.inline
    def setCodeIntegrityCheckVersion(value: NullableOption[String]): Self = this.set("codeIntegrityCheckVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeIntegrityCheckVersion: Self = this.set("codeIntegrityCheckVersion", js.undefined)
    
    @scala.inline
    def setCodeIntegrityCheckVersionNull: Self = this.set("codeIntegrityCheckVersion", null)
    
    @scala.inline
    def setCodeIntegrityPolicy(value: NullableOption[String]): Self = this.set("codeIntegrityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeIntegrityPolicy: Self = this.set("codeIntegrityPolicy", js.undefined)
    
    @scala.inline
    def setCodeIntegrityPolicyNull: Self = this.set("codeIntegrityPolicy", null)
    
    @scala.inline
    def setContentNamespaceUrl(value: NullableOption[String]): Self = this.set("contentNamespaceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentNamespaceUrl: Self = this.set("contentNamespaceUrl", js.undefined)
    
    @scala.inline
    def setContentNamespaceUrlNull: Self = this.set("contentNamespaceUrl", null)
    
    @scala.inline
    def setContentVersion(value: NullableOption[String]): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    
    @scala.inline
    def setContentVersionNull: Self = this.set("contentVersion", null)
    
    @scala.inline
    def setDataExcutionPolicy(value: NullableOption[String]): Self = this.set("dataExcutionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExcutionPolicy: Self = this.set("dataExcutionPolicy", js.undefined)
    
    @scala.inline
    def setDataExcutionPolicyNull: Self = this.set("dataExcutionPolicy", null)
    
    @scala.inline
    def setDeviceHealthAttestationStatus(value: NullableOption[String]): Self = this.set("deviceHealthAttestationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceHealthAttestationStatus: Self = this.set("deviceHealthAttestationStatus", js.undefined)
    
    @scala.inline
    def setDeviceHealthAttestationStatusNull: Self = this.set("deviceHealthAttestationStatus", null)
    
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverProtection(value: NullableOption[String]): Self = this.set("earlyLaunchAntiMalwareDriverProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarlyLaunchAntiMalwareDriverProtection: Self = this.set("earlyLaunchAntiMalwareDriverProtection", js.undefined)
    
    @scala.inline
    def setEarlyLaunchAntiMalwareDriverProtectionNull: Self = this.set("earlyLaunchAntiMalwareDriverProtection", null)
    
    @scala.inline
    def setHealthAttestationSupportedStatus(value: NullableOption[String]): Self = this.set("healthAttestationSupportedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthAttestationSupportedStatus: Self = this.set("healthAttestationSupportedStatus", js.undefined)
    
    @scala.inline
    def setHealthAttestationSupportedStatusNull: Self = this.set("healthAttestationSupportedStatus", null)
    
    @scala.inline
    def setHealthStatusMismatchInfo(value: NullableOption[String]): Self = this.set("healthStatusMismatchInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatusMismatchInfo: Self = this.set("healthStatusMismatchInfo", js.undefined)
    
    @scala.inline
    def setHealthStatusMismatchInfoNull: Self = this.set("healthStatusMismatchInfo", null)
    
    @scala.inline
    def setIssuedDateTime(value: String): Self = this.set("issuedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuedDateTime: Self = this.set("issuedDateTime", js.undefined)
    
    @scala.inline
    def setLastUpdateDateTime(value: NullableOption[String]): Self = this.set("lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateDateTime: Self = this.set("lastUpdateDateTime", js.undefined)
    
    @scala.inline
    def setLastUpdateDateTimeNull: Self = this.set("lastUpdateDateTime", null)
    
    @scala.inline
    def setOperatingSystemKernelDebugging(value: NullableOption[String]): Self = this.set("operatingSystemKernelDebugging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemKernelDebugging: Self = this.set("operatingSystemKernelDebugging", js.undefined)
    
    @scala.inline
    def setOperatingSystemKernelDebuggingNull: Self = this.set("operatingSystemKernelDebugging", null)
    
    @scala.inline
    def setOperatingSystemRevListInfo(value: NullableOption[String]): Self = this.set("operatingSystemRevListInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemRevListInfo: Self = this.set("operatingSystemRevListInfo", js.undefined)
    
    @scala.inline
    def setOperatingSystemRevListInfoNull: Self = this.set("operatingSystemRevListInfo", null)
    
    @scala.inline
    def setPcr0(value: NullableOption[String]): Self = this.set("pcr0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcr0: Self = this.set("pcr0", js.undefined)
    
    @scala.inline
    def setPcr0Null: Self = this.set("pcr0", null)
    
    @scala.inline
    def setPcrHashAlgorithm(value: NullableOption[String]): Self = this.set("pcrHashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcrHashAlgorithm: Self = this.set("pcrHashAlgorithm", js.undefined)
    
    @scala.inline
    def setPcrHashAlgorithmNull: Self = this.set("pcrHashAlgorithm", null)
    
    @scala.inline
    def setResetCount(value: Double): Self = this.set("resetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetCount: Self = this.set("resetCount", js.undefined)
    
    @scala.inline
    def setRestartCount(value: Double): Self = this.set("restartCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartCount: Self = this.set("restartCount", js.undefined)
    
    @scala.inline
    def setSafeMode(value: NullableOption[String]): Self = this.set("safeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeMode: Self = this.set("safeMode", js.undefined)
    
    @scala.inline
    def setSafeModeNull: Self = this.set("safeMode", null)
    
    @scala.inline
    def setSecureBoot(value: NullableOption[String]): Self = this.set("secureBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureBoot: Self = this.set("secureBoot", js.undefined)
    
    @scala.inline
    def setSecureBootNull: Self = this.set("secureBoot", null)
    
    @scala.inline
    def setSecureBootConfigurationPolicyFingerPrint(value: NullableOption[String]): Self = this.set("secureBootConfigurationPolicyFingerPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureBootConfigurationPolicyFingerPrint: Self = this.set("secureBootConfigurationPolicyFingerPrint", js.undefined)
    
    @scala.inline
    def setSecureBootConfigurationPolicyFingerPrintNull: Self = this.set("secureBootConfigurationPolicyFingerPrint", null)
    
    @scala.inline
    def setTestSigning(value: NullableOption[String]): Self = this.set("testSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSigning: Self = this.set("testSigning", js.undefined)
    
    @scala.inline
    def setTestSigningNull: Self = this.set("testSigning", null)
    
    @scala.inline
    def setTpmVersion(value: NullableOption[String]): Self = this.set("tpmVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpmVersion: Self = this.set("tpmVersion", js.undefined)
    
    @scala.inline
    def setTpmVersionNull: Self = this.set("tpmVersion", null)
    
    @scala.inline
    def setVirtualSecureMode(value: NullableOption[String]): Self = this.set("virtualSecureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualSecureMode: Self = this.set("virtualSecureMode", js.undefined)
    
    @scala.inline
    def setVirtualSecureModeNull: Self = this.set("virtualSecureMode", null)
    
    @scala.inline
    def setWindowsPE(value: NullableOption[String]): Self = this.set("windowsPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsPE: Self = this.set("windowsPE", js.undefined)
    
    @scala.inline
    def setWindowsPENull: Self = this.set("windowsPE", null)
  }
}
