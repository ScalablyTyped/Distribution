package typings.officeUiFabricReact.selectableOptionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectableOption extends js.Object {
  /**
    * The aria label for the dropdown option. If not present, the `text` will be used.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Data available to custom onRender functions.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the option is disabled
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the option is hidden or not.
    * @defaultvalue false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * ID attribute associated with this option
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Text to render for this option
    */
  var itemType: js.UndefOr[SelectableOptionMenuItemType] = js.undefined
  /**
    * Arbitrary string associated with this option.
    */
  var key: String | Double
  /** If option is selected. */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * Text to render for this option
    */
  var text: String
  /**
    * Title attribute (built in tooltip) for a given option.
    */
  var title: js.UndefOr[String] = js.undefined
}

object ISelectableOption {
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
    title: String = null
  ): ISelectableOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectableOption]
  }
}

