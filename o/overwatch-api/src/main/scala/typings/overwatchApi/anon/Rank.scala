package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rank extends js.Object {
  var rank: Double
  var rank_img: String
}

object Rank {
  @scala.inline
  def apply(rank: Double, rank_img: String): Rank = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], rank_img = rank_img.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rank]
  }
}

