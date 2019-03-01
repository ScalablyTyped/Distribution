package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotField.toJSON()". */
trait PivotFieldData extends js.Object {
  /**
    *
    * Id of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.Subtotals] = js.undefined
}

object PivotFieldData {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    items: js.Array[PivotItemData] = null,
    name: java.lang.String = null,
    showAllItems: js.UndefOr[scala.Boolean] = js.undefined,
    subtotals: officeDashJsDashPreviewLib.ExcelNs.Subtotals = null
  ): PivotFieldData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(showAllItems)) __obj.updateDynamic("showAllItems")(showAllItems)
    if (subtotals != null) __obj.updateDynamic("subtotals")(subtotals)
    __obj.asInstanceOf[PivotFieldData]
  }
}

