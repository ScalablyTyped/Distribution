package typings.officeUiFabricReact

import typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var Item: FunctionComponent[IStackItemProps]
}

object AnonItem {
  @scala.inline
  def apply(Item: FunctionComponent[IStackItemProps]): AnonItem = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItem]
  }
}

