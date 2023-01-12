package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLight extends StObject {
  
  var light: Any
  
  var max: Vec3
  
  var min: Vec3
}
object ClusterLight {
  
  inline def apply(light: Any, max: Vec3, min: Vec3): ClusterLight = {
    val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterLight] (val x: Self) extends AnyVal {
    
    inline def setLight(value: Any): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Vec3): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Vec3): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
