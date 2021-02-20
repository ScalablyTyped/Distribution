package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.DROP_INDEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropIndexAction extends Action {
  
  var args: js.Array[_] = js.native
  
  var `type`: DROP_INDEX = js.native
}
object DropIndexAction {
  
  @scala.inline
  def apply(args: js.Array[_], `type`: DROP_INDEX): DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexAction]
  }
  
  @scala.inline
  implicit class DropIndexActionMutableBuilder[Self <: DropIndexAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setType(value: DROP_INDEX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
