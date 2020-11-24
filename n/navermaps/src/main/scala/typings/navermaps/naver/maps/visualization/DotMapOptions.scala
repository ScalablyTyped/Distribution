package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.PointArrayLiteral
import typings.navermaps.naver.maps.strokeLineCapType
import typings.navermaps.naver.maps.strokeLineJoinType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotMapOptions extends js.Object {
  
  var data: js.Array[LatLng | PointArrayLiteral | WeightedLocation] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var map: Map = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
  
  var strokeLineCap: js.UndefOr[strokeLineCapType] = js.native
  
  var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.native
  
  var strokeWeight: js.UndefOr[Double] = js.native
}
object DotMapOptions {
  
  @scala.inline
  def apply(data: js.Array[LatLng | PointArrayLiteral | WeightedLocation], map: Map): DotMapOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMapOptions]
  }
  
  @scala.inline
  implicit class DotMapOptionsOps[Self <: DotMapOptions] (val x: Self) extends AnyVal {
    
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
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
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
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
  }
}
