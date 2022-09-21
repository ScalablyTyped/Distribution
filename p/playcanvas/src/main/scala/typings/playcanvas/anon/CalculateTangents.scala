package typings.playcanvas.anon

import typings.playcanvas.mod.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateTangents extends StObject {
  
  var calculateTangents: js.UndefOr[Boolean] = js.undefined
  
  var halfExtents: js.UndefOr[Vec3] = js.undefined
  
  var heightSegments: js.UndefOr[Double] = js.undefined
  
  var lengthSegments: js.UndefOr[Double] = js.undefined
  
  var widthSegments: js.UndefOr[Double] = js.undefined
}
object CalculateTangents {
  
  inline def apply(): CalculateTangents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateTangents]
  }
  
  extension [Self <: CalculateTangents](x: Self) {
    
    inline def setCalculateTangents(value: Boolean): Self = StObject.set(x, "calculateTangents", value.asInstanceOf[js.Any])
    
    inline def setCalculateTangentsUndefined: Self = StObject.set(x, "calculateTangents", js.undefined)
    
    inline def setHalfExtents(value: Vec3): Self = StObject.set(x, "halfExtents", value.asInstanceOf[js.Any])
    
    inline def setHalfExtentsUndefined: Self = StObject.set(x, "halfExtents", js.undefined)
    
    inline def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    inline def setHeightSegmentsUndefined: Self = StObject.set(x, "heightSegments", js.undefined)
    
    inline def setLengthSegments(value: Double): Self = StObject.set(x, "lengthSegments", value.asInstanceOf[js.Any])
    
    inline def setLengthSegmentsUndefined: Self = StObject.set(x, "lengthSegments", js.undefined)
    
    inline def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
    
    inline def setWidthSegmentsUndefined: Self = StObject.set(x, "widthSegments", js.undefined)
  }
}
