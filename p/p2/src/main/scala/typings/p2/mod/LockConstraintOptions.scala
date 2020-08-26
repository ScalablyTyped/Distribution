package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockConstraintOptions extends ConstraintOptions {
  var localAngleB: js.UndefOr[Double] = js.native
  var localOffsetB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var maxForce: js.UndefOr[Double] = js.native
}

object LockConstraintOptions {
  @scala.inline
  def apply(): LockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockConstraintOptions]
  }
  @scala.inline
  implicit class LockConstraintOptionsOps[Self <: LockConstraintOptions] (val x: Self) extends AnyVal {
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
    def setLocalAngleB(value: Double): Self = this.set("localAngleB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAngleB: Self = this.set("localAngleB", js.undefined)
    @scala.inline
    def setLocalOffsetB(value: js.Tuple2[Double, Double]): Self = this.set("localOffsetB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalOffsetB: Self = this.set("localOffsetB", js.undefined)
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxForce: Self = this.set("maxForce", js.undefined)
  }
  
}

