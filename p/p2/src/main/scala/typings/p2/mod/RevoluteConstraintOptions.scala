package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevoluteConstraintOptions extends ConstraintOptions {
  var localPivotA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localPivotB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var maxForce: js.UndefOr[Double] = js.native
  var worldPivot: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object RevoluteConstraintOptions {
  @scala.inline
  def apply(): RevoluteConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevoluteConstraintOptions]
  }
  @scala.inline
  implicit class RevoluteConstraintOptionsOps[Self <: RevoluteConstraintOptions] (val x: Self) extends AnyVal {
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
    def setLocalPivotA(value: js.Tuple2[Double, Double]): Self = this.set("localPivotA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPivotA: Self = this.set("localPivotA", js.undefined)
    @scala.inline
    def setLocalPivotB(value: js.Tuple2[Double, Double]): Self = this.set("localPivotB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPivotB: Self = this.set("localPivotB", js.undefined)
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxForce: Self = this.set("maxForce", js.undefined)
    @scala.inline
    def setWorldPivot(value: js.Tuple2[Double, Double]): Self = this.set("worldPivot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldPivot: Self = this.set("worldPivot", js.undefined)
  }
  
}

