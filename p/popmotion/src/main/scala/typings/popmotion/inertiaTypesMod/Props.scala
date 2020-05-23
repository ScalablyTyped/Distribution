package typings.popmotion.inertiaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bounceDamping: Double
  var bounceStiffness: Double
  var from: Double
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var power: Double
  var restDelta: Double
  var timeConstant: Double
  var velocity: Double
  def modifyTarget(v: Double): Double
}

object Props {
  @scala.inline
  def apply(
    bounceDamping: Double,
    bounceStiffness: Double,
    from: Double,
    modifyTarget: Double => Double,
    power: Double,
    restDelta: Double,
    timeConstant: Double,
    velocity: Double,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(bounceDamping = bounceDamping.asInstanceOf[js.Any], bounceStiffness = bounceStiffness.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], modifyTarget = js.Any.fromFunction1(modifyTarget), power = power.asInstanceOf[js.Any], restDelta = restDelta.asInstanceOf[js.Any], timeConstant = timeConstant.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

