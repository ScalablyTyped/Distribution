package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringOptions extends js.Object {
  var damping: js.UndefOr[Double] = js.native
  var localAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var localAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var worldAnchorA: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var worldAnchorB: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object SpringOptions {
  @scala.inline
  def apply(): SpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringOptions]
  }
  @scala.inline
  implicit class SpringOptionsOps[Self <: SpringOptions] (val x: Self) extends AnyVal {
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
    def setLocalAnchorA(value: js.Tuple2[Double, Double]): Self = this.set("localAnchorA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAnchorA: Self = this.set("localAnchorA", js.undefined)
    @scala.inline
    def setLocalAnchorB(value: js.Tuple2[Double, Double]): Self = this.set("localAnchorB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAnchorB: Self = this.set("localAnchorB", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    @scala.inline
    def setWorldAnchorA(value: js.Tuple2[Double, Double]): Self = this.set("worldAnchorA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldAnchorA: Self = this.set("worldAnchorA", js.undefined)
    @scala.inline
    def setWorldAnchorB(value: js.Tuple2[Double, Double]): Self = this.set("worldAnchorB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldAnchorB: Self = this.set("worldAnchorB", js.undefined)
  }
  
}

