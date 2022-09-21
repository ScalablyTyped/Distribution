package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dice extends StObject {
  
  var emoji: String
  
  var value: Double
}
object Dice {
  
  inline def apply(emoji: String, value: Double): Dice = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dice]
  }
  
  extension [Self <: Dice](x: Self) {
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
