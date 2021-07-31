package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerPreCheckoutQueryOptions extends StObject {
  
  var error_message: js.UndefOr[String] = js.undefined
}
object AnswerPreCheckoutQueryOptions {
  
  @scala.inline
  def apply(): AnswerPreCheckoutQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerPreCheckoutQueryOptions]
  }
  
  @scala.inline
  implicit class AnswerPreCheckoutQueryOptionsMutableBuilder[Self <: AnswerPreCheckoutQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
  }
}
