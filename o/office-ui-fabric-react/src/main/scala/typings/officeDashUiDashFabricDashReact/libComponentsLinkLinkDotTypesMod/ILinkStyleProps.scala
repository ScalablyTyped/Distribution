package typings.officeDashUiDashFabricDashReact.libComponentsLinkLinkDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var isButton: js.UndefOr[Boolean] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object ILinkStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    isButton: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined
  ): ILinkStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isButton)) __obj.updateDynamic("isButton")(isButton.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkStyleProps]
  }
}

