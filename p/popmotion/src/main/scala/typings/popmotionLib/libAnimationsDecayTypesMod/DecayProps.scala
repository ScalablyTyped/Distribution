package typings
package popmotionLib.libAnimationsDecayTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecayProps extends js.Object {
  var from: js.UndefOr[scala.Double] = js.undefined
  var modifyTarget: js.UndefOr[ModifyTarget] = js.undefined
  var power: js.UndefOr[scala.Double] = js.undefined
  var restDelta: js.UndefOr[scala.Double] = js.undefined
  var timeConstant: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[scala.Double] = js.undefined
}

object DecayProps {
  @scala.inline
  def apply(
    from: scala.Int | scala.Double = null,
    modifyTarget: ModifyTarget = null,
    power: scala.Int | scala.Double = null,
    restDelta: scala.Int | scala.Double = null,
    timeConstant: scala.Int | scala.Double = null,
    velocity: scala.Int | scala.Double = null
  ): DecayProps = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (modifyTarget != null) __obj.updateDynamic("modifyTarget")(modifyTarget)
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    if (restDelta != null) __obj.updateDynamic("restDelta")(restDelta.asInstanceOf[js.Any])
    if (timeConstant != null) __obj.updateDynamic("timeConstant")(timeConstant.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayProps]
  }
}

