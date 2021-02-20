package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditMessageCaptionOptions extends EditMessageReplyMarkupOptions {
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.native
}
object EditMessageCaptionOptions {
  
  @scala.inline
  def apply(): EditMessageCaptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageCaptionOptions]
  }
  
  @scala.inline
  implicit class EditMessageCaptionOptionsMutableBuilder[Self <: EditMessageCaptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
  }
}
