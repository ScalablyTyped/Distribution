package typings.paypalRestSdk.anon

import typings.paypalRestSdk.mod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items extends js.Object {
  
  var items: js.Array[Item] = js.native
  
  var shipping_address: js.UndefOr[typings.paypalRestSdk.mod.Address] = js.native
  
  var shipping_method: js.UndefOr[String] = js.native
  
  var shipping_phone_number: js.UndefOr[String] = js.native
}
object Items {
  
  @scala.inline
  def apply(items: js.Array[Item]): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_address(value: typings.paypalRestSdk.mod.Address): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_address: Self = this.set("shipping_address", js.undefined)
    
    @scala.inline
    def setShipping_method(value: String): Self = this.set("shipping_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_method: Self = this.set("shipping_method", js.undefined)
    
    @scala.inline
    def setShipping_phone_number(value: String): Self = this.set("shipping_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_phone_number: Self = this.set("shipping_phone_number", js.undefined)
  }
}
