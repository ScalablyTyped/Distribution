package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtection extends ManagedAppPolicy {
  
  // Navigation property to list of security groups targeted for policy.
  var assignments: js.UndefOr[NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]] = js.native
  
  // Specifies whether to allow Azure RMS encryption for WIP
  var azureRightsManagementServicesAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data
    * recovery agent(DRA) certificate for encrypting file system(EFS)
    */
  var dataRecoveryCertificate: js.UndefOr[NullableOption[WindowsInformationProtectionDataRecoveryCertificate]] = js.native
  
  /**
    * WIP enforcement level.See the Enum definition for supported values. Possible values are: noProtection,
    * encryptAndAuditOnly, encryptAuditAndPrompt, encryptAuditAndBlock.
    */
  var enforcementLevel: js.UndefOr[WindowsInformationProtectionEnforcementLevel] = js.native
  
  // Primary enterprise domain
  var enterpriseDomain: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers
    * will be considered part of the enterprise and protected. These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseIPRanges: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionIPRangeCollection]]] = js.native
  
  /**
    * Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other
    * subnets. Default is false
    */
  var enterpriseIPRangesAreAuthoritative: js.UndefOr[Boolean] = js.native
  
  /**
    * This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167,
    * 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the
    * Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the
    * EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
    */
  var enterpriseInternalProxyServers: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.native
  
  /**
    * This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent
    * to a device will be considered enterprise data and protected These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseNetworkDomainNames: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.native
  
  // List of enterprise domains to be protected
  var enterpriseProtectedDomainNames: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.native
  
  /**
    * Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these
    * resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource
    * will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this
    * purpose must also be configured using the EnterpriseInternalProxyServers policy
    */
  var enterpriseProxiedDomains: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionProxiedDomainCollection]]] = js.native
  
  // This is a list of proxy servers. Any server not on this list is considered non-enterprise
  var enterpriseProxyServers: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.native
  
  /**
    * Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies.
    * Default is false
    */
  var enterpriseProxyServersAreAuthoritative: js.UndefOr[Boolean] = js.native
  
  // Another way to input exempt apps through xml files
  var exemptAppLockerFiles: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]] = js.native
  
  /**
    * Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This
    * is because some critical enterprise applications may have compatibility problems with encrypted data.
    */
  var exemptApps: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionApp]]] = js.native
  
  /**
    * Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the
    * Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the
    * title bar of a WIP-protected app
    */
  var iconsVisible: js.UndefOr[Boolean] = js.native
  
  // This switch is for the Windows Search Indexer, to allow or disallow indexing of items
  var indexingEncryptedStoresOrItemsBlocked: js.UndefOr[Boolean] = js.native
  
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.native
  
  // List of domain names that can used for work or personal resource
  var neutralDomainResources: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.native
  
  // Another way to input protected apps through xml files
  var protectedAppLockerFiles: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]] = js.native
  
  /**
    * Protected applications can access enterprise data and the data handled by those applications are protected with
    * encryption
    */
  var protectedApps: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionApp]]] = js.native
  
  // Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
  var protectionUnderLockConfigRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1
    * (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after
    * unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
    */
  var revokeOnUnenrollDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has
    * access to RMS-protected file and how long they have access
    */
  var rightsManagementServicesTemplateId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share
    * within the corporate boundary
    */
  var smbAutoEncryptedFileExtensions: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.native
}
object WindowsInformationProtection {
  
  @scala.inline
  def apply(): WindowsInformationProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtection]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionMutableBuilder[Self <: WindowsInformationProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setAzureRightsManagementServicesAllowed(value: Boolean): Self = StObject.set(x, "azureRightsManagementServicesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureRightsManagementServicesAllowedUndefined: Self = StObject.set(x, "azureRightsManagementServicesAllowed", js.undefined)
    
    @scala.inline
    def setDataRecoveryCertificate(value: NullableOption[WindowsInformationProtectionDataRecoveryCertificate]): Self = StObject.set(x, "dataRecoveryCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRecoveryCertificateNull: Self = StObject.set(x, "dataRecoveryCertificate", null)
    
    @scala.inline
    def setDataRecoveryCertificateUndefined: Self = StObject.set(x, "dataRecoveryCertificate", js.undefined)
    
    @scala.inline
    def setEnforcementLevel(value: WindowsInformationProtectionEnforcementLevel): Self = StObject.set(x, "enforcementLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcementLevelUndefined: Self = StObject.set(x, "enforcementLevel", js.undefined)
    
    @scala.inline
    def setEnterpriseDomain(value: NullableOption[String]): Self = StObject.set(x, "enterpriseDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseDomainNull: Self = StObject.set(x, "enterpriseDomain", null)
    
    @scala.inline
    def setEnterpriseDomainUndefined: Self = StObject.set(x, "enterpriseDomain", js.undefined)
    
    @scala.inline
    def setEnterpriseIPRanges(value: NullableOption[js.Array[WindowsInformationProtectionIPRangeCollection]]): Self = StObject.set(x, "enterpriseIPRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIPRangesAreAuthoritative(value: Boolean): Self = StObject.set(x, "enterpriseIPRangesAreAuthoritative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIPRangesAreAuthoritativeUndefined: Self = StObject.set(x, "enterpriseIPRangesAreAuthoritative", js.undefined)
    
    @scala.inline
    def setEnterpriseIPRangesNull: Self = StObject.set(x, "enterpriseIPRanges", null)
    
    @scala.inline
    def setEnterpriseIPRangesUndefined: Self = StObject.set(x, "enterpriseIPRanges", js.undefined)
    
    @scala.inline
    def setEnterpriseIPRangesVarargs(value: WindowsInformationProtectionIPRangeCollection*): Self = StObject.set(x, "enterpriseIPRanges", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseInternalProxyServers(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseInternalProxyServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseInternalProxyServersNull: Self = StObject.set(x, "enterpriseInternalProxyServers", null)
    
    @scala.inline
    def setEnterpriseInternalProxyServersUndefined: Self = StObject.set(x, "enterpriseInternalProxyServers", js.undefined)
    
    @scala.inline
    def setEnterpriseInternalProxyServersVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseInternalProxyServers", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseNetworkDomainNames(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseNetworkDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseNetworkDomainNamesNull: Self = StObject.set(x, "enterpriseNetworkDomainNames", null)
    
    @scala.inline
    def setEnterpriseNetworkDomainNamesUndefined: Self = StObject.set(x, "enterpriseNetworkDomainNames", js.undefined)
    
    @scala.inline
    def setEnterpriseNetworkDomainNamesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseNetworkDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseProtectedDomainNames(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseProtectedDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseProtectedDomainNamesNull: Self = StObject.set(x, "enterpriseProtectedDomainNames", null)
    
    @scala.inline
    def setEnterpriseProtectedDomainNamesUndefined: Self = StObject.set(x, "enterpriseProtectedDomainNames", js.undefined)
    
    @scala.inline
    def setEnterpriseProtectedDomainNamesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseProtectedDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseProxiedDomains(value: NullableOption[js.Array[WindowsInformationProtectionProxiedDomainCollection]]): Self = StObject.set(x, "enterpriseProxiedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseProxiedDomainsNull: Self = StObject.set(x, "enterpriseProxiedDomains", null)
    
    @scala.inline
    def setEnterpriseProxiedDomainsUndefined: Self = StObject.set(x, "enterpriseProxiedDomains", js.undefined)
    
    @scala.inline
    def setEnterpriseProxiedDomainsVarargs(value: WindowsInformationProtectionProxiedDomainCollection*): Self = StObject.set(x, "enterpriseProxiedDomains", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseProxyServers(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseProxyServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseProxyServersAreAuthoritative(value: Boolean): Self = StObject.set(x, "enterpriseProxyServersAreAuthoritative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseProxyServersAreAuthoritativeUndefined: Self = StObject.set(x, "enterpriseProxyServersAreAuthoritative", js.undefined)
    
    @scala.inline
    def setEnterpriseProxyServersNull: Self = StObject.set(x, "enterpriseProxyServers", null)
    
    @scala.inline
    def setEnterpriseProxyServersUndefined: Self = StObject.set(x, "enterpriseProxyServers", js.undefined)
    
    @scala.inline
    def setEnterpriseProxyServersVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseProxyServers", js.Array(value :_*))
    
    @scala.inline
    def setExemptAppLockerFiles(value: NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]): Self = StObject.set(x, "exemptAppLockerFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptAppLockerFilesNull: Self = StObject.set(x, "exemptAppLockerFiles", null)
    
    @scala.inline
    def setExemptAppLockerFilesUndefined: Self = StObject.set(x, "exemptAppLockerFiles", js.undefined)
    
    @scala.inline
    def setExemptAppLockerFilesVarargs(value: WindowsInformationProtectionAppLockerFile*): Self = StObject.set(x, "exemptAppLockerFiles", js.Array(value :_*))
    
    @scala.inline
    def setExemptApps(value: NullableOption[js.Array[WindowsInformationProtectionApp]]): Self = StObject.set(x, "exemptApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptAppsNull: Self = StObject.set(x, "exemptApps", null)
    
    @scala.inline
    def setExemptAppsUndefined: Self = StObject.set(x, "exemptApps", js.undefined)
    
    @scala.inline
    def setExemptAppsVarargs(value: WindowsInformationProtectionApp*): Self = StObject.set(x, "exemptApps", js.Array(value :_*))
    
    @scala.inline
    def setIconsVisible(value: Boolean): Self = StObject.set(x, "iconsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsVisibleUndefined: Self = StObject.set(x, "iconsVisible", js.undefined)
    
    @scala.inline
    def setIndexingEncryptedStoresOrItemsBlocked(value: Boolean): Self = StObject.set(x, "indexingEncryptedStoresOrItemsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexingEncryptedStoresOrItemsBlockedUndefined: Self = StObject.set(x, "indexingEncryptedStoresOrItemsBlocked", js.undefined)
    
    @scala.inline
    def setIsAssigned(value: Boolean): Self = StObject.set(x, "isAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAssignedUndefined: Self = StObject.set(x, "isAssigned", js.undefined)
    
    @scala.inline
    def setNeutralDomainResources(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "neutralDomainResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeutralDomainResourcesNull: Self = StObject.set(x, "neutralDomainResources", null)
    
    @scala.inline
    def setNeutralDomainResourcesUndefined: Self = StObject.set(x, "neutralDomainResources", js.undefined)
    
    @scala.inline
    def setNeutralDomainResourcesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "neutralDomainResources", js.Array(value :_*))
    
    @scala.inline
    def setProtectedAppLockerFiles(value: NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]): Self = StObject.set(x, "protectedAppLockerFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedAppLockerFilesNull: Self = StObject.set(x, "protectedAppLockerFiles", null)
    
    @scala.inline
    def setProtectedAppLockerFilesUndefined: Self = StObject.set(x, "protectedAppLockerFiles", js.undefined)
    
    @scala.inline
    def setProtectedAppLockerFilesVarargs(value: WindowsInformationProtectionAppLockerFile*): Self = StObject.set(x, "protectedAppLockerFiles", js.Array(value :_*))
    
    @scala.inline
    def setProtectedApps(value: NullableOption[js.Array[WindowsInformationProtectionApp]]): Self = StObject.set(x, "protectedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedAppsNull: Self = StObject.set(x, "protectedApps", null)
    
    @scala.inline
    def setProtectedAppsUndefined: Self = StObject.set(x, "protectedApps", js.undefined)
    
    @scala.inline
    def setProtectedAppsVarargs(value: WindowsInformationProtectionApp*): Self = StObject.set(x, "protectedApps", js.Array(value :_*))
    
    @scala.inline
    def setProtectionUnderLockConfigRequired(value: Boolean): Self = StObject.set(x, "protectionUnderLockConfigRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUnderLockConfigRequiredUndefined: Self = StObject.set(x, "protectionUnderLockConfigRequired", js.undefined)
    
    @scala.inline
    def setRevokeOnUnenrollDisabled(value: Boolean): Self = StObject.set(x, "revokeOnUnenrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokeOnUnenrollDisabledUndefined: Self = StObject.set(x, "revokeOnUnenrollDisabled", js.undefined)
    
    @scala.inline
    def setRightsManagementServicesTemplateId(value: NullableOption[String]): Self = StObject.set(x, "rightsManagementServicesTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightsManagementServicesTemplateIdNull: Self = StObject.set(x, "rightsManagementServicesTemplateId", null)
    
    @scala.inline
    def setRightsManagementServicesTemplateIdUndefined: Self = StObject.set(x, "rightsManagementServicesTemplateId", js.undefined)
    
    @scala.inline
    def setSmbAutoEncryptedFileExtensions(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "smbAutoEncryptedFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmbAutoEncryptedFileExtensionsNull: Self = StObject.set(x, "smbAutoEncryptedFileExtensions", null)
    
    @scala.inline
    def setSmbAutoEncryptedFileExtensionsUndefined: Self = StObject.set(x, "smbAutoEncryptedFileExtensions", js.undefined)
    
    @scala.inline
    def setSmbAutoEncryptedFileExtensionsVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "smbAutoEncryptedFileExtensions", js.Array(value :_*))
  }
}
