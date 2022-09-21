package typings.paypalPaypalJs.ordersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountWithCurrencyCodeOptional extends StObject {
  
  /** The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency. */
  var currency_code: js.UndefOr[String] = js.undefined
  
  /**
    * The value, which might be:
    * - An integer for currencies like `JPY` that are not typically fractional.
    * - A decimal fraction for currencies like `TND` that are subdivided into thousandths.
    *
    * For the required number of decimal places for a currency code, see [Currency Codes](/docs/integration/direct/rest/currency-codes/).
    */
  var value: String
}
object AmountWithCurrencyCodeOptional {
  
  inline def apply(value: String): AmountWithCurrencyCodeOptional = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountWithCurrencyCodeOptional]
  }
  
  extension [Self <: AmountWithCurrencyCodeOptional](x: Self) {
    
    inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
    
    inline def setCurrency_codeUndefined: Self = StObject.set(x, "currency_code", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
