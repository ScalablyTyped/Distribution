package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDatabaseRequest extends js.Object {
  
  /** Name of the backup from which to restore. Values are of the form `projects//instances//backups/`. */
  var backup: js.UndefOr[String] = js.native
  
  /**
    * Required. The id of the database to create and restore to. This database must not already exist. The `database_id` appended to `parent` forms the full database name of the form
    * `projects//instances//databases/`.
    */
  var databaseId: js.UndefOr[String] = js.native
}
object RestoreDatabaseRequest {
  
  @scala.inline
  def apply(): RestoreDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDatabaseRequest]
  }
  
  @scala.inline
  implicit class RestoreDatabaseRequestOps[Self <: RestoreDatabaseRequest] (val x: Self) extends AnyVal {
    
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
    def setBackup(value: String): Self = this.set("backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackup: Self = this.set("backup", js.undefined)
    
    @scala.inline
    def setDatabaseId(value: String): Self = this.set("databaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseId: Self = this.set("databaseId", js.undefined)
  }
}
