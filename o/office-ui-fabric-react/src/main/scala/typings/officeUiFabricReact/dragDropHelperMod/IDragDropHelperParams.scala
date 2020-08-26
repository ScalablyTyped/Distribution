package typings.officeUiFabricReact.dragDropHelperMod

import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropHelperParams extends js.Object {
  var minimumPixelsForDrag: js.UndefOr[Double] = js.native
  var selection: ISelection[IObjectWithKey] = js.native
}

object IDragDropHelperParams {
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey]): IDragDropHelperParams = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropHelperParams]
  }
  @scala.inline
  implicit class IDragDropHelperParamsOps[Self <: IDragDropHelperParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumPixelsForDrag(value: Double): Self = this.set("minimumPixelsForDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumPixelsForDrag: Self = this.set("minimumPixelsForDrag", js.undefined)
  }
  
}

