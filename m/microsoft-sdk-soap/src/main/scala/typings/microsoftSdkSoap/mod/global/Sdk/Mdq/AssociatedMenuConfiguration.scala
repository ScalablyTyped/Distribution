package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedMenuConfiguration extends js.Object {
  var Behavior: AssociatedMenuBehavior
  var Group: AssociatedMenuGroup
  var Label: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.Label
  var Order: Double
}

object AssociatedMenuConfiguration {
  @scala.inline
  def apply(Behavior: AssociatedMenuBehavior, Group: AssociatedMenuGroup, Label: Label, Order: Double): AssociatedMenuConfiguration = {
    val __obj = js.Dynamic.literal(Behavior = Behavior.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedMenuConfiguration]
  }
}

