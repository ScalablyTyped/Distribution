package typings.officeDashUiDashFabricDashReact.libComponentsResizeGroupResizeGroupDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeGroupStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IResizeGroupStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IResizeGroupStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeGroupStyleProps]
  }
}

