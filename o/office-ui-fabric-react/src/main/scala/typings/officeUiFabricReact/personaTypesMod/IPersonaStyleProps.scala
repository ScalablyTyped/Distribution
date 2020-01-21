package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaStyleProps extends js.Object {
  /**
    * Custom class name.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @defaultvalue PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  var showSecondaryText: js.UndefOr[Boolean] = js.undefined
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

object IPersonaStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    coinSize: Int | Double = null,
    presence: PersonaPresence = null,
    showSecondaryText: js.UndefOr[Boolean] = js.undefined,
    size: PersonaSize = null
  ): IPersonaStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (coinSize != null) __obj.updateDynamic("coinSize")(coinSize.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecondaryText)) __obj.updateDynamic("showSecondaryText")(showSecondaryText.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaStyleProps]
  }
}

