package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTranslate.anon.Callback
import typings.maximMazurokGapiClientTranslate.anon.Filter
import typings.maximMazurokGapiClientTranslate.anon.Key
import typings.maximMazurokGapiClientTranslate.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsResource extends js.Object {
  
  def cancel(request: Callback, body: CancelOperationRequest): Request[js.Object] = js.native
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support
    * this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  def cancel(request: Key): Request[js.Object] = js.native
  
  /**
    * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't
    * support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
  def get(): Request[Operation] = js.native
  def get(request: Callback): Request[Operation] = js.native
  
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services
    * to override the binding to use different resource name schemes, such as `users/∗/operations`. To override the binding, API services can add a binding such as
    * `"/v1/{name=users/ *}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
    * ensure the name binding is the parent resource, without the operations collection id.
    */
  def list(): Request[ListOperationsResponse] = js.native
  def list(request: Filter): Request[ListOperationsResponse] = js.native
  
  def wait(request: Callback, body: WaitOperationRequest): Request[Operation] = js.native
  /**
    * Waits for the specified long-running operation until it is done or reaches at most a specified timeout, returning the latest state. If the operation is already done, the latest
    * state is immediately returned. If the timeout specified is greater than the default HTTP/RPC timeout, the HTTP/RPC timeout is used. If the server does not support this method, it
    * returns `google.rpc.Code.UNIMPLEMENTED`. Note that this method is on a best-effort basis. It may return the latest state before the specified timeout (including immediately),
    * meaning even an immediate response is no guarantee that the operation is done.
    */
  def wait(request: Name): Request[Operation] = js.native
}
