package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonOptions extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var map: js.UndefOr[Map] = js.native
  var paths: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  var strokeLineCap: js.UndefOr[strokeLineCapType] = js.native
  var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.native
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeStyle: js.UndefOr[strokeStyleType] = js.native
  var strokeWeight: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object PolygonOptions {
  @scala.inline
  def apply(paths: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords]): PolygonOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonOptions]
  }
  @scala.inline
  implicit class PolygonOptionsOps[Self <: PolygonOptions] (val x: Self) extends AnyVal {
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
    def setPathsVarargs(value: (ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords)*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeLineCap(value: strokeLineCapType): Self = this.set("strokeLineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLineCap: Self = this.set("strokeLineCap", js.undefined)
    @scala.inline
    def setStrokeLineJoin(value: strokeLineJoinType): Self = this.set("strokeLineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLineJoin: Self = this.set("strokeLineJoin", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeStyle(value: strokeStyleType): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

