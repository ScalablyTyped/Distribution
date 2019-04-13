package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitActivityStatsResponseItem extends js.Object {
  var days: js.Array[scala.Double]
  var total: scala.Double
  var week: scala.Double
}

object ReposGetCommitActivityStatsResponseItem {
  @scala.inline
  def apply(days: js.Array[scala.Double], total: scala.Double, week: scala.Double): ReposGetCommitActivityStatsResponseItem = {
    val __obj = js.Dynamic.literal(days = days, total = total, week = week)
  
    __obj.asInstanceOf[ReposGetCommitActivityStatsResponseItem]
  }
}

