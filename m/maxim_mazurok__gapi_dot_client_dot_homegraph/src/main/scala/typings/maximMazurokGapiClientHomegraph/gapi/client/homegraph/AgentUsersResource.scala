package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHomegraph.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentUsersResource extends StObject {
  
  /**
    * Unlinks the given third-party user from your smart home Action. All data related to this user will be deleted. For more details on how users link their accounts, see [fulfillment
    * and authentication](https://developers.google.com/assistant/smarthome/concepts/fulfillment-authentication). The third-party user's identity is passed in via the `agent_user_id` (see
    * DeleteAgentUserRequest). This request must be authorized using service account credentials from your Actions console project.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
}
