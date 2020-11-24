package typings.maximMazurokGapiClientFirebasedatabase.gapi.client.firebasedatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseInstance extends js.Object {
  
  /** Immutable. The globally unique hostname of the database. */
  var databaseUrl: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`. Currently the only supported
    * location is 'us-central1'.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The resource name of the project this instance belongs to. For example: `projects/{project-number}`. */
  var project: js.UndefOr[String] = js.native
  
  /** The database's lifecycle state. Read-only. */
  var state: js.UndefOr[String] = js.native
  
  /** The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted. */
  var `type`: js.UndefOr[String] = js.native
}
object DatabaseInstance {
  
  @scala.inline
  def apply(): DatabaseInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseInstance]
  }
  
  @scala.inline
  implicit class DatabaseInstanceOps[Self <: DatabaseInstance] (val x: Self) extends AnyVal {
    
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
    def setDatabaseUrl(value: String): Self = this.set("databaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseUrl: Self = this.set("databaseUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
