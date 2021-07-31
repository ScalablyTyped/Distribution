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
  
  @scala.inline
  def apply(): BaseRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseRadius]
  }
  
  @scala.inline
  implicit class BaseRadiusMutableBuilder[Self <: BaseRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseRadius(value: Double): Self = StObject.set(x, "baseRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseRadiusUndefined: Self = StObject.set(x, "baseRadius", js.undefined)
    
    @scala.inline
    def setCapSegments(value: Double): Self = StObject.set(x, "capSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapSegmentsUndefined: Self = StObject.set(x, "capSegments", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPeakRadius(value: Double): Self = StObject.set(x, "peakRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeakRadiusUndefined: Self = StObject.set(x, "peakRadius", js.undefined)
  }
}
