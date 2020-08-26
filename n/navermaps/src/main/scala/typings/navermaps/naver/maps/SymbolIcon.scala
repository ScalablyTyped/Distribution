package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolIcon extends js.Object {
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var path: SymbolPath | (js.Array[Point | PointLiteral]) = js.native
  var radius: js.UndefOr[Double] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeWeight: js.UndefOr[Double] = js.native
  var style: js.UndefOr[SymbolStyle] = js.native
}

object SymbolIcon {
  @scala.inline
  def apply(path: SymbolPath | (js.Array[Point | PointLiteral])): SymbolIcon = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolIcon]
  }
  @scala.inline
  implicit class SymbolIconOps[Self <: SymbolIcon] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: (Point | PointLiteral)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: SymbolPath | (js.Array[Point | PointLiteral])): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchor(value: Point | PointLiteral | Position): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
    @scala.inline
    def setStyle(value: SymbolStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

