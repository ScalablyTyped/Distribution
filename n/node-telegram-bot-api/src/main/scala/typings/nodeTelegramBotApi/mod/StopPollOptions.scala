package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopPollOptions extends StObject {
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.native
}
object StopPollOptions {
  
  @scala.inline
  def apply(): StopPollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPollOptions]
  }
  
  @scala.inline
  implicit class StopPollOptionsMutableBuilder[Self <: StopPollOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
  }
}
