package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipHostStyleProps extends js.Object {
  /**
    * Accept optional classNames for the host wrapper
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object ITooltipHostStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): ITooltipHostStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ITooltipHostStyleProps]
  }
}

