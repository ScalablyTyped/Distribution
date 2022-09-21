package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStoragetransfer.anon.AgentPoolId
import typings.maximMazurokGapiClientStoragetransfer.anon.Alt
import typings.maximMazurokGapiClientStoragetransfer.anon.Callback
import typings.maximMazurokGapiClientStoragetransfer.anon.Fields
import typings.maximMazurokGapiClientStoragetransfer.anon.Key
import typings.maximMazurokGapiClientStoragetransfer.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentPoolsResource extends StObject {
  
  /** Creates an agent pool resource. */
  def create(request: AgentPoolId): Request[AgentPool] = js.native
  def create(request: Alt, body: AgentPool): Request[AgentPool] = js.native
  
  /** Deletes an agent pool. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an agent pool. */
  def get(): Request[AgentPool] = js.native
  def get(request: Callback): Request[AgentPool] = js.native
  
  /** Lists agent pools. */
  def list(): Request[ListAgentPoolsResponse] = js.native
  def list(request: Fields): Request[ListAgentPoolsResponse] = js.native
  
  /** Updates an existing agent pool resource. */
  def patch(request: Key): Request[AgentPool] = js.native
  def patch(request: Name, body: AgentPool): Request[AgentPool] = js.native
}
