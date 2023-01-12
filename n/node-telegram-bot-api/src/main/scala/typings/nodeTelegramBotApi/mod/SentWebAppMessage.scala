package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentWebAppMessage extends StObject {
  
  var inline_message_id: js.UndefOr[String] = js.undefined
}
object SentWebAppMessage {
  
  inline def apply(): SentWebAppMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentWebAppMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SentWebAppMessage] (val x: Self) extends AnyVal {
    
    inline def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    inline def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
  }
}
