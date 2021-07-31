package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.ungroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupsT extends StObject {
  
  var groups: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: ungroup
}
object GroupsT {
  
  @scala.inline
  def apply(): GroupsT = {
    val __obj = js.Dynamic.literal(t = "ungroup")
    __obj.asInstanceOf[GroupsT]
  }
  
  @scala.inline
  implicit class GroupsTMutableBuilder[Self <: GroupsT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setT(value: ungroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
