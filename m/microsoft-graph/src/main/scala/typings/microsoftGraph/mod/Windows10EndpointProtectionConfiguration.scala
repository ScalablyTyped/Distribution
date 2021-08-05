package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows10EndpointProtectionConfiguration
  extends StObject
     with DeviceConfiguration {
  
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
  var bitLockerRemovableDrivePolicy: js.UndefOr[NullableOption[BitLockerRemovableDrivePolicy]] = js.undefined
  
  // List of folder paths to be added to the list of protected folders
  var defenderAdditionalGuardedFolders: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // List of exe files and folders to be excluded from attack surface reduction rules
  var defenderAttackSurfaceReductionExcludedPaths: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Xml content containing information regarding exploit protection details.
  var defenderExploitProtectionXml: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Name of the file from which DefenderExploitProtectionXml was obtained.
  var defenderExploitProtectionXmlFileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of paths to exe that are allowed to access protected folders
  var defenderGuardedFoldersAllowedAppPaths: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Indicates whether or not to block user from overriding Exploit Protection settings.
  var defenderSecurityCenterBlockExploitProtectionOverride: js.UndefOr[Boolean] = js.undefined
  
  // Blocks stateful FTP connections to the device
  var firewallBlockStatefulFTP: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
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
  var firewallIdleTimeoutForSecurityAssociationInSeconds: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported
    * authentication suites rather than the entire set
    */
  var firewallMergeKeyingModuleSettings: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Configures how packet queueing should be applied in the tunnel gateway scenario. Possible values are: deviceDefault,
    * disabled, queueInbound, queueOutbound, queueBoth.
    */
  var firewallPacketQueueingMethod: js.UndefOr[FirewallPacketQueueingMethodType] = js.undefined
  
  // Select the preshared key encoding to be used. Possible values are: deviceDefault, none, utF8.
  var firewallPreSharedKeyEncodingMethod: js.UndefOr[FirewallPreSharedKeyEncodingMethodType] = js.undefined
  
  // Configures the firewall profile settings for domain networks
  var firewallProfileDomain: js.UndefOr[NullableOption[WindowsFirewallNetworkProfile]] = js.undefined
  
  // Configures the firewall profile settings for private networks
  var firewallProfilePrivate: js.UndefOr[NullableOption[WindowsFirewallNetworkProfile]] = js.undefined
  
  // Configures the firewall profile settings for public networks
  var firewallProfilePublic: js.UndefOr[NullableOption[WindowsFirewallNetworkProfile]] = js.undefined
  
  // Allows IT Admins to control whether users can ignore SmartScreen warnings and run malicious files.
  var smartScreenBlockOverrideForFiles: js.UndefOr[Boolean] = js.undefined
  
  // Allows IT Admins to configure SmartScreen for Windows.
  var smartScreenEnableInShell: js.UndefOr[Boolean] = js.undefined
}
object Windows10EndpointProtectionConfiguration {
  
  inline def apply(): Windows10EndpointProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10EndpointProtectionConfiguration]
  }
  
  extension [Self <: Windows10EndpointProtectionConfiguration](x: Self) {
    
    inline def setAppLockerApplicationControl(value: AppLockerApplicationControlType): Self = StObject.set(x, "appLockerApplicationControl", value.asInstanceOf[js.Any])
    
    inline def setAppLockerApplicationControlUndefined: Self = StObject.set(x, "appLockerApplicationControl", js.undefined)
    
    inline def setApplicationGuardAllowPersistence(value: Boolean): Self = StObject.set(x, "applicationGuardAllowPersistence", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardAllowPersistenceUndefined: Self = StObject.set(x, "applicationGuardAllowPersistence", js.undefined)
    
    inline def setApplicationGuardAllowPrintToLocalPrinters(value: Boolean): Self = StObject.set(x, "applicationGuardAllowPrintToLocalPrinters", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardAllowPrintToLocalPrintersUndefined: Self = StObject.set(x, "applicationGuardAllowPrintToLocalPrinters", js.undefined)
    
    inline def setApplicationGuardAllowPrintToNetworkPrinters(value: Boolean): Self = StObject.set(x, "applicationGuardAllowPrintToNetworkPrinters", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardAllowPrintToNetworkPrintersUndefined: Self = StObject.set(x, "applicationGuardAllowPrintToNetworkPrinters", js.undefined)
    
    inline def setApplicationGuardAllowPrintToPDF(value: Boolean): Self = StObject.set(x, "applicationGuardAllowPrintToPDF", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardAllowPrintToPDFUndefined: Self = StObject.set(x, "applicationGuardAllowPrintToPDF", js.undefined)
    
    inline def setApplicationGuardAllowPrintToXPS(value: Boolean): Self = StObject.set(x, "applicationGuardAllowPrintToXPS", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardAllowPrintToXPSUndefined: Self = StObject.set(x, "applicationGuardAllowPrintToXPS", js.undefined)
    
    inline def setApplicationGuardBlockClipboardSharing(value: ApplicationGuardBlockClipboardSharingType): Self = StObject.set(x, "applicationGuardBlockClipboardSharing", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardBlockClipboardSharingUndefined: Self = StObject.set(x, "applicationGuardBlockClipboardSharing", js.undefined)
    
    inline def setApplicationGuardBlockFileTransfer(value: ApplicationGuardBlockFileTransferType): Self = StObject.set(x, "applicationGuardBlockFileTransfer", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardBlockFileTransferUndefined: Self = StObject.set(x, "applicationGuardBlockFileTransfer", js.undefined)
    
    inline def setApplicationGuardBlockNonEnterpriseContent(value: Boolean): Self = StObject.set(x, "applicationGuardBlockNonEnterpriseContent", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardBlockNonEnterpriseContentUndefined: Self = StObject.set(x, "applicationGuardBlockNonEnterpriseContent", js.undefined)
    
    inline def setApplicationGuardEnabled(value: Boolean): Self = StObject.set(x, "applicationGuardEnabled", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardEnabledUndefined: Self = StObject.set(x, "applicationGuardEnabled", js.undefined)
    
    inline def setApplicationGuardForceAuditing(value: Boolean): Self = StObject.set(x, "applicationGuardForceAuditing", value.asInstanceOf[js.Any])
    
    inline def setApplicationGuardForceAuditingUndefined: Self = StObject.set(x, "applicationGuardForceAuditing", js.undefined)
    
    inline def setBitLockerDisableWarningForOtherDiskEncryption(value: Boolean): Self = StObject.set(x, "bitLockerDisableWarningForOtherDiskEncryption", value.asInstanceOf[js.Any])
    
    inline def setBitLockerDisableWarningForOtherDiskEncryptionUndefined: Self = StObject.set(x, "bitLockerDisableWarningForOtherDiskEncryption", js.undefined)
    
    inline def setBitLockerEnableStorageCardEncryptionOnMobile(value: Boolean): Self = StObject.set(x, "bitLockerEnableStorageCardEncryptionOnMobile", value.asInstanceOf[js.Any])
    
    inline def setBitLockerEnableStorageCardEncryptionOnMobileUndefined: Self = StObject.set(x, "bitLockerEnableStorageCardEncryptionOnMobile", js.undefined)
    
    inline def setBitLockerEncryptDevice(value: Boolean): Self = StObject.set(x, "bitLockerEncryptDevice", value.asInstanceOf[js.Any])
    
    inline def setBitLockerEncryptDeviceUndefined: Self = StObject.set(x, "bitLockerEncryptDevice", js.undefined)
    
    inline def setBitLockerRemovableDrivePolicy(value: NullableOption[BitLockerRemovableDrivePolicy]): Self = StObject.set(x, "bitLockerRemovableDrivePolicy", value.asInstanceOf[js.Any])
    
    inline def setBitLockerRemovableDrivePolicyNull: Self = StObject.set(x, "bitLockerRemovableDrivePolicy", null)
    
    inline def setBitLockerRemovableDrivePolicyUndefined: Self = StObject.set(x, "bitLockerRemovableDrivePolicy", js.undefined)
    
    inline def setDefenderAdditionalGuardedFolders(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "defenderAdditionalGuardedFolders", value.asInstanceOf[js.Any])
    
    inline def setDefenderAdditionalGuardedFoldersNull: Self = StObject.set(x, "defenderAdditionalGuardedFolders", null)
    
    inline def setDefenderAdditionalGuardedFoldersUndefined: Self = StObject.set(x, "defenderAdditionalGuardedFolders", js.undefined)
    
    inline def setDefenderAdditionalGuardedFoldersVarargs(value: String*): Self = StObject.set(x, "defenderAdditionalGuardedFolders", js.Array(value :_*))
    
    inline def setDefenderAttackSurfaceReductionExcludedPaths(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "defenderAttackSurfaceReductionExcludedPaths", value.asInstanceOf[js.Any])
    
    inline def setDefenderAttackSurfaceReductionExcludedPathsNull: Self = StObject.set(x, "defenderAttackSurfaceReductionExcludedPaths", null)
    
    inline def setDefenderAttackSurfaceReductionExcludedPathsUndefined: Self = StObject.set(x, "defenderAttackSurfaceReductionExcludedPaths", js.undefined)
    
    inline def setDefenderAttackSurfaceReductionExcludedPathsVarargs(value: String*): Self = StObject.set(x, "defenderAttackSurfaceReductionExcludedPaths", js.Array(value :_*))
    
    inline def setDefenderExploitProtectionXml(value: NullableOption[Double]): Self = StObject.set(x, "defenderExploitProtectionXml", value.asInstanceOf[js.Any])
    
    inline def setDefenderExploitProtectionXmlFileName(value: NullableOption[String]): Self = StObject.set(x, "defenderExploitProtectionXmlFileName", value.asInstanceOf[js.Any])
    
    inline def setDefenderExploitProtectionXmlFileNameNull: Self = StObject.set(x, "defenderExploitProtectionXmlFileName", null)
    
    inline def setDefenderExploitProtectionXmlFileNameUndefined: Self = StObject.set(x, "defenderExploitProtectionXmlFileName", js.undefined)
    
    inline def setDefenderExploitProtectionXmlNull: Self = StObject.set(x, "defenderExploitProtectionXml", null)
    
    inline def setDefenderExploitProtectionXmlUndefined: Self = StObject.set(x, "defenderExploitProtectionXml", js.undefined)
    
    inline def setDefenderGuardedFoldersAllowedAppPaths(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "defenderGuardedFoldersAllowedAppPaths", value.asInstanceOf[js.Any])
    
    inline def setDefenderGuardedFoldersAllowedAppPathsNull: Self = StObject.set(x, "defenderGuardedFoldersAllowedAppPaths", null)
    
    inline def setDefenderGuardedFoldersAllowedAppPathsUndefined: Self = StObject.set(x, "defenderGuardedFoldersAllowedAppPaths", js.undefined)
    
    inline def setDefenderGuardedFoldersAllowedAppPathsVarargs(value: String*): Self = StObject.set(x, "defenderGuardedFoldersAllowedAppPaths", js.Array(value :_*))
    
    inline def setDefenderSecurityCenterBlockExploitProtectionOverride(value: Boolean): Self = StObject.set(x, "defenderSecurityCenterBlockExploitProtectionOverride", value.asInstanceOf[js.Any])
    
    inline def setDefenderSecurityCenterBlockExploitProtectionOverrideUndefined: Self = StObject.set(x, "defenderSecurityCenterBlockExploitProtectionOverride", js.undefined)
    
    inline def setFirewallBlockStatefulFTP(value: NullableOption[Boolean]): Self = StObject.set(x, "firewallBlockStatefulFTP", value.asInstanceOf[js.Any])
    
    inline def setFirewallBlockStatefulFTPNull: Self = StObject.set(x, "firewallBlockStatefulFTP", null)
    
    inline def setFirewallBlockStatefulFTPUndefined: Self = StObject.set(x, "firewallBlockStatefulFTP", js.undefined)
    
    inline def setFirewallCertificateRevocationListCheckMethod(value: FirewallCertificateRevocationListCheckMethodType): Self = StObject.set(x, "firewallCertificateRevocationListCheckMethod", value.asInstanceOf[js.Any])
    
    inline def setFirewallCertificateRevocationListCheckMethodUndefined: Self = StObject.set(x, "firewallCertificateRevocationListCheckMethod", js.undefined)
    
    inline def setFirewallIPSecExemptionsAllowDHCP(value: Boolean): Self = StObject.set(x, "firewallIPSecExemptionsAllowDHCP", value.asInstanceOf[js.Any])
    
    inline def setFirewallIPSecExemptionsAllowDHCPUndefined: Self = StObject.set(x, "firewallIPSecExemptionsAllowDHCP", js.undefined)
    
    inline def setFirewallIPSecExemptionsAllowICMP(value: Boolean): Self = StObject.set(x, "firewallIPSecExemptionsAllowICMP", value.asInstanceOf[js.Any])
    
    inline def setFirewallIPSecExemptionsAllowICMPUndefined: Self = StObject.set(x, "firewallIPSecExemptionsAllowICMP", js.undefined)
    
    inline def setFirewallIPSecExemptionsAllowNeighborDiscovery(value: Boolean): Self = StObject.set(x, "firewallIPSecExemptionsAllowNeighborDiscovery", value.asInstanceOf[js.Any])
    
    inline def setFirewallIPSecExemptionsAllowNeighborDiscoveryUndefined: Self = StObject.set(x, "firewallIPSecExemptionsAllowNeighborDiscovery", js.undefined)
    
    inline def setFirewallIPSecExemptionsAllowRouterDiscovery(value: Boolean): Self = StObject.set(x, "firewallIPSecExemptionsAllowRouterDiscovery", value.asInstanceOf[js.Any])
    
    inline def setFirewallIPSecExemptionsAllowRouterDiscoveryUndefined: Self = StObject.set(x, "firewallIPSecExemptionsAllowRouterDiscovery", js.undefined)
    
    inline def setFirewallIdleTimeoutForSecurityAssociationInSeconds(value: NullableOption[Double]): Self = StObject.set(x, "firewallIdleTimeoutForSecurityAssociationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setFirewallIdleTimeoutForSecurityAssociationInSecondsNull: Self = StObject.set(x, "firewallIdleTimeoutForSecurityAssociationInSeconds", null)
    
    inline def setFirewallIdleTimeoutForSecurityAssociationInSecondsUndefined: Self = StObject.set(x, "firewallIdleTimeoutForSecurityAssociationInSeconds", js.undefined)
    
    inline def setFirewallMergeKeyingModuleSettings(value: NullableOption[Boolean]): Self = StObject.set(x, "firewallMergeKeyingModuleSettings", value.asInstanceOf[js.Any])
    
    inline def setFirewallMergeKeyingModuleSettingsNull: Self = StObject.set(x, "firewallMergeKeyingModuleSettings", null)
    
    inline def setFirewallMergeKeyingModuleSettingsUndefined: Self = StObject.set(x, "firewallMergeKeyingModuleSettings", js.undefined)
    
    inline def setFirewallPacketQueueingMethod(value: FirewallPacketQueueingMethodType): Self = StObject.set(x, "firewallPacketQueueingMethod", value.asInstanceOf[js.Any])
    
    inline def setFirewallPacketQueueingMethodUndefined: Self = StObject.set(x, "firewallPacketQueueingMethod", js.undefined)
    
    inline def setFirewallPreSharedKeyEncodingMethod(value: FirewallPreSharedKeyEncodingMethodType): Self = StObject.set(x, "firewallPreSharedKeyEncodingMethod", value.asInstanceOf[js.Any])
    
    inline def setFirewallPreSharedKeyEncodingMethodUndefined: Self = StObject.set(x, "firewallPreSharedKeyEncodingMethod", js.undefined)
    
    inline def setFirewallProfileDomain(value: NullableOption[WindowsFirewallNetworkProfile]): Self = StObject.set(x, "firewallProfileDomain", value.asInstanceOf[js.Any])
    
    inline def setFirewallProfileDomainNull: Self = StObject.set(x, "firewallProfileDomain", null)
    
    inline def setFirewallProfileDomainUndefined: Self = StObject.set(x, "firewallProfileDomain", js.undefined)
    
    inline def setFirewallProfilePrivate(value: NullableOption[WindowsFirewallNetworkProfile]): Self = StObject.set(x, "firewallProfilePrivate", value.asInstanceOf[js.Any])
    
    inline def setFirewallProfilePrivateNull: Self = StObject.set(x, "firewallProfilePrivate", null)
    
    inline def setFirewallProfilePrivateUndefined: Self = StObject.set(x, "firewallProfilePrivate", js.undefined)
    
    inline def setFirewallProfilePublic(value: NullableOption[WindowsFirewallNetworkProfile]): Self = StObject.set(x, "firewallProfilePublic", value.asInstanceOf[js.Any])
    
    inline def setFirewallProfilePublicNull: Self = StObject.set(x, "firewallProfilePublic", null)
    
    inline def setFirewallProfilePublicUndefined: Self = StObject.set(x, "firewallProfilePublic", js.undefined)
    
    inline def setSmartScreenBlockOverrideForFiles(value: Boolean): Self = StObject.set(x, "smartScreenBlockOverrideForFiles", value.asInstanceOf[js.Any])
    
    inline def setSmartScreenBlockOverrideForFilesUndefined: Self = StObject.set(x, "smartScreenBlockOverrideForFiles", js.undefined)
    
    inline def setSmartScreenEnableInShell(value: Boolean): Self = StObject.set(x, "smartScreenEnableInShell", value.asInstanceOf[js.Any])
    
    inline def setSmartScreenEnableInShellUndefined: Self = StObject.set(x, "smartScreenEnableInShell", js.undefined)
  }
}
