package typings.popmotion.springTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringProps extends js.Object {
  var damping: js.UndefOr[Double] = js.native
  var from: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var restDelta: js.UndefOr[Double] = js.native
  var restSpeed: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var to: js.UndefOr[Double] = js.native
  var velocity: js.UndefOr[Double] = js.native
}

object SpringProps {
  @scala.inline
  def apply(): SpringProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringProps]
  }
  @scala.inline
  implicit class SpringPropsOps[Self <: SpringProps] (val x: Self) extends AnyVal {
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
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    @scala.inline
    def setRestDelta(value: Double): Self = this.set("restDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestDelta: Self = this.set("restDelta", js.undefined)
    @scala.inline
    def setRestSpeed(value: Double): Self = this.set("restSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSpeed: Self = this.set("restSpeed", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

