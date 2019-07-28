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
  // Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
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
    if (appLockerApplicationControl != null) __obj.updateDynamic("appLockerApplicationControl")(appLockerApplicationControl)
    if (!js.isUndefined(applicationGuardAllowPersistence)) __obj.updateDynamic("applicationGuardAllowPersistence")(applicationGuardAllowPersistence)
    if (!js.isUndefined(applicationGuardAllowPrintToLocalPrinters)) __obj.updateDynamic("applicationGuardAllowPrintToLocalPrinters")(applicationGuardAllowPrintToLocalPrinters)
    if (!js.isUndefined(applicationGuardAllowPrintToNetworkPrinters)) __obj.updateDynamic("applicationGuardAllowPrintToNetworkPrinters")(applicationGuardAllowPrintToNetworkPrinters)
    if (!js.isUndefined(applicationGuardAllowPrintToPDF)) __obj.updateDynamic("applicationGuardAllowPrintToPDF")(applicationGuardAllowPrintToPDF)
    if (!js.isUndefined(applicationGuardAllowPrintToXPS)) __obj.updateDynamic("applicationGuardAllowPrintToXPS")(applicationGuardAllowPrintToXPS)
    if (applicationGuardBlockClipboardSharing != null) __obj.updateDynamic("applicationGuardBlockClipboardSharing")(applicationGuardBlockClipboardSharing)
    if (applicationGuardBlockFileTransfer != null) __obj.updateDynamic("applicationGuardBlockFileTransfer")(applicationGuardBlockFileTransfer)
    if (!js.isUndefined(applicationGuardBlockNonEnterpriseContent)) __obj.updateDynamic("applicationGuardBlockNonEnterpriseContent")(applicationGuardBlockNonEnterpriseContent)
    if (!js.isUndefined(applicationGuardEnabled)) __obj.updateDynamic("applicationGuardEnabled")(applicationGuardEnabled)
    if (!js.isUndefined(applicationGuardForceAuditing)) __obj.updateDynamic("applicationGuardForceAuditing")(applicationGuardForceAuditing)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(bitLockerDisableWarningForOtherDiskEncryption)) __obj.updateDynamic("bitLockerDisableWarningForOtherDiskEncryption")(bitLockerDisableWarningForOtherDiskEncryption)
    if (!js.isUndefined(bitLockerEnableStorageCardEncryptionOnMobile)) __obj.updateDynamic("bitLockerEnableStorageCardEncryptionOnMobile")(bitLockerEnableStorageCardEncryptionOnMobile)
    if (!js.isUndefined(bitLockerEncryptDevice)) __obj.updateDynamic("bitLockerEncryptDevice")(bitLockerEncryptDevice)
    if (bitLockerRemovableDrivePolicy != null) __obj.updateDynamic("bitLockerRemovableDrivePolicy")(bitLockerRemovableDrivePolicy)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (defenderAdditionalGuardedFolders != null) __obj.updateDynamic("defenderAdditionalGuardedFolders")(defenderAdditionalGuardedFolders)
    if (defenderAttackSurfaceReductionExcludedPaths != null) __obj.updateDynamic("defenderAttackSurfaceReductionExcludedPaths")(defenderAttackSurfaceReductionExcludedPaths)
    if (defenderExploitProtectionXml != null) __obj.updateDynamic("defenderExploitProtectionXml")(defenderExploitProtectionXml.asInstanceOf[js.Any])
    if (defenderExploitProtectionXmlFileName != null) __obj.updateDynamic("defenderExploitProtectionXmlFileName")(defenderExploitProtectionXmlFileName)
    if (defenderGuardedFoldersAllowedAppPaths != null) __obj.updateDynamic("defenderGuardedFoldersAllowedAppPaths")(defenderGuardedFoldersAllowedAppPaths)
    if (!js.isUndefined(defenderSecurityCenterBlockExploitProtectionOverride)) __obj.updateDynamic("defenderSecurityCenterBlockExploitProtectionOverride")(defenderSecurityCenterBlockExploitProtectionOverride)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(firewallBlockStatefulFTP)) __obj.updateDynamic("firewallBlockStatefulFTP")(firewallBlockStatefulFTP)
    if (firewallCertificateRevocationListCheckMethod != null) __obj.updateDynamic("firewallCertificateRevocationListCheckMethod")(firewallCertificateRevocationListCheckMethod)
    if (!js.isUndefined(firewallIPSecExemptionsAllowDHCP)) __obj.updateDynamic("firewallIPSecExemptionsAllowDHCP")(firewallIPSecExemptionsAllowDHCP)
    if (!js.isUndefined(firewallIPSecExemptionsAllowICMP)) __obj.updateDynamic("firewallIPSecExemptionsAllowICMP")(firewallIPSecExemptionsAllowICMP)
    if (!js.isUndefined(firewallIPSecExemptionsAllowNeighborDiscovery)) __obj.updateDynamic("firewallIPSecExemptionsAllowNeighborDiscovery")(firewallIPSecExemptionsAllowNeighborDiscovery)
    if (!js.isUndefined(firewallIPSecExemptionsAllowRouterDiscovery)) __obj.updateDynamic("firewallIPSecExemptionsAllowRouterDiscovery")(firewallIPSecExemptionsAllowRouterDiscovery)
    if (firewallIdleTimeoutForSecurityAssociationInSeconds != null) __obj.updateDynamic("firewallIdleTimeoutForSecurityAssociationInSeconds")(firewallIdleTimeoutForSecurityAssociationInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(firewallMergeKeyingModuleSettings)) __obj.updateDynamic("firewallMergeKeyingModuleSettings")(firewallMergeKeyingModuleSettings)
    if (firewallPacketQueueingMethod != null) __obj.updateDynamic("firewallPacketQueueingMethod")(firewallPacketQueueingMethod)
    if (firewallPreSharedKeyEncodingMethod != null) __obj.updateDynamic("firewallPreSharedKeyEncodingMethod")(firewallPreSharedKeyEncodingMethod)
    if (firewallProfileDomain != null) __obj.updateDynamic("firewallProfileDomain")(firewallProfileDomain)
    if (firewallProfilePrivate != null) __obj.updateDynamic("firewallProfilePrivate")(firewallProfilePrivate)
    if (firewallProfilePublic != null) __obj.updateDynamic("firewallProfilePublic")(firewallProfilePublic)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(smartScreenBlockOverrideForFiles)) __obj.updateDynamic("smartScreenBlockOverrideForFiles")(smartScreenBlockOverrideForFiles)
    if (!js.isUndefined(smartScreenEnableInShell)) __obj.updateDynamic("smartScreenEnableInShell")(smartScreenEnableInShell)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Windows10EndpointProtectionConfiguration]
  }
}

