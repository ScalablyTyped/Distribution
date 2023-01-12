package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerCallbackQueryOptions extends StObject {
  
  var cache_time: js.UndefOr[Double] = js.undefined
  
  var callback_query_id: String
  
  var show_alert: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object AnswerCallbackQueryOptions {
  
  inline def apply(callback_query_id: String): AnswerCallbackQueryOptions = {
    val __obj = js.Dynamic.literal(callback_query_id = callback_query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerCallbackQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnswerCallbackQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setCache_time(value: Double): Self = StObject.set(x, "cache_time", value.asInstanceOf[js.Any])
    
    inline def setCache_timeUndefined: Self = StObject.set(x, "cache_time", js.undefined)
    
    inline def setCallback_query_id(value: String): Self = StObject.set(x, "callback_query_id", value.asInstanceOf[js.Any])
    
    inline def setShow_alert(value: Boolean): Self = StObject.set(x, "show_alert", value.asInstanceOf[js.Any])
    
    inline def setShow_alertUndefined: Self = StObject.set(x, "show_alert", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
