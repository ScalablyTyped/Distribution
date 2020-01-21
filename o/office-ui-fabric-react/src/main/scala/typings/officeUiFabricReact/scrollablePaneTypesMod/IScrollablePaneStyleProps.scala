package typings.officeUiFabricReact.scrollablePaneTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
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
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (scrollbarVisibility != null) __obj.updateDynamic("scrollbarVisibility")(scrollbarVisibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneStyleProps]
  }
}

