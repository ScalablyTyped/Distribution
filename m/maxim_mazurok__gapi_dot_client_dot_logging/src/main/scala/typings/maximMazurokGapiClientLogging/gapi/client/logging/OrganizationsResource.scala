package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.Accesstoken
import typings.maximMazurokGapiClientLogging.anon.KeyName
import typings.maximMazurokGapiClientLogging.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsResource extends js.Object {
  
  var exclusions: ExclusionsResource = js.native
  
  /**
    * Gets the Logs Router CMEK settings for the given resource.Note: CMEK for the Logs Router can currently only be configured for GCP organizations. Once configured, it applies to all
    * projects and folders in the GCP organization.See Enabling CMEK for Logs Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  def getCmekSettings(): Request[CmekSettings] = js.native
  def getCmekSettings(request: Accesstoken): Request[CmekSettings] = js.native
  
  var locations: LocationsResource = js.native
  
  var logs: LogsResource = js.native
  
  var sinks: SinksResource = js.native
  
  /**
    * Updates the Logs Router CMEK settings for the given resource.Note: CMEK for the Logs Router can currently only be configured for GCP organizations. Once configured, it applies to
    * all projects and folders in the GCP organization.UpdateCmekSettings will fail if 1) kms_key_name is invalid, or 2) the associated service account does not have the required
    * roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key, or 3) access to the key is disabled.See Enabling CMEK for Logs Router
    * (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  def updateCmekSettings(request: KeyName): Request[CmekSettings] = js.native
  def updateCmekSettings(request: Name, body: CmekSettings): Request[CmekSettings] = js.native
}
