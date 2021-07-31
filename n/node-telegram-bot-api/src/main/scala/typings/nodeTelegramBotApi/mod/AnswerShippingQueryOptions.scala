package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerShippingQueryOptions extends StObject {
  
  var error_message: js.UndefOr[String] = js.undefined
  
  var shipping_options: js.UndefOr[js.Array[ShippingOption]] = js.undefined
}
object AnswerShippingQueryOptions {
  
  @scala.inline
  def apply(): AnswerShippingQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerShippingQueryOptions]
  }
  
  @scala.inline
  implicit class AnswerShippingQueryOptionsMutableBuilder[Self <: AnswerShippingQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
    
    @scala.inline
    def setShipping_options(value: js.Array[ShippingOption]): Self = StObject.set(x, "shipping_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_optionsUndefined: Self = StObject.set(x, "shipping_options", js.undefined)
    
    @scala.inline
    def setShipping_optionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shipping_options", js.Array(value :_*))
  }
}
