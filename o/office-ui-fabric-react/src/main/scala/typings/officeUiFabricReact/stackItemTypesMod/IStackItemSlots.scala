package typings.officeUiFabricReact.stackItemTypesMod

import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackItemSlots extends js.Object {
  var root: js.UndefOr[IHTMLSlot] = js.undefined
}

object IStackItemSlots {
  @scala.inline
  def apply(root: IHTMLSlot = null): IStackItemSlots = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackItemSlots]
  }
}

