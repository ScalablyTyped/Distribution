package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociatedMenuConfiguration extends js.Object {
  var Behavior: AssociatedMenuBehavior
  var Group: AssociatedMenuGroup
  var Label: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.Label
  var Order: scala.Double
}

object AssociatedMenuConfiguration {
  @scala.inline
  def apply(Behavior: AssociatedMenuBehavior, Group: AssociatedMenuGroup, Label: Label, Order: scala.Double): AssociatedMenuConfiguration = {
    val __obj = js.Dynamic.literal(Behavior = Behavior, Group = Group, Label = Label, Order = Order)
  
    __obj.asInstanceOf[AssociatedMenuConfiguration]
  }
}

