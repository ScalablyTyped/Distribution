package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupAssignmentTarget
  extends StObject
     with DeviceAndAppManagementAssignmentTarget {
  
  // The group Id that is the target of the assignment.
  var groupId: js.UndefOr[NullableOption[String]] = js.undefined
}
object GroupAssignmentTarget {
  
  inline def apply(): GroupAssignmentTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupAssignmentTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupAssignmentTarget] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: NullableOption[String]): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdNull: Self = StObject.set(x, "groupId", null)
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
  }
}
