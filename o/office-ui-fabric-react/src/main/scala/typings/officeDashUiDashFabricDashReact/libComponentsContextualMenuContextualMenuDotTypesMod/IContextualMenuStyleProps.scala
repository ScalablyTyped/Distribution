package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object IContextualMenuStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IContextualMenuStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IContextualMenuStyleProps]
  }
}

