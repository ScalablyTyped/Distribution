package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10EndpointProtectionConfiguration extends DeviceConfiguration {
  /**
    * Enables the Admin to choose what types of app to allow on devices. Possible values are: notConfigured,
    * enforceComponentsAndStoreApps, auditComponentsAndStoreApps, enforceComponentsStoreAppsAndSmartlocker,
    * auditComponentsStoreAppsAndSmartlocker.
    */
  var appLockerApplicationControl: js.UndefOr[AppLockerApplicationControlType] = js.native
  // Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
  var applicationGuardAllowPersistence: js.UndefOr[Boolean] = js.native
  // Allow printing to Local Printers from Container
  var applicationGuardAllowPrintToLocalPrinters: js.UndefOr[Boolean] = js.native
  // Allow printing to Network Printers from Container
  var applicationGuardAllowPrintToNetworkPrinters: js.UndefOr[Boolean] = js.native
  // Allow printing to PDF from Container
  var applicationGuardAllowPrintToPDF: js.UndefOr[Boolean] = js.native
  // Allow printing to XPS from Container
  var applicationGuardAllowPrintToXPS: js.UndefOr[Boolean] = js.native
  /**
    * Block clipboard to share data from Host to Container, or from Container to Host, or both ways, or neither ways.
    * Possible values are: notConfigured, blockBoth, blockHostToContainer, blockContainerToHost, blockNone.
    */
  var applicationGuardBlockClipboardSharing: js.UndefOr[ApplicationGuardBlockClipboardSharingType] = js.native
  /**
    * Block clipboard to transfer image file, text file or neither of them. Possible values are: notConfigured,
    * blockImageAndTextFile, blockImageFile, blockNone, blockTextFile.
    */
  var applicationGuardBlockFileTransfer: js.UndefOr[ApplicationGuardBlockFileTransferType] = js.native
  // Block enterprise sites to load non-enterprise content, such as third party plug-ins
  var applicationGuardBlockNonEnterpriseContent: js.UndefOr[Boolean] = js.native
  // Enable Windows Defender Application Guard
  var applicationGuardEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user
    * login-logoff, use of privilege rights, software installation, system changes, etc.)
    */
  var applicationGuardForceAuditing: js.UndefOr[Boolean] = js.native
  // Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
  var bitLockerDisableWarningForOtherDiskEncryption: js.UndefOr[Boolean] = js.native
  // Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
  var bitLockerEnableStorageCardEncryptionOnMobile: js.UndefOr[Boolean] = js.native
  // Allows the admin to require encryption to be turned on using BitLocker.
  var bitLockerEncryptDevice: js.UndefOr[Boolean] = js.native
  // BitLocker Removable Drive Policy.
  var bitLockerRemovableDrivePolicy: js.UndefOr[BitLockerRemovableDrivePolicy] = js.native
  // List of folder paths to be added to the list of protected folders
  var defenderAdditionalGuardedFolders: js.UndefOr[js.Array[String]] = js.native
  // List of exe files and folders to be excluded from attack surface reduction rules
  var defenderAttackSurfaceReductionExcludedPaths: js.UndefOr[js.Array[String]] = js.native
  // Xml content containing information regarding exploit protection details.
  var defenderExploitProtectionXml: js.UndefOr[Double] = js.native
  // Name of the file from which DefenderExploitProtectionXml was obtained.
  var defenderExploitProtectionXmlFileName: js.UndefOr[String] = js.native
  // List of paths to exe that are allowed to access protected folders
  var defenderGuardedFoldersAllowedAppPaths: js.UndefOr[js.Array[String]] = js.native
  // Indicates whether or not to block user from overriding Exploit Protection settings.
  var defenderSecurityCenterBlockExploitProtectionOverride: js.UndefOr[Boolean] = js.native
  // Blocks stateful FTP connections to the device
  var firewallBlockStatefulFTP: js.UndefOr[Boolean] = js.native
  /**
    * Specify how the certificate revocation list is to be enforced. Possible values are: deviceDefault, none, attempt,
    * require.
    */
  var firewallCertificateRevocationListCheckMethod: js.UndefOr[FirewallCertificateRevocationListCheckMethodType] = js.native
  // Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
  var firewallIPSecExemptionsAllowDHCP: js.UndefOr[Boolean] = js.native
  // Configures IPSec exemptions to allow ICMP
  var firewallIPSecExemptionsAllowICMP: js.UndefOr[Boolean] = js.native
  // Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
  var firewallIPSecExemptionsAllowNeighborDiscovery: js.UndefOr[Boolean] = js.native
  // Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
  var firewallIPSecExemptionsAllowRouterDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after
    * which security associations will expire and be deleted. Valid values 300 to 3600
    */
  var firewallIdleTimeoutForSecurityAssociationInSeconds: js.UndefOr[Double] = js.native
  /**
    * If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported
    * authentication suites rather than the entire set
    */
  var firewallMergeKeyingModuleSettings: js.UndefOr[Boolean] = js.native
  /**
    * Configures how packet queueing should be applied in the tunnel gateway scenario. Possible values are: deviceDefault,
    * disabled, queueInbound, queueOutbound, queueBoth.
    */
  var firewallPacketQueueingMethod: js.UndefOr[FirewallPacketQueueingMethodType] = js.native
  // Select the preshared key encoding to be used. Possible values are: deviceDefault, none, utF8.
  var firewallPreSharedKeyEncodingMethod: js.UndefOr[FirewallPreSharedKeyEncodingMethodType] = js.native
  // Configures the firewall profile settings for domain networks
  var firewallProfileDomain: js.UndefOr[WindowsFirewallNetworkProfile] = js.native
  // Configures the firewall profile settings for private networks
  var firewallProfilePrivate: js.UndefOr[WindowsFirewallNetworkProfile] = js.native
  // Configures the firewall profile settings for public networks
  var firewallProfilePublic: js.UndefOr[WindowsFirewallNetworkProfile] = js.native
  // Allows IT Admins to control whether users can ignore SmartScreen warnings and run malicious files.
  var smartScreenBlockOverrideForFiles: js.UndefOr[Boolean] = js.native
  // Allows IT Admins to configure SmartScreen for Windows.
  var smartScreenEnableInShell: js.UndefOr[Boolean] = js.native
}

object Windows10EndpointProtectionConfiguration {
  @scala.inline
  def apply(): Windows10EndpointProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10EndpointProtectionConfiguration]
  }
  @scala.inline
  implicit class Windows10EndpointProtectionConfigurationOps[Self <: Windows10EndpointProtectionConfiguration] (val x: Self) extends AnyVal {
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
    def setAppLockerApplicationControl(value: AppLockerApplicationControlType): Self = this.set("appLockerApplicationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppLockerApplicationControl: Self = this.set("appLockerApplicationControl", js.undefined)
    @scala.inline
    def setApplicationGuardAllowPersistence(value: Boolean): Self = this.set("applicationGuardAllowPersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardAllowPersistence: Self = this.set("applicationGuardAllowPersistence", js.undefined)
    @scala.inline
    def setApplicationGuardAllowPrintToLocalPrinters(value: Boolean): Self = this.set("applicationGuardAllowPrintToLocalPrinters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardAllowPrintToLocalPrinters: Self = this.set("applicationGuardAllowPrintToLocalPrinters", js.undefined)
    @scala.inline
    def setApplicationGuardAllowPrintToNetworkPrinters(value: Boolean): Self = this.set("applicationGuardAllowPrintToNetworkPrinters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardAllowPrintToNetworkPrinters: Self = this.set("applicationGuardAllowPrintToNetworkPrinters", js.undefined)
    @scala.inline
    def setApplicationGuardAllowPrintToPDF(value: Boolean): Self = this.set("applicationGuardAllowPrintToPDF", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardAllowPrintToPDF: Self = this.set("applicationGuardAllowPrintToPDF", js.undefined)
    @scala.inline
    def setApplicationGuardAllowPrintToXPS(value: Boolean): Self = this.set("applicationGuardAllowPrintToXPS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardAllowPrintToXPS: Self = this.set("applicationGuardAllowPrintToXPS", js.undefined)
    @scala.inline
    def setApplicationGuardBlockClipboardSharing(value: ApplicationGuardBlockClipboardSharingType): Self = this.set("applicationGuardBlockClipboardSharing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardBlockClipboardSharing: Self = this.set("applicationGuardBlockClipboardSharing", js.undefined)
    @scala.inline
    def setApplicationGuardBlockFileTransfer(value: ApplicationGuardBlockFileTransferType): Self = this.set("applicationGuardBlockFileTransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardBlockFileTransfer: Self = this.set("applicationGuardBlockFileTransfer", js.undefined)
    @scala.inline
    def setApplicationGuardBlockNonEnterpriseContent(value: Boolean): Self = this.set("applicationGuardBlockNonEnterpriseContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardBlockNonEnterpriseContent: Self = this.set("applicationGuardBlockNonEnterpriseContent", js.undefined)
    @scala.inline
    def setApplicationGuardEnabled(value: Boolean): Self = this.set("applicationGuardEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardEnabled: Self = this.set("applicationGuardEnabled", js.undefined)
    @scala.inline
    def setApplicationGuardForceAuditing(value: Boolean): Self = this.set("applicationGuardForceAuditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationGuardForceAuditing: Self = this.set("applicationGuardForceAuditing", js.undefined)
    @scala.inline
    def setBitLockerDisableWarningForOtherDiskEncryption(value: Boolean): Self = this.set("bitLockerDisableWarningForOtherDiskEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitLockerDisableWarningForOtherDiskEncryption: Self = this.set("bitLockerDisableWarningForOtherDiskEncryption", js.undefined)
    @scala.inline
    def setBitLockerEnableStorageCardEncryptionOnMobile(value: Boolean): Self = this.set("bitLockerEnableStorageCardEncryptionOnMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitLockerEnableStorageCardEncryptionOnMobile: Self = this.set("bitLockerEnableStorageCardEncryptionOnMobile", js.undefined)
    @scala.inline
    def setBitLockerEncryptDevice(value: Boolean): Self = this.set("bitLockerEncryptDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitLockerEncryptDevice: Self = this.set("bitLockerEncryptDevice", js.undefined)
    @scala.inline
    def setBitLockerRemovableDrivePolicy(value: BitLockerRemovableDrivePolicy): Self = this.set("bitLockerRemovableDrivePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitLockerRemovableDrivePolicy: Self = this.set("bitLockerRemovableDrivePolicy", js.undefined)
    @scala.inline
    def setDefenderAdditionalGuardedFoldersVarargs(value: String*): Self = this.set("defenderAdditionalGuardedFolders", js.Array(value :_*))
    @scala.inline
    def setDefenderAdditionalGuardedFolders(value: js.Array[String]): Self = this.set("defenderAdditionalGuardedFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefenderAdditionalGuardedFolders: Self = this.set("defenderAdditionalGuardedFolders", js.undefined)
    @scala.inline
    def setDefenderAttackSurfaceReductionExcludedPathsVarargs(value: String*): Self = this.set("defenderAttackSurfaceReductionExcludedPaths", js.Array(value :_*))
    @scala.inline
    def setDefenderAttackSurfaceReductionExcludedPaths(value: js.Array[String]): Self = this.set("defenderAttackSurfaceReductionExcludedPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefenderAttackSurfaceReductionExcludedPaths: Self = this.set("defenderAttackSurfaceReductionExcludedPaths", js.undefined)
    @scala.inline
    def setDefenderExploitProtectionXml(value: Double): Self = this.set("defenderExploitProtectionXml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefenderExploitProtectionXml: Self = this.set("defenderExploitProtectionXml", js.undefined)
    @scala.inline
    def setDefenderExploitProtectionXmlFileName(value: String): Self = this.set("defenderExploitProtectionXmlFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefenderExploitProtectionXmlFileName: Self = this.set("defenderExploitProtectionXmlFileName", js.undefined)
    @scala.inline
    def setDefenderGuardedFoldersAllowedAppPathsVarargs(value: String*): Self = this.set("defenderGuardedFoldersAllowedAppPaths", js.Array(value :_*))
    @scala.inline
    def setDefenderGuardedFoldersAllowedAppPaths(value: js.Array[String]): Self = this.set("defenderGuardedFoldersAllowedAppPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefenderGuardedFoldersAllowedAppPaths: Self = this.set("defenderGuardedFoldersAllowedAppPaths", js.undefined)
    @scala.inline
    def setDefenderSecurityCenterBlockExploitProtectionOverride(value: Boolean): Self = this.set("defenderSecurityCenterBlockExploitProtectionOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefenderSecurityCenterBlockExploitProtectionOverride: Self = this.set("defenderSecurityCenterBlockExploitProtectionOverride", js.undefined)
    @scala.inline
    def setFirewallBlockStatefulFTP(value: Boolean): Self = this.set("firewallBlockStatefulFTP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallBlockStatefulFTP: Self = this.set("firewallBlockStatefulFTP", js.undefined)
    @scala.inline
    def setFirewallCertificateRevocationListCheckMethod(value: FirewallCertificateRevocationListCheckMethodType): Self = this.set("firewallCertificateRevocationListCheckMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallCertificateRevocationListCheckMethod: Self = this.set("firewallCertificateRevocationListCheckMethod", js.undefined)
    @scala.inline
    def setFirewallIPSecExemptionsAllowDHCP(value: Boolean): Self = this.set("firewallIPSecExemptionsAllowDHCP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallIPSecExemptionsAllowDHCP: Self = this.set("firewallIPSecExemptionsAllowDHCP", js.undefined)
    @scala.inline
    def setFirewallIPSecExemptionsAllowICMP(value: Boolean): Self = this.set("firewallIPSecExemptionsAllowICMP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallIPSecExemptionsAllowICMP: Self = this.set("firewallIPSecExemptionsAllowICMP", js.undefined)
    @scala.inline
    def setFirewallIPSecExemptionsAllowNeighborDiscovery(value: Boolean): Self = this.set("firewallIPSecExemptionsAllowNeighborDiscovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallIPSecExemptionsAllowNeighborDiscovery: Self = this.set("firewallIPSecExemptionsAllowNeighborDiscovery", js.undefined)
    @scala.inline
    def setFirewallIPSecExemptionsAllowRouterDiscovery(value: Boolean): Self = this.set("firewallIPSecExemptionsAllowRouterDiscovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallIPSecExemptionsAllowRouterDiscovery: Self = this.set("firewallIPSecExemptionsAllowRouterDiscovery", js.undefined)
    @scala.inline
    def setFirewallIdleTimeoutForSecurityAssociationInSeconds(value: Double): Self = this.set("firewallIdleTimeoutForSecurityAssociationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallIdleTimeoutForSecurityAssociationInSeconds: Self = this.set("firewallIdleTimeoutForSecurityAssociationInSeconds", js.undefined)
    @scala.inline
    def setFirewallMergeKeyingModuleSettings(value: Boolean): Self = this.set("firewallMergeKeyingModuleSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallMergeKeyingModuleSettings: Self = this.set("firewallMergeKeyingModuleSettings", js.undefined)
    @scala.inline
    def setFirewallPacketQueueingMethod(value: FirewallPacketQueueingMethodType): Self = this.set("firewallPacketQueueingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallPacketQueueingMethod: Self = this.set("firewallPacketQueueingMethod", js.undefined)
    @scala.inline
    def setFirewallPreSharedKeyEncodingMethod(value: FirewallPreSharedKeyEncodingMethodType): Self = this.set("firewallPreSharedKeyEncodingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallPreSharedKeyEncodingMethod: Self = this.set("firewallPreSharedKeyEncodingMethod", js.undefined)
    @scala.inline
    def setFirewallProfileDomain(value: WindowsFirewallNetworkProfile): Self = this.set("firewallProfileDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallProfileDomain: Self = this.set("firewallProfileDomain", js.undefined)
    @scala.inline
    def setFirewallProfilePrivate(value: WindowsFirewallNetworkProfile): Self = this.set("firewallProfilePrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallProfilePrivate: Self = this.set("firewallProfilePrivate", js.undefined)
    @scala.inline
    def setFirewallProfilePublic(value: WindowsFirewallNetworkProfile): Self = this.set("firewallProfilePublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirewallProfilePublic: Self = this.set("firewallProfilePublic", js.undefined)
    @scala.inline
    def setSmartScreenBlockOverrideForFiles(value: Boolean): Self = this.set("smartScreenBlockOverrideForFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartScreenBlockOverrideForFiles: Self = this.set("smartScreenBlockOverrideForFiles", js.undefined)
    @scala.inline
    def setSmartScreenEnableInShell(value: Boolean): Self = this.set("smartScreenEnableInShell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartScreenEnableInShell: Self = this.set("smartScreenEnableInShell", js.undefined)
  }
  
}

