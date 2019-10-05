package typings.popmotion.libAnimationsDecayTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecayProps extends js.Object {
  var from: js.UndefOr[Double] = js.undefined
  var modifyTarget: js.UndefOr[ModifyTarget] = js.undefined
  var power: js.UndefOr[Double] = js.undefined
  var restDelta: js.UndefOr[Double] = js.undefined
  var timeConstant: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object DecayProps {
  @scala.inline
  def apply(
    from: Int | Double = null,
    modifyTarget: /* v */ Double => Double = null,
    power: Int | Double = null,
    restDelta: Int | Double = null,
    timeConstant: Int | Double = null,
    velocity: Int | Double = null
  ): DecayProps = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (modifyTarget != null) __obj.updateDynamic("modifyTarget")(js.Any.fromFunction1(modifyTarget))
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    if (restDelta != null) __obj.updateDynamic("restDelta")(restDelta.asInstanceOf[js.Any])
    if (timeConstant != null) __obj.updateDynamic("timeConstant")(timeConstant.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayProps]
  }
}

