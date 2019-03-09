package typings
package oakdexDashPokedexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Jump extends js.Object {
  var jump: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var power: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var skill: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var speed: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var stamina: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Jump {
  @scala.inline
  def apply(
    jump: js.Array[scala.Double] = null,
    power: js.Array[scala.Double] = null,
    skill: js.Array[scala.Double] = null,
    speed: js.Array[scala.Double] = null,
    stamina: js.Array[scala.Double] = null
  ): Anon_Jump = {
    val __obj = js.Dynamic.literal()
    if (jump != null) __obj.updateDynamic("jump")(jump)
    if (power != null) __obj.updateDynamic("power")(power)
    if (skill != null) __obj.updateDynamic("skill")(skill)
    if (speed != null) __obj.updateDynamic("speed")(speed)
    if (stamina != null) __obj.updateDynamic("stamina")(stamina)
    __obj.asInstanceOf[Anon_Jump]
  }
}

