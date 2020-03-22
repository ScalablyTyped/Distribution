package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An interface representing all PivotFilters currently applied to a given PivotField.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait PivotFilters extends js.Object {
  /**
    *
    * The PivotField's currently applied date filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateFilter: js.UndefOr[PivotDateFilter] = js.undefined
  /**
    *
    * The PivotField's currently applied label filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var labelFilter: js.UndefOr[PivotLabelFilter] = js.undefined
  /**
    *
    * The PivotField's currently applied manual filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var manualFilter: js.UndefOr[PivotManualFilter] = js.undefined
  /**
    *
    * The PivotField's currently applied value filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var valueFilter: js.UndefOr[PivotValueFilter] = js.undefined
}

object PivotFilters {
  @scala.inline
  def apply(
    dateFilter: PivotDateFilter = null,
    labelFilter: PivotLabelFilter = null,
    manualFilter: PivotManualFilter = null,
    valueFilter: PivotValueFilter = null
  ): PivotFilters = {
    val __obj = js.Dynamic.literal()
    if (dateFilter != null) __obj.updateDynamic("dateFilter")(dateFilter.asInstanceOf[js.Any])
    if (labelFilter != null) __obj.updateDynamic("labelFilter")(labelFilter.asInstanceOf[js.Any])
    if (manualFilter != null) __obj.updateDynamic("manualFilter")(manualFilter.asInstanceOf[js.Any])
    if (valueFilter != null) __obj.updateDynamic("valueFilter")(valueFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFilters]
  }
}

