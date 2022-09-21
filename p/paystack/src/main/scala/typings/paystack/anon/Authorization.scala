package typings.paystack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorization extends StObject {
  
  var authorization: String
  
  var customer: String
  
  var plan: String
  
  var start_date: js.UndefOr[js.Date] = js.undefined
}
object Authorization {
  
  inline def apply(authorization: String, customer: String, plan: String): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  extension [Self <: Authorization](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setStart_date(value: js.Date): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
    
    inline def setStart_dateUndefined: Self = StObject.set(x, "start_date", js.undefined)
  }
}
