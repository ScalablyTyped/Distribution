package typings.officeDashUiDashFabricDashReact.libUtilitiesDragdropDragDropHelperMod

import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropHelperParams extends js.Object {
  var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
  var selection: ISelection
}

object IDragDropHelperParams {
  @scala.inline
  def apply(selection: ISelection, minimumPixelsForDrag: Int | Double = null): IDragDropHelperParams = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropHelperParams]
  }
}

