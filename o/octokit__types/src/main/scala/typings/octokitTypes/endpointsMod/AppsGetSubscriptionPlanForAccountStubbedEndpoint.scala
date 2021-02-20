package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsGetSubscriptionPlanForAccountStubbedEndpoint extends StObject {
  
  var account_id: Double = js.native
}
object AppsGetSubscriptionPlanForAccountStubbedEndpoint {
  
  @scala.inline
  def apply(account_id: Double): AppsGetSubscriptionPlanForAccountStubbedEndpoint = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetSubscriptionPlanForAccountStubbedEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetSubscriptionPlanForAccountStubbedEndpointMutableBuilder[Self <: AppsGetSubscriptionPlanForAccountStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
  }
}
