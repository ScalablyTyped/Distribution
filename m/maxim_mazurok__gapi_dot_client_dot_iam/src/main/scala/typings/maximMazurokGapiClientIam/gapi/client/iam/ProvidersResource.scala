package typings.maximMazurokGapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIam.anon.Fields
import typings.maximMazurokGapiClientIam.anon.PageSize
import typings.maximMazurokGapiClientIam.anon.Parent
import typings.maximMazurokGapiClientIam.anon.Resource
import typings.maximMazurokGapiClientIam.anon.UpdateMask
import typings.maximMazurokGapiClientIam.anon.UploadType
import typings.maximMazurokGapiClientIam.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidersResource extends StObject {
  
  /** Creates a new WorkloadIdentityPoolProvider in a WorkloadIdentityPool. You cannot reuse the name of a deleted provider until 30 days after deletion. */
  def create(request: Parent): Request[Operation] = js.native
  def create(request: UploadType, body: WorkloadIdentityPoolProvider): Request[Operation] = js.native
  
  /**
    * Deletes a WorkloadIdentityPoolProvider. Deleting a provider does not revoke credentials that have already been issued; they continue to grant access. You can undelete a provider for
    * 30 days. After 30 days, deletion is permanent. You cannot update deleted providers. However, you can view and list them.
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Fields): Request[Operation] = js.native
  
  /** Gets an individual WorkloadIdentityPoolProvider. */
  def get(): Request[WorkloadIdentityPoolProvider] = js.native
  def get(request: Fields): Request[WorkloadIdentityPoolProvider] = js.native
  
  var keys: KeysResource = js.native
  
  /** Lists all non-deleted WorkloadIdentityPoolProviders in a WorkloadIdentityPool. If `show_deleted` is set to `true`, then deleted providers are also listed. */
  def list(): Request[ListWorkloadIdentityPoolProvidersResponse] = js.native
  def list(request: PageSize): Request[ListWorkloadIdentityPoolProvidersResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  /** Updates an existing WorkloadIdentityPoolProvider. */
  def patch(request: Resource): Request[Operation] = js.native
  def patch(request: UpdateMask, body: WorkloadIdentityPoolProvider): Request[Operation] = js.native
  
  def undelete(request: Fields, body: UndeleteWorkloadIdentityPoolProviderRequest): Request[Operation] = js.native
  /** Undeletes a WorkloadIdentityPoolProvider, as long as it was deleted fewer than 30 days ago. */
  def undelete(request: Uploadprotocol): Request[Operation] = js.native
}
