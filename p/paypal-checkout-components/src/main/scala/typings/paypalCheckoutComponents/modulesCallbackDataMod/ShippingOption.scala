package typings.paypalCheckoutComponents.modulesCallbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingOption extends StObject {
  
  /**
    * The shipping cost for the selected option.
    */
  var amount: CurrencyAmount
  
  /**
    * A unique ID that identifies a payer-selected shipping option.
    */
  var id: String
  
  /**
    * A description that the payer sees, which helps them choose an appropriate shipping option.
    * For example, `Free Shipping`, `USPS Priority Shipping`, `Expédition prioritaire USPS`,
    * or `USPS yōuxiān fā huò`. Localize this description to the payer's locale.
    */
  var label: String
  
  /**
    * If `selected = true` is specified as part of the API request it represents the shipping
    * option that the payee/merchant expects to be pre-selected for the payer when they first view
    * the shipping options within the PayPal checkout experience. As part of the response if a
    * shipping option has `selected = true` it represents the shipping option that the payer
    * selected during the course of checkout with PayPal. Only 1 `shippingOption` can be set
    * to `selected = true`.
    */
  var selected: Boolean
  
  /**
    * The method by which the payer wants to get their items.
    */
  var `type`: ShippingOptionType
}
object ShippingOption {
  
  inline def apply(amount: CurrencyAmount, id: String, label: String, selected: Boolean, `type`: ShippingOptionType): ShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShippingOption] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: CurrencyAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShippingOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
