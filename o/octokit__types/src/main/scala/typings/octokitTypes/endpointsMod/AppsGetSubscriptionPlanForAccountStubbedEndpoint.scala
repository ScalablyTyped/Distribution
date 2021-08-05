package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsGetSubscriptionPlanForAccountStubbedEndpoint extends StObject {
  
  var account_id: Double
}
object AppsGetSubscriptionPlanForAccountStubbedEndpoint {
  
  inline def apply(account_id: Double): AppsGetSubscriptionPlanForAccountStubbedEndpoint = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetSubscriptionPlanForAccountStubbedEndpoint]
  }
  
  extension [Self <: AppsGetSubscriptionPlanForAccountStubbedEndpoint](x: Self) {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
  }
}
