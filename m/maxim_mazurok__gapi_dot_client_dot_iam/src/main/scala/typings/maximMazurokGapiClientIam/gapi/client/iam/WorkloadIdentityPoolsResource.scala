package typings.maximMazurokGapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIam.anon.Fields
import typings.maximMazurokGapiClientIam.anon.KeyName
import typings.maximMazurokGapiClientIam.anon.NameOauthtoken
import typings.maximMazurokGapiClientIam.anon.OauthtokenParent
import typings.maximMazurokGapiClientIam.anon.PageSize
import typings.maximMazurokGapiClientIam.anon.UpdateMask
import typings.maximMazurokGapiClientIam.anon.WorkloadIdentityPoolId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkloadIdentityPoolsResource extends StObject {
  
  def create(request: OauthtokenParent, body: WorkloadIdentityPool): Request[Operation] = js.native
  /** Creates a new WorkloadIdentityPool. You cannot reuse the name of a deleted pool until 30 days after deletion. */
  def create(request: WorkloadIdentityPoolId): Request[Operation] = js.native
  
  /**
    * Deletes a WorkloadIdentityPool. You cannot use a deleted pool to exchange external credentials for Google Cloud credentials. However, deletion does not revoke credentials that have
    * already been issued. Credentials issued for a deleted pool do not grant access to resources. If the pool is undeleted, and the credentials are not expired, they grant access again.
    * You can undelete a pool for 30 days. After 30 days, deletion is permanent. You cannot update deleted pools. However, you can view and list them.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Fields): Request[Operation] = js.native
  
  /** Gets an individual WorkloadIdentityPool. */
  def get(): Request[WorkloadIdentityPool] = js.native
  def get(request: Fields): Request[WorkloadIdentityPool] = js.native
  
  /** Lists all non-deleted WorkloadIdentityPools in a project. If `show_deleted` is set to `true`, then deleted pools are also listed. */
  def list(): Request[ListWorkloadIdentityPoolsResponse] = js.native
  def list(request: PageSize): Request[ListWorkloadIdentityPoolsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  /** Updates an existing WorkloadIdentityPool. */
  def patch(request: KeyName): Request[Operation] = js.native
  def patch(request: UpdateMask, body: WorkloadIdentityPool): Request[Operation] = js.native
  
  var providers: ProvidersResource = js.native
  
  def undelete(request: Fields, body: UndeleteWorkloadIdentityPoolRequest): Request[Operation] = js.native
  /** Undeletes a WorkloadIdentityPool, as long as it was deleted fewer than 30 days ago. */
  def undelete(request: NameOauthtoken): Request[Operation] = js.native
}
