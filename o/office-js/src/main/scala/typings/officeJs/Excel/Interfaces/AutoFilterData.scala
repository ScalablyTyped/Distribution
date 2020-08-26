package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.FilterCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `autoFilter.toJSON()`. */
@js.native
trait AutoFilterData extends js.Object {
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var criteria: js.UndefOr[js.Array[FilterCriteria]] = js.native
  /**
    *
    * Specifies if the AutoFilter is enabled.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the AutoFilter has filter criteria.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDataFiltered: js.UndefOr[Boolean] = js.native
}

object AutoFilterData {
  @scala.inline
  def apply(): AutoFilterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFilterData]
  }
  @scala.inline
  implicit class AutoFilterDataOps[Self <: AutoFilterData] (val x: Self) extends AnyVal {
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
    def setCriteriaVarargs(value: FilterCriteria*): Self = this.set("criteria", js.Array(value :_*))
    @scala.inline
    def setCriteria(value: js.Array[FilterCriteria]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIsDataFiltered(value: Boolean): Self = this.set("isDataFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDataFiltered: Self = this.set("isDataFiltered", js.undefined)
  }
  
}

