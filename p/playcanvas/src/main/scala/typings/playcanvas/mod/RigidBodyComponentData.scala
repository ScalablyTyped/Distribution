package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RigidBodyComponentData extends StObject {
  
  var enabled: Boolean
}
object RigidBodyComponentData {
  
  inline def apply(enabled: Boolean): RigidBodyComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RigidBodyComponentData]
  }
  
  extension [Self <: RigidBodyComponentData](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
