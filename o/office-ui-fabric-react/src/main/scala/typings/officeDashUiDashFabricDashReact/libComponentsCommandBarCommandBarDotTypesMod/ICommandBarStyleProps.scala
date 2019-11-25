package typings.officeDashUiDashFabricDashReact.libComponentsCommandBarCommandBarDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object ICommandBarStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): ICommandBarStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarStyleProps]
  }
}

