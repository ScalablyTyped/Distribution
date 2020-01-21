package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRank extends js.Object {
  var rank: Double
  var rank_img: String
}

object AnonRank {
  @scala.inline
  def apply(rank: Double, rank_img: String): AnonRank = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], rank_img = rank_img.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRank]
  }
}

