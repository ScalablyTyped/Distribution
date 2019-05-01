package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the AutoFilter object.
  AutoFilter turns the values in Excel column into specific filters based on the cell contents.
  *
  * [Api set: ExcelApi 1.9]
  */
trait AutoFilterLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var criteria: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the AutoFilter is enabled or not. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the AutoFilter has filter criteria. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDataFiltered: js.UndefOr[scala.Boolean] = js.undefined
}

object AutoFilterLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    criteria: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    isDataFiltered: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoFilterLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(criteria)) __obj.updateDynamic("criteria")(criteria)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(isDataFiltered)) __obj.updateDynamic("isDataFiltered")(isDataFiltered)
    __obj.asInstanceOf[AutoFilterLoadOptions]
  }
}

