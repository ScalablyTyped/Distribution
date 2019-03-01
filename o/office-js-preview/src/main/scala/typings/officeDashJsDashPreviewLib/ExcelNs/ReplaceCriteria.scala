package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the replace criteria to be used.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ReplaceCriteria extends js.Object {
  /**
    *
    * Specifies whether the match needs to be complete or partial. Default is false (partial).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var completeMatch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether the match is case sensitive. Default is false (insensitive).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
}

object ReplaceCriteria {
  @scala.inline
  def apply(
    completeMatch: js.UndefOr[scala.Boolean] = js.undefined,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined
  ): ReplaceCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completeMatch)) __obj.updateDynamic("completeMatch")(completeMatch)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    __obj.asInstanceOf[ReplaceCriteria]
  }
}

