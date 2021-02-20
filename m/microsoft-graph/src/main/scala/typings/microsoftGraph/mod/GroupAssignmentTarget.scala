package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class GroupAssignmentTargetMutableBuilder[Self <: GroupAssignmentTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: NullableOption[String]): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdNull: Self = StObject.set(x, "groupId", null)
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}
