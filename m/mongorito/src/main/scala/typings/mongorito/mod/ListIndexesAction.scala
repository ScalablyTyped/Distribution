package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.LIST_INDEXES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIndexesAction extends Action {
  
  var args: js.Array[_] = js.native
  
  var `type`: LIST_INDEXES = js.native
}
object ListIndexesAction {
  
  @scala.inline
  def apply(args: js.Array[_], `type`: LIST_INDEXES): ListIndexesAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexesAction]
  }
  
  @scala.inline
  implicit class ListIndexesActionMutableBuilder[Self <: ListIndexesAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setType(value: LIST_INDEXES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
