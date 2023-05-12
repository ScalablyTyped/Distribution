package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AspectRatio extends StObject {
  
  var aspectRatio: Double
  
  var farClip: Double
  
  var fov: Double
  
  var horizontalFov: Boolean
  
  var nearClip: Double
}
object AspectRatio {
  
  inline def apply(aspectRatio: Double, farClip: Double, fov: Double, horizontalFov: Boolean, nearClip: Double): AspectRatio = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], farClip = farClip.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any], horizontalFov = horizontalFov.asInstanceOf[js.Any], nearClip = nearClip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AspectRatio] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setFarClip(value: Double): Self = StObject.set(x, "farClip", value.asInstanceOf[js.Any])
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setHorizontalFov(value: Boolean): Self = StObject.set(x, "horizontalFov", value.asInstanceOf[js.Any])
    
    inline def setNearClip(value: Double): Self = StObject.set(x, "nearClip", value.asInstanceOf[js.Any])
  }
}
