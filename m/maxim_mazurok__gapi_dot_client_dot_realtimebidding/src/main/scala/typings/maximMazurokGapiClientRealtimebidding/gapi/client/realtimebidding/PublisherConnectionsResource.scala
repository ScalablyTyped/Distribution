package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRealtimebidding.anon.Callback
import typings.maximMazurokGapiClientRealtimebidding.anon.Filter
import typings.maximMazurokGapiClientRealtimebidding.anon.KeyOauthtoken
import typings.maximMazurokGapiClientRealtimebidding.anon.OauthtokenParent
import typings.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherConnectionsResource extends StObject {
  
  def batchApprove(request: Callback, body: BatchApprovePublisherConnectionsRequest): Request[BatchApprovePublisherConnectionsResponse] = js.native
  /** Batch approves multiple publisher connections. */
  def batchApprove(request: KeyOauthtoken): Request[BatchApprovePublisherConnectionsResponse] = js.native
  
  def batchReject(request: Callback, body: BatchRejectPublisherConnectionsRequest): Request[BatchRejectPublisherConnectionsResponse] = js.native
  /** Batch rejects multiple publisher connections. */
  def batchReject(request: OauthtokenParent): Request[BatchRejectPublisherConnectionsResponse] = js.native
  
  /** Gets a publisher connection. */
  def get(): Request[PublisherConnection] = js.native
  def get(request: PrettyPrint): Request[PublisherConnection] = js.native
  
  /** Lists publisher connections for a given bidder. */
  def list(): Request[ListPublisherConnectionsResponse] = js.native
  def list(request: Filter): Request[ListPublisherConnectionsResponse] = js.native
}
