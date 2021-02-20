package typings.msRestAzure.mod

import typings.msRestAzure.anon.ActiveDirectoryEndpointUrl
import typings.msRestAzure.anon.ActiveDirectoryGraphApiVersion
import typings.msRestAzure.anon.ActiveDirectoryGraphResourceId
import typings.msRestAzure.anon.ActiveDirectoryResourceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "AzureEnvironment")
@js.native
class AzureEnvironment protected () extends StObject {
  /**
    * Initializes a new instance of the AzureEnvironment class.
    * @param {string} parameters.name - The Environment name
    * @param {string} parameters.portalUrl - The management portal URL
    * @param {string} parameters.managementEndpointUrl - The management service endpoint
    * @param {string} parameters.resourceManagerEndpointUrl - The resource management endpoint
    * @param {string} parameters.activeDirectoryEndpointUrl - The Active Directory login endpoint
    * @param {string} parameters.activeDirectoryResourceId - The resource ID to obtain AD tokens for (token audience)
    * @param {string} [parameters.publishingProfileUrl] - The publish settings file URL
    * @param {string} [parameters.sqlManagementEndpointUrl] - The sql server management endpoint for mobile commands
    * @param {string} [parameters.sqlServerHostnameSuffix] - The dns suffix for sql servers
    * @param {string} [parameters.galleryEndpointUrl] - The template gallery endpoint
    * @param {string} [parameters.activeDirectoryGraphResourceId] - The Active Directory resource ID
    * @param {string} [parameters.batchResourceId] - The Azure Batch resource ID
    * @param {string} [parameters.activeDirectoryGraphApiVersion] - The Active Directory api version
    * @param {string} [parameters.storageEndpointSuffix] - The endpoint suffix for storage accounts
    * @param {string} [parameters.keyVaultDnsSuffix] - The keyvault service dns suffix
    * @param {string} [parameters.azureDataLakeStoreFileSystemEndpointSuffix] - The data lake store filesystem service dns suffix
    * @param {string} [parameters.azureDataLakeAnalyticsCatalogAndJobEndpointSuffix] - The data lake analytics job and catalog service dns suffix
    * @param {bool} [parameters.validateAuthority] - Determines whether the authentication endpoint should 
    * be validated with Azure AD. Default value is true.
    */
  def this(parameters: AzureEnvironmentParameters) = this()
  
  /**
    * The Active Directory login endpoint.
    */
  var activeDirectoryEndpointUrl: String = js.native
  
  /**
    * The Active Directory api version.
    */
  var activeDirectoryGraphApiVersion: String = js.native
  
  /**
    * The Active Directory resource ID.
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
/* static members */
object AzureEnvironment {
  
  @JSImport("ms-rest-azure", "AzureEnvironment.Azure")
  @js.native
  val Azure: ActiveDirectoryEndpointUrl = js.native
  
  @JSImport("ms-rest-azure", "AzureEnvironment.AzureChina")
  @js.native
  val AzureChina: ActiveDirectoryGraphApiVersion = js.native
  
  @JSImport("ms-rest-azure", "AzureEnvironment.AzureGermanCloud")
  @js.native
  val AzureGermanCloud: ActiveDirectoryResourceId = js.native
  
  @JSImport("ms-rest-azure", "AzureEnvironment.AzureUSGovernment")
  @js.native
  val AzureUSGovernment: ActiveDirectoryGraphResourceId = js.native
}
