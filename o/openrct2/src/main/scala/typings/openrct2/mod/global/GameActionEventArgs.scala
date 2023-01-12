package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameActionEventArgs extends StObject {
  
  val action: String
  
  val args: js.Object
  
  val isClientOnly: Boolean
  
  val player: Double
  
  var result: GameActionResult
  
  val `type`: Double
}
object GameActionEventArgs {
  
  inline def apply(
    action: String,
    args: js.Object,
    isClientOnly: Boolean,
    player: Double,
    result: GameActionResult,
    `type`: Double
  ): GameActionEventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], isClientOnly = isClientOnly.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameActionEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameActionEventArgs] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setIsClientOnly(value: Boolean): Self = StObject.set(x, "isClientOnly", value.asInstanceOf[js.Any])
    
    inline def setPlayer(value: Double): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setResult(value: GameActionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
