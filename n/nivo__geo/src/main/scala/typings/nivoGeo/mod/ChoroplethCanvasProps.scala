package typings.nivoGeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoroplethCanvasProps extends ChoroplethCommonProps {
  var pixelRatio: js.UndefOr[Double] = js.native
}

object ChoroplethCanvasProps {
  @scala.inline
  def apply(data: js.Array[_], domain: js.Array[Double], features: js.Array[_]): ChoroplethCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoroplethCanvasProps]
  }
  @scala.inline
  implicit class ChoroplethCanvasPropsOps[Self <: ChoroplethCanvasProps] (val x: Self) extends AnyVal {
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
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
  }
  
}

