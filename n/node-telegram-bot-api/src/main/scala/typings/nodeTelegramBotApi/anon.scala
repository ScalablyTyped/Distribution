package typings.nodeTelegramBotApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<node-telegram-bot-api.node-telegram-bot-api.AnswerCallbackQueryOptions> */
  @js.native
  trait PartialAnswerCallbackQuer extends StObject {
    
    var cache_time: js.UndefOr[Double] = js.native
    
    var callback_query_id: js.UndefOr[String] = js.native
    
    var show_alert: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object PartialAnswerCallbackQuer {
    
    @scala.inline
    def apply(): PartialAnswerCallbackQuer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAnswerCallbackQuer]
    }
    
    @scala.inline
    implicit class PartialAnswerCallbackQuerMutableBuilder[Self <: PartialAnswerCallbackQuer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache_time(value: Double): Self = StObject.set(x, "cache_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache_timeUndefined: Self = StObject.set(x, "cache_time", js.undefined)
      
      @scala.inline
      def setCallback_query_id(value: String): Self = StObject.set(x, "callback_query_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback_query_idUndefined: Self = StObject.set(x, "callback_query_id", js.undefined)
      
      @scala.inline
      def setShow_alert(value: Boolean): Self = StObject.set(x, "show_alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_alertUndefined: Self = StObject.set(x, "show_alert", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
