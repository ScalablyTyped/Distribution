package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assignment extends js.Object {
  
  /** The user to whom the comment was assigned. */
  var assignedUser: js.UndefOr[User] = js.native
  
  /** The sub-type of this event. */
  var subtype: js.UndefOr[String] = js.native
}
object Assignment {
  
  @scala.inline
  def apply(): Assignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assignment]
  }
  
  @scala.inline
  implicit class AssignmentOps[Self <: Assignment] (val x: Self) extends AnyVal {
    
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
    def setAssignedUser(value: User): Self = this.set("assignedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedUser: Self = this.set("assignedUser", js.undefined)
    
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
  }
}
