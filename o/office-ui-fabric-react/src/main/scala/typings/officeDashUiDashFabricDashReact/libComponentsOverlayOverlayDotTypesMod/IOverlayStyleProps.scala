package typings.officeDashUiDashFabricDashReact.libComponentsOverlayOverlayDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Is overlay dark themed
    */
  var isDark: js.UndefOr[Boolean] = js.undefined
  /**
    * Is overlay visible
    */
  var isNone: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IOverlayStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    isDark: js.UndefOr[Boolean] = js.undefined,
    isNone: js.UndefOr[Boolean] = js.undefined
  ): IOverlayStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isDark)) __obj.updateDynamic("isDark")(isDark)
    if (!js.isUndefined(isNone)) __obj.updateDynamic("isNone")(isNone)
    __obj.asInstanceOf[IOverlayStyleProps]
  }
}

