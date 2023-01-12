package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionLocationArgs extends StObject {
  
  val isClientOnly: Boolean
  
  val player: Double
  
  var result: Boolean
  
  val `type`: Double
  
  val x: Double
  
  val y: Double
}
object ActionLocationArgs {
  
  inline def apply(isClientOnly: Boolean, player: Double, result: Boolean, `type`: Double, x: Double, y: Double): ActionLocationArgs = {
    val __obj = js.Dynamic.literal(isClientOnly = isClientOnly.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionLocationArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionLocationArgs] (val x: Self) extends AnyVal {
    
    inline def setIsClientOnly(value: Boolean): Self = StObject.set(x, "isClientOnly", value.asInstanceOf[js.Any])
    
    inline def setPlayer(value: Double): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
