package typings.officeJsPreview.Excel

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
    * Specifies if the match needs to be complete or partial.
    A complete match matches the entire contents of the cell. A partial match matches a substring within the content of the cell (e.g., `cat` partially matches `caterpillar` and `scatter`).
    Default is false (partial).
    *
    * [Api set: ExcelApi 1.9]
    */
  var completeMatch: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the match is case sensitive. Default is false (insensitive).
    *
    * [Api set: ExcelApi 1.9]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
}

object WorksheetSearchCriteria {
  @scala.inline
  def apply(completeMatch: js.UndefOr[Boolean] = js.undefined, matchCase: js.UndefOr[Boolean] = js.undefined): WorksheetSearchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completeMatch)) __obj.updateDynamic("completeMatch")(completeMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetSearchCriteria]
  }
}

