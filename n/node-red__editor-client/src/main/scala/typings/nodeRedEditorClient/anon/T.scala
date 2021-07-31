package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.createGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait T extends StObject {
  
  var groups: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var t: createGroup
}
object T {
  
  @scala.inline
  def apply(): T = {
    val __obj = js.Dynamic.literal(t = "createGroup")
    __obj.asInstanceOf[T]
  }
  
  @scala.inline
  implicit class TMutableBuilder[Self <: T] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[js.Object]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: js.Object*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setT(value: createGroup): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
