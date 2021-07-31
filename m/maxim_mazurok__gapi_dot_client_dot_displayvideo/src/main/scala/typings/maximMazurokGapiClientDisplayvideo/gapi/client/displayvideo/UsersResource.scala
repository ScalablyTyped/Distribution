package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsFilterKey
import typings.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUserUpdateMask
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserResourceUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.QuotaUserUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.UploadprotocolUserId
import typings.maximMazurokGapiClientDisplayvideo.anon.UserId
import typings.maximMazurokGapiClientDisplayvideo.anon.UserIdXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  def bulkEditAssignedUserRoles(request: UploadprotocolUserId, body: BulkEditAssignedUserRolesRequest): Request[BulkEditAssignedUserRolesResponse] = js.native
  /**
    * Bulk edits user roles for a user. The operation will delete the assigned user roles provided in BulkEditAssignedUserRolesRequest.deletedAssignedUserRoles and then assign the user
    * roles provided in BulkEditAssignedUserRolesRequest.createdAssignedUserRoles.
    */
  def bulkEditAssignedUserRoles(request: UserId): Request[BulkEditAssignedUserRolesResponse] = js.native
  
  /** Creates a new user. Returns the newly created user if successful. */
  def create(request: QuotaUserResourceUploadType): Request[User] = js.native
  def create(request: QuotaUserUploadType, body: User): Request[User] = js.native
  
  /** Deletes a user. */
  def delete(): Request[js.Object] = js.native
  def delete(request: UploadprotocolUserId): Request[js.Object] = js.native
  
  /** Gets a user. */
  def get(): Request[User] = js.native
  def get(request: UploadprotocolUserId): Request[User] = js.native
  
  /** Lists users that are accessible to the current user. If two users have user roles on the same partner or advertiser, they can access each other. */
  def list(): Request[ListUsersResponse] = js.native
  def list(request: FieldsFilterKey): Request[ListUsersResponse] = js.native
  
  def patch(request: PrettyPrintQuotaUserUpdateMask, body: User): Request[User] = js.native
  /** Updates an existing user. Returns the updated user if successful. */
  def patch(request: UserIdXgafv): Request[User] = js.native
}
