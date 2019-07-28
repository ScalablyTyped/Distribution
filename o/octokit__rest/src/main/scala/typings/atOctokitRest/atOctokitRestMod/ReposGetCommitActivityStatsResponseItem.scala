package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitActivityStatsResponseItem extends js.Object {
  var days: js.Array[Double]
  var total: Double
  var week: Double
}

object ReposGetCommitActivityStatsResponseItem {
  @scala.inline
  def apply(days: js.Array[Double], total: Double, week: Double): ReposGetCommitActivityStatsResponseItem = {
    val __obj = js.Dynamic.literal(days = days, total = total, week = week)
  
    __obj.asInstanceOf[ReposGetCommitActivityStatsResponseItem]
  }
}

