package typings.officeUiFabricReact.detailsRowCheckTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
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
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsCheckboxProps]
  }
}

