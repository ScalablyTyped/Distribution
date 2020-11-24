package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupAssignmentTarget extends DeviceAndAppManagementAssignmentTarget {
  
  // The group Id that is the target of the assignment.
  var groupId: js.UndefOr[NullableOption[String]] = js.native
}
object GroupAssignmentTarget {
  
  @scala.inline
  def apply(): GroupAssignmentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupAssignmentTarget]
  }
  
  @scala.inline
  implicit class GroupAssignmentTargetOps[Self <: GroupAssignmentTarget] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: NullableOption[String]): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setGroupIdNull: Self = this.set("groupId", null)
  }
}
