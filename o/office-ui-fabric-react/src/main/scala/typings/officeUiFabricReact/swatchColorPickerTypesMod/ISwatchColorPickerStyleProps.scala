package typings.officeUiFabricReact.swatchColorPickerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwatchColorPickerStyleProps extends js.Object {
  /**
    * The distance between cells
    */
  var cellMargin: js.UndefOr[Double] = js.native
  /**
    * Custom className to apply to the container.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Theme to apply to the container
    */
  var theme: ITheme = js.native
}

object ISwatchColorPickerStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISwatchColorPickerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerStyleProps]
  }
  @scala.inline
  implicit class ISwatchColorPickerStylePropsOps[Self <: ISwatchColorPickerStyleProps] (val x: Self) extends AnyVal {
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
    def setCellMargin(value: Double): Self = this.set("cellMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellMargin: Self = this.set("cellMargin", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

