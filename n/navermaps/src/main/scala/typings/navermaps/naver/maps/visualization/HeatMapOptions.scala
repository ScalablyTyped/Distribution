package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.PointArrayLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatMapOptions extends js.Object {
  var colorMap: js.UndefOr[SpectrumStyle] = js.native
  var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation] = js.native
  var map: Map = js.native
  var opacity: js.UndefOr[Double] = js.native
  var radius: js.UndefOr[Double] = js.native
}

object HeatMapOptions {
  @scala.inline
  def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation], map: Map): HeatMapOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapOptions]
  }
  @scala.inline
  implicit class HeatMapOptionsOps[Self <: HeatMapOptions] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: (LatLng | PointArrayLiteral | WeightedLocation)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[LatLng | PointArrayLiteral | WeightedLocation]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorMap(value: SpectrumStyle): Self = this.set("colorMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMap: Self = this.set("colorMap", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
  
}

