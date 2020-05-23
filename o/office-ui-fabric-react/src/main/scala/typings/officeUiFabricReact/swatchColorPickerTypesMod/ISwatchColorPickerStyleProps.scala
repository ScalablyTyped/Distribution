package typings.officeUiFabricReact.swatchColorPickerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwatchColorPickerStyleProps extends js.Object {
  /**
    * The distance between cells
    */
  var cellMargin: js.UndefOr[Double] = js.undefined
  /**
    * Custom className to apply to the container.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Theme to apply to the container
    */
  var theme: ITheme
}

object ISwatchColorPickerStyleProps {
  @scala.inline
  def apply(theme: ITheme, cellMargin: js.UndefOr[Double] = js.undefined, className: String = null): ISwatchColorPickerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(cellMargin)) __obj.updateDynamic("cellMargin")(cellMargin.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerStyleProps]
  }
}

