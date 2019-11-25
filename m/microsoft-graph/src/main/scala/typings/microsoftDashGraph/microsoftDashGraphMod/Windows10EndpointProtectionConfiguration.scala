package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows10EndpointProtectionConfiguration extends DeviceConfiguration {
  /**
    * Enables the Admin to choose what types of app to allow on devices. Possible values are: notConfigured,
    * enforceComponentsAndStoreApps, auditComponentsAndStoreApps, enforceComponentsStoreAppsAndSmartlocker,
    * auditComponentsStoreAppsAndSmartlocker.
    */
  var appLockerApplicationControl: js.UndefOr[AppLockerApplicationControlType] = js.undefined
  // Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
  var applicationGuardAllowPersistence: js.UndefOr[Boolean] = js.undefined
  // Allow printing to Local Printers from Container
  var applicationGuardAllowPrintToLocalPrinters: js.UndefOr[Boolean] = js.undefined
  // Allow printing to Network Printers from Container
  var applicationGuardAllowPrintToNetworkPrinters: js.UndefOr[Boolean] = js.undefined
  // Allow printing to PDF from Container
  var applicationGuardAllowPrintToPDF: js.UndefOr[Boolean] = js.undefined
  // Allow printing to XPS from Container
  var applicationGuardAllowPrintToXPS: js.UndefOr[Boolean] = js.undefined
  /**
    * Block clipboard to share data from Host to Container, or from Container to Host, or both ways, or neither ways.
    * Possible values are: notConfigured, blockBoth, blockHostToContainer, blockContainerToHost, blockNone.
    */
  var applicationGuardBlockClipboardSharing: js.UndefOr[ApplicationGuardBlockClipboardSharingType] = js.undefined
  /**
    * Block clipboard to transfer image file, text file or neither of them. Possible values are: notConfigured,
    * blockImageAndTextFile, blockImageFile, blockNone, blockTextFile.
    */
  var applicationGuardBlockFileTransfer: js.UndefOr[ApplicationGuardBlockFileTransferType] = js.undefined
  // Block enterprise sites to load non-enterprise content, such as third party plug-ins
  var applicationGuardBlockNonEnterpriseContent: js.UndefOr[Boolean] = js.undefined
  // Enable Windows Defender Application Guard
  var applicationGuardEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user
    * login-logoff, use of privilege rights, software installation, system changes, etc.)
    */
  var applicationGuardForceAuditing: js.UndefOr[Boolean] = js.undefined
  // Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
  var bitLockerDisableWarningForOtherDiskEncryption: js.UndefOr[Boolean] = js.undefined
  // Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
  var bitLockerEnableStorageCardEncryptionOnMobile: js.UndefOr[Boolean] = js.undefined
  // Allows the admin to require encryption to be turned on using BitLocker.
  var bitLockerEncryptDevice: js.UndefOr[Boolean] = js.undefined
  // BitLocker Removable Drive Policy.
  var bitLockerRemovableDrivePolicy: js.UndefOr[BitLockerRemovableDrivePolicy] = js.undefined
  // List of folder paths to be added to the list of protected folders
  var defenderAdditionalGuardedFolders: js.UndefOr[js.Array[String]] = js.undefined
  // List of exe files and folders to be excluded from attack surface reduction rules
  var defenderAttackSurfaceReductionExcludedPaths: js.UndefOr[js.Array[String]] = js.undefined
  // Xml content containing information regarding exploit protection details.
  var defenderExploitProtectionXml: js.UndefOr[Double] = js.undefined
  // Name of the file from which DefenderExploitProtectionXml was obtained.
  var defenderExploitProtectionXmlFileName: js.UndefOr[String] = js.undefined
  // List of paths to exe that are allowed to access protected folders
  var defenderGuardedFoldersAllowedAppPaths: js.UndefOr[js.Array[String]] = js.undefined
  // Indicates whether or not to block user from overriding Exploit Protection settings.
  var defenderSecurityCenterBlockExploitProtectionOverride: js.UndefOr[Boolean] = js.undefined
  // Blocks stateful FTP connections to the device
  var firewallBlockStatefulFTP: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify how the certificate revocation list is to be enforced. Possible values are: deviceDefault, none, attempt,
    * require.
    */
  var firewallCertificateRevocationListCheckMethod: js.UndefOr[FirewallCertificateRevocationListCheckMethodType] = js.undefined
  // Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
  var firewallIPSecExemptionsAllowDHCP: js.UndefOr[Boolean] = js.undefined
  // Configures IPSec exemptions to allow ICMP
  var firewallIPSecExemptionsAllowICMP: js.UndefOr[Boolean] = js.undefined
  // Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
  var firewallIPSecExemptionsAllowNeighborDiscovery: js.UndefOr[Boolean] = js.undefined
  // Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
  var firewallIPSecExemptionsAllowRouterDiscovery: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after
    * which security associations will expire and be deleted. Valid values 300 to 3600
    */
  var firewallIdleTimeoutForSecurityAssociationInSeconds: js.UndefOr[Double] = js.undefined
  /**
    * If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported
    * authentication suites rather than the entire set
    */
  var firewallMergeKeyingModuleSettings: js.UndefOr[Boolean] = js.undefined
  /**
    * Configures how packet queueing should be applied in the tunnel gateway scenario. Possible values are: deviceDefault,
    * disabled, queueInbound, queueOutbound, queueBoth.
    */
  var firewallPacketQueueingMethod: js.UndefOr[FirewallPacketQueueingMethodType] = js.undefined
  // Select the preshared key encoding to be used. Possible values are: deviceDefault, none, utF8.
  var firewallPreSharedKeyEncodingMethod: js.UndefOr[FirewallPreSharedKeyEncodingMethodType] = js.undefined
  // Configures the firewall profile settings for domain networks
  var firewallProfileDomain: js.UndefOr[WindowsFirewallNetworkProfile] = js.undefined
  // Configures the firewall profile settings for private networks
  var firewallProfilePrivate: js.UndefOr[WindowsFirewallNetworkProfile] = js.undefined
  // Configures the firewall profile settings for public networks
  var firewallProfilePublic: js.UndefOr[WindowsFirewallNetworkProfile] = js.undefined
  // Allows IT Admins to control whether users can ignore SmartScreen warnings and run malicious files.
  var smartScreenBlockOverrideForFiles: js.UndefOr[Boolean] = js.undefined
  // Allows IT Admins to configure SmartScreen for Windows.
  var smartScreenEnableInShell: js.UndefOr[Boolean] = js.undefined
}

object Windows10EndpointProtectionConfiguration {
  @scala.inline
  def apply(
    appLockerApplicationControl: AppLockerApplicationControlType = null,
    applicationGuardAllowPersistence: js.UndefOr[Boolean] = js.undefined,
    applicationGuardAllowPrintToLocalPrinters: js.UndefOr[Boolean] = js.undefined,
    applicationGuardAllowPrintToNetworkPrinters: js.UndefOr[Boolean] = js.undefined,
    applicationGuardAllowPrintToPDF: js.UndefOr[Boolean] = js.undefined,
    applicationGuardAllowPrintToXPS: js.UndefOr[Boolean] = js.undefined,
    applicationGuardBlockClipboardSharing: ApplicationGuardBlockClipboardSharingType = null,
    applicationGuardBlockFileTransfer: ApplicationGuardBlockFileTransferType = null,
    applicationGuardBlockNonEnterpriseContent: js.UndefOr[Boolean] = js.undefined,
    applicationGuardEnabled: js.UndefOr[Boolean] = js.undefined,
    applicationGuardForceAuditing: js.UndefOr[Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bitLockerDisableWarningForOtherDiskEncryption: js.UndefOr[Boolean] = js.undefined,
    bitLockerEnableStorageCardEncryptionOnMobile: js.UndefOr[Boolean] = js.undefined,
    bitLockerEncryptDevice: js.UndefOr[Boolean] = js.undefined,
    bitLockerRemovableDrivePolicy: BitLockerRemovableDrivePolicy = null,
    createdDateTime: String = null,
    defenderAdditionalGuardedFolders: js.Array[String] = null,
    defenderAttackSurfaceReductionExcludedPaths: js.Array[String] = null,
    defenderExploitProtectionXml: Int | Double = null,
    defenderExploitProtectionXmlFileName: String = null,
    defenderGuardedFoldersAllowedAppPaths: js.Array[String] = null,
    defenderSecurityCenterBlockExploitProtectionOverride: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    displayName: String = null,
    firewallBlockStatefulFTP: js.UndefOr[Boolean] = js.undefined,
    firewallCertificateRevocationListCheckMethod: FirewallCertificateRevocationListCheckMethodType = null,
    firewallIPSecExemptionsAllowDHCP: js.UndefOr[Boolean] = js.undefined,
    firewallIPSecExemptionsAllowICMP: js.UndefOr[Boolean] = js.undefined,
    firewallIPSecExemptionsAllowNeighborDiscovery: js.UndefOr[Boolean] = js.undefined,
    firewallIPSecExemptionsAllowRouterDiscovery: js.UndefOr[Boolean] = js.undefined,
    firewallIdleTimeoutForSecurityAssociationInSeconds: Int | Double = null,
    firewallMergeKeyingModuleSettings: js.UndefOr[Boolean] = js.undefined,
    firewallPacketQueueingMethod: FirewallPacketQueueingMethodType = null,
    firewallPreSharedKeyEncodingMethod: FirewallPreSharedKeyEncodingMethodType = null,
    firewallProfileDomain: WindowsFirewallNetworkProfile = null,
    firewallProfilePrivate: WindowsFirewallNetworkProfile = null,
    firewallProfilePublic: WindowsFirewallNetworkProfile = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    smartScreenBlockOverrideForFiles: js.UndefOr[Boolean] = js.undefined,
    smartScreenEnableInShell: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: Int | Double = null
  ): Windows10EndpointProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (appLockerApplicationControl != null) __obj.updateDynamic("appLockerApplicationControl")(appLockerApplicationControl.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardAllowPersistence)) __obj.updateDynamic("applicationGuardAllowPersistence")(applicationGuardAllowPersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardAllowPrintToLocalPrinters)) __obj.updateDynamic("applicationGuardAllowPrintToLocalPrinters")(applicationGuardAllowPrintToLocalPrinters.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardAllowPrintToNetworkPrinters)) __obj.updateDynamic("applicationGuardAllowPrintToNetworkPrinters")(applicationGuardAllowPrintToNetworkPrinters.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardAllowPrintToPDF)) __obj.updateDynamic("applicationGuardAllowPrintToPDF")(applicationGuardAllowPrintToPDF.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardAllowPrintToXPS)) __obj.updateDynamic("applicationGuardAllowPrintToXPS")(applicationGuardAllowPrintToXPS.asInstanceOf[js.Any])
    if (applicationGuardBlockClipboardSharing != null) __obj.updateDynamic("applicationGuardBlockClipboardSharing")(applicationGuardBlockClipboardSharing.asInstanceOf[js.Any])
    if (applicationGuardBlockFileTransfer != null) __obj.updateDynamic("applicationGuardBlockFileTransfer")(applicationGuardBlockFileTransfer.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardBlockNonEnterpriseContent)) __obj.updateDynamic("applicationGuardBlockNonEnterpriseContent")(applicationGuardBlockNonEnterpriseContent.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardEnabled)) __obj.updateDynamic("applicationGuardEnabled")(applicationGuardEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationGuardForceAuditing)) __obj.updateDynamic("applicationGuardForceAuditing")(applicationGuardForceAuditing.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(bitLockerDisableWarningForOtherDiskEncryption)) __obj.updateDynamic("bitLockerDisableWarningForOtherDiskEncryption")(bitLockerDisableWarningForOtherDiskEncryption.asInstanceOf[js.Any])
    if (!js.isUndefined(bitLockerEnableStorageCardEncryptionOnMobile)) __obj.updateDynamic("bitLockerEnableStorageCardEncryptionOnMobile")(bitLockerEnableStorageCardEncryptionOnMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(bitLockerEncryptDevice)) __obj.updateDynamic("bitLockerEncryptDevice")(bitLockerEncryptDevice.asInstanceOf[js.Any])
    if (bitLockerRemovableDrivePolicy != null) __obj.updateDynamic("bitLockerRemovableDrivePolicy")(bitLockerRemovableDrivePolicy.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (defenderAdditionalGuardedFolders != null) __obj.updateDynamic("defenderAdditionalGuardedFolders")(defenderAdditionalGuardedFolders.asInstanceOf[js.Any])
    if (defenderAttackSurfaceReductionExcludedPaths != null) __obj.updateDynamic("defenderAttackSurfaceReductionExcludedPaths")(defenderAttackSurfaceReductionExcludedPaths.asInstanceOf[js.Any])
    if (defenderExploitProtectionXml != null) __obj.updateDynamic("defenderExploitProtectionXml")(defenderExploitProtectionXml.asInstanceOf[js.Any])
    if (defenderExploitProtectionXmlFileName != null) __obj.updateDynamic("defenderExploitProtectionXmlFileName")(defenderExploitProtectionXmlFileName.asInstanceOf[js.Any])
    if (defenderGuardedFoldersAllowedAppPaths != null) __obj.updateDynamic("defenderGuardedFoldersAllowedAppPaths")(defenderGuardedFoldersAllowedAppPaths.asInstanceOf[js.Any])
    if (!js.isUndefined(defenderSecurityCenterBlockExploitProtectionOverride)) __obj.updateDynamic("defenderSecurityCenterBlockExploitProtectionOverride")(defenderSecurityCenterBlockExploitProtectionOverride.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallBlockStatefulFTP)) __obj.updateDynamic("firewallBlockStatefulFTP")(firewallBlockStatefulFTP.asInstanceOf[js.Any])
    if (firewallCertificateRevocationListCheckMethod != null) __obj.updateDynamic("firewallCertificateRevocationListCheckMethod")(firewallCertificateRevocationListCheckMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallIPSecExemptionsAllowDHCP)) __obj.updateDynamic("firewallIPSecExemptionsAllowDHCP")(firewallIPSecExemptionsAllowDHCP.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallIPSecExemptionsAllowICMP)) __obj.updateDynamic("firewallIPSecExemptionsAllowICMP")(firewallIPSecExemptionsAllowICMP.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallIPSecExemptionsAllowNeighborDiscovery)) __obj.updateDynamic("firewallIPSecExemptionsAllowNeighborDiscovery")(firewallIPSecExemptionsAllowNeighborDiscovery.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallIPSecExemptionsAllowRouterDiscovery)) __obj.updateDynamic("firewallIPSecExemptionsAllowRouterDiscovery")(firewallIPSecExemptionsAllowRouterDiscovery.asInstanceOf[js.Any])
    if (firewallIdleTimeoutForSecurityAssociationInSeconds != null) __obj.updateDynamic("firewallIdleTimeoutForSecurityAssociationInSeconds")(firewallIdleTimeoutForSecurityAssociationInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallMergeKeyingModuleSettings)) __obj.updateDynamic("firewallMergeKeyingModuleSettings")(firewallMergeKeyingModuleSettings.asInstanceOf[js.Any])
    if (firewallPacketQueueingMethod != null) __obj.updateDynamic("firewallPacketQueueingMethod")(firewallPacketQueueingMethod.asInstanceOf[js.Any])
    if (firewallPreSharedKeyEncodingMethod != null) __obj.updateDynamic("firewallPreSharedKeyEncodingMethod")(firewallPreSharedKeyEncodingMethod.asInstanceOf[js.Any])
    if (firewallProfileDomain != null) __obj.updateDynamic("firewallProfileDomain")(firewallProfileDomain.asInstanceOf[js.Any])
    if (firewallProfilePrivate != null) __obj.updateDynamic("firewallProfilePrivate")(firewallProfilePrivate.asInstanceOf[js.Any])
    if (firewallProfilePublic != null) __obj.updateDynamic("firewallProfilePublic")(firewallProfilePublic.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(smartScreenBlockOverrideForFiles)) __obj.updateDynamic("smartScreenBlockOverrideForFiles")(smartScreenBlockOverrideForFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(smartScreenEnableInShell)) __obj.updateDynamic("smartScreenEnableInShell")(smartScreenEnableInShell.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10EndpointProtectionConfiguration]
  }
}

