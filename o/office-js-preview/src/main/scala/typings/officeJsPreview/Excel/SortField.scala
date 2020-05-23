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
trait SortField extends js.Object {
  /**
    *
    * Specifies if the sorting is done in an ascending fashion.
    *
    * [Api set: ExcelApi 1.2]
    */
  var ascending: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the color that is the target of the condition if the sorting is on font or cell color.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents additional sorting options for this field.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dataOption: js.UndefOr[SortDataOption | Normal | TextAsNumber] = js.undefined
  /**
    *
    * Specifies the icon that is the target of the condition if the sorting is on the cell's icon.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.undefined
  /**
    *
    * Specifies the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
    *
    * [Api set: ExcelApi 1.2]
    */
  var key: Double
  /**
    *
    * Specifies the type of sorting of this condition.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sortOn: js.UndefOr[
    SortOn | Value | CellColor | FontColor | typings.officeJsPreview.officeJsPreviewStrings.Icon
  ] = js.undefined
  /**
    *
    * Specifies the subfield that is the target property name of a rich value to sort on.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.undefined
}

object SortField {
  @scala.inline
  def apply(
    key: Double,
    ascending: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dataOption: SortDataOption | Normal | TextAsNumber = null,
    icon: Icon = null,
    sortOn: SortOn | Value | CellColor | FontColor | typings.officeJsPreview.officeJsPreviewStrings.Icon = null,
    subField: String = null
  ): SortField = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataOption != null) __obj.updateDynamic("dataOption")(dataOption.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (sortOn != null) __obj.updateDynamic("sortOn")(sortOn.asInstanceOf[js.Any])
    if (subField != null) __obj.updateDynamic("subField")(subField.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
}

