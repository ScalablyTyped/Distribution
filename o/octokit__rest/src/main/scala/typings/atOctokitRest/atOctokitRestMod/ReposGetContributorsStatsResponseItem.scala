package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContributorsStatsResponseItem extends js.Object {
  var author: ReposGetContributorsStatsResponseItemAuthor
  var total: Double
  var weeks: js.Array[ReposGetContributorsStatsResponseItemWeeksItem]
}

object ReposGetContributorsStatsResponseItem {
  @scala.inline
  def apply(
    author: ReposGetContributorsStatsResponseItemAuthor,
    total: Double,
    weeks: js.Array[ReposGetContributorsStatsResponseItemWeeksItem]
  ): ReposGetContributorsStatsResponseItem = {
    val __obj = js.Dynamic.literal(author = author, total = total, weeks = weeks)
  
    __obj.asInstanceOf[ReposGetContributorsStatsResponseItem]
  }
}

