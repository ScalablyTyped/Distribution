package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingOption extends js.Object {
  
  var id: String = js.native
  
  var prices: js.Array[LabeledPrice] = js.native
  
  var title: String = js.native
}
object ShippingOption {
  
  @scala.inline
  def apply(id: String, prices: js.Array[LabeledPrice], title: String): ShippingOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingOption]
  }
  
  @scala.inline
  implicit class ShippingOptionOps[Self <: ShippingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricesVarargs(value: LabeledPrice*): Self = this.set("prices", js.Array(value :_*))
    
    @scala.inline
    def setPrices(value: js.Array[LabeledPrice]): Self = this.set("prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
