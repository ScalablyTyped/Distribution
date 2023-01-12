package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.UNSET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsetAction
  extends StObject
     with Action {
  
  var keys: String | js.Array[String]
  
  var `type`: UNSET
}
object UnsetAction {
  
  inline def apply(keys: String | js.Array[String], `type`: UNSET): UnsetAction = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsetAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsetAction] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: String | js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setType(value: UNSET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
