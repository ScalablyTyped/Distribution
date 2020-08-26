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
@js.native
trait PivotFilters extends js.Object {
  /**
    *
    * The PivotField's currently applied date filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateFilter: js.UndefOr[PivotDateFilter] = js.native
  /**
    *
    * The PivotField's currently applied label filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var labelFilter: js.UndefOr[PivotLabelFilter] = js.native
  /**
    *
    * The PivotField's currently applied manual filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var manualFilter: js.UndefOr[PivotManualFilter] = js.native
  /**
    *
    * The PivotField's currently applied value filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var valueFilter: js.UndefOr[PivotValueFilter] = js.native
}

object PivotFilters {
  @scala.inline
  def apply(): PivotFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilters]
  }
  @scala.inline
  implicit class PivotFiltersOps[Self <: PivotFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDateFilter(value: PivotDateFilter): Self = this.set("dateFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFilter: Self = this.set("dateFilter", js.undefined)
    @scala.inline
    def setLabelFilter(value: PivotLabelFilter): Self = this.set("labelFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFilter: Self = this.set("labelFilter", js.undefined)
    @scala.inline
    def setManualFilter(value: PivotManualFilter): Self = this.set("manualFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualFilter: Self = this.set("manualFilter", js.undefined)
    @scala.inline
    def setValueFilter(value: PivotValueFilter): Self = this.set("valueFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFilter: Self = this.set("valueFilter", js.undefined)
  }
  
}

