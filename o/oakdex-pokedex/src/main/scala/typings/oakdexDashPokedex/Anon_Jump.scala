package typings.oakdexDashPokedex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Jump extends js.Object {
  var jump: js.UndefOr[js.Array[Double]] = js.undefined
  var power: js.UndefOr[js.Array[Double]] = js.undefined
  var skill: js.UndefOr[js.Array[Double]] = js.undefined
  var speed: js.UndefOr[js.Array[Double]] = js.undefined
  var stamina: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_Jump {
  @scala.inline
  def apply(
    jump: js.Array[Double] = null,
    power: js.Array[Double] = null,
    skill: js.Array[Double] = null,
    speed: js.Array[Double] = null,
    stamina: js.Array[Double] = null
  ): Anon_Jump = {
    val __obj = js.Dynamic.literal()
    if (jump != null) __obj.updateDynamic("jump")(jump.asInstanceOf[js.Any])
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    if (skill != null) __obj.updateDynamic("skill")(skill.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (stamina != null) __obj.updateDynamic("stamina")(stamina.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Jump]
  }
}

