package typings.paypalPaypalJs

import typings.paypalPaypalJs.anon.Currencycode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shippingMod {
  
  trait SelectedShippingOption extends StObject {
    
    var amount: Currencycode
    
    var label: String
    
    var `type`: ShippingOptionType
  }
  object SelectedShippingOption {
    
    inline def apply(amount: Currencycode, label: String, `type`: ShippingOptionType): SelectedShippingOption = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedShippingOption]
    }
    
    extension [Self <: SelectedShippingOption](x: Self) {
      
      inline def setAmount(value: Currencycode): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setType(value: ShippingOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShippingAddress extends StObject {
    
    var city: String
    
    var country_code: String
    
    var postal_code: String
    
    var state: String
  }
  object ShippingAddress {
    
    inline def apply(city: String, country_code: String, postal_code: String, state: String): ShippingAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShippingAddress]
    }
    
    extension [Self <: ShippingAddress](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.paypalPaypalJs.paypalPaypalJsStrings.SHIPPING
    - typings.paypalPaypalJs.paypalPaypalJsStrings.PICKUP
  */
  trait ShippingOptionType extends StObject
  object ShippingOptionType {
    
    inline def PICKUP: typings.paypalPaypalJs.paypalPaypalJsStrings.PICKUP = "PICKUP".asInstanceOf[typings.paypalPaypalJs.paypalPaypalJsStrings.PICKUP]
    
    inline def SHIPPING: typings.paypalPaypalJs.paypalPaypalJsStrings.SHIPPING = "SHIPPING".asInstanceOf[typings.paypalPaypalJs.paypalPaypalJsStrings.SHIPPING]
  }
}
