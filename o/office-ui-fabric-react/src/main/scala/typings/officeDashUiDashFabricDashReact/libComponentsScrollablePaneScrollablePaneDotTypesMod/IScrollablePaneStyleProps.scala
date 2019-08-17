package typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePaneStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  var scrollbarVisibility: js.UndefOr[ScrollbarVisibility] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IScrollablePaneStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, scrollbarVisibility: ScrollbarVisibility = null): IScrollablePaneStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (scrollbarVisibility != null) __obj.updateDynamic("scrollbarVisibility")(scrollbarVisibility)
    __obj.asInstanceOf[IScrollablePaneStyleProps]
  }
}

