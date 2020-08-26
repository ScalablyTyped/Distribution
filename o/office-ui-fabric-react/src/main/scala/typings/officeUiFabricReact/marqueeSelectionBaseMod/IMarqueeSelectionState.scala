package typings.officeUiFabricReact.marqueeSelectionBaseMod

import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarqueeSelectionState extends js.Object {
  var dragOrigin: js.UndefOr[Point] = js.native
  var dragRect: js.UndefOr[IRectangle] = js.native
}

object IMarqueeSelectionState {
  @scala.inline
  def apply(): IMarqueeSelectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarqueeSelectionState]
  }
  @scala.inline
  implicit class IMarqueeSelectionStateOps[Self <: IMarqueeSelectionState] (val x: Self) extends AnyVal {
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
    def setDragOrigin(value: Point): Self = this.set("dragOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragOrigin: Self = this.set("dragOrigin", js.undefined)
    @scala.inline
    def setDragRect(value: IRectangle): Self = this.set("dragRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragRect: Self = this.set("dragRect", js.undefined)
  }
  
}

