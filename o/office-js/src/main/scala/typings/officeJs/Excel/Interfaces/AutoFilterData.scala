package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.FilterCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `autoFilter.toJSON()`. */
trait AutoFilterData extends js.Object {
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var criteria: js.UndefOr[js.Array[FilterCriteria]] = js.undefined
  /**
    *
    * Specifies if the AutoFilter is enabled.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the AutoFilter has filter criteria.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDataFiltered: js.UndefOr[Boolean] = js.undefined
}

object AutoFilterData {
  @scala.inline
  def apply(
    criteria: js.Array[FilterCriteria] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    isDataFiltered: js.UndefOr[Boolean] = js.undefined
  ): AutoFilterData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataFiltered)) __obj.updateDynamic("isDataFiltered")(isDataFiltered.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFilterData]
  }
}

