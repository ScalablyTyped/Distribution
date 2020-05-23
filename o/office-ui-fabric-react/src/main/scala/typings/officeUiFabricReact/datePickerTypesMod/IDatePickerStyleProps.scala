package typings.officeUiFabricReact.datePickerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isDatePickerShown: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[Boolean] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: ITheme
}

object IDatePickerStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isDatePickerShown: js.UndefOr[Boolean] = js.undefined,
    label: js.UndefOr[Boolean] = js.undefined
  ): IDatePickerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDatePickerShown)) __obj.updateDynamic("isDatePickerShown")(isDatePickerShown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerStyleProps]
  }
}

