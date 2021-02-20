package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.UNSET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsetAction extends Action {
  
  var keys: String | js.Array[String] = js.native
  
  var `type`: UNSET = js.native
}
object UnsetAction {
  
  @scala.inline
  def apply(keys: String | js.Array[String], `type`: UNSET): UnsetAction = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsetAction]
  }
  
  @scala.inline
  implicit class UnsetActionMutableBuilder[Self <: UnsetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: String | js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setType(value: UNSET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
