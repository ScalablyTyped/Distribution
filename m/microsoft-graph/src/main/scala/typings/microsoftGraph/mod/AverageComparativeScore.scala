package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AverageComparativeScore extends js.Object {
  // Average score within specified basis.
  var averageScore: js.UndefOr[Double] = js.native
  // Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes.
  var basis: js.UndefOr[String] = js.native
}

object AverageComparativeScore {
  @scala.inline
  def apply(): AverageComparativeScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AverageComparativeScore]
  }
  @scala.inline
  implicit class AverageComparativeScoreOps[Self <: AverageComparativeScore] (val x: Self) extends AnyVal {
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
    def setAverageScore(value: Double): Self = this.set("averageScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageScore: Self = this.set("averageScore", js.undefined)
    @scala.inline
    def setBasis(value: String): Self = this.set("basis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasis: Self = this.set("basis", js.undefined)
  }
  
}

