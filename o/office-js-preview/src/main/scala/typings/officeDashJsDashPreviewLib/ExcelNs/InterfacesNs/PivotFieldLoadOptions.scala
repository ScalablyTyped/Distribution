package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel PivotField.
  *
  * [Api set: ExcelApi 1.8]
  */
trait PivotFieldLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Id of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
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
  var subtotals: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotFieldLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    showAllItems: js.UndefOr[scala.Boolean] = js.undefined,
    subtotals: js.UndefOr[scala.Boolean] = js.undefined
  ): PivotFieldLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(showAllItems)) __obj.updateDynamic("showAllItems")(showAllItems)
    if (!js.isUndefined(subtotals)) __obj.updateDynamic("subtotals")(subtotals)
    __obj.asInstanceOf[PivotFieldLoadOptions]
  }
}

