package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupMetadata extends StObject {
  
  /**
    * The time at which cancellation of this operation was received. Operations.CancelOperation starts asynchronous cancellation on a long-running operation. The server makes a best
    * effort to cancel the operation, but success is not guaranteed. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var cancelTime: js.UndefOr[String] = js.undefined
  
  /** The name of the database the backup is created from. */
  var database: js.UndefOr[String] = js.undefined
  
  /** The name of the backup being created. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The progress of the CreateBackup operation. */
  var progress: js.UndefOr[OperationProgress] = js.undefined
}
object CreateBackupMetadata {
  
  @scala.inline
  def apply(): CreateBackupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBackupMetadata]
  }
  
  @scala.inline
  implicit class CreateBackupMetadataMutableBuilder[Self <: CreateBackupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
