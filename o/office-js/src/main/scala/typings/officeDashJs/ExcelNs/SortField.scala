package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.CellColor
import typings.officeDashJs.officeDashJsStrings.FontColor
import typings.officeDashJs.officeDashJsStrings.Normal
import typings.officeDashJs.officeDashJsStrings.TextAsNumber
import typings.officeDashJs.officeDashJsStrings.Value
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
    * Represents whether the sorting is done in an ascending fashion.
    *
    * [Api set: ExcelApi 1.2]
    */
  var ascending: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the color that is the target of the condition if the sorting is on font or cell color.
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
    * Represents the icon that is the target of the condition if the sorting is on the cell's icon.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.undefined
  /**
    *
    * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset from the first column (or row).
    *
    * [Api set: ExcelApi 1.2]
    */
  var key: Double
  /**
    *
    * Represents the type of sorting of this condition.
    *
    * [Api set: ExcelApi 1.2]
    */
  var sortOn: js.UndefOr[
    SortOn | Value | CellColor | FontColor | typings.officeDashJs.officeDashJsStrings.Icon
  ] = js.undefined
  /**
    *
    * Represents the subfield that is the target property name of a rich value to sort on.
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
    sortOn: SortOn | Value | CellColor | FontColor | typings.officeDashJs.officeDashJsStrings.Icon = null,
    subField: String = null
  ): SortField = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dataOption != null) __obj.updateDynamic("dataOption")(dataOption.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (sortOn != null) __obj.updateDynamic("sortOn")(sortOn.asInstanceOf[js.Any])
    if (subField != null) __obj.updateDynamic("subField")(subField)
    __obj.asInstanceOf[SortField]
  }
}

