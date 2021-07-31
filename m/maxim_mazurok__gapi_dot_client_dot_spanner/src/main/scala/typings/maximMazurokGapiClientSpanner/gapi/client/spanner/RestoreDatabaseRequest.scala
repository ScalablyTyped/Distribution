package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDatabaseRequest extends StObject {
  
  /** Name of the backup from which to restore. Values are of the form `projects//instances//backups/`. */
  var backup: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the database to create and restore to. This database must not already exist. The `database_id` appended to `parent` forms the full database name of the form
    * `projects//instances//databases/`.
    */
  var databaseId: js.UndefOr[String] = js.undefined
}
object RestoreDatabaseRequest {
  
  @scala.inline
  def apply(): RestoreDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDatabaseRequest]
  }
  
  @scala.inline
  implicit class RestoreDatabaseRequestMutableBuilder[Self <: RestoreDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    @scala.inline
    def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
  }
}
