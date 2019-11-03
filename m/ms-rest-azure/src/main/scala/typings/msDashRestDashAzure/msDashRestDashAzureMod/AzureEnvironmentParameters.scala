package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureEnvironmentParameters extends js.Object {
  /**
    * The Active Directory login endpoint.
    */
  var activeDirectoryEndpointUrl: String
  /**
    * The Active Directory api version.
    */
  var activeDirectoryGraphApiVersion: String
  /**
    * The Active Directory Graph resource ID.
    */
  var activeDirectoryGraphResourceId: String
  /**
    * The resource ID to obtain AD tokens for (token audience).
    */
  var activeDirectoryResourceId: String
  /**
    * The data lake analytics job and catalog service dns suffix.
    */
  var azureDataLakeAnalyticsCatalogAndJobEndpointSuffix: String
  /**
    * The data lake store filesystem service dns suffix.
    */
  var azureDataLakeStoreFileSystemEndpointSuffix: String
  /**
    * The Azure Batch resource ID.
    */
  var batchResourceId: String
  /**
    * The template gallery endpoint.
    */
  var galleryEndpointUrl: String
  /**
    * The keyvault service dns suffix.
    */
  var keyVaultDnsSuffix: String
  /**
    * The management service endpoint.
    */
  var managementEndpointUrl: String
  /**
    * The Environment name.
    */
  var name: String
  /**
    * The management portal URL.
    */
  var portalUrl: String
  /**
    * The publish settings file URL.
    */
  var publishingProfileUrl: String
  /**
    * The resource management endpoint.
    */
  var resourceManagerEndpointUrl: String
  /**
    * The sql server management endpoint for mobile commands.
    */
  var sqlManagementEndpointUrl: String
  /**
    * The dns suffix for sql servers.
    */
  var sqlServerHostnameSuffix: String
  /**
    * The endpoint suffix for storage accounts.
    */
  var storageEndpointSuffix: String
  /**
    * Determines whether the authentication endpoint should be validated with Azure AD. Default value is true.
    */
  var validateAuthority: Boolean
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
    val __obj = js.Dynamic.literal(activeDirectoryEndpointUrl = activeDirectoryEndpointUrl, activeDirectoryGraphApiVersion = activeDirectoryGraphApiVersion, activeDirectoryGraphResourceId = activeDirectoryGraphResourceId, activeDirectoryResourceId = activeDirectoryResourceId, azureDataLakeAnalyticsCatalogAndJobEndpointSuffix = azureDataLakeAnalyticsCatalogAndJobEndpointSuffix, azureDataLakeStoreFileSystemEndpointSuffix = azureDataLakeStoreFileSystemEndpointSuffix, batchResourceId = batchResourceId, galleryEndpointUrl = galleryEndpointUrl, keyVaultDnsSuffix = keyVaultDnsSuffix, managementEndpointUrl = managementEndpointUrl, name = name, portalUrl = portalUrl, publishingProfileUrl = publishingProfileUrl, resourceManagerEndpointUrl = resourceManagerEndpointUrl, sqlManagementEndpointUrl = sqlManagementEndpointUrl, sqlServerHostnameSuffix = sqlServerHostnameSuffix, storageEndpointSuffix = storageEndpointSuffix, validateAuthority = validateAuthority)
  
    __obj.asInstanceOf[AzureEnvironmentParameters]
  }
}

