package typings.mediapipeFaceMesh.mod

import typings.mediapipeFaceMesh.mediapipeFaceMeshDoubles.`1.0`
import typings.mediapipeFaceMesh.mediapipeFaceMeshDoubles.`10000.0`
import typings.mediapipeFaceMesh.mediapipeFaceMeshDoubles.`63.0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultCameraParams extends StObject {
  
  var far: `10000.0`
  
  var near: `1.0`
  
  var verticalFovDegrees: `63.0`
}
object DefaultCameraParams {
  
  inline def apply(): DefaultCameraParams = {
    val __obj = js.Dynamic.literal(far = 10000.0d, near = 1.0d, verticalFovDegrees = 63.0d)
    __obj.asInstanceOf[DefaultCameraParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultCameraParams] (val x: Self) extends AnyVal {
    
    inline def setFar(value: `10000.0`): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    inline def setNear(value: `1.0`): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    inline def setVerticalFovDegrees(value: `63.0`): Self = StObject.set(x, "verticalFovDegrees", value.asInstanceOf[js.Any])
  }
}
