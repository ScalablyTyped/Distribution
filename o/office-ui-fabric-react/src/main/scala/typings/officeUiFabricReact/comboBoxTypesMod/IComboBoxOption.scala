package typings.officeUiFabricReact.comboBoxTypesMod

import typings.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxOption extends ISelectableOption {
  /**
    * Specific styles for each comboBox option. If you intend to give
    * common styles to all comboBox option please use
    * the prop comboBoxOptionStyles
    */
  var styles: js.UndefOr[PartialIComboBoxOptionSty] = js.undefined
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
    id: String = null,
    index: js.UndefOr[Double] = js.undefined,
    itemType: SelectableOptionMenuItemType = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    styles: PartialIComboBoxOptionSty = null,
    title: String = null,
    useAriaLabelAsText: js.UndefOr[Boolean] = js.undefined
  ): IComboBoxOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(useAriaLabelAsText)) __obj.updateDynamic("useAriaLabelAsText")(useAriaLabelAsText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxOption]
  }
}

