package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gravity extends StObject {
  
  var gravity: js.Array[Double]
}
object Gravity {
  
  inline def apply(gravity: js.Array[Double]): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
  
  extension [Self <: Gravity](x: Self) {
    
    inline def setGravity(value: js.Array[Double]): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityVarargs(value: Double*): Self = StObject.set(x, "gravity", js.Array(value :_*))
  }
}
