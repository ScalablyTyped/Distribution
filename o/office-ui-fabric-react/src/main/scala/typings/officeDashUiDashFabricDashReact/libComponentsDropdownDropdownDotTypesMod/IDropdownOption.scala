package typings.officeDashUiDashFabricDashReact.libComponentsDropdownDropdownDotTypesMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.ISelectableOption
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownOption extends ISelectableOption {
  /**
    * Deprecated at v.65.1, use `selected` instead.
    * @deprecated Use `selected` instead.
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object IDropdownOption {
  @scala.inline
  def apply(
    key: String | Double,
    text: String,
    ariaLabel: String = null,
    data: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    itemType: SelectableOptionMenuItemType = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): IDropdownOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IDropdownOption]
  }
}

