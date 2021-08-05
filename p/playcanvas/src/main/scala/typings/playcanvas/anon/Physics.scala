package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Physics extends StObject {
  
  var physics: Gravity
  
  var render: Exposure
}
object Physics {
  
  inline def apply(physics: Gravity, render: Exposure): Physics = {
    val __obj = js.Dynamic.literal(physics = physics.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Physics]
  }
  
  extension [Self <: Physics](x: Self) {
    
    inline def setPhysics(value: Gravity): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Exposure): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
