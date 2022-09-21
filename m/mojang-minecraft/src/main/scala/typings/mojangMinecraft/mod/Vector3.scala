package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vector3 extends StObject {
  
  /**
    * X component of this vector.
    */
  var x: Double
  
  /**
    * Y component of this vector.
    */
  var y: Double
  
  /**
    * Z component of this vector.
    */
  var z: Double
}
object Vector3 {
  
  inline def apply(x: Double, y: Double, z: Double): Vector3 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector3]
  }
  
  extension [Self <: Vector3](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
