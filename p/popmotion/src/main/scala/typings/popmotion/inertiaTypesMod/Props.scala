package typings.popmotion.inertiaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var bounceDamping: Double = js.native
  var bounceStiffness: Double = js.native
  var from: Double = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var power: Double = js.native
  var restDelta: Double = js.native
  var timeConstant: Double = js.native
  var velocity: Double = js.native
  def modifyTarget(v: Double): Double = js.native
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
    velocity: Double
  ): Props = {
    val __obj = js.Dynamic.literal(bounceDamping = bounceDamping.asInstanceOf[js.Any], bounceStiffness = bounceStiffness.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], modifyTarget = js.Any.fromFunction1(modifyTarget), power = power.asInstanceOf[js.Any], restDelta = restDelta.asInstanceOf[js.Any], timeConstant = timeConstant.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setBounceDamping(value: Double): Self = this.set("bounceDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounceStiffness(value: Double): Self = this.set("bounceStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifyTarget(value: Double => Double): Self = this.set("modifyTarget", js.Any.fromFunction1(value))
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestDelta(value: Double): Self = this.set("restDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeConstant(value: Double): Self = this.set("timeConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

