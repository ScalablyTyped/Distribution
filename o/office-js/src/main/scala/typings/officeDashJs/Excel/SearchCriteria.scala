package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.Backwards
import typings.officeDashJs.officeDashJsStrings.Forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the search criteria to be used.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SearchCriteria extends js.Object {
  /**
    *
    * Specifies whether the match needs to be complete or partial. A complete match matches the entire contents of the cell. A partial match matches a substring within the content of the cell (e.g., `cat` partially matches `caterpillar` and `scatter`). Default is false (partial).
    *
    * [Api set: ExcelApi 1.9]
    */
  var completeMatch: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether the match is case sensitive. Default is false (insensitive).
    *
    * [Api set: ExcelApi 1.9]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the search direction. Default is forward. See Excel.SearchDirection.
    *
    * [Api set: ExcelApi 1.9]
    */
  var searchDirection: js.UndefOr[SearchDirection | Forward | Backwards] = js.undefined
}

object SearchCriteria {
  @scala.inline
  def apply(
    completeMatch: js.UndefOr[Boolean] = js.undefined,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    searchDirection: SearchDirection | Forward | Backwards = null
  ): SearchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completeMatch)) __obj.updateDynamic("completeMatch")(completeMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.asInstanceOf[js.Any])
    if (searchDirection != null) __obj.updateDynamic("searchDirection")(searchDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriteria]
  }
}

