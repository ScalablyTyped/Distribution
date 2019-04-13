package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContributorsStatsResponseItem extends js.Object {
  var author: ReposGetContributorsStatsResponseItemAuthor
  var total: scala.Double
  var weeks: js.Array[ReposGetContributorsStatsResponseItemWeeksItem]
}

object ReposGetContributorsStatsResponseItem {
  @scala.inline
  def apply(
    author: ReposGetContributorsStatsResponseItemAuthor,
    total: scala.Double,
    weeks: js.Array[ReposGetContributorsStatsResponseItemWeeksItem]
  ): ReposGetContributorsStatsResponseItem = {
    val __obj = js.Dynamic.literal(author = author, total = total, weeks = weeks)
  
    __obj.asInstanceOf[ReposGetContributorsStatsResponseItem]
  }
}

