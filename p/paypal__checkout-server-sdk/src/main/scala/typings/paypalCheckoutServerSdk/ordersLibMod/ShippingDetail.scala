package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.anon.Addressline1
import typings.paypalCheckoutServerSdk.anon.Fullname
import typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingDetail extends StObject {
  
  var address: Addressline1
  
  var name: js.UndefOr[Fullname] = js.undefined
  
  var `type`: js.UndefOr[ShippingType] = js.undefined
}
object ShippingDetail {
  
  inline def apply(address: Addressline1): ShippingDetail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingDetail]
  }
  
  extension [Self <: ShippingDetail](x: Self) {
    
    inline def setAddress(value: Addressline1): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setName(value: Fullname): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: ShippingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
