package typings.officeDashUiDashFabricDashReact

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Theme extends js.Object {
  var theme: js.UndefOr[ITheme] = js.undefined
}

object Anon_Theme {
  @scala.inline
  def apply(theme: ITheme = null): Anon_Theme = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Theme]
  }
}

