package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsCheckboxProps extends js.Object {
  var checked: Boolean
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDetailsCheckboxProps {
  @scala.inline
  def apply(checked: Boolean, theme: ITheme = null): IDetailsCheckboxProps = {
    val __obj = js.Dynamic.literal(checked = checked)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IDetailsCheckboxProps]
  }
}

