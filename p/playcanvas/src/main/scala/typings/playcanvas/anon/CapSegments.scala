package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapSegments extends StObject {
  
  var calculateTangents: js.UndefOr[Boolean] = js.undefined
  
  var capSegments: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var heightSegments: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
}
object CapSegments {
  
  inline def apply(): CapSegments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapSegments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapSegments] (val x: Self) extends AnyVal {
    
    inline def setCalculateTangents(value: Boolean): Self = StObject.set(x, "calculateTangents", value.asInstanceOf[js.Any])
    
    inline def setCalculateTangentsUndefined: Self = StObject.set(x, "calculateTangents", js.undefined)
    
    inline def setCapSegments(value: Double): Self = StObject.set(x, "capSegments", value.asInstanceOf[js.Any])
    
    inline def setCapSegmentsUndefined: Self = StObject.set(x, "capSegments", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    inline def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
