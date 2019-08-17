package typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.ISelectableOption
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxOption extends ISelectableOption {
  /**
    * Specific styles for each comboBox option. If you intend to give
    * common styles to all comboBox option please use
    * the prop comboBoxOptionStyles
    */
  var styles: js.UndefOr[Partial[IComboBoxOptionStyles]] = js.undefined
  /**
    * In scenarios where embedded data is used at the text prop, we will use the ariaLabel prop
    * to set the aria-label and preview text. Default to false
    * @defaultvalue false;
    */
  var useAriaLabelAsText: js.UndefOr[Boolean] = js.undefined
}

object IComboBoxOption {
  @scala.inline
  def apply(
    key: String | Double,
    text: String,
    ariaLabel: String = null,
    data: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    itemType: SelectableOptionMenuItemType = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    styles: Partial[IComboBoxOptionStyles] = null,
    title: String = null,
    useAriaLabelAsText: js.UndefOr[Boolean] = js.undefined
  ): IComboBoxOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useAriaLabelAsText)) __obj.updateDynamic("useAriaLabelAsText")(useAriaLabelAsText)
    __obj.asInstanceOf[IComboBoxOption]
  }
}

