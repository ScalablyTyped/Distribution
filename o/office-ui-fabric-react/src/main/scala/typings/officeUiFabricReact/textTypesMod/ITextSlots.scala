package typings.officeUiFabricReact.textTypesMod

import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSlots extends js.Object {
  var root: js.UndefOr[IHTMLSlot] = js.undefined
}

object ITextSlots {
  @scala.inline
  def apply(root: IHTMLSlot = null): ITextSlots = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextSlots]
  }
}

