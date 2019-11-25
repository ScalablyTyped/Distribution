package typings.officeDashUiDashFabricDashReact.libComponentsMarqueeSelectionMarqueeSelectionDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarqueeSelectionStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object IMarqueeSelectionStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IMarqueeSelectionStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarqueeSelectionStyleProps]
  }
}

