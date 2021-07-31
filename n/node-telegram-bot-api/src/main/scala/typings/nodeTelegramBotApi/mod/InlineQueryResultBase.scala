package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultBase extends StObject {
  
  var id: String
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}
object InlineQueryResultBase {
  
  @scala.inline
  def apply(id: String): InlineQueryResultBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultBase]
  }
  
  @scala.inline
  implicit class InlineQueryResultBaseMutableBuilder[Self <: InlineQueryResultBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
  }
}
