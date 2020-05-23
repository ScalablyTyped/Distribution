package typings.officeUiFabricReact.facepileTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFacepileStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Pixel value for spacing around button. Number value set in pixels
    */
  var spacingAroundItemButton: js.UndefOr[Double] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}

object IFacepileStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    spacingAroundItemButton: js.UndefOr[Double] = js.undefined
  ): IFacepileStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingAroundItemButton)) __obj.updateDynamic("spacingAroundItemButton")(spacingAroundItemButton.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileStyleProps]
  }
}

