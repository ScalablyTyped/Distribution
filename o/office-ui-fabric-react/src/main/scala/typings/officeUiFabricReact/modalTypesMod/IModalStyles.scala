package typings.officeUiFabricReact.modalTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalStyles extends js.Object {
  var keyboardMoveIcon: IStyle = js.native
  var keyboardMoveIconContainer: IStyle = js.native
  var layer: IStyle = js.native
  var main: IStyle = js.native
  var root: IStyle = js.native
  var scrollableContent: IStyle = js.native
}

object IModalStyles {
  @scala.inline
  def apply(): IModalStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModalStyles]
  }
  @scala.inline
  implicit class IModalStylesOps[Self <: IModalStyles] (val x: Self) extends AnyVal {
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
    def setKeyboardMoveIcon(value: IStyle): Self = this.set("keyboardMoveIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardMoveIcon: Self = this.set("keyboardMoveIcon", js.undefined)
    @scala.inline
    def setKeyboardMoveIconNull: Self = this.set("keyboardMoveIcon", null)
    @scala.inline
    def setKeyboardMoveIconContainer(value: IStyle): Self = this.set("keyboardMoveIconContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardMoveIconContainer: Self = this.set("keyboardMoveIconContainer", js.undefined)
    @scala.inline
    def setKeyboardMoveIconContainerNull: Self = this.set("keyboardMoveIconContainer", null)
    @scala.inline
    def setLayer(value: IStyle): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setLayerNull: Self = this.set("layer", null)
    @scala.inline
    def setMain(value: IStyle): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setMainNull: Self = this.set("main", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setScrollableContent(value: IStyle): Self = this.set("scrollableContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollableContent: Self = this.set("scrollableContent", js.undefined)
    @scala.inline
    def setScrollableContentNull: Self = this.set("scrollableContent", null)
  }
  
}

