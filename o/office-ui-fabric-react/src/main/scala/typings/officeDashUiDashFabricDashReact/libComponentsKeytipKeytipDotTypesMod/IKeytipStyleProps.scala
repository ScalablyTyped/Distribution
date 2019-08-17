package typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipStyleProps extends js.Object {
  /**
    * Whether the keytip is disabled or not.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The theme for the keytip.
    */
  var theme: ITheme
  /**
    * T/F if the keytip is visible
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IKeytipStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    disabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IKeytipStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IKeytipStyleProps]
  }
}

