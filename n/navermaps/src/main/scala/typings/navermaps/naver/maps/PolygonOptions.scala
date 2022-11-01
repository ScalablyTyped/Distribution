package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PolygonOptions
  */
trait PolygonOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var paths: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords]
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeLineCap: js.UndefOr[StrokeLineCapType] = js.undefined
  
  var strokeLineJoin: js.UndefOr[StrokeLineJoinType] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeStyle: js.UndefOr[StrokeStyleType] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PolygonOptions {
  
  inline def apply(paths: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords]): PolygonOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonOptions]
  }
  
  extension [Self <: PolygonOptions](x: Self) {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPaths(value: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: (ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords)*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeLineCap(value: StrokeLineCapType): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
    
    inline def setStrokeLineJoin(value: StrokeLineJoinType): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeStyle(value: StrokeStyleType): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
