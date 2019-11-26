package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.Subtotals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotField.toJSON()`. */
trait PivotFieldData extends js.Object {
  /**
    *
    * Id of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the PivotFields associated with the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var items: js.UndefOr[js.Array[PivotItemData]] = js.undefined
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[Subtotals] = js.undefined
}

object PivotFieldData {
  @scala.inline
  def apply(
    id: String = null,
    items: js.Array[PivotItemData] = null,
    name: String = null,
    showAllItems: js.UndefOr[Boolean] = js.undefined,
    subtotals: Subtotals = null
  ): PivotFieldData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllItems)) __obj.updateDynamic("showAllItems")(showAllItems.asInstanceOf[js.Any])
    if (subtotals != null) __obj.updateDynamic("subtotals")(subtotals.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFieldData]
  }
}

