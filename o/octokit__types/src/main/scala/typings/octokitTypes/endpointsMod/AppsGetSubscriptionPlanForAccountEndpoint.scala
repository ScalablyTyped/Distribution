package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetSubscriptionPlanForAccountEndpoint extends StObject {
  
  var account_id: Double
}
object AppsGetSubscriptionPlanForAccountEndpoint {
  
  inline def apply(account_id: Double): AppsGetSubscriptionPlanForAccountEndpoint = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetSubscriptionPlanForAccountEndpoint]
  }
  
  extension [Self <: AppsGetSubscriptionPlanForAccountEndpoint](x: Self) {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
  }
}
