package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorRectangleStyleProps extends js.Object {
  /**
    * Additional CSS class(es) to apply to the ColorRectangle.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Minimum width and height.
    */
  var minSize: js.UndefOr[Double] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: ITheme
}

object IColorRectangleStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, minSize: Int | Double = null): IColorRectangleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorRectangleStyleProps]
  }
}

