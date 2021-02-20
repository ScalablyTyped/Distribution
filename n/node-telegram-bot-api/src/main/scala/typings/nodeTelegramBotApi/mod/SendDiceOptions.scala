package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendDiceOptions extends SendBasicOptions {
  
  var emoji: js.UndefOr[String] = js.native
}
object SendDiceOptions {
  
  @scala.inline
  def apply(): SendDiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDiceOptions]
  }
  
  @scala.inline
  implicit class SendDiceOptionsMutableBuilder[Self <: SendDiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}
