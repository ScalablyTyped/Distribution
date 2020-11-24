package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSourcerepo.anon.Accesstoken
import typings.maximMazurokGapiClientSourcerepo.anon.Alt
import typings.maximMazurokGapiClientSourcerepo.anon.Callback
import typings.maximMazurokGapiClientSourcerepo.anon.Fields
import typings.maximMazurokGapiClientSourcerepo.anon.Key
import typings.maximMazurokGapiClientSourcerepo.anon.Name
import typings.maximMazurokGapiClientSourcerepo.anon.Oauthtoken
import typings.maximMazurokGapiClientSourcerepo.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposResource extends js.Object {
  
  /** Creates a repo in the given project with the given name. If the named repository already exists, `CreateRepo` returns `ALREADY_EXISTS`. */
  def create(request: Accesstoken): Request[Repo] = js.native
  def create(request: Alt, body: Repo): Request[Repo] = js.native
  
  /** Deletes a repo. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Returns information about a repo. */
  def get(): Request[Repo] = js.native
  def get(request: Callback): Request[Repo] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Fields): Request[Policy] = js.native
  
  /** Returns all repos belonging to a project. The sizes of the repos are not set by ListRepos. To get the size of a repo, use GetRepo. */
  def list(): Request[ListReposResponse] = js.native
  def list(request: Key): Request[ListReposResponse] = js.native
  
  def patch(request: Callback, body: UpdateRepoRequest): Request[Repo] = js.native
  /** Updates information about a repo. */
  def patch(request: Name): Request[Repo] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  def sync(request: Callback, body: SyncRepoRequest): Request[Operation] = js.native
  /** Synchronize a connected repo. The response contains SyncRepoMetadata in the metadata field. */
  def sync(request: PrettyPrint): Request[Operation] = js.native
  
  /** Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error. */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
