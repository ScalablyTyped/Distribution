package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseRadius extends StObject {
  
  var baseRadius: js.UndefOr[Double] = js.undefined
  
  var capSegments: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var heightSegments: js.UndefOr[Double] = js.undefined
  
  var peakRadius: js.UndefOr[Double] = js.undefined
}
object BaseRadius {
  
  inline def apply(): BaseRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRadius]
  }
  
  extension [Self <: BaseRadius](x: Self) {
    
    inline def setBaseRadius(value: Double): Self = StObject.set(x, "baseRadius", value.asInstanceOf[js.Any])
    
    inline def setBaseRadiusUndefined: Self = StObject.set(x, "baseRadius", js.undefined)
    
    inline def setCapSegments(value: Double): Self = StObject.set(x, "capSegments", value.asInstanceOf[js.Any])
    
    inline def setCapSegmentsUndefined: Self = StObject.set(x, "capSegments", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    inline def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPeakRadius(value: Double): Self = StObject.set(x, "peakRadius", value.asInstanceOf[js.Any])
    
    inline def setPeakRadiusUndefined: Self = StObject.set(x, "peakRadius", js.undefined)
  }
}
