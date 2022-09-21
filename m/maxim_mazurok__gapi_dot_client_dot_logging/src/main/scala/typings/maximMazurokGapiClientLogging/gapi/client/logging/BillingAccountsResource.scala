package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingAccountsResource extends StObject {
  
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
}
