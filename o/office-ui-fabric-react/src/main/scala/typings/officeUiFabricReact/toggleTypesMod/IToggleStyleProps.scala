package typings.officeUiFabricReact.toggleTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggleStyleProps extends js.Object {
  /**
    * Component is checked.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Root element class name.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Component is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether label should be positioned inline with the toggle.
    */
  var inlineLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the user did not specify a on/off text. Influencing only when inlineLabel is used.
    */
  var onOffMissing: js.UndefOr[Boolean] = js.undefined
  /**
    * Theme values.
    */
  var theme: ITheme
}

object IToggleStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inlineLabel: js.UndefOr[Boolean] = js.undefined,
    onOffMissing: js.UndefOr[Boolean] = js.undefined
  ): IToggleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineLabel)) __obj.updateDynamic("inlineLabel")(inlineLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(onOffMissing)) __obj.updateDynamic("onOffMissing")(onOffMissing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToggleStyleProps]
  }
}

