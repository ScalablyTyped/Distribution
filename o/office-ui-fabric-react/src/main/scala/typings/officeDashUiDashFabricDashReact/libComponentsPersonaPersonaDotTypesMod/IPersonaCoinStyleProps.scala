package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaCoinStyleProps extends js.Object {
  /**
    * Custom class name.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  /**
    * Decides whether to display coin for unknown persona
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}

object IPersonaCoinStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    coinSize: Int | Double = null,
    showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined,
    size: PersonaSize = null
  ): IPersonaCoinStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (coinSize != null) __obj.updateDynamic("coinSize")(coinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnknownPersonaCoin)) __obj.updateDynamic("showUnknownPersonaCoin")(showUnknownPersonaCoin)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IPersonaCoinStyleProps]
  }
}

