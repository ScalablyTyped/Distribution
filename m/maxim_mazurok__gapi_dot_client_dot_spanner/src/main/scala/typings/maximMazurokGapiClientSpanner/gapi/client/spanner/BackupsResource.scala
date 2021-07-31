package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpanner.anon.Accesstoken
import typings.maximMazurokGapiClientSpanner.anon.BackupId
import typings.maximMazurokGapiClientSpanner.anon.Callback
import typings.maximMazurokGapiClientSpanner.anon.Key
import typings.maximMazurokGapiClientSpanner.anon.Name
import typings.maximMazurokGapiClientSpanner.anon.Oauthtoken
import typings.maximMazurokGapiClientSpanner.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupsResource extends StObject {
  
  /**
    * Starts creating a new Cloud Spanner Backup. The returned backup long-running operation will have a name of the format `projects//instances//backups//operations/` and can be used to
    * track creation of the backup. The metadata field type is CreateBackupMetadata. The response field type is Backup, if successful. Cancelling the returned operation will stop the
    * creation and delete the backup. There can be only one pending backup creation per database. Backup creation of different databases can run concurrently.
    */
  def create(request: BackupId): Request[Operation] = js.native
  def create(request: Key, body: Backup): Request[Operation] = js.native
  
  /** Deletes a pending or completed Backup. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets metadata on a pending or completed Backup. */
  def get(): Request[Backup] = js.native
  def get(request: Accesstoken): Request[Backup] = js.native
  
  /**
    * Gets the access control policy for a database or backup resource. Returns an empty policy if a database or backup exists but does not have a policy set. Authorization requires
    * `spanner.databases.getIamPolicy` permission on resource. For backups, authorization requires `spanner.backups.getIamPolicy` permission on resource.
    */
  def getIamPolicy(request: Oauthtoken, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists completed and pending backups. Backups returned are ordered by `create_time` in descending order, starting from the most recent `create_time`. */
  def list(): Request[ListBackupsResponse] = js.native
  def list(request: Callback): Request[ListBackupsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  /** Updates a pending or completed Backup. */
  def patch(request: Name): Request[Backup] = js.native
  def patch(request: PrettyPrint, body: Backup): Request[Backup] = js.native
  
  /**
    * Sets the access control policy on a database or backup resource. Replaces any existing policy. Authorization requires `spanner.databases.setIamPolicy` permission on resource. For
    * backups, authorization requires `spanner.backups.setIamPolicy` permission on resource.
    */
  def setIamPolicy(request: Oauthtoken, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that the caller has on the specified database or backup resource. Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND error
    * if the user has `spanner.databases.list` permission on the containing Cloud Spanner instance. Otherwise returns an empty set of permissions. Calling this method on a backup that
    * does not exist will result in a NOT_FOUND error if the user has `spanner.backups.list` permission on the containing instance.
    */
  def testIamPermissions(request: Oauthtoken, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
