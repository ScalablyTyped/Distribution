package typings.officeUiFabricReact

import typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var Item: StatelessComponent[IStackItemProps]
}

object AnonItem {
  @scala.inline
  def apply(Item: StatelessComponent[IStackItemProps]): AnonItem = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItem]
  }
}

