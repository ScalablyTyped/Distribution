package typings.officeUiFabricReact

import typings.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typings.uifabricFoundation.libIslotsMod.ExtractProps
import typings.uifabricFoundation.libIslotsMod.ISlotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in keyof office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackSlots[key]>>} */
trait keyinkeyofIStackSlotsISlo extends js.Object {
  var inner: js.UndefOr[ISlotOptions[ExtractProps[js.UndefOr[IHTMLSlot]]]] = js.undefined
  var root: js.UndefOr[ISlotOptions[ExtractProps[js.UndefOr[IHTMLSlot]]]] = js.undefined
}

object keyinkeyofIStackSlotsISlo {
  @scala.inline
  def apply(
    inner: ISlotOptions[ExtractProps[js.UndefOr[IHTMLSlot]]] = null,
    root: ISlotOptions[ExtractProps[js.UndefOr[IHTMLSlot]]] = null
  ): keyinkeyofIStackSlotsISlo = {
    val __obj = js.Dynamic.literal()
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinkeyofIStackSlotsISlo]
  }
}

