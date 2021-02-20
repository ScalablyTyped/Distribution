package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolIcon extends StObject {
  
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
  implicit class SymbolIconMutableBuilder[Self <: SymbolIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point | PointLiteral | Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setPath(value: SymbolPath | (js.Array[Point | PointLiteral])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (Point | PointLiteral)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    @scala.inline
    def setStyle(value: SymbolStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
