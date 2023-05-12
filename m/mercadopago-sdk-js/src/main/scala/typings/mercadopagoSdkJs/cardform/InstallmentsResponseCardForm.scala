package typings.mercadopagoSdkJs.cardform

import typings.mercadopagoSdkJs.shared.PayerCost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallmentsResponseCardForm extends StObject {
  
  var merchant_account_id: js.UndefOr[String] = js.undefined
  
  var payer_costs: js.Array[PayerCost]
}
object InstallmentsResponseCardForm {
  
  inline def apply(payer_costs: js.Array[PayerCost]): InstallmentsResponseCardForm = {
    val __obj = js.Dynamic.literal(payer_costs = payer_costs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallmentsResponseCardForm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallmentsResponseCardForm] (val x: Self) extends AnyVal {
    
    inline def setMerchant_account_id(value: String): Self = StObject.set(x, "merchant_account_id", value.asInstanceOf[js.Any])
    
    inline def setMerchant_account_idUndefined: Self = StObject.set(x, "merchant_account_id", js.undefined)
    
    inline def setPayer_costs(value: js.Array[PayerCost]): Self = StObject.set(x, "payer_costs", value.asInstanceOf[js.Any])
    
    inline def setPayer_costsVarargs(value: PayerCost*): Self = StObject.set(x, "payer_costs", js.Array(value*))
  }
}
