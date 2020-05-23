package typings.popmotion.springTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringProps extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var restDelta: js.UndefOr[Double] = js.undefined
  var restSpeed: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Double] = js.undefined
}

object SpringProps {
  @scala.inline
  def apply(
    damping: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    restDelta: js.UndefOr[Double] = js.undefined,
    restSpeed: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined,
    velocity: js.UndefOr[Double] = js.undefined
  ): SpringProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restDelta)) __obj.updateDynamic("restDelta")(restDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restSpeed)) __obj.updateDynamic("restSpeed")(restSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringProps]
  }
}

