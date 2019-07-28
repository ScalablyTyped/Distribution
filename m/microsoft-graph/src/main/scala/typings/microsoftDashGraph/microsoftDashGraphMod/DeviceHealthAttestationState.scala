package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceHealthAttestationState extends js.Object {
  /**
    * TWhen an Attestation Identity Key (AIK) is present on a device, it indicates that the device has an endorsement key
    * (EK) certificate.
    */
  var attestationIdentityKey: js.UndefOr[String] = js.undefined
  // On or Off of BitLocker Drive Encryption
  var bitLockerStatus: js.UndefOr[String] = js.undefined
  // The security version number of the Boot Application
  var bootAppSecurityVersion: js.UndefOr[String] = js.undefined
  // When bootDebugging is enabled, the device is used in development and testing
  var bootDebugging: js.UndefOr[String] = js.undefined
  // The security version number of the Boot Application
  var bootManagerSecurityVersion: js.UndefOr[String] = js.undefined
  // The version of the Boot Manager
  var bootManagerVersion: js.UndefOr[String] = js.undefined
  // The Boot Revision List that was loaded during initial boot on the attested device
  var bootRevisionListInfo: js.UndefOr[String] = js.undefined
  // When code integrity is enabled, code execution is restricted to integrity verified code
  var codeIntegrity: js.UndefOr[String] = js.undefined
  // The version of the Boot Manager
  var codeIntegrityCheckVersion: js.UndefOr[String] = js.undefined
  // The Code Integrity policy that is controlling the security of the boot environment
  var codeIntegrityPolicy: js.UndefOr[String] = js.undefined
  // The DHA report version. (Namespace version)
  var contentNamespaceUrl: js.UndefOr[String] = js.undefined
  // The HealthAttestation state schema version
  var contentVersion: js.UndefOr[String] = js.undefined
  // DEP Policy defines a set of hardware and software technologies that perform additional checks on memory
  var dataExcutionPolicy: js.UndefOr[String] = js.undefined
  // The DHA report version. (Namespace version)
  var deviceHealthAttestationStatus: js.UndefOr[String] = js.undefined
  // ELAM provides protection for the computers in your network when they start up
  var earlyLaunchAntiMalwareDriverProtection: js.UndefOr[String] = js.undefined
  // This attribute indicates if DHA is supported for the device
  var healthAttestationSupportedStatus: js.UndefOr[String] = js.undefined
  // This attribute appears if DHA-Service detects an integrity issue
  var healthStatusMismatchInfo: js.UndefOr[String] = js.undefined
  // The DateTime when device was evaluated or issued to MDM
  var issuedDateTime: js.UndefOr[String] = js.undefined
  // The Timestamp of the last update.
  var lastUpdateDateTime: js.UndefOr[String] = js.undefined
  // When operatingSystemKernelDebugging is enabled, the device is used in development and testing
  var operatingSystemKernelDebugging: js.UndefOr[String] = js.undefined
  // The Operating System Revision List that was loaded during initial boot on the attested device
  var operatingSystemRevListInfo: js.UndefOr[String] = js.undefined
  // The measurement that is captured in PCR[0]
  var pcr0: js.UndefOr[String] = js.undefined
  // Informational attribute that identifies the HASH algorithm that was used by TPM
  var pcrHashAlgorithm: js.UndefOr[String] = js.undefined
  // The number of times a PC device has hibernated or resumed
  var resetCount: js.UndefOr[Double] = js.undefined
  // The number of times a PC device has rebooted
  var restartCount: js.UndefOr[Double] = js.undefined
  // Safe mode is a troubleshooting option for Windows that starts your computer in a limited state
  var safeMode: js.UndefOr[String] = js.undefined
  // When Secure Boot is enabled, the core components must have the correct cryptographic signatures
  var secureBoot: js.UndefOr[String] = js.undefined
  // Fingerprint of the Custom Secure Boot Configuration Policy
  var secureBootConfigurationPolicyFingerPrint: js.UndefOr[String] = js.undefined
  // When test signing is allowed, the device does not enforce signature validation during boot
  var testSigning: js.UndefOr[String] = js.undefined
  // The security version number of the Boot Application
  var tpmVersion: js.UndefOr[String] = js.undefined
  // VSM is a container that protects high value assets from a compromised kernel
  var virtualSecureMode: js.UndefOr[String] = js.undefined
  // Operating system running with limited services that is used to prepare a computer for Windows
  var windowsPE: js.UndefOr[String] = js.undefined
}

object DeviceHealthAttestationState {
  @scala.inline
  def apply(
    attestationIdentityKey: String = null,
    bitLockerStatus: String = null,
    bootAppSecurityVersion: String = null,
    bootDebugging: String = null,
    bootManagerSecurityVersion: String = null,
    bootManagerVersion: String = null,
    bootRevisionListInfo: String = null,
    codeIntegrity: String = null,
    codeIntegrityCheckVersion: String = null,
    codeIntegrityPolicy: String = null,
    contentNamespaceUrl: String = null,
    contentVersion: String = null,
    dataExcutionPolicy: String = null,
    deviceHealthAttestationStatus: String = null,
    earlyLaunchAntiMalwareDriverProtection: String = null,
    healthAttestationSupportedStatus: String = null,
    healthStatusMismatchInfo: String = null,
    issuedDateTime: String = null,
    lastUpdateDateTime: String = null,
    operatingSystemKernelDebugging: String = null,
    operatingSystemRevListInfo: String = null,
    pcr0: String = null,
    pcrHashAlgorithm: String = null,
    resetCount: Int | Double = null,
    restartCount: Int | Double = null,
    safeMode: String = null,
    secureBoot: String = null,
    secureBootConfigurationPolicyFingerPrint: String = null,
    testSigning: String = null,
    tpmVersion: String = null,
    virtualSecureMode: String = null,
    windowsPE: String = null
  ): DeviceHealthAttestationState = {
    val __obj = js.Dynamic.literal()
    if (attestationIdentityKey != null) __obj.updateDynamic("attestationIdentityKey")(attestationIdentityKey)
    if (bitLockerStatus != null) __obj.updateDynamic("bitLockerStatus")(bitLockerStatus)
    if (bootAppSecurityVersion != null) __obj.updateDynamic("bootAppSecurityVersion")(bootAppSecurityVersion)
    if (bootDebugging != null) __obj.updateDynamic("bootDebugging")(bootDebugging)
    if (bootManagerSecurityVersion != null) __obj.updateDynamic("bootManagerSecurityVersion")(bootManagerSecurityVersion)
    if (bootManagerVersion != null) __obj.updateDynamic("bootManagerVersion")(bootManagerVersion)
    if (bootRevisionListInfo != null) __obj.updateDynamic("bootRevisionListInfo")(bootRevisionListInfo)
    if (codeIntegrity != null) __obj.updateDynamic("codeIntegrity")(codeIntegrity)
    if (codeIntegrityCheckVersion != null) __obj.updateDynamic("codeIntegrityCheckVersion")(codeIntegrityCheckVersion)
    if (codeIntegrityPolicy != null) __obj.updateDynamic("codeIntegrityPolicy")(codeIntegrityPolicy)
    if (contentNamespaceUrl != null) __obj.updateDynamic("contentNamespaceUrl")(contentNamespaceUrl)
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion)
    if (dataExcutionPolicy != null) __obj.updateDynamic("dataExcutionPolicy")(dataExcutionPolicy)
    if (deviceHealthAttestationStatus != null) __obj.updateDynamic("deviceHealthAttestationStatus")(deviceHealthAttestationStatus)
    if (earlyLaunchAntiMalwareDriverProtection != null) __obj.updateDynamic("earlyLaunchAntiMalwareDriverProtection")(earlyLaunchAntiMalwareDriverProtection)
    if (healthAttestationSupportedStatus != null) __obj.updateDynamic("healthAttestationSupportedStatus")(healthAttestationSupportedStatus)
    if (healthStatusMismatchInfo != null) __obj.updateDynamic("healthStatusMismatchInfo")(healthStatusMismatchInfo)
    if (issuedDateTime != null) __obj.updateDynamic("issuedDateTime")(issuedDateTime)
    if (lastUpdateDateTime != null) __obj.updateDynamic("lastUpdateDateTime")(lastUpdateDateTime)
    if (operatingSystemKernelDebugging != null) __obj.updateDynamic("operatingSystemKernelDebugging")(operatingSystemKernelDebugging)
    if (operatingSystemRevListInfo != null) __obj.updateDynamic("operatingSystemRevListInfo")(operatingSystemRevListInfo)
    if (pcr0 != null) __obj.updateDynamic("pcr0")(pcr0)
    if (pcrHashAlgorithm != null) __obj.updateDynamic("pcrHashAlgorithm")(pcrHashAlgorithm)
    if (resetCount != null) __obj.updateDynamic("resetCount")(resetCount.asInstanceOf[js.Any])
    if (restartCount != null) __obj.updateDynamic("restartCount")(restartCount.asInstanceOf[js.Any])
    if (safeMode != null) __obj.updateDynamic("safeMode")(safeMode)
    if (secureBoot != null) __obj.updateDynamic("secureBoot")(secureBoot)
    if (secureBootConfigurationPolicyFingerPrint != null) __obj.updateDynamic("secureBootConfigurationPolicyFingerPrint")(secureBootConfigurationPolicyFingerPrint)
    if (testSigning != null) __obj.updateDynamic("testSigning")(testSigning)
    if (tpmVersion != null) __obj.updateDynamic("tpmVersion")(tpmVersion)
    if (virtualSecureMode != null) __obj.updateDynamic("virtualSecureMode")(virtualSecureMode)
    if (windowsPE != null) __obj.updateDynamic("windowsPE")(windowsPE)
    __obj.asInstanceOf[DeviceHealthAttestationState]
  }
}

