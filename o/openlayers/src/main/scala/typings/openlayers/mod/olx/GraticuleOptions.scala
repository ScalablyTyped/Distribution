package typings.openlayers.mod.olx

import typings.openlayers.mod.Map
import typings.openlayers.mod.style.Stroke
import typings.openlayers.mod.style.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraticuleOptions extends StObject {
  
  var latLabelFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.undefined
  
  var latLabelPosition: js.UndefOr[Double] = js.undefined
  
  var latLabelStyle: js.UndefOr[Text] = js.undefined
  
  var lonLabelFormatter: js.UndefOr[js.Function1[/* lon */ Double, String]] = js.undefined
  
  var lonLabelPosition: js.UndefOr[Double] = js.undefined
  
  var lonLabelStyle: js.UndefOr[Text] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var maxLines: js.UndefOr[Double] = js.undefined
  
  var showLabels: js.UndefOr[Boolean] = js.undefined
  
  var strokeStyle: js.UndefOr[Stroke] = js.undefined
  
  var targetSize: js.UndefOr[Double] = js.undefined
}
object GraticuleOptions {
  
  inline def apply(): GraticuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraticuleOptions]
  }
  
  extension [Self <: GraticuleOptions](x: Self) {
    
    inline def setLatLabelFormatter(value: /* lat */ Double => String): Self = StObject.set(x, "latLabelFormatter", js.Any.fromFunction1(value))
    
    inline def setLatLabelFormatterUndefined: Self = StObject.set(x, "latLabelFormatter", js.undefined)
    
    inline def setLatLabelPosition(value: Double): Self = StObject.set(x, "latLabelPosition", value.asInstanceOf[js.Any])
    
    inline def setLatLabelPositionUndefined: Self = StObject.set(x, "latLabelPosition", js.undefined)
    
    inline def setLatLabelStyle(value: Text): Self = StObject.set(x, "latLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setLatLabelStyleUndefined: Self = StObject.set(x, "latLabelStyle", js.undefined)
    
    inline def setLonLabelFormatter(value: /* lon */ Double => String): Self = StObject.set(x, "lonLabelFormatter", js.Any.fromFunction1(value))
    
    inline def setLonLabelFormatterUndefined: Self = StObject.set(x, "lonLabelFormatter", js.undefined)
    
    inline def setLonLabelPosition(value: Double): Self = StObject.set(x, "lonLabelPosition", value.asInstanceOf[js.Any])
    
    inline def setLonLabelPositionUndefined: Self = StObject.set(x, "lonLabelPosition", js.undefined)
    
    inline def setLonLabelStyle(value: Text): Self = StObject.set(x, "lonLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setLonLabelStyleUndefined: Self = StObject.set(x, "lonLabelStyle", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
    
    inline def setStrokeStyle(value: Stroke): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setTargetSize(value: Double): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
