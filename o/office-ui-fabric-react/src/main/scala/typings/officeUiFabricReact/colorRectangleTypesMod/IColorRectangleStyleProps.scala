package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorRectangleStyleProps extends js.Object {
  /**
    * Additional CSS class(es) to apply to the ColorRectangle.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Minimum width and height.
    */
  var minSize: js.UndefOr[Double] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: ITheme = js.native
}

object IColorRectangleStyleProps {
  @scala.inline
  def apply(theme: ITheme): IColorRectangleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorRectangleStyleProps]
  }
  @scala.inline
  implicit class IColorRectangleStylePropsOps[Self <: IColorRectangleStyleProps] (val x: Self) extends AnyVal {
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
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
  
}

