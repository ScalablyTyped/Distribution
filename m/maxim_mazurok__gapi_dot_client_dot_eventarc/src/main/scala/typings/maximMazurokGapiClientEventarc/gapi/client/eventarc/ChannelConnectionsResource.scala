package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientEventarc.anon.Accesstoken
import typings.maximMazurokGapiClientEventarc.anon.Alt
import typings.maximMazurokGapiClientEventarc.anon.Callback
import typings.maximMazurokGapiClientEventarc.anon.Fields
import typings.maximMazurokGapiClientEventarc.anon.Key
import typings.maximMazurokGapiClientEventarc.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelConnectionsResource extends StObject {
  
  /** Create a new ChannelConnection in a particular project and location. */
  def create(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
  def create(request: Alt, body: ChannelConnection): Request[GoogleLongrunningOperation] = js.native
  
  /** Delete a single ChannelConnection. */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Callback): Request[GoogleLongrunningOperation] = js.native
  
  /** Get a single ChannelConnection. */
  def get(): Request[ChannelConnection] = js.native
  def get(request: Callback): Request[ChannelConnection] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** List channel connections. */
  def list(): Request[ListChannelConnectionsResponse] = js.native
  def list(request: Key): Request[ListChannelConnectionsResponse] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
