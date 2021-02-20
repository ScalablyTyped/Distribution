package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientEventarc.anon.Alt
import typings.maximMazurokGapiClientEventarc.anon.Etag
import typings.maximMazurokGapiClientEventarc.anon.Fields
import typings.maximMazurokGapiClientEventarc.anon.Key
import typings.maximMazurokGapiClientEventarc.anon.Name
import typings.maximMazurokGapiClientEventarc.anon.Oauthtoken
import typings.maximMazurokGapiClientEventarc.anon.OrderBy
import typings.maximMazurokGapiClientEventarc.anon.PrettyPrint
import typings.maximMazurokGapiClientEventarc.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggersResource extends StObject {
  
  /** Create a new trigger in a particular project and location. */
  def create(request: Fields): Request[Operation] = js.native
  def create(request: Key, body: Trigger): Request[Operation] = js.native
  
  /** Delete a single trigger. */
  def delete(): Request[Operation] = js.native
  def delete(request: Etag): Request[Operation] = js.native
  
  /** Get a single trigger. */
  def get(): Request[Trigger] = js.native
  def get(request: Alt): Request[Trigger] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  
  /** List triggers. */
  def list(): Request[ListTriggersResponse] = js.native
  def list(request: OrderBy): Request[ListTriggersResponse] = js.native
  
  /** Update a single trigger. */
  def patch(request: Name): Request[Operation] = js.native
  def patch(request: PrettyPrint, body: Trigger): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: QuotaUser, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: QuotaUser, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
