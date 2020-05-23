package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AverageComparativeScore extends js.Object {
  // Average score within specified basis.
  var averageScore: js.UndefOr[Double] = js.undefined
  // Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes.
  var basis: js.UndefOr[String] = js.undefined
}

object AverageComparativeScore {
  @scala.inline
  def apply(averageScore: js.UndefOr[Double] = js.undefined, basis: String = null): AverageComparativeScore = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(averageScore)) __obj.updateDynamic("averageScore")(averageScore.get.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageComparativeScore]
  }
}

