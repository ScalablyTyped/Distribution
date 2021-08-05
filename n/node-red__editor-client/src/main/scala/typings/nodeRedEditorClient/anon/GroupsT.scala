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
  
  inline def apply(): GroupsT = {
    val __obj = js.Dynamic.literal(t = "ungroup")
    __obj.asInstanceOf[GroupsT]
  }
  
  extension [Self <: GroupsT](x: Self) {
    
    inline def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setT(value: ungroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
