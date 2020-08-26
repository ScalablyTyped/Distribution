package typings.officeUiFabricReact.spinnerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinnerStyleProps extends js.Object {
  /** CSS class name for the component attached to the root stylable area. */
  var className: js.UndefOr[String] = js.native
  /** Position of the label in regards to the spinner animation. */
  var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.native
  /** Size of the spinner animation. */
  var size: js.UndefOr[SpinnerSize] = js.native
  /** Theme provided by High-Order Component. */
  var theme: ITheme = js.native
}

object ISpinnerStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISpinnerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinnerStyleProps]
  }
  @scala.inline
  implicit class ISpinnerStylePropsOps[Self <: ISpinnerStyleProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setLabelPosition(value: SpinnerLabelPosition): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setSize(value: SpinnerSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

