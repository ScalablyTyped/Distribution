package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Camera extends StObject {
  
  var center: PartialPoint
  
  var eye: PartialPoint
  
  var up: PartialPoint
}
object Camera {
  
  inline def apply(center: PartialPoint, eye: PartialPoint, up: PartialPoint): Camera = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: PartialPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEye(value: PartialPoint): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    inline def setUp(value: PartialPoint): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
