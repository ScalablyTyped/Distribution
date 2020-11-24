package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicemanagement.anon.Accesstoken
import typings.maximMazurokGapiClientServicemanagement.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends js.Object {
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[Operation] = js.native
  def get(request: Accesstoken): Request[Operation] = js.native
  
  /** Lists service operations that match the specified filter in the request. */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: Alt): Request[ListOperationsResponse] = js.native
}
