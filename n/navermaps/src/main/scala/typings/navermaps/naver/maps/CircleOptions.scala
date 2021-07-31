package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleOptions extends StObject {
  
  var center: Coord | CoordLiteral
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeLineCap: js.UndefOr[strokeLineCapType] = js.undefined
  
  var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeStyle: js.UndefOr[strokeStyleType] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object CircleOptions {
  
  @scala.inline
  def apply(center: Coord | CoordLiteral): CircleOptions = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
  
  @scala.inline
  implicit class CircleOptionsMutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Coord | CoordLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeLineCap(value: strokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
    
    @scala.inline
    def setStrokeLineJoin(value: strokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: strokeStyleType): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
