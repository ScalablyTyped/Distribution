package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    * Specifies whether the match needs to be complete or partial. Default is false (partial).
    *
    * [Api set: ExcelApi 1.9]
    */
  var completeMatch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether the match is case sensitive. Default is false (insensitive).
    *
    * [Api set: ExcelApi 1.9]
    */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies the search direction. Default is forward. See Excel.SearchDirection.
    *
    * [Api set: ExcelApi 1.9]
    */
  var searchDirection: js.UndefOr[
    SearchDirection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Forward | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Backwards
  ] = js.undefined
}

object SearchCriteria {
  @scala.inline
  def apply(
    completeMatch: js.UndefOr[scala.Boolean] = js.undefined,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined,
    searchDirection: SearchDirection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Forward | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Backwards = null
  ): SearchCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completeMatch)) __obj.updateDynamic("completeMatch")(completeMatch)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (searchDirection != null) __obj.updateDynamic("searchDirection")(searchDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriteria]
  }
}

