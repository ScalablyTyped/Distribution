package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDiceOptions
  extends StObject
     with SendBasicOptions {
  
  var emoji: js.UndefOr[String] = js.undefined
}
object SendDiceOptions {
  
  inline def apply(): SendDiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDiceOptions]
  }
  
  extension [Self <: SendDiceOptions](x: Self) {
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}
