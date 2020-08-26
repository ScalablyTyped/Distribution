package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.CellColor
import typings.officeJsPreview.officeJsPreviewStrings.FontColor
import typings.officeJsPreview.officeJsPreviewStrings.Normal
import typings.officeJsPreview.officeJsPreviewStrings.TextAsNumber
import typings.officeJsPreview.officeJsPreviewStrings.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a condition in a sorting operation.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait SortField extends js.Object {
  /**
    *
    * Specifies if the sorting is done in an ascending fashion.
    *
    * [Api set: ExcelApi 1.2]
    */
  var ascending: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the color that is the target of the condition if the sorting is on font or cell color.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents additional sorting options for this field.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dataOption: js.UndefOr[SortDataOption | Normal | TextAsNumber] = js.native
  /**
    *
    * Specifies the icon that is the target of the condition if the sorting is on the cell's icon.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.native
  /**
    *
    * Specifies the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
    *
    * [Api set: ExcelApi 1.2]
    */
  var key: Double = js.native
  /**
    *
    * Specifies the type of sorting of this condition.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sortOn: js.UndefOr[
    SortOn | Value | CellColor | FontColor | typings.officeJsPreview.officeJsPreviewStrings.Icon
  ] = js.native
  /**
    *
    * Specifies the subfield that is the target property name of a rich value to sort on.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.native
}

object SortField {
  @scala.inline
  def apply(key: Double): SortField = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  @scala.inline
  implicit class SortFieldOps[Self <: SortField] (val x: Self) extends AnyVal {
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
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDataOption(value: SortDataOption | Normal | TextAsNumber): Self = this.set("dataOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataOption: Self = this.set("dataOption", js.undefined)
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setSortOn(
      value: SortOn | Value | CellColor | FontColor | typings.officeJsPreview.officeJsPreviewStrings.Icon
    ): Self = this.set("sortOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOn: Self = this.set("sortOn", js.undefined)
    @scala.inline
    def setSubField(value: String): Self = this.set("subField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubField: Self = this.set("subField", js.undefined)
  }
  
}

