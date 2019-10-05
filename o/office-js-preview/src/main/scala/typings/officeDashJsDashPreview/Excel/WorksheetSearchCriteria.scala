package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the worksheet search criteria to be used.
  *
  * [Api set: ExcelApi 1.9]
  */
trait WorksheetSearchCriteria extends js.Object {
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
}

object WorksheetSearchCriteria {
  @scala.inline
  def apply(completeMatch: js.UndefOr[Boolean] = js.undefined, matchCase: js.UndefOr[Boolean] = js.undefined): WorksheetSearchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completeMatch)) __obj.updateDynamic("completeMatch")(completeMatch)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    __obj.asInstanceOf[WorksheetSearchCriteria]
  }
}

