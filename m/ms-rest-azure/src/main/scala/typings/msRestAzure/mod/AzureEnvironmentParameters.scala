package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureEnvironmentParameters extends js.Object {
  
  /**
    * The Active Directory login endpoint.
    */
  var activeDirectoryEndpointUrl: String = js.native
  
  /**
    * The Active Directory api version.
    */
  var activeDirectoryGraphApiVersion: String = js.native
  
  /**
    * The Active Directory Graph resource ID.
    */
  var activeDirectoryGraphResourceId: String = js.native
  
  /**
    * The resource ID to obtain AD tokens for (token audience).
    */
  var activeDirectoryResourceId: String = js.native
  
  /**
    * The data lake analytics job and catalog service dns suffix.
    */
  var azureDataLakeAnalyticsCatalogAndJobEndpointSuffix: String = js.native
  
  /**
    * The data lake store filesystem service dns suffix.
    */
  var azureDataLakeStoreFileSystemEndpointSuffix: String = js.native
  
  /**
    * The Azure Batch resource ID.
    */
  var batchResourceId: String = js.native
  
  /**
    * The template gallery endpoint.
    */
  var galleryEndpointUrl: String = js.native
  
  /**
    * The keyvault service dns suffix.
    */
  var keyVaultDnsSuffix: String = js.native
  
  /**
    * The management service endpoint.
    */
  var managementEndpointUrl: String = js.native
  
  /**
    * The Environment name.
    */
  var name: String = js.native
  
  /**
    * The management portal URL.
    */
  var portalUrl: String = js.native
  
  /**
    * The publish settings file URL.
    */
  var publishingProfileUrl: String = js.native
  
  /**
    * The resource management endpoint.
    */
  var resourceManagerEndpointUrl: String = js.native
  
  /**
    * The sql server management endpoint for mobile commands.
    */
  var sqlManagementEndpointUrl: String = js.native
  
  /**
    * The dns suffix for sql servers.
    */
  var sqlServerHostnameSuffix: String = js.native
  
  /**
    * The endpoint suffix for storage accounts.
    */
  var storageEndpointSuffix: String = js.native
  
  /**
    * Determines whether the authentication endpoint should be validated with Azure AD. Default value is true.
    */
  var validateAuthority: Boolean = js.native
}
object AzureEnvironmentParameters {
  
  @scala.inline
  def apply(
    activeDirectoryEndpointUrl: String,
    activeDirectoryGraphApiVersion: String,
    activeDirectoryGraphResourceId: String,
    activeDirectoryResourceId: String,
    azureDataLakeAnalyticsCatalogAndJobEndpointSuffix: String,
    azureDataLakeStoreFileSystemEndpointSuffix: String,
    batchResourceId: String,
    galleryEndpointUrl: String,
    keyVaultDnsSuffix: String,
    managementEndpointUrl: String,
    name: String,
    portalUrl: String,
    publishingProfileUrl: String,
    resourceManagerEndpointUrl: String,
    sqlManagementEndpointUrl: String,
    sqlServerHostnameSuffix: String,
    storageEndpointSuffix: String,
    validateAuthority: Boolean
  ): AzureEnvironmentParameters = {
    val __obj = js.Dynamic.literal(activeDirectoryEndpointUrl = activeDirectoryEndpointUrl.asInstanceOf[js.Any], activeDirectoryGraphApiVersion = activeDirectoryGraphApiVersion.asInstanceOf[js.Any], activeDirectoryGraphResourceId = activeDirectoryGraphResourceId.asInstanceOf[js.Any], activeDirectoryResourceId = activeDirectoryResourceId.asInstanceOf[js.Any], azureDataLakeAnalyticsCatalogAndJobEndpointSuffix = azureDataLakeAnalyticsCatalogAndJobEndpointSuffix.asInstanceOf[js.Any], azureDataLakeStoreFileSystemEndpointSuffix = azureDataLakeStoreFileSystemEndpointSuffix.asInstanceOf[js.Any], batchResourceId = batchResourceId.asInstanceOf[js.Any], galleryEndpointUrl = galleryEndpointUrl.asInstanceOf[js.Any], keyVaultDnsSuffix = keyVaultDnsSuffix.asInstanceOf[js.Any], managementEndpointUrl = managementEndpointUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], portalUrl = portalUrl.asInstanceOf[js.Any], publishingProfileUrl = publishingProfileUrl.asInstanceOf[js.Any], resourceManagerEndpointUrl = resourceManagerEndpointUrl.asInstanceOf[js.Any], sqlManagementEndpointUrl = sqlManagementEndpointUrl.asInstanceOf[js.Any], sqlServerHostnameSuffix = sqlServerHostnameSuffix.asInstanceOf[js.Any], storageEndpointSuffix = storageEndpointSuffix.asInstanceOf[js.Any], validateAuthority = validateAuthority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureEnvironmentParameters]
  }
  
  @scala.inline
  implicit class AzureEnvironmentParametersOps[Self <: AzureEnvironmentParameters] (val x: Self) extends AnyVal {
    
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
    def setActiveDirectoryEndpointUrl(value: String): Self = this.set("activeDirectoryEndpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDirectoryGraphApiVersion(value: String): Self = this.set("activeDirectoryGraphApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDirectoryGraphResourceId(value: String): Self = this.set("activeDirectoryGraphResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDirectoryResourceId(value: String): Self = this.set("activeDirectoryResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureDataLakeAnalyticsCatalogAndJobEndpointSuffix(value: String): Self = this.set("azureDataLakeAnalyticsCatalogAndJobEndpointSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureDataLakeStoreFileSystemEndpointSuffix(value: String): Self = this.set("azureDataLakeStoreFileSystemEndpointSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchResourceId(value: String): Self = this.set("batchResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGalleryEndpointUrl(value: String): Self = this.set("galleryEndpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyVaultDnsSuffix(value: String): Self = this.set("keyVaultDnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementEndpointUrl(value: String): Self = this.set("managementEndpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUrl(value: String): Self = this.set("portalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishingProfileUrl(value: String): Self = this.set("publishingProfileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceManagerEndpointUrl(value: String): Self = this.set("resourceManagerEndpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlManagementEndpointUrl(value: String): Self = this.set("sqlManagementEndpointUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlServerHostnameSuffix(value: String): Self = this.set("sqlServerHostnameSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEndpointSuffix(value: String): Self = this.set("storageEndpointSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateAuthority(value: Boolean): Self = this.set("validateAuthority", value.asInstanceOf[js.Any])
  }
}
