package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.Callback
import typings.maximMazurokGapiClientLogging.anon.KeyName
import typings.maximMazurokGapiClientLogging.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldersResource extends StObject {
  
  var exclusions: ExclusionsResource = js.native
  
  /**
    * Gets the Logging CMEK settings for the given resource.Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations and billing accounts. Once
    * configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log Router
    * (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  def getCmekSettings(): Request[CmekSettings] = js.native
  def getCmekSettings(request: Callback): Request[CmekSettings] = js.native
  
  /**
    * Gets the Log Router settings for the given resource.Note: Settings for the Log Router can be get for Google Cloud projects, folders, organizations and billing accounts. Currently it
    * can only be configured for organizations. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.See Enabling CMEK for Log
    * Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  def getSettings(): Request[Settings] = js.native
  def getSettings(request: Callback): Request[Settings] = js.native
  
  var locations: LocationsResource = js.native
  
  var logs: LogsResource = js.native
  
  var sinks: SinksResource = js.native
  
  /**
    * Updates the Log Router settings for the given resource.Note: Settings for the Log Router can currently only be configured for Google Cloud organizations. Once configured, it applies
    * to all projects and folders in the Google Cloud organization.UpdateSettings will fail if 1) kms_key_name is invalid, or 2) the associated service account does not have the required
    * roles/cloudkms.cryptoKeyEncrypterDecrypter role assigned for the key, or 3) access to the key is disabled. 4) location_id is not supported by Logging. 5) location_id violate
    * OrgPolicy.See Enabling CMEK for Log Router (https://cloud.google.com/logging/docs/routing/managed-encryption) for more information.
    */
  def updateSettings(request: KeyName): Request[Settings] = js.native
  def updateSettings(request: Name, body: Settings): Request[Settings] = js.native
}
