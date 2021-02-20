package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHomegraph.anon.Alt
import typings.maximMazurokGapiClientHomegraph.anon.Callback
import typings.maximMazurokGapiClientHomegraph.anon.Fields
import typings.maximMazurokGapiClientHomegraph.anon.Key
import typings.maximMazurokGapiClientHomegraph.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  /**
    * Gets the current states in Home Graph for the given set of the third-party user's devices. The third-party user's identity is passed in via the `agent_user_id` (see QueryRequest).
    * This request must be authorized using service account credentials from your Actions console project.
    */
  def query(request: Alt): Request[QueryResponse] = js.native
  def query(request: Callback, body: QueryRequest): Request[QueryResponse] = js.native
  
  def reportStateAndNotification(request: Callback, body: ReportStateAndNotificationRequest): Request[ReportStateAndNotificationResponse] = js.native
  /**
    * Reports device state and optionally sends device notifications. Called by your smart home Action when the state of a third-party device changes or you need to send a notification
    * about the device. See [Implement Report State](https://developers.google.com/assistant/smarthome/develop/report-state) for more information. This method updates the device state
    * according to its declared [traits](https://developers.google.com/assistant/smarthome/concepts/devices-traits). Publishing a new state value outside of these traits will result in an
    * `INVALID_ARGUMENT` error response. The third-party user's identity is passed in via the `agent_user_id` (see ReportStateAndNotificationRequest). This request must be authorized
    * using service account credentials from your Actions console project.
    */
  def reportStateAndNotification(request: Fields): Request[ReportStateAndNotificationResponse] = js.native
  
  def requestSync(request: Callback, body: RequestSyncDevicesRequest): Request[js.Object] = js.native
  /**
    * Requests Google to send an `action.devices.SYNC` [intent](https://developers.google.com/assistant/smarthome/reference/intent/sync) to your smart home Action to update device
    * metadata for the given user. The third-party user's identity is passed via the `agent_user_id` (see RequestSyncDevicesRequest). This request must be authorized using service account
    * credentials from your Actions console project.
    */
  def requestSync(request: Key): Request[js.Object] = js.native
  
  def sync(request: Callback, body: SyncRequest): Request[SyncResponse] = js.native
  /**
    * Gets all the devices associated with the given third-party user. The third-party user's identity is passed in via the `agent_user_id` (see SyncRequest). This request must be
    * authorized using service account credentials from your Actions console project.
    */
  def sync(request: Oauthtoken): Request[SyncResponse] = js.native
}
