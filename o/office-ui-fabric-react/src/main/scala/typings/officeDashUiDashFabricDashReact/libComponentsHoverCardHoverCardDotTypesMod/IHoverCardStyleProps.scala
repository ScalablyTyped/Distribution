package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardHoverCardDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHoverCardStyleProps extends js.Object {
  /**
    * Optional className(s) for the host div of HoverCard.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}

object IHoverCardStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IHoverCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoverCardStyleProps]
  }
}

