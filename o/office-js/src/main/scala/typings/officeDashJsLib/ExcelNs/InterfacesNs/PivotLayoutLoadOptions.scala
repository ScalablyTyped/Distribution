package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the visual layout of the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
trait PivotLayoutLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotLayoutLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    layoutType: js.UndefOr[scala.Boolean] = js.undefined,
    showColumnGrandTotals: js.UndefOr[scala.Boolean] = js.undefined,
    showRowGrandTotals: js.UndefOr[scala.Boolean] = js.undefined,
    subtotalLocation: js.UndefOr[scala.Boolean] = js.undefined
  ): PivotLayoutLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(layoutType)) __obj.updateDynamic("layoutType")(layoutType)
    if (!js.isUndefined(showColumnGrandTotals)) __obj.updateDynamic("showColumnGrandTotals")(showColumnGrandTotals)
    if (!js.isUndefined(showRowGrandTotals)) __obj.updateDynamic("showRowGrandTotals")(showRowGrandTotals)
    if (!js.isUndefined(subtotalLocation)) __obj.updateDynamic("subtotalLocation")(subtotalLocation)
    __obj.asInstanceOf[PivotLayoutLoadOptions]
  }
}

