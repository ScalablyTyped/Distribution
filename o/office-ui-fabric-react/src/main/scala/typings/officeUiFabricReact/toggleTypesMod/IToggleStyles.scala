package typings.officeUiFabricReact.toggleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToggleStyles extends js.Object {
  /**
    * Container for the toggle pill and the text next to it.
    */
  var container: IStyle = js.native
  /**
    * Label element above the toggle.
    */
  var label: IStyle = js.native
  /**
    * Pill, rendered as a button.
    */
  var pill: IStyle = js.native
  /** Root element. */
  var root: IStyle = js.native
  /**
    * Text next to the pill.
    */
  var text: IStyle = js.native
  /**
    * Thumb inside of the pill.
    */
  var thumb: IStyle = js.native
}

object IToggleStyles {
  @scala.inline
  def apply(): IToggleStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToggleStyles]
  }
  @scala.inline
  implicit class IToggleStylesOps[Self <: IToggleStyles] (val x: Self) extends AnyVal {
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
    def setContainer(value: IStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setPill(value: IStyle): Self = this.set("pill", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePill: Self = this.set("pill", js.undefined)
    @scala.inline
    def setPillNull: Self = this.set("pill", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setText(value: IStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    @scala.inline
    def setThumb(value: IStyle): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    @scala.inline
    def setThumbNull: Self = this.set("thumb", null)
  }
  
}

