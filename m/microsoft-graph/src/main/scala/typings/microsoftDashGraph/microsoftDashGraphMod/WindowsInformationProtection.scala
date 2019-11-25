package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtection extends ManagedAppPolicy {
  // Navigation property to list of security groups targeted for policy.
  var assignments: js.UndefOr[js.Array[TargetedManagedAppPolicyAssignment]] = js.undefined
  // Specifies whether to allow Azure RMS encryption for WIP
  var azureRightsManagementServicesAllowed: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data
    * recovery agent(DRA) certificate for encrypting file system(EFS)
    */
  var dataRecoveryCertificate: js.UndefOr[WindowsInformationProtectionDataRecoveryCertificate] = js.undefined
  /**
    * WIP enforcement level.See the Enum definition for supported values. Possible values are: noProtection,
    * encryptAndAuditOnly, encryptAuditAndPrompt, encryptAuditAndBlock.
    */
  var enforcementLevel: js.UndefOr[WindowsInformationProtectionEnforcementLevel] = js.undefined
  // Primary enterprise domain
  var enterpriseDomain: js.UndefOr[String] = js.undefined
  /**
    * Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers
    * will be considered part of the enterprise and protected. These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseIPRanges: js.UndefOr[js.Array[WindowsInformationProtectionIPRangeCollection]] = js.undefined
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
  var enterpriseInternalProxyServers: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.undefined
  /**
    * This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent
    * to a device will be considered enterprise data and protected These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseNetworkDomainNames: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.undefined
  // List of enterprise domains to be protected
  var enterpriseProtectedDomainNames: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.undefined
  /**
    * Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these
    * resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource
    * will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this
    * purpose must also be configured using the EnterpriseInternalProxyServers policy
    */
  var enterpriseProxiedDomains: js.UndefOr[js.Array[WindowsInformationProtectionProxiedDomainCollection]] = js.undefined
  // This is a list of proxy servers. Any server not on this list is considered non-enterprise
  var enterpriseProxyServers: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.undefined
  /**
    * Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies.
    * Default is false
    */
  var enterpriseProxyServersAreAuthoritative: js.UndefOr[Boolean] = js.undefined
  // Another way to input exempt apps through xml files
  var exemptAppLockerFiles: js.UndefOr[js.Array[WindowsInformationProtectionAppLockerFile]] = js.undefined
  /**
    * Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This
    * is because some critical enterprise applications may have compatibility problems with encrypted data.
    */
  var exemptApps: js.UndefOr[js.Array[WindowsInformationProtectionApp]] = js.undefined
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
  var neutralDomainResources: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.undefined
  // Another way to input protected apps through xml files
  var protectedAppLockerFiles: js.UndefOr[js.Array[WindowsInformationProtectionAppLockerFile]] = js.undefined
  /**
    * Protected applications can access enterprise data and the data handled by those applications are protected with
    * encryption
    */
  var protectedApps: js.UndefOr[js.Array[WindowsInformationProtectionApp]] = js.undefined
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
  var rightsManagementServicesTemplateId: js.UndefOr[String] = js.undefined
  /**
    * Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share
    * within the corporate boundary
    */
  var smbAutoEncryptedFileExtensions: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.undefined
}

object WindowsInformationProtection {
  @scala.inline
  def apply(
    assignments: js.Array[TargetedManagedAppPolicyAssignment] = null,
    azureRightsManagementServicesAllowed: js.UndefOr[Boolean] = js.undefined,
    createdDateTime: String = null,
    dataRecoveryCertificate: WindowsInformationProtectionDataRecoveryCertificate = null,
    description: String = null,
    displayName: String = null,
    enforcementLevel: WindowsInformationProtectionEnforcementLevel = null,
    enterpriseDomain: String = null,
    enterpriseIPRanges: js.Array[WindowsInformationProtectionIPRangeCollection] = null,
    enterpriseIPRangesAreAuthoritative: js.UndefOr[Boolean] = js.undefined,
    enterpriseInternalProxyServers: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseNetworkDomainNames: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProtectedDomainNames: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProxiedDomains: js.Array[WindowsInformationProtectionProxiedDomainCollection] = null,
    enterpriseProxyServers: js.Array[WindowsInformationProtectionResourceCollection] = null,
    enterpriseProxyServersAreAuthoritative: js.UndefOr[Boolean] = js.undefined,
    exemptAppLockerFiles: js.Array[WindowsInformationProtectionAppLockerFile] = null,
    exemptApps: js.Array[WindowsInformationProtectionApp] = null,
    iconsVisible: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    indexingEncryptedStoresOrItemsBlocked: js.UndefOr[Boolean] = js.undefined,
    isAssigned: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    neutralDomainResources: js.Array[WindowsInformationProtectionResourceCollection] = null,
    protectedAppLockerFiles: js.Array[WindowsInformationProtectionAppLockerFile] = null,
    protectedApps: js.Array[WindowsInformationProtectionApp] = null,
    protectionUnderLockConfigRequired: js.UndefOr[Boolean] = js.undefined,
    revokeOnUnenrollDisabled: js.UndefOr[Boolean] = js.undefined,
    rightsManagementServicesTemplateId: String = null,
    smbAutoEncryptedFileExtensions: js.Array[WindowsInformationProtectionResourceCollection] = null,
    version: String = null
  ): WindowsInformationProtection = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(azureRightsManagementServicesAllowed)) __obj.updateDynamic("azureRightsManagementServicesAllowed")(azureRightsManagementServicesAllowed.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (dataRecoveryCertificate != null) __obj.updateDynamic("dataRecoveryCertificate")(dataRecoveryCertificate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (enforcementLevel != null) __obj.updateDynamic("enforcementLevel")(enforcementLevel.asInstanceOf[js.Any])
    if (enterpriseDomain != null) __obj.updateDynamic("enterpriseDomain")(enterpriseDomain.asInstanceOf[js.Any])
    if (enterpriseIPRanges != null) __obj.updateDynamic("enterpriseIPRanges")(enterpriseIPRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(enterpriseIPRangesAreAuthoritative)) __obj.updateDynamic("enterpriseIPRangesAreAuthoritative")(enterpriseIPRangesAreAuthoritative.asInstanceOf[js.Any])
    if (enterpriseInternalProxyServers != null) __obj.updateDynamic("enterpriseInternalProxyServers")(enterpriseInternalProxyServers.asInstanceOf[js.Any])
    if (enterpriseNetworkDomainNames != null) __obj.updateDynamic("enterpriseNetworkDomainNames")(enterpriseNetworkDomainNames.asInstanceOf[js.Any])
    if (enterpriseProtectedDomainNames != null) __obj.updateDynamic("enterpriseProtectedDomainNames")(enterpriseProtectedDomainNames.asInstanceOf[js.Any])
    if (enterpriseProxiedDomains != null) __obj.updateDynamic("enterpriseProxiedDomains")(enterpriseProxiedDomains.asInstanceOf[js.Any])
    if (enterpriseProxyServers != null) __obj.updateDynamic("enterpriseProxyServers")(enterpriseProxyServers.asInstanceOf[js.Any])
    if (!js.isUndefined(enterpriseProxyServersAreAuthoritative)) __obj.updateDynamic("enterpriseProxyServersAreAuthoritative")(enterpriseProxyServersAreAuthoritative.asInstanceOf[js.Any])
    if (exemptAppLockerFiles != null) __obj.updateDynamic("exemptAppLockerFiles")(exemptAppLockerFiles.asInstanceOf[js.Any])
    if (exemptApps != null) __obj.updateDynamic("exemptApps")(exemptApps.asInstanceOf[js.Any])
    if (!js.isUndefined(iconsVisible)) __obj.updateDynamic("iconsVisible")(iconsVisible.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indexingEncryptedStoresOrItemsBlocked)) __obj.updateDynamic("indexingEncryptedStoresOrItemsBlocked")(indexingEncryptedStoresOrItemsBlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(isAssigned)) __obj.updateDynamic("isAssigned")(isAssigned.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (neutralDomainResources != null) __obj.updateDynamic("neutralDomainResources")(neutralDomainResources.asInstanceOf[js.Any])
    if (protectedAppLockerFiles != null) __obj.updateDynamic("protectedAppLockerFiles")(protectedAppLockerFiles.asInstanceOf[js.Any])
    if (protectedApps != null) __obj.updateDynamic("protectedApps")(protectedApps.asInstanceOf[js.Any])
    if (!js.isUndefined(protectionUnderLockConfigRequired)) __obj.updateDynamic("protectionUnderLockConfigRequired")(protectionUnderLockConfigRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(revokeOnUnenrollDisabled)) __obj.updateDynamic("revokeOnUnenrollDisabled")(revokeOnUnenrollDisabled.asInstanceOf[js.Any])
    if (rightsManagementServicesTemplateId != null) __obj.updateDynamic("rightsManagementServicesTemplateId")(rightsManagementServicesTemplateId.asInstanceOf[js.Any])
    if (smbAutoEncryptedFileExtensions != null) __obj.updateDynamic("smbAutoEncryptedFileExtensions")(smbAutoEncryptedFileExtensions.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtection]
  }
}

