package typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
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
  def apply(theme: ITheme, className: String = null, spacingAroundItemButton: Int | Double = null): IFacepileStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (spacingAroundItemButton != null) __obj.updateDynamic("spacingAroundItemButton")(spacingAroundItemButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileStyleProps]
  }
}

