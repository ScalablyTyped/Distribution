package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Waittimer extends StObject {
  
  /** @example 3515 */
  var id: Double
  
  /** @example MDQ6R2F0ZTM1MTU= */
  var node_id: String
  
  /** @example wait_timer */
  var `type`: String
  
  var wait_timer: js.UndefOr[Double] = js.undefined
}
object Waittimer {
  
  inline def apply(id: Double, node_id: String, `type`: String): Waittimer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waittimer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Waittimer] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWait_timer(value: Double): Self = StObject.set(x, "wait_timer", value.asInstanceOf[js.Any])
    
    inline def setWait_timerUndefined: Self = StObject.set(x, "wait_timer", js.undefined)
  }
}
