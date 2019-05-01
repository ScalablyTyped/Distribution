package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "autoFilter.toJSON()". */
trait AutoFilterData extends js.Object {
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var criteria: js.UndefOr[js.Array[officeDashJsDashPreviewLib.ExcelNs.FilterCriteria]] = js.undefined
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

object AutoFilterData {
  @scala.inline
  def apply(
    criteria: js.Array[officeDashJsDashPreviewLib.ExcelNs.FilterCriteria] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    isDataFiltered: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoFilterData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(isDataFiltered)) __obj.updateDynamic("isDataFiltered")(isDataFiltered)
    __obj.asInstanceOf[AutoFilterData]
  }
}

