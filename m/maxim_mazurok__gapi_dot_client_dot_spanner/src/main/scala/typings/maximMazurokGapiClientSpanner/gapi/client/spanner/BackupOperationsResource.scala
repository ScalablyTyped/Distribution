package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpanner.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupOperationsResource extends StObject {
  
  /**
    * Lists the backup long-running operations in the given instance. A backup operation has a name of the form `projects//instances//backups//operations/`. The long-running operation
    * metadata field type `metadata.type_url` describes the type of the metadata. Operations returned include those that have completed/failed/canceled within the last 7 days, and pending
    * operations. Operations returned are ordered by `operation.metadata.value.progress.start_time` in descending order starting from the most recently started operation.
    */
  def list(): Request[ListBackupOperationsResponse] = js.native
  def list(request: Callback): Request[ListBackupOperationsResponse] = js.native
}
