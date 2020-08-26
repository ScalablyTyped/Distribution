package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompetitiveRank extends js.Object {
  var damage: js.UndefOr[Double] = js.native
  var support: js.UndefOr[Double] = js.native
  var tank: js.UndefOr[Double] = js.native
}

object CompetitiveRank {
  @scala.inline
  def apply(): CompetitiveRank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompetitiveRank]
  }
  @scala.inline
  implicit class CompetitiveRankOps[Self <: CompetitiveRank] (val x: Self) extends AnyVal {
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
    def setDamage(value: Double): Self = this.set("damage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamage: Self = this.set("damage", js.undefined)
    @scala.inline
    def setSupport(value: Double): Self = this.set("support", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupport: Self = this.set("support", js.undefined)
    @scala.inline
    def setTank(value: Double): Self = this.set("tank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTank: Self = this.set("tank", js.undefined)
  }
  
}

