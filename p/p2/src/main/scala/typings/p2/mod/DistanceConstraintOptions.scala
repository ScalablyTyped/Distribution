package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceConstraintOptions extends ConstraintOptions {
  var distance: js.UndefOr[Double] = js.native
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var maxForce: js.UndefOr[Double] = js.native
}

object DistanceConstraintOptions {
  @scala.inline
  def apply(): DistanceConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceConstraintOptions]
  }
  @scala.inline
  implicit class DistanceConstraintOptionsOps[Self <: DistanceConstraintOptions] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setLocalAnchorA(value: js.Tuple2[Double, Double]): Self = this.set("localAnchorA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAnchorA: Self = this.set("localAnchorA", js.undefined)
    @scala.inline
    def setLocalAnchorB(value: js.Tuple2[Double, Double]): Self = this.set("localAnchorB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAnchorB: Self = this.set("localAnchorB", js.undefined)
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxForce: Self = this.set("maxForce", js.undefined)
  }
  
}

