package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedMenuConfiguration extends js.Object {
  
  var Behavior: AssociatedMenuBehavior = js.native
  
  var Group: AssociatedMenuGroup = js.native
  
  var Label: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.Label = js.native
  
  var Order: Double = js.native
}
object AssociatedMenuConfiguration {
  
  @scala.inline
  def apply(Behavior: AssociatedMenuBehavior, Group: AssociatedMenuGroup, Label: Label, Order: Double): AssociatedMenuConfiguration = {
    val __obj = js.Dynamic.literal(Behavior = Behavior.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedMenuConfiguration]
  }
  
  @scala.inline
  implicit class AssociatedMenuConfigurationOps[Self <: AssociatedMenuConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBehavior(value: AssociatedMenuBehavior): Self = this.set("Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: AssociatedMenuGroup): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("Order", value.asInstanceOf[js.Any])
  }
}
