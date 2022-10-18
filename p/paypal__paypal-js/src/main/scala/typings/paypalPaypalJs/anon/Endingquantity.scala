package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endingquantity extends StObject {
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var amount: AmountWithCurrencyCode
  
  /** The ending quantity for the tier. Optional for the last tier. */
  var ending_quantity: js.UndefOr[String] = js.undefined
  
  /** The starting quantity for the tier. */
  var starting_quantity: String
}
object Endingquantity {
  
  inline def apply(amount: AmountWithCurrencyCode, starting_quantity: String): Endingquantity = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], starting_quantity = starting_quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endingquantity]
  }
  
  extension [Self <: Endingquantity](x: Self) {
    
    inline def setAmount(value: AmountWithCurrencyCode): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setEnding_quantity(value: String): Self = StObject.set(x, "ending_quantity", value.asInstanceOf[js.Any])
    
    inline def setEnding_quantityUndefined: Self = StObject.set(x, "ending_quantity", js.undefined)
    
    inline def setStarting_quantity(value: String): Self = StObject.set(x, "starting_quantity", value.asInstanceOf[js.Any])
  }
}
