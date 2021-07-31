package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /** The context for backup operation, if applicable. */
  var backupContext: js.UndefOr[BackupContext] = js.undefined
  
  /** The time this operation finished in UTC timezone in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** If errors occurred during processing of this operation, this field will be populated. */
  var error: js.UndefOr[OperationErrors] = js.undefined
  
  /** The context for export operation, if applicable. */
  var exportContext: js.UndefOr[ExportContext] = js.undefined
  
  /** The context for import operation, if applicable. */
  var importContext: js.UndefOr[ImportContext] = js.undefined
  
  /** The time this operation was enqueued in UTC timezone in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /** This is always *sql#operation*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the operation. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the operation. Valid values are: *CREATE* *DELETE* *UPDATE* *RESTART* *IMPORT* *EXPORT* *BACKUP_VOLUME* *RESTORE_VOLUME* *CREATE_USER* *DELETE_USER* *CREATE_DATABASE*
    * *DELETE_DATABASE*
    */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The time this operation actually started in UTC timezone in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The status of an operation. Valid values are: *PENDING* *RUNNING* *DONE* *SQL_OPERATION_STATUS_UNSPECIFIED* */
  var status: js.UndefOr[String] = js.undefined
  
  /** Name of the database instance related to this operation. */
  var targetId: js.UndefOr[String] = js.undefined
  
  var targetLink: js.UndefOr[String] = js.undefined
  
  /** The project ID of the target instance related to this operation. */
  var targetProject: js.UndefOr[String] = js.undefined
  
  /** The email address of the user who initiated this operation. */
  var user: js.UndefOr[String] = js.undefined
}
object Operation {
  
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupContext(value: BackupContext): Self = StObject.set(x, "backupContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupContextUndefined: Self = StObject.set(x, "backupContext", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setError(value: OperationErrors): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExportContext(value: ExportContext): Self = StObject.set(x, "exportContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportContextUndefined: Self = StObject.set(x, "exportContext", js.undefined)
    
    @scala.inline
    def setImportContext(value: ImportContext): Self = StObject.set(x, "importContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportContextUndefined: Self = StObject.set(x, "importContext", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    @scala.inline
    def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
    
    @scala.inline
    def setTargetProject(value: String): Self = StObject.set(x, "targetProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetProjectUndefined: Self = StObject.set(x, "targetProject", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
