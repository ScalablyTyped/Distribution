package typings.microsoftGraph.mod

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
  implicit class WindowsInformationProtectionOps[Self <: WindowsInformationProtection] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: TargetedManagedAppPolicyAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: NullableOption[js.Array[TargetedManagedAppPolicyAssignment]]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsNull: Self = this.set("assignments", null)
    
    @scala.inline
    def setAzureRightsManagementServicesAllowed(value: Boolean): Self = this.set("azureRightsManagementServicesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzureRightsManagementServicesAllowed: Self = this.set("azureRightsManagementServicesAllowed", js.undefined)
    
    @scala.inline
    def setDataRecoveryCertificate(value: NullableOption[WindowsInformationProtectionDataRecoveryCertificate]): Self = this.set("dataRecoveryCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRecoveryCertificate: Self = this.set("dataRecoveryCertificate", js.undefined)
    
    @scala.inline
    def setDataRecoveryCertificateNull: Self = this.set("dataRecoveryCertificate", null)
    
    @scala.inline
    def setEnforcementLevel(value: WindowsInformationProtectionEnforcementLevel): Self = this.set("enforcementLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcementLevel: Self = this.set("enforcementLevel", js.undefined)
    
    @scala.inline
    def setEnterpriseDomain(value: NullableOption[String]): Self = this.set("enterpriseDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseDomain: Self = this.set("enterpriseDomain", js.undefined)
    
    @scala.inline
    def setEnterpriseDomainNull: Self = this.set("enterpriseDomain", null)
    
    @scala.inline
    def setEnterpriseIPRangesVarargs(value: WindowsInformationProtectionIPRangeCollection*): Self = this.set("enterpriseIPRanges", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseIPRanges(value: NullableOption[js.Array[WindowsInformationProtectionIPRangeCollection]]): Self = this.set("enterpriseIPRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseIPRanges: Self = this.set("enterpriseIPRanges", js.undefined)
    
    @scala.inline
    def setEnterpriseIPRangesNull: Self = this.set("enterpriseIPRanges", null)
    
    @scala.inline
    def setEnterpriseIPRangesAreAuthoritative(value: Boolean): Self = this.set("enterpriseIPRangesAreAuthoritative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseIPRangesAreAuthoritative: Self = this.set("enterpriseIPRangesAreAuthoritative", js.undefined)
    
    @scala.inline
    def setEnterpriseInternalProxyServersVarargs(value: WindowsInformationProtectionResourceCollection*): Self = this.set("enterpriseInternalProxyServers", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseInternalProxyServers(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = this.set("enterpriseInternalProxyServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseInternalProxyServers: Self = this.set("enterpriseInternalProxyServers", js.undefined)
    
    @scala.inline
    def setEnterpriseInternalProxyServersNull: Self = this.set("enterpriseInternalProxyServers", null)
    
    @scala.inline
    def setEnterpriseNetworkDomainNamesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = this.set("enterpriseNetworkDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseNetworkDomainNames(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = this.set("enterpriseNetworkDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseNetworkDomainNames: Self = this.set("enterpriseNetworkDomainNames", js.undefined)
    
    @scala.inline
    def setEnterpriseNetworkDomainNamesNull: Self = this.set("enterpriseNetworkDomainNames", null)
    
    @scala.inline
    def setEnterpriseProtectedDomainNamesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = this.set("enterpriseProtectedDomainNames", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseProtectedDomainNames(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = this.set("enterpriseProtectedDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseProtectedDomainNames: Self = this.set("enterpriseProtectedDomainNames", js.undefined)
    
    @scala.inline
    def setEnterpriseProtectedDomainNamesNull: Self = this.set("enterpriseProtectedDomainNames", null)
    
    @scala.inline
    def setEnterpriseProxiedDomainsVarargs(value: WindowsInformationProtectionProxiedDomainCollection*): Self = this.set("enterpriseProxiedDomains", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseProxiedDomains(value: NullableOption[js.Array[WindowsInformationProtectionProxiedDomainCollection]]): Self = this.set("enterpriseProxiedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseProxiedDomains: Self = this.set("enterpriseProxiedDomains", js.undefined)
    
    @scala.inline
    def setEnterpriseProxiedDomainsNull: Self = this.set("enterpriseProxiedDomains", null)
    
    @scala.inline
    def setEnterpriseProxyServersVarargs(value: WindowsInformationProtectionResourceCollection*): Self = this.set("enterpriseProxyServers", js.Array(value :_*))
    
    @scala.inline
    def setEnterpriseProxyServers(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = this.set("enterpriseProxyServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseProxyServers: Self = this.set("enterpriseProxyServers", js.undefined)
    
    @scala.inline
    def setEnterpriseProxyServersNull: Self = this.set("enterpriseProxyServers", null)
    
    @scala.inline
    def setEnterpriseProxyServersAreAuthoritative(value: Boolean): Self = this.set("enterpriseProxyServersAreAuthoritative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseProxyServersAreAuthoritative: Self = this.set("enterpriseProxyServersAreAuthoritative", js.undefined)
    
    @scala.inline
    def setExemptAppLockerFilesVarargs(value: WindowsInformationProtectionAppLockerFile*): Self = this.set("exemptAppLockerFiles", js.Array(value :_*))
    
    @scala.inline
    def setExemptAppLockerFiles(value: NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]): Self = this.set("exemptAppLockerFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExemptAppLockerFiles: Self = this.set("exemptAppLockerFiles", js.undefined)
    
    @scala.inline
    def setExemptAppLockerFilesNull: Self = this.set("exemptAppLockerFiles", null)
    
    @scala.inline
    def setExemptAppsVarargs(value: WindowsInformationProtectionApp*): Self = this.set("exemptApps", js.Array(value :_*))
    
    @scala.inline
    def setExemptApps(value: NullableOption[js.Array[WindowsInformationProtectionApp]]): Self = this.set("exemptApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExemptApps: Self = this.set("exemptApps", js.undefined)
    
    @scala.inline
    def setExemptAppsNull: Self = this.set("exemptApps", null)
    
    @scala.inline
    def setIconsVisible(value: Boolean): Self = this.set("iconsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconsVisible: Self = this.set("iconsVisible", js.undefined)
    
    @scala.inline
    def setIndexingEncryptedStoresOrItemsBlocked(value: Boolean): Self = this.set("indexingEncryptedStoresOrItemsBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexingEncryptedStoresOrItemsBlocked: Self = this.set("indexingEncryptedStoresOrItemsBlocked", js.undefined)
    
    @scala.inline
    def setIsAssigned(value: Boolean): Self = this.set("isAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAssigned: Self = this.set("isAssigned", js.undefined)
    
    @scala.inline
    def setNeutralDomainResourcesVarargs(value: WindowsInformationProtectionResourceCollection*): Self = this.set("neutralDomainResources", js.Array(value :_*))
    
    @scala.inline
    def setNeutralDomainResources(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = this.set("neutralDomainResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeutralDomainResources: Self = this.set("neutralDomainResources", js.undefined)
    
    @scala.inline
    def setNeutralDomainResourcesNull: Self = this.set("neutralDomainResources", null)
    
    @scala.inline
    def setProtectedAppLockerFilesVarargs(value: WindowsInformationProtectionAppLockerFile*): Self = this.set("protectedAppLockerFiles", js.Array(value :_*))
    
    @scala.inline
    def setProtectedAppLockerFiles(value: NullableOption[js.Array[WindowsInformationProtectionAppLockerFile]]): Self = this.set("protectedAppLockerFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedAppLockerFiles: Self = this.set("protectedAppLockerFiles", js.undefined)
    
    @scala.inline
    def setProtectedAppLockerFilesNull: Self = this.set("protectedAppLockerFiles", null)
    
    @scala.inline
    def setProtectedAppsVarargs(value: WindowsInformationProtectionApp*): Self = this.set("protectedApps", js.Array(value :_*))
    
    @scala.inline
    def setProtectedApps(value: NullableOption[js.Array[WindowsInformationProtectionApp]]): Self = this.set("protectedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedApps: Self = this.set("protectedApps", js.undefined)
    
    @scala.inline
    def setProtectedAppsNull: Self = this.set("protectedApps", null)
    
    @scala.inline
    def setProtectionUnderLockConfigRequired(value: Boolean): Self = this.set("protectionUnderLockConfigRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionUnderLockConfigRequired: Self = this.set("protectionUnderLockConfigRequired", js.undefined)
    
    @scala.inline
    def setRevokeOnUnenrollDisabled(value: Boolean): Self = this.set("revokeOnUnenrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokeOnUnenrollDisabled: Self = this.set("revokeOnUnenrollDisabled", js.undefined)
    
    @scala.inline
    def setRightsManagementServicesTemplateId(value: NullableOption[String]): Self = this.set("rightsManagementServicesTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightsManagementServicesTemplateId: Self = this.set("rightsManagementServicesTemplateId", js.undefined)
    
    @scala.inline
    def setRightsManagementServicesTemplateIdNull: Self = this.set("rightsManagementServicesTemplateId", null)
    
    @scala.inline
    def setSmbAutoEncryptedFileExtensionsVarargs(value: WindowsInformationProtectionResourceCollection*): Self = this.set("smbAutoEncryptedFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setSmbAutoEncryptedFileExtensions(value: NullableOption[js.Array[WindowsInformationProtectionResourceCollection]]): Self = this.set("smbAutoEncryptedFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmbAutoEncryptedFileExtensions: Self = this.set("smbAutoEncryptedFileExtensions", js.undefined)
    
    @scala.inline
    def setSmbAutoEncryptedFileExtensionsNull: Self = this.set("smbAutoEncryptedFileExtensions", null)
  }
}
