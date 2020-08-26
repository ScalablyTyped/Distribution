package typings.oakdexPokedex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jump extends js.Object {
  var jump: js.UndefOr[js.Array[Double]] = js.native
  var power: js.UndefOr[js.Array[Double]] = js.native
  var skill: js.UndefOr[js.Array[Double]] = js.native
  var speed: js.UndefOr[js.Array[Double]] = js.native
  var stamina: js.UndefOr[js.Array[Double]] = js.native
}

object Jump {
  @scala.inline
  def apply(): Jump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jump]
  }
  @scala.inline
  implicit class JumpOps[Self <: Jump] (val x: Self) extends AnyVal {
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
    def setJumpVarargs(value: Double*): Self = this.set("jump", js.Array(value :_*))
    @scala.inline
    def setJump(value: js.Array[Double]): Self = this.set("jump", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJump: Self = this.set("jump", js.undefined)
    @scala.inline
    def setPowerVarargs(value: Double*): Self = this.set("power", js.Array(value :_*))
    @scala.inline
    def setPower(value: js.Array[Double]): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    @scala.inline
    def setSkillVarargs(value: Double*): Self = this.set("skill", js.Array(value :_*))
    @scala.inline
    def setSkill(value: js.Array[Double]): Self = this.set("skill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkill: Self = this.set("skill", js.undefined)
    @scala.inline
    def setSpeedVarargs(value: Double*): Self = this.set("speed", js.Array(value :_*))
    @scala.inline
    def setSpeed(value: js.Array[Double]): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStaminaVarargs(value: Double*): Self = this.set("stamina", js.Array(value :_*))
    @scala.inline
    def setStamina(value: js.Array[Double]): Self = this.set("stamina", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStamina: Self = this.set("stamina", js.undefined)
  }
  
}

