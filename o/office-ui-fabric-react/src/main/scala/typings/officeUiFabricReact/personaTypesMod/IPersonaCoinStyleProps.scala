package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
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
    coinSize: js.UndefOr[Double] = js.undefined,
    showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined,
    size: PersonaSize = null
  ): IPersonaCoinStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(coinSize)) __obj.updateDynamic("coinSize")(coinSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnknownPersonaCoin)) __obj.updateDynamic("showUnknownPersonaCoin")(showUnknownPersonaCoin.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaCoinStyleProps]
  }
}

