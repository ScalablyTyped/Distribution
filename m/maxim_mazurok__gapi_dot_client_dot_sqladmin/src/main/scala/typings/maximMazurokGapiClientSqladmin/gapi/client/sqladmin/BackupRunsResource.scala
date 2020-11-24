package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSqladmin.anon.Accesstoken
import typings.maximMazurokGapiClientSqladmin.anon.Alt
import typings.maximMazurokGapiClientSqladmin.anon.Callback
import typings.maximMazurokGapiClientSqladmin.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupRunsResource extends js.Object {
  
  /** Deletes the backup taken by a backup run. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  /** Retrieves a resource containing information about a backup run. */
  def get(): Request[BackupRun] = js.native
  def get(request: Accesstoken): Request[BackupRun] = js.native
  
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: Alt): Request[Operation] = js.native
  def insert(request: Callback, body: BackupRun): Request[Operation] = js.native
  
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the backup initiation time. */
  def list(): Request[BackupRunsListResponse] = js.native
  def list(request: Fields): Request[BackupRunsListResponse] = js.native
}
