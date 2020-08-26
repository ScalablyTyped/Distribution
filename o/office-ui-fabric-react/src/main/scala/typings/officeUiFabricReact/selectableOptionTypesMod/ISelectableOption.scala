package typings.officeUiFabricReact.selectableOptionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectableOption extends js.Object {
  /**
    * The aria label for the dropdown option. If not present, the `text` will be used.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Data available to custom onRender functions.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Whether the option is disabled
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the option is hidden or not.
    * @defaultvalue false
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * ID attribute associated with this option
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Text to render for this option
    */
  var itemType: js.UndefOr[SelectableOptionMenuItemType] = js.native
  /**
    * Arbitrary string associated with this option.
    */
  var key: String | Double = js.native
  /** If option is selected. */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Text to render for this option
    */
  var text: String = js.native
  /**
    * Title attribute (built in tooltip) for a given option.
    */
  var title: js.UndefOr[String] = js.native
}

object ISelectableOption {
  @scala.inline
  def apply(key: String | Double, text: String): ISelectableOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectableOption]
  }
  @scala.inline
  implicit class ISelectableOptionOps[Self <: ISelectableOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setItemType(value: SelectableOptionMenuItemType): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

