package typings.officeUiFabricReact.spinnerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinnerStyles extends js.Object {
  /** Styles for the spinner circle animation. */
  var circle: js.UndefOr[IStyle] = js.native
  /** Styles for the label accompanying the circle. */
  var label: js.UndefOr[IStyle] = js.native
  /** Styles for the root element. Refers to the wrapper containing both the circle and the label. */
  var root: js.UndefOr[IStyle] = js.native
  /** Styles for the hidden helper element to aid with screen readers. */
  var screenReaderText: js.UndefOr[IStyle] = js.native
}

object ISpinnerStyles {
  @scala.inline
  def apply(): ISpinnerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinnerStyles]
  }
  @scala.inline
  implicit class ISpinnerStylesOps[Self <: ISpinnerStyles] (val x: Self) extends AnyVal {
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
    def setCircle(value: IStyle): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setCircleNull: Self = this.set("circle", null)
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setScreenReaderText(value: IStyle): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderText: Self = this.set("screenReaderText", js.undefined)
    @scala.inline
    def setScreenReaderTextNull: Self = this.set("screenReaderText", null)
  }
  
}

