package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PolylineOptions
  */
trait PolylineOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var endIcon: js.UndefOr[PointingIcon] = js.undefined
  
  var endIconSize: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var path: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral
  
  var startIcon: js.UndefOr[PointingIcon] = js.undefined
  
  var startIconSize: js.UndefOr[Double] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeLineCap: js.UndefOr[StrokeLineCapType] = js.undefined
  
  var strokeLineJoin: js.UndefOr[StrokeLineJoinType] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeStyle: js.UndefOr[StrokeStyleType] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PolylineOptions {
  
  inline def apply(path: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral): PolylineOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
  
  extension [Self <: PolylineOptions](x: Self) {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setEndIcon(value: PointingIcon): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
    
    inline def setEndIconSize(value: Double): Self = StObject.set(x, "endIconSize", value.asInstanceOf[js.Any])
    
    inline def setEndIconSizeUndefined: Self = StObject.set(x, "endIconSize", js.undefined)
    
    inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPath(value: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (LatLng | LatLngLiteral | Point | PointLiteral)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setStartIcon(value: PointingIcon): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
    
    inline def setStartIconSize(value: Double): Self = StObject.set(x, "startIconSize", value.asInstanceOf[js.Any])
    
    inline def setStartIconSizeUndefined: Self = StObject.set(x, "startIconSize", js.undefined)
    
    inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
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
