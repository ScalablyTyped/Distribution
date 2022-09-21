package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientManagedidentities.anon.Callback
import typings.maximMazurokGapiClientManagedidentities.anon.CallbackFields
import typings.maximMazurokGapiClientManagedidentities.anon.Fields
import typings.maximMazurokGapiClientManagedidentities.anon.FieldsKey
import typings.maximMazurokGapiClientManagedidentities.anon.Filter
import typings.maximMazurokGapiClientManagedidentities.anon.Name
import typings.maximMazurokGapiClientManagedidentities.anon.Oauthtoken
import typings.maximMazurokGapiClientManagedidentities.anon.PeeringId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeringsResource extends StObject {
  
  def create(request: CallbackFields, body: Peering): Request[Operation] = js.native
  /** Creates a Peering for Managed AD instance. */
  def create(request: PeeringId): Request[Operation] = js.native
  
  /** Deletes identified Peering. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single Peering. */
  def get(): Request[Peering] = js.native
  def get(request: Callback): Request[Peering] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Lists Peerings in a given project. */
  def list(): Request[ListPeeringsResponse] = js.native
  def list(request: Filter): Request[ListPeeringsResponse] = js.native
  
  /** Updates the labels for specified Peering. */
  def patch(request: FieldsKey): Request[Operation] = js.native
  def patch(request: Name, body: Peering): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
