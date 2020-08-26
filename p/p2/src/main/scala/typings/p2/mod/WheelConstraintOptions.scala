package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WheelConstraintOptions extends js.Object {
  var localForwardVector: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localPosition: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var sideFriction: js.UndefOr[Double] = js.native
}

object WheelConstraintOptions {
  @scala.inline
  def apply(): WheelConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelConstraintOptions]
  }
  @scala.inline
  implicit class WheelConstraintOptionsOps[Self <: WheelConstraintOptions] (val x: Self) extends AnyVal {
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
    def setLocalForwardVector(value: js.Tuple2[Double, Double]): Self = this.set("localForwardVector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalForwardVector: Self = this.set("localForwardVector", js.undefined)
    @scala.inline
    def setLocalPosition(value: js.Tuple2[Double, Double]): Self = this.set("localPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPosition: Self = this.set("localPosition", js.undefined)
    @scala.inline
    def setSideFriction(value: Double): Self = this.set("sideFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideFriction: Self = this.set("sideFriction", js.undefined)
  }
  
}

