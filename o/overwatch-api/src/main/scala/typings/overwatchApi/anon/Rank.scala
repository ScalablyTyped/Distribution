package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rank extends js.Object {
  var rank: Double = js.native
  var rank_img: String = js.native
}

object Rank {
  @scala.inline
  def apply(rank: Double, rank_img: String): Rank = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], rank_img = rank_img.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rank]
  }
  @scala.inline
  implicit class RankOps[Self <: Rank] (val x: Self) extends AnyVal {
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
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank_img(value: String): Self = this.set("rank_img", value.asInstanceOf[js.Any])
  }
  
}

