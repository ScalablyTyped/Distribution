package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.anon.Nationalnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneWithType extends StObject {
  
  var phone_number: Nationalnumber
  
  var phone_type: js.UndefOr[PhoneType] = js.undefined
}
object PhoneWithType {
  
  inline def apply(phone_number: Nationalnumber): PhoneWithType = {
    val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneWithType]
  }
  
  extension [Self <: PhoneWithType](x: Self) {
    
    inline def setPhone_number(value: Nationalnumber): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_type(value: PhoneType): Self = StObject.set(x, "phone_type", value.asInstanceOf[js.Any])
    
    inline def setPhone_typeUndefined: Self = StObject.set(x, "phone_type", js.undefined)
  }
}
