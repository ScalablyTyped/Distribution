package typings.popmotion.decayTypesMod

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
    from: js.UndefOr[Double] = js.undefined,
    modifyTarget: /* v */ Double => Double = null,
    power: js.UndefOr[Double] = js.undefined,
    restDelta: js.UndefOr[Double] = js.undefined,
    timeConstant: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): DecayProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (modifyTarget != null) __obj.updateDynamic("modifyTarget")(js.Any.fromFunction1(modifyTarget))
    if (!js.isUndefined(power)) __obj.updateDynamic("power")(power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restDelta)) __obj.updateDynamic("restDelta")(restDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeConstant)) __obj.updateDynamic("timeConstant")(timeConstant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayProps]
  }
}

