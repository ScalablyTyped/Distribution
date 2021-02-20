package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderInfo extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var phone_number: js.UndefOr[String] = js.native
  
  var shipping_address: js.UndefOr[ShippingAddress] = js.native
}
object OrderInfo {
  
  @scala.inline
  def apply(): OrderInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderInfo]
  }
  
  @scala.inline
  implicit class OrderInfoMutableBuilder[Self <: OrderInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    @scala.inline
    def setShipping_address(value: ShippingAddress): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
  }
}
