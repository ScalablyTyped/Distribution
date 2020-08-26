package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatObject extends js.Object {
  var atk: Double = js.native
  var `def`: Double = js.native
  var hp: Double = js.native
  var sp_atk: Double = js.native
  var sp_def: Double = js.native
  var speed: Double = js.native
}

object StatObject {
  @scala.inline
  def apply(atk: Double, `def`: Double, hp: Double, sp_atk: Double, sp_def: Double, speed: Double): StatObject = {
    val __obj = js.Dynamic.literal(atk = atk.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], sp_atk = sp_atk.asInstanceOf[js.Any], sp_def = sp_def.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatObject]
  }
  @scala.inline
  implicit class StatObjectOps[Self <: StatObject] (val x: Self) extends AnyVal {
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
    def setAtk(value: Double): Self = this.set("atk", value.asInstanceOf[js.Any])
    @scala.inline
    def setDef(value: Double): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def setHp(value: Double): Self = this.set("hp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSp_atk(value: Double): Self = this.set("sp_atk", value.asInstanceOf[js.Any])
    @scala.inline
    def setSp_def(value: Double): Self = this.set("sp_def", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
  }
  
}

