package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.CALL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallAction extends Action {
  
  var args: js.Array[Args] = js.native
  
  var method: String = js.native
  
  var `type`: CALL = js.native
}
object CallAction {
  
  @scala.inline
  def apply(args: js.Array[Args], method: String, `type`: CALL): CallAction = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallAction]
  }
  
  @scala.inline
  implicit class CallActionMutableBuilder[Self <: CallAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[Args]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: Args*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CALL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
