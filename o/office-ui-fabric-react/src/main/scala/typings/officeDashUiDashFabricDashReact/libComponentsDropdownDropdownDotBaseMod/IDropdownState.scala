package typings.officeDashUiDashFabricDashReact.libComponentsDropdownDropdownDotBaseMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownState extends js.Object {
  var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.undefined
  /** Whether the root dropdown element has focus. */
  var hasFocus: Boolean
  var isOpen: Boolean
  var selectedIndices: js.Array[Double]
}

object IDropdownState {
  @scala.inline
  def apply(
    hasFocus: Boolean,
    isOpen: Boolean,
    selectedIndices: js.Array[Double],
    calloutRenderEdge: RectangleEdge = null
  ): IDropdownState = {
    val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedIndices = selectedIndices.asInstanceOf[js.Any])
    if (calloutRenderEdge != null) __obj.updateDynamic("calloutRenderEdge")(calloutRenderEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownState]
  }
}

