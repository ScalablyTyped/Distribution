package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallmentsConfiguration extends StObject {
  
  var amount: String
  
  var billingCountryCode: js.UndefOr[String] = js.undefined
  
  var currencyCode: String
  
  var financingCountryCode: js.UndefOr[String] = js.undefined
}
object InstallmentsConfiguration {
  
  inline def apply(amount: String, currencyCode: String): InstallmentsConfiguration = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallmentsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallmentsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBillingCountryCode(value: String): Self = StObject.set(x, "billingCountryCode", value.asInstanceOf[js.Any])
    
    inline def setBillingCountryCodeUndefined: Self = StObject.set(x, "billingCountryCode", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setFinancingCountryCode(value: String): Self = StObject.set(x, "financingCountryCode", value.asInstanceOf[js.Any])
    
    inline def setFinancingCountryCodeUndefined: Self = StObject.set(x, "financingCountryCode", js.undefined)
  }
}
