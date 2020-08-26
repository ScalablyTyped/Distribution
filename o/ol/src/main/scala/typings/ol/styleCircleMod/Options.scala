package typings.ol.styleCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var displacement: js.UndefOr[js.Array[Double]] = js.native
  var fill: js.UndefOr[typings.ol.fillMod.default] = js.native
  var radius: Double = js.native
  var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.native
}

object Options {
  @scala.inline
  def apply(radius: Double): Options = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplacementVarargs(value: Double*): Self = this.set("displacement", js.Array(value :_*))
    @scala.inline
    def setDisplacement(value: js.Array[Double]): Self = this.set("displacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplacement: Self = this.set("displacement", js.undefined)
    @scala.inline
    def setFill(value: typings.ol.fillMod.default): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setStroke(value: typings.ol.strokeMod.default): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
  
}

