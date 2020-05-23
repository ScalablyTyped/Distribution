package typings.officeUiFabricReact.checkboxTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
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
    val __obj = js.Dynamic.literal(isUsingCustomLabelRender = isUsingCustomLabelRender.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxStyleProps]
  }
}

