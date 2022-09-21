package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtection
  extends StObject
     with ManagedAppPolicy {
  
  // Navigation property to list of security groups targeted for policy.
  var assignments: js.UndefOr[NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]] = js.undefined
  
  // Specifies whether to allow Azure RMS encryption for WIP
  var azureRightsManagementServicesAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data
    * recovery agent(DRA) certificate for encrypting file system(EFS)
    */
  var dataRecoveryCertificate: js.UndefOr[NullableOption[WindowsInformationProtectionDataRecoveryCertificate]] = js.undefined
  
  /**
    * WIP enforcement level.See the Enum definition for supported values. Possible values are: noProtection,
    * encryptAndAuditOnly, encryptAuditAndPrompt, encryptAuditAndBlock.
    */
  var enforcementLevel: js.UndefOr[WindowsInformationProtectionEnforcementLevel] = js.undefined
  
  // Primary enterprise domain
  var enterpriseDomain: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers
    * will be considered part of the enterprise and protected. These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseIPRanges: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionIPRangeCollection]]] = js.undefined
  
  /**
    * Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other
    * subnets. Default is false
    */
  var enterpriseIPRangesAreAuthoritative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167,
    * 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the
    * Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the
    * EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
    */
  var enterpriseInternalProxyServers: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.undefined
  
  /**
    * This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent
    * to a device will be considered enterprise data and protected These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseNetworkDomainNames: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.undefined
  
  // List of enterprise domains to be protected
  var enterpriseProtectedDomainNames: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.undefined
  
  /**
    * Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these
    * resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource
    * will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this
    * purpose must also be configured using the EnterpriseInternalProxyServers policy
    */
  var enterpriseProxiedDomains: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionProxiedDomainCollection]]] = js.undefined
  
  // This is a list of proxy servers. Any server not on this list is considered non-enterprise
  var enterpriseProxyServers: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.undefined
  
  /**
    * Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies.
    * Default is false
    */
  var enterpriseProxyServersAreAuthoritative: js.UndefOr[Boolean] = js.undefined
  
  // Another way to input exempt apps through xml files
  var exemptAppLockerFiles: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]] = js.undefined
  
  /**
    * Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This
    * is because some critical enterprise applications may have compatibility problems with encrypted data.
    */
  var exemptApps: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionApp]]] = js.undefined
  
  /**
    * Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the
    * Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the
    * title bar of a WIP-protected app
    */
  var iconsVisible: js.UndefOr[Boolean] = js.undefined
  
  // This switch is for the Windows Search Indexer, to allow or disallow indexing of items
  var indexingEncryptedStoresOrItemsBlocked: js.UndefOr[Boolean] = js.undefined
  
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.undefined
  
  // List of domain names that can used for work or personal resource
  var neutralDomainResources: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.undefined
  
  // Another way to input protected apps through xml files
  var protectedAppLockerFiles: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]] = js.undefined
  
  /**
    * Protected applications can access enterprise data and the data handled by those applications are protected with
    * encryption
    */
  var protectedApps: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionApp]]] = js.undefined
  
  // Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
  var protectionUnderLockConfigRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1
    * (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after
    * unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
    */
  var revokeOnUnenrollDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has
    * access to RMS-protected file and how long they have access
    */
  var rightsManagementServicesTemplateId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share
    * within the corporate boundary
    */
  var smbAutoEncryptedFileExtensions: js.UndefOr[NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]] = js.undefined
}
object WindowsInformationProtection {
  
  inline def apply(): WindowsInformationProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtection]
  }
  
  extension [Self <: WindowsInformationProtection](x: Self) {
    
    inline def setAssignments(value: NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsNull: Self = StObject.set(x, "assignments", null)
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = StObject.set(x, "assignments", js.Array(value*))
    
    inline def setAzureRightsManagementServicesAllowed(value: Boolean): Self = StObject.set(x, "azureRightsManagementServicesAllowed", value.asInstanceOf[js.Any])
    
    inline def setAzureRightsManagementServicesAllowedUndefined: Self = StObject.set(x, "azureRightsManagementServicesAllowed", js.undefined)
    
    inline def setDataRecoveryCertificate(value: NullableOption[WindowsInformationProtectionDataRecoveryCertificate]): Self = StObject.set(x, "dataRecoveryCertificate", value.asInstanceOf[js.Any])
    
    inline def setDataRecoveryCertificateNull: Self = StObject.set(x, "dataRecoveryCertificate", null)
    
    inline def setDataRecoveryCertificateUndefined: Self = StObject.set(x, "dataRecoveryCertificate", js.undefined)
    
    inline def setEnforcementLevel(value: WindowsInformationProtectionEnforcementLevel): Self = StObject.set(x, "enforcementLevel", value.asInstanceOf[js.Any])
    
    inline def setEnforcementLevelUndefined: Self = StObject.set(x, "enforcementLevel", js.undefined)
    
    inline def setEnterpriseDomain(value: NullableOption[String]): Self = StObject.set(x, "enterpriseDomain", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseDomainNull: Self = StObject.set(x, "enterpriseDomain", null)
    
    inline def setEnterpriseDomainUndefined: Self = StObject.set(x, "enterpriseDomain", js.undefined)
    
    inline def setEnterpriseIPRanges(value: NullableOption[js.Array[WindowsInformationProtectionIPRangeCollection]]): Self = StObject.set(x, "enterpriseIPRanges", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIPRangesAreAuthoritative(value: Boolean): Self = StObject.set(x, "enterpriseIPRangesAreAuthoritative", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIPRangesAreAuthoritativeUndefined: Self = StObject.set(x, "enterpriseIPRangesAreAuthoritative", js.undefined)
    
    inline def setEnterpriseIPRangesNull: Self = StObject.set(x, "enterpriseIPRanges", null)
    
    inline def setEnterpriseIPRangesUndefined: Self = StObject.set(x, "enterpriseIPRanges", js.undefined)
    
    inline def setEnterpriseIPRangesVarargs(value: WindowsInformationProtectionIPRangeCollection*): Self = StObject.set(x, "enterpriseIPRanges", js.Array(value*))
    
    inline def setEnterpriseInternalProxyServers(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseInternalProxyServers", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseInternalProxyServersNull: Self = StObject.set(x, "enterpriseInternalProxyServers", null)
    
    inline def setEnterpriseInternalProxyServersUndefined: Self = StObject.set(x, "enterpriseInternalProxyServers", js.undefined)
    
    inline def setEnterpriseInternalProxyServersVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseInternalProxyServers", js.Array(value*))
    
    inline def setEnterpriseNetworkDomainNames(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseNetworkDomainNames", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseNetworkDomainNamesNull: Self = StObject.set(x, "enterpriseNetworkDomainNames", null)
    
    inline def setEnterpriseNetworkDomainNamesUndefined: Self = StObject.set(x, "enterpriseNetworkDomainNames", js.undefined)
    
    inline def setEnterpriseNetworkDomainNamesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseNetworkDomainNames", js.Array(value*))
    
    inline def setEnterpriseProtectedDomainNames(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseProtectedDomainNames", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseProtectedDomainNamesNull: Self = StObject.set(x, "enterpriseProtectedDomainNames", null)
    
    inline def setEnterpriseProtectedDomainNamesUndefined: Self = StObject.set(x, "enterpriseProtectedDomainNames", js.undefined)
    
    inline def setEnterpriseProtectedDomainNamesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseProtectedDomainNames", js.Array(value*))
    
    inline def setEnterpriseProxiedDomains(value: NullableOption[js.Array[WindowsInformationProtectionProxiedDomainCollection]]): Self = StObject.set(x, "enterpriseProxiedDomains", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseProxiedDomainsNull: Self = StObject.set(x, "enterpriseProxiedDomains", null)
    
    inline def setEnterpriseProxiedDomainsUndefined: Self = StObject.set(x, "enterpriseProxiedDomains", js.undefined)
    
    inline def setEnterpriseProxiedDomainsVarargs(value: WindowsInformationProtectionProxiedDomainCollection*): Self = StObject.set(x, "enterpriseProxiedDomains", js.Array(value*))
    
    inline def setEnterpriseProxyServers(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "enterpriseProxyServers", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseProxyServersAreAuthoritative(value: Boolean): Self = StObject.set(x, "enterpriseProxyServersAreAuthoritative", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseProxyServersAreAuthoritativeUndefined: Self = StObject.set(x, "enterpriseProxyServersAreAuthoritative", js.undefined)
    
    inline def setEnterpriseProxyServersNull: Self = StObject.set(x, "enterpriseProxyServers", null)
    
    inline def setEnterpriseProxyServersUndefined: Self = StObject.set(x, "enterpriseProxyServers", js.undefined)
    
    inline def setEnterpriseProxyServersVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "enterpriseProxyServers", js.Array(value*))
    
    inline def setExemptAppLockerFiles(value: NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]): Self = StObject.set(x, "exemptAppLockerFiles", value.asInstanceOf[js.Any])
    
    inline def setExemptAppLockerFilesNull: Self = StObject.set(x, "exemptAppLockerFiles", null)
    
    inline def setExemptAppLockerFilesUndefined: Self = StObject.set(x, "exemptAppLockerFiles", js.undefined)
    
    inline def setExemptAppLockerFilesVarargs(value: WindowsInformationProtectionAppLockerFile*): Self = StObject.set(x, "exemptAppLockerFiles", js.Array(value*))
    
    inline def setExemptApps(value: NullableOption[js.Array[WindowsInformationProtectionApp]]): Self = StObject.set(x, "exemptApps", value.asInstanceOf[js.Any])
    
    inline def setExemptAppsNull: Self = StObject.set(x, "exemptApps", null)
    
    inline def setExemptAppsUndefined: Self = StObject.set(x, "exemptApps", js.undefined)
    
    inline def setExemptAppsVarargs(value: WindowsInformationProtectionApp*): Self = StObject.set(x, "exemptApps", js.Array(value*))
    
    inline def setIconsVisible(value: Boolean): Self = StObject.set(x, "iconsVisible", value.asInstanceOf[js.Any])
    
    inline def setIconsVisibleUndefined: Self = StObject.set(x, "iconsVisible", js.undefined)
    
    inline def setIndexingEncryptedStoresOrItemsBlocked(value: Boolean): Self = StObject.set(x, "indexingEncryptedStoresOrItemsBlocked", value.asInstanceOf[js.Any])
    
    inline def setIndexingEncryptedStoresOrItemsBlockedUndefined: Self = StObject.set(x, "indexingEncryptedStoresOrItemsBlocked", js.undefined)
    
    inline def setIsAssigned(value: Boolean): Self = StObject.set(x, "isAssigned", value.asInstanceOf[js.Any])
    
    inline def setIsAssignedUndefined: Self = StObject.set(x, "isAssigned", js.undefined)
    
    inline def setNeutralDomainResources(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "neutralDomainResources", value.asInstanceOf[js.Any])
    
    inline def setNeutralDomainResourcesNull: Self = StObject.set(x, "neutralDomainResources", null)
    
    inline def setNeutralDomainResourcesUndefined: Self = StObject.set(x, "neutralDomainResources", js.undefined)
    
    inline def setNeutralDomainResourcesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "neutralDomainResources", js.Array(value*))
    
    inline def setProtectedAppLockerFiles(value: NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]): Self = StObject.set(x, "protectedAppLockerFiles", value.asInstanceOf[js.Any])
    
    inline def setProtectedAppLockerFilesNull: Self = StObject.set(x, "protectedAppLockerFiles", null)
    
    inline def setProtectedAppLockerFilesUndefined: Self = StObject.set(x, "protectedAppLockerFiles", js.undefined)
    
    inline def setProtectedAppLockerFilesVarargs(value: WindowsInformationProtectionAppLockerFile*): Self = StObject.set(x, "protectedAppLockerFiles", js.Array(value*))
    
    inline def setProtectedApps(value: NullableOption[js.Array[WindowsInformationProtectionApp]]): Self = StObject.set(x, "protectedApps", value.asInstanceOf[js.Any])
    
    inline def setProtectedAppsNull: Self = StObject.set(x, "protectedApps", null)
    
    inline def setProtectedAppsUndefined: Self = StObject.set(x, "protectedApps", js.undefined)
    
    inline def setProtectedAppsVarargs(value: WindowsInformationProtectionApp*): Self = StObject.set(x, "protectedApps", js.Array(value*))
    
    inline def setProtectionUnderLockConfigRequired(value: Boolean): Self = StObject.set(x, "protectionUnderLockConfigRequired", value.asInstanceOf[js.Any])
    
    inline def setProtectionUnderLockConfigRequiredUndefined: Self = StObject.set(x, "protectionUnderLockConfigRequired", js.undefined)
    
    inline def setRevokeOnUnenrollDisabled(value: Boolean): Self = StObject.set(x, "revokeOnUnenrollDisabled", value.asInstanceOf[js.Any])
    
    inline def setRevokeOnUnenrollDisabledUndefined: Self = StObject.set(x, "revokeOnUnenrollDisabled", js.undefined)
    
    inline def setRightsManagementServicesTemplateId(value: NullableOption[String]): Self = StObject.set(x, "rightsManagementServicesTemplateId", value.asInstanceOf[js.Any])
    
    inline def setRightsManagementServicesTemplateIdNull: Self = StObject.set(x, "rightsManagementServicesTemplateId", null)
    
    inline def setRightsManagementServicesTemplateIdUndefined: Self = StObject.set(x, "rightsManagementServicesTemplateId", js.undefined)
    
    inline def setSmbAutoEncryptedFileExtensions(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = StObject.set(x, "smbAutoEncryptedFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setSmbAutoEncryptedFileExtensionsNull: Self = StObject.set(x, "smbAutoEncryptedFileExtensions", null)
    
    inline def setSmbAutoEncryptedFileExtensionsUndefined: Self = StObject.set(x, "smbAutoEncryptedFileExtensions", js.undefined)
    
    inline def setSmbAutoEncryptedFileExtensionsVarargs(value: WindowsInformationProtectionResourceCollection*): Self = StObject.set(x, "smbAutoEncryptedFileExtensions", js.Array(value*))
  }
}
