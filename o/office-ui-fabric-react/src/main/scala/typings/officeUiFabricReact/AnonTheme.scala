package typings.officeUiFabricReact

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTheme extends js.Object {
  var theme: js.UndefOr[ITheme] = js.undefined
}

object AnonTheme {
  @scala.inline
  def apply(theme: ITheme = null): AnonTheme = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTheme]
  }
}

