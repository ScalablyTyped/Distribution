package typings.officeUiFabricReact.marqueeSelectionTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarqueeSelectionStyles extends js.Object {
  var box: js.UndefOr[IStyle] = js.native
  var boxFill: js.UndefOr[IStyle] = js.native
  var dragMask: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
}

object IMarqueeSelectionStyles {
  @scala.inline
  def apply(): IMarqueeSelectionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarqueeSelectionStyles]
  }
  @scala.inline
  implicit class IMarqueeSelectionStylesOps[Self <: IMarqueeSelectionStyles] (val x: Self) extends AnyVal {
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
    def setBox(value: IStyle): Self = this.set("box", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    @scala.inline
    def setBoxNull: Self = this.set("box", null)
    @scala.inline
    def setBoxFill(value: IStyle): Self = this.set("boxFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxFill: Self = this.set("boxFill", js.undefined)
    @scala.inline
    def setBoxFillNull: Self = this.set("boxFill", null)
    @scala.inline
    def setDragMask(value: IStyle): Self = this.set("dragMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragMask: Self = this.set("dragMask", js.undefined)
    @scala.inline
    def setDragMaskNull: Self = this.set("dragMask", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

