package typings.officeUiFabricReact.anon

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var theme: js.UndefOr[ITheme] = js.undefined
}

object Theme {
  @scala.inline
  def apply(theme: ITheme = null): Theme = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

