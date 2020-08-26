package typings.momentHijri.mod.momentAugmentingMod.iConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GregorianResult extends js.Object {
  var gd: Double = js.native
  var gm: Double = js.native
  var gy: Double = js.native
}

object GregorianResult {
  @scala.inline
  def apply(gd: Double, gm: Double, gy: Double): GregorianResult = {
    val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GregorianResult]
  }
  @scala.inline
  implicit class GregorianResultOps[Self <: GregorianResult] (val x: Self) extends AnyVal {
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
    def setGd(value: Double): Self = this.set("gd", value.asInstanceOf[js.Any])
    @scala.inline
    def setGm(value: Double): Self = this.set("gm", value.asInstanceOf[js.Any])
    @scala.inline
    def setGy(value: Double): Self = this.set("gy", value.asInstanceOf[js.Any])
  }
  
}

