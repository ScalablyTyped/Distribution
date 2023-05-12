package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinancingDeals extends StObject {
  
  var expiration_date: js.UndefOr[Any] = js.undefined
  
  var installments: js.UndefOr[Any] = js.undefined
  
  var legals: js.UndefOr[Any] = js.undefined
  
  var start_date: js.UndefOr[Any] = js.undefined
  
  var status: String
}
object FinancingDeals {
  
  inline def apply(status: String): FinancingDeals = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinancingDeals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinancingDeals] (val x: Self) extends AnyVal {
    
    inline def setExpiration_date(value: Any): Self = StObject.set(x, "expiration_date", value.asInstanceOf[js.Any])
    
    inline def setExpiration_dateUndefined: Self = StObject.set(x, "expiration_date", js.undefined)
    
    inline def setInstallments(value: Any): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
    
    inline def setInstallmentsUndefined: Self = StObject.set(x, "installments", js.undefined)
    
    inline def setLegals(value: Any): Self = StObject.set(x, "legals", value.asInstanceOf[js.Any])
    
    inline def setLegalsUndefined: Self = StObject.set(x, "legals", js.undefined)
    
    inline def setStart_date(value: Any): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
    
    inline def setStart_dateUndefined: Self = StObject.set(x, "start_date", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
