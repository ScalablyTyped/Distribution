package typings.officeDashUiDashFabricDashReact.libComponentsStackStackDotTypesMod

import typings.atUifabricFoundation.libIHTMLSlotsMod.IHTMLSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackSlots extends js.Object {
  /**
    * Defines a slot that is placed inside the root slot in order to achieve wrapping. Only used when the wrap
    * property is set to true.
    */
  var inner: js.UndefOr[IHTMLSlot] = js.undefined
  /**
    * Defines root slot of the component.
    */
  var root: js.UndefOr[IHTMLSlot] = js.undefined
}

object IStackSlots {
  @scala.inline
  def apply(inner: IHTMLSlot = null, root: IHTMLSlot = null): IStackSlots = {
    val __obj = js.Dynamic.literal()
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackSlots]
  }
}

