package typings.postmark.messageStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionManagementConfiguration extends js.Object {
  
  var UnsubscribeHandlingType: String = js.native
}
object SubscriptionManagementConfiguration {
  
  @scala.inline
  def apply(UnsubscribeHandlingType: String): SubscriptionManagementConfiguration = {
    val __obj = js.Dynamic.literal(UnsubscribeHandlingType = UnsubscribeHandlingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionManagementConfiguration]
  }
  
  @scala.inline
  implicit class SubscriptionManagementConfigurationOps[Self <: SubscriptionManagementConfiguration] (val x: Self) extends AnyVal {
    
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
    def setUnsubscribeHandlingType(value: String): Self = this.set("UnsubscribeHandlingType", value.asInstanceOf[js.Any])
  }
}
