package typings.officeUiFabricReact.dragDropHelperMod

import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropHelperParams extends js.Object {
  var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
  var selection: ISelection[IObjectWithKey]
}

object IDragDropHelperParams {
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey], minimumPixelsForDrag: js.UndefOr[Double] = js.undefined): IDragDropHelperParams = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumPixelsForDrag)) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropHelperParams]
  }
}

