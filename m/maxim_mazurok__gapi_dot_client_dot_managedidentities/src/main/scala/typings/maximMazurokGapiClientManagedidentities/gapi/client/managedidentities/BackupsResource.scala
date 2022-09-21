package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientManagedidentities.anon.Accesstoken
import typings.maximMazurokGapiClientManagedidentities.anon.Alt
import typings.maximMazurokGapiClientManagedidentities.anon.Callback
import typings.maximMazurokGapiClientManagedidentities.anon.Fields
import typings.maximMazurokGapiClientManagedidentities.anon.Filter
import typings.maximMazurokGapiClientManagedidentities.anon.Key
import typings.maximMazurokGapiClientManagedidentities.anon.Name
import typings.maximMazurokGapiClientManagedidentities.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupsResource extends StObject {
  
  /** Creates a Backup for a domain. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Backup): Request[Operation] = js.native
  
  /** Deletes identified Backup. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets details of a single Backup. */
  def get(): Request[Backup] = js.native
  def get(request: Callback): Request[Backup] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Lists Backup in a given project. */
  def list(): Request[ListBackupsResponse] = js.native
  def list(request: Filter): Request[ListBackupsResponse] = js.native
  
  /** Updates the labels for specified Backup. */
  def patch(request: Key): Request[Operation] = js.native
  def patch(request: Name, body: Backup): Request[Operation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
