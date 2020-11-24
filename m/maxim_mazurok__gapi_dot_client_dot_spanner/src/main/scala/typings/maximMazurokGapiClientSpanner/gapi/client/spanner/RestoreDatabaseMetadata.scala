package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDatabaseMetadata extends js.Object {
  
  /** Information about the backup used to restore the database. */
  var backupInfo: js.UndefOr[BackupInfo] = js.native
  
  /**
    * The time at which cancellation of this operation was received. Operations.CancelOperation starts asynchronous cancellation on a long-running operation. The server makes a best
    * effort to cancel the operation, but success is not guaranteed. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var cancelTime: js.UndefOr[String] = js.native
  
  /** Name of the database being created and restored to. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If exists, the name of the long-running operation that will be used to track the post-restore optimization process to optimize the performance of the restored database, and remove
    * the dependency on the restore source. The name is of the form `projects//instances//databases//operations/` where the is the name of database being created and restored to. The
    * metadata type of the long-running operation is OptimizeRestoredDatabaseMetadata. This long-running operation will be automatically created by the system after the RestoreDatabase
    * long-running operation completes successfully. This operation will not be created if the restore was not successful.
    */
  var optimizeDatabaseOperationName: js.UndefOr[String] = js.native
  
  /** The progress of the RestoreDatabase operation. */
  var progress: js.UndefOr[OperationProgress] = js.native
  
  /** The type of the restore source. */
  var sourceType: js.UndefOr[String] = js.native
}
object RestoreDatabaseMetadata {
  
  @scala.inline
  def apply(): RestoreDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDatabaseMetadata]
  }
  
  @scala.inline
  implicit class RestoreDatabaseMetadataOps[Self <: RestoreDatabaseMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupInfo(value: BackupInfo): Self = this.set("backupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupInfo: Self = this.set("backupInfo", js.undefined)
    
    @scala.inline
    def setCancelTime(value: String): Self = this.set("cancelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTime: Self = this.set("cancelTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptimizeDatabaseOperationName(value: String): Self = this.set("optimizeDatabaseOperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeDatabaseOperationName: Self = this.set("optimizeDatabaseOperationName", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setSourceType(value: String): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
}
