package typings.playcanvas.anon

import typings.playcanvas.mod.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HalfExtents extends StObject {
  
  var calculateTangents: js.UndefOr[Boolean] = js.undefined
  
  var halfExtents: js.UndefOr[Vec2] = js.undefined
  
  var lengthSegments: js.UndefOr[Double] = js.undefined
  
  var widthSegments: js.UndefOr[Double] = js.undefined
}
object HalfExtents {
  
  inline def apply(): HalfExtents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HalfExtents]
  }
  
  extension [Self <: HalfExtents](x: Self) {
    
    inline def setCalculateTangents(value: Boolean): Self = StObject.set(x, "calculateTangents", value.asInstanceOf[js.Any])
    
    inline def setCalculateTangentsUndefined: Self = StObject.set(x, "calculateTangents", js.undefined)
    
    inline def setHalfExtents(value: Vec2): Self = StObject.set(x, "halfExtents", value.asInstanceOf[js.Any])
    
    inline def setHalfExtentsUndefined: Self = StObject.set(x, "halfExtents", js.undefined)
    
    inline def setLengthSegments(value: Double): Self = StObject.set(x, "lengthSegments", value.asInstanceOf[js.Any])
    
    inline def setLengthSegmentsUndefined: Self = StObject.set(x, "lengthSegments", js.undefined)
    
    inline def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
    
    inline def setWidthSegmentsUndefined: Self = StObject.set(x, "widthSegments", js.undefined)
  }
}
