package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientNetworkmanagement.anon.Accesstoken
import typings.maximMazurokGapiClientNetworkmanagement.anon.Alt
import typings.maximMazurokGapiClientNetworkmanagement.anon.Callback
import typings.maximMazurokGapiClientNetworkmanagement.anon.Fields
import typings.maximMazurokGapiClientNetworkmanagement.anon.Filter
import typings.maximMazurokGapiClientNetworkmanagement.anon.Key
import typings.maximMazurokGapiClientNetworkmanagement.anon.Name
import typings.maximMazurokGapiClientNetworkmanagement.anon.Oauthtoken
import typings.maximMazurokGapiClientNetworkmanagement.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectivityTestsResource extends js.Object {
  
  /**
    * Creates a new Connectivity Test. After you create a test, the reachability analysis is performed as part of the long running operation, which completes when the analysis completes.
    * If the endpoint specifications in `ConnectivityTest` are invalid (for example, containing non-existent resources in the network, or you don't have read permissions to the network
    * configurations of listed projects), then the reachability result returns a value of `UNKNOWN`. If the endpoint specifications in `ConnectivityTest` are incomplete, the reachability
    * result returns a value of AMBIGUOUS. For more information, see the Connectivity Test documentation.
    */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: ConnectivityTest): Request[Operation] = js.native
  
  /** Deletes a specific `ConnectivityTest`. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets the details of a specific Connectivity Test. */
  def get(): Request[ConnectivityTest] = js.native
  def get(request: Callback): Request[ConnectivityTest] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Lists all Connectivity Tests owned by a project. */
  def list(): Request[ListConnectivityTestsResponse] = js.native
  def list(request: Filter): Request[ListConnectivityTestsResponse] = js.native
  
  /**
    * Updates the configuration of an existing `ConnectivityTest`. After you update a test, the reachability analysis is performed as part of the long running operation, which completes
    * when the analysis completes. The Reachability state in the test resource is updated with the new result. If the endpoint specifications in `ConnectivityTest` are invalid (for
    * example, they contain non-existent resources in the network, or the user does not have read permissions to the network configurations of listed projects), then the reachability
    * result returns a value of UNKNOWN. If the endpoint specifications in `ConnectivityTest` are incomplete, the reachability result returns a value of `AMBIGUOUS`. See the documentation
    * in `ConnectivityTest` for for more details.
    */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: ConnectivityTest): Request[Operation] = js.native
  
  def rerun(request: Callback, body: RerunConnectivityTestRequest): Request[Operation] = js.native
  /**
    * Rerun an existing `ConnectivityTest`. After the user triggers the rerun, the reachability analysis is performed as part of the long running operation, which completes when the
    * analysis completes. Even though the test configuration remains the same, the reachability result may change due to underlying network configuration changes. If the endpoint
    * specifications in `ConnectivityTest` become invalid (for example, specified resources are deleted in the network, or you lost read permissions to the network configurations of
    * listed projects), then the reachability result returns a value of `UNKNOWN`.
    */
  def rerun(request: Oauthtoken): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
