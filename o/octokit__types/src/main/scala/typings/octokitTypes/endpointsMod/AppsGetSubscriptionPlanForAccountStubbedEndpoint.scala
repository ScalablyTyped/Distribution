package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsGetSubscriptionPlanForAccountStubbedEndpoint extends js.Object {
  
  var account_id: Double = js.native
}
object AppsGetSubscriptionPlanForAccountStubbedEndpoint {
  
  @scala.inline
  def apply(account_id: Double): AppsGetSubscriptionPlanForAccountStubbedEndpoint = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetSubscriptionPlanForAccountStubbedEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetSubscriptionPlanForAccountStubbedEndpointOps[Self <: AppsGetSubscriptionPlanForAccountStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount_id(value: Double): Self = this.set("account_id", value.asInstanceOf[js.Any])
  }
}
