package typings.officeUiFabricReact.dropdownTypesMod

import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType
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
    id: String = null,
    index: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    itemType: SelectableOptionMenuItemType = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): IDropdownOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownOption]
  }
}

