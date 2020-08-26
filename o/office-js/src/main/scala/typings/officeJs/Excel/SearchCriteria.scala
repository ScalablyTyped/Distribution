package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Backwards
import typings.officeJs.officeJsStrings.Forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the search criteria to be used.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait SearchCriteria extends js.Object {
  /**
    *
    * Specifies if the match needs to be complete or partial.
    A complete match matches the entire contents of the cell. A partial match matches a substring within the content of the cell (e.g., `cat` partially matches `caterpillar` and `scatter`).
    Default is false (partial).
    *
    * [Api set: ExcelApi 1.9]
    */
  var completeMatch: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the match is case sensitive. Default is false (insensitive).
    *
    * [Api set: ExcelApi 1.9]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the search direction. Default is forward. See Excel.SearchDirection.
    *
    * [Api set: ExcelApi 1.9]
    */
  var searchDirection: js.UndefOr[SearchDirection | Forward | Backwards] = js.native
}

object SearchCriteria {
  @scala.inline
  def apply(): SearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchCriteria]
  }
  @scala.inline
  implicit class SearchCriteriaOps[Self <: SearchCriteria] (val x: Self) extends AnyVal {
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
    def setCompleteMatch(value: Boolean): Self = this.set("completeMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteMatch: Self = this.set("completeMatch", js.undefined)
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    @scala.inline
    def setSearchDirection(value: SearchDirection | Forward | Backwards): Self = this.set("searchDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchDirection: Self = this.set("searchDirection", js.undefined)
  }
  
}

