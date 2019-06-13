package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AverageComparativeScore extends js.Object {
  /** Average score within specified basis. */
  var averageScore: js.UndefOr[scala.Double] = js.undefined
  /** Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes. */
  var basis: js.UndefOr[java.lang.String] = js.undefined
}

object AverageComparativeScore {
  @scala.inline
  def apply(averageScore: scala.Int | scala.Double = null, basis: java.lang.String = null): AverageComparativeScore = {
    val __obj = js.Dynamic.literal()
    if (averageScore != null) __obj.updateDynamic("averageScore")(averageScore.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis)
    __obj.asInstanceOf[AverageComparativeScore]
  }
}

