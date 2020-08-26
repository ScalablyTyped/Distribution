package typings.openlayers.mod.olx.format

import typings.openlayers.mod.geom.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineOptions extends js.Object {
  var factor: js.UndefOr[Double] = js.native
  var geometryLayout: js.UndefOr[GeometryLayout] = js.native
}

object PolylineOptions {
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  @scala.inline
  implicit class PolylineOptionsOps[Self <: PolylineOptions] (val x: Self) extends AnyVal {
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
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setGeometryLayout(value: GeometryLayout): Self = this.set("geometryLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryLayout: Self = this.set("geometryLayout", js.undefined)
  }
  
}

