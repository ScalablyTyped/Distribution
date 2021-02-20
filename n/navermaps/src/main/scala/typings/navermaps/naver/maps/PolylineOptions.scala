package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.native
  
  var endIcon: js.UndefOr[PointingIcon] = js.native
  
  var endIconSize: js.UndefOr[Double] = js.native
  
  var map: js.UndefOr[Map] = js.native
  
  var path: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral = js.native
  
  var startIcon: js.UndefOr[PointingIcon] = js.native
  
  var startIconSize: js.UndefOr[Double] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
  
  var strokeLineCap: js.UndefOr[strokeLineCapType] = js.native
  
  var strokeLineJoin: js.UndefOr[strokeLineJoinType] = js.native
  
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  var strokeStyle: js.UndefOr[strokeStyleType] = js.native
  
  var strokeWeight: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object PolylineOptions {
  
  @scala.inline
  def apply(path: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral): PolylineOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
  
  @scala.inline
  implicit class PolylineOptionsMutableBuilder[Self <: PolylineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setEndIcon(value: PointingIcon): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIconSize(value: Double): Self = StObject.set(x, "endIconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIconSizeUndefined: Self = StObject.set(x, "endIconSize", js.undefined)
    
    @scala.inline
    def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setPath(value: ArrayOfCoords | KVOArrayOfCoords | ArrayOfCoordsLiteral): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (LatLng | LatLngLiteral | Point | PointLiteral)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setStartIcon(value: PointingIcon): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIconSize(value: Double): Self = StObject.set(x, "startIconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIconSizeUndefined: Self = StObject.set(x, "startIconSize", js.undefined)
    
    @scala.inline
    def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
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
