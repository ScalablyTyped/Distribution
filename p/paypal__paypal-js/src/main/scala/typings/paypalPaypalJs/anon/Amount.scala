package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.commonsMod.AmountWithCurrencyCode
import typings.paypalPaypalJs.shippingMod.ShippingOptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount extends StObject {
  
  var amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  /** A unique ID that identifies a payer-selected shipping option. */
  var id: String
  
  /** A description that the payer sees, which helps them choose an appropriate shipping option. */
  var label: String
  
  /**
    * If the API request sets `selected = true`, it represents the shipping option that the payee or merchant expects
    * to be pre-selected for the payer when they first view the `shipping.options` in the PayPal Checkout experience.
    * As part of the response if a `shipping.option` contains `selected=true`,
    * it represents the shipping option that the payer selected during the course of checkout with PayPal.
    * Only one `shipping.option` can be set to `selected=true`.
    */
  var selected: Boolean
  
  /** The method by which the payer wants to get their items. */
  var `type`: js.UndefOr[ShippingOptionType] = js.undefined
}
object Amount {
  
  inline def apply(id: String, label: String, selected: Boolean): Amount = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  extension [Self <: Amount](x: Self) {
    
    inline def setAmount(value: AmountWithCurrencyCode): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShippingOptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
