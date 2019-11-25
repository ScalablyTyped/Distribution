package typings.officeDashUiDashFabricDashReact.libComponentsLabelLabelDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    *
    */
  var theme: ITheme
}

object ILabelStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined
  ): ILabelStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabelStyleProps]
  }
}

