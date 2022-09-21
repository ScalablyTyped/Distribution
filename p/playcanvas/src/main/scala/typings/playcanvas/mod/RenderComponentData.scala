package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderComponentData extends StObject {
  
  var enabled: Boolean
  
  var rootBone: Any
}
object RenderComponentData {
  
  inline def apply(enabled: Boolean, rootBone: Any): RenderComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], rootBone = rootBone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderComponentData]
  }
  
  extension [Self <: RenderComponentData](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setRootBone(value: Any): Self = StObject.set(x, "rootBone", value.asInstanceOf[js.Any])
  }
}
