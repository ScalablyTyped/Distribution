package typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingStyleProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IRatingStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    disabled: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): IRatingStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[IRatingStyleProps]
  }
}

