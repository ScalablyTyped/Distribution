package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrismaticConstraintOptions extends ConstraintOptions {
  var disableRotationalLock: js.UndefOr[Boolean] = js.native
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAxisA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var lowerLimit: js.UndefOr[Double] = js.native
  var maxForce: js.UndefOr[Double] = js.native
  var upperLimit: js.UndefOr[Double] = js.native
}

object PrismaticConstraintOptions {
  @scala.inline
  def apply(): PrismaticConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismaticConstraintOptions]
  }
  @scala.inline
  implicit class PrismaticConstraintOptionsOps[Self <: PrismaticConstraintOptions] (val x: Self) extends AnyVal {
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
    def setDisableRotationalLock(value: Boolean): Self = this.set("disableRotationalLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRotationalLock: Self = this.set("disableRotationalLock", js.undefined)
    @scala.inline
    def setLocalAnchorA(value: js.Tuple2[Double, Double]): Self = this.set("localAnchorA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAnchorA: Self = this.set("localAnchorA", js.undefined)
    @scala.inline
    def setLocalAnchorB(value: js.Tuple2[Double, Double]): Self = this.set("localAnchorB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAnchorB: Self = this.set("localAnchorB", js.undefined)
    @scala.inline
    def setLocalAxisA(value: js.Tuple2[Double, Double]): Self = this.set("localAxisA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAxisA: Self = this.set("localAxisA", js.undefined)
    @scala.inline
    def setLowerLimit(value: Double): Self = this.set("lowerLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerLimit: Self = this.set("lowerLimit", js.undefined)
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxForce: Self = this.set("maxForce", js.undefined)
    @scala.inline
    def setUpperLimit(value: Double): Self = this.set("upperLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperLimit: Self = this.set("upperLimit", js.undefined)
  }
  
}

