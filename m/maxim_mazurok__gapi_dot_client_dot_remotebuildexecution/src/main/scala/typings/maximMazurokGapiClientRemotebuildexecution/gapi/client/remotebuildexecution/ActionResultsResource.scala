package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRemotebuildexecution.anon.Accesstoken
import typings.maximMazurokGapiClientRemotebuildexecution.anon.Alt
import typings.maximMazurokGapiClientRemotebuildexecution.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionResultsResource extends js.Object {
  
  /**
    * Retrieve a cached execution result. Implementations SHOULD ensure that any blobs referenced from the ContentAddressableStorage are available at the time of returning the
    * ActionResult and will be for some period of time afterwards. The TTLs of the referenced blobs SHOULD be increased if necessary and applicable. Errors: * `NOT_FOUND`: The requested
    * `ActionResult` is not in the cache.
    */
  def get(): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(request: Accesstoken): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
  
  /**
    * Upload a new execution result. In order to allow the server to perform access control based on the type of action, and to assist with client debugging, the client MUST first upload
    * the Action that produced the result, along with its Command, into the `ContentAddressableStorage`. Errors: * `INVALID_ARGUMENT`: One or more arguments are invalid. *
    * `FAILED_PRECONDITION`: One or more errors occurred in updating the action result, such as a missing command or action. * `RESOURCE_EXHAUSTED`: There is insufficient storage space to
    * add the entry to the cache.
    */
  def update(request: Alt): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(request: Callback, body: BuildBazelRemoteExecutionV2ActionResult): Request[BuildBazelRemoteExecutionV2ActionResult] = js.native
}
