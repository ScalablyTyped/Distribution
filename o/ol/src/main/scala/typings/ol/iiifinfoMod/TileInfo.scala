package typings.ol.iiifinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileInfo extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var scaleFactors: js.Array[Double] = js.native
  var width: Double = js.native
}

object TileInfo {
  @scala.inline
  def apply(scaleFactors: js.Array[Double], width: Double): TileInfo = {
    val __obj = js.Dynamic.literal(scaleFactors = scaleFactors.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileInfo]
  }
  @scala.inline
  implicit class TileInfoOps[Self <: TileInfo] (val x: Self) extends AnyVal {
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
    def setScaleFactorsVarargs(value: Double*): Self = this.set("scaleFactors", js.Array(value :_*))
    @scala.inline
    def setScaleFactors(value: js.Array[Double]): Self = this.set("scaleFactors", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

