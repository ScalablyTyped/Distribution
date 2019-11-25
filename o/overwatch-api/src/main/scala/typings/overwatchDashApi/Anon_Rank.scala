package typings.overwatchDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rank extends js.Object {
  var rank: Double
  var rank_img: String
}

object Anon_Rank {
  @scala.inline
  def apply(rank: Double, rank_img: String): Anon_Rank = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], rank_img = rank_img.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rank]
  }
}

