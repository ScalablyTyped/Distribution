package typings.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxStyleProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var isUsingCustomLabelRender: Boolean
  var reversed: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object ICheckboxStyleProps {
  @scala.inline
  def apply(
    isUsingCustomLabelRender: Boolean,
    theme: ITheme,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): ICheckboxStyleProps = {
    val __obj = js.Dynamic.literal(isUsingCustomLabelRender = isUsingCustomLabelRender, theme = theme)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    __obj.asInstanceOf[ICheckboxStyleProps]
  }
}

