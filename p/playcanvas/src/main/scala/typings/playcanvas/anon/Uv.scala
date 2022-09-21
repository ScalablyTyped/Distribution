package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uv extends StObject {
  
  var uv: Double
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object Uv {
  
  inline def apply(uv: Double, x: Double, y: Double, z: Double): Uv = {
    val __obj = js.Dynamic.literal(uv = uv.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uv]
  }
  
  extension [Self <: Uv](x: Self) {
    
    inline def setUv(value: Double): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
