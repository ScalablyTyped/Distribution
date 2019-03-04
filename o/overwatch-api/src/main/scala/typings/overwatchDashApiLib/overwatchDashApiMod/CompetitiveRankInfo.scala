package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompetitiveRankInfo extends js.Object {
  var rank: scala.Double
  var rank_img: java.lang.String
}

object CompetitiveRankInfo {
  @scala.inline
  def apply(rank: scala.Double, rank_img: java.lang.String): CompetitiveRankInfo = {
    val __obj = js.Dynamic.literal(rank = rank, rank_img = rank_img)
  
    __obj.asInstanceOf[CompetitiveRankInfo]
  }
}

