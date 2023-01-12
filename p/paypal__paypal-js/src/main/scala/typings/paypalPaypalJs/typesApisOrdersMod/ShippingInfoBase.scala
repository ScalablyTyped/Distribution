package typings.paypalPaypalJs.typesApisOrdersMod

import typings.paypalPaypalJs.anon.Nationalnumber
import typings.paypalPaypalJs.anon.Partialfullnamestring
import typings.paypalPaypalJs.typesApisCommonsMod.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingInfoBase extends StObject {
  
  var address: js.UndefOr[Address] = js.undefined
  
  var email_address: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the party
    */
  var name: js.UndefOr[Partialfullnamestring] = js.undefined
  
  var phone_number: js.UndefOr[Nationalnumber] = js.undefined
}
object ShippingInfoBase {
  
  inline def apply(): ShippingInfoBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingInfoBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingInfoBase] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
    
    inline def setName(value: Partialfullnamestring): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone_number(value: Nationalnumber): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
  }
}
