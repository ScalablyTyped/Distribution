package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompetitiveRankInfo extends js.Object {
  var rank: Double
  var rank_img: String
}

object CompetitiveRankInfo {
  @scala.inline
  def apply(rank: Double, rank_img: String): CompetitiveRankInfo = {
    val __obj = js.Dynamic.literal(rank = rank, rank_img = rank_img)
  
    __obj.asInstanceOf[CompetitiveRankInfo]
  }
}

