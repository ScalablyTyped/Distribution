package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedLandmark extends StObject {
  
  var visibility: js.UndefOr[Double] = js.undefined
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object NormalizedLandmark {
  
  inline def apply(x: Double, y: Double, z: Double): NormalizedLandmark = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedLandmark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedLandmark] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Double): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
