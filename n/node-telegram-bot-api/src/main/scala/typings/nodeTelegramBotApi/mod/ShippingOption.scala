package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingOption extends StObject {
  
  var id: String
  
  var prices: js.Array[LabeledPrice]
  
  var title: String
}
object ShippingOption {
  
  @scala.inline
  def apply(id: String, prices: js.Array[LabeledPrice], title: String): ShippingOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingOption]
  }
  
  @scala.inline
  implicit class ShippingOptionMutableBuilder[Self <: ShippingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrices(value: js.Array[LabeledPrice]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricesVarargs(value: LabeledPrice*): Self = StObject.set(x, "prices", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
