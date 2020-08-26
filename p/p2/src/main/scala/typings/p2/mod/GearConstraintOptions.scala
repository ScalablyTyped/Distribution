package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GearConstraintOptions extends ConstraintOptions {
  var angle: js.UndefOr[Double] = js.native
  var maxTorque: js.UndefOr[Double] = js.native
  var ratio: js.UndefOr[Double] = js.native
}

object GearConstraintOptions {
  @scala.inline
  def apply(): GearConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GearConstraintOptions]
  }
  @scala.inline
  implicit class GearConstraintOptionsOps[Self <: GearConstraintOptions] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setMaxTorque(value: Double): Self = this.set("maxTorque", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTorque: Self = this.set("maxTorque", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
  }
  
}

