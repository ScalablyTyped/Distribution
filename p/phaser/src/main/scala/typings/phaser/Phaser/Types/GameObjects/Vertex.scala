package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vertex extends StObject {
  
  /**
    * The alpha value of the vertex.
    */
  var alpha: Double
  
  /**
    * The x normal of the vertex.
    */
  var normalX: Double
  
  /**
    * The y normal of the vertex.
    */
  var normalY: Double
  
  /**
    * The z normal of the vertex.
    */
  var normalZ: Double
  
  /**
    * UV u texture coordinate of the vertex.
    */
  var u: Double
  
  /**
    * UV v texture coordinate of the vertex.
    */
  var v: Double
  
  /**
    * The x coordinate of the vertex.
    */
  var x: Double
  
  /**
    * The y coordinate of the vertex.
    */
  var y: Double
  
  /**
    * The z coordinate of the vertex.
    */
  var z: Double
}
object Vertex {
  
  inline def apply(
    alpha: Double,
    normalX: Double,
    normalY: Double,
    normalZ: Double,
    u: Double,
    v: Double,
    x: Double,
    y: Double,
    z: Double
  ): Vertex = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], normalX = normalX.asInstanceOf[js.Any], normalY = normalY.asInstanceOf[js.Any], normalZ = normalZ.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
  
  extension [Self <: Vertex](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setNormalX(value: Double): Self = StObject.set(x, "normalX", value.asInstanceOf[js.Any])
    
    inline def setNormalY(value: Double): Self = StObject.set(x, "normalY", value.asInstanceOf[js.Any])
    
    inline def setNormalZ(value: Double): Self = StObject.set(x, "normalZ", value.asInstanceOf[js.Any])
    
    inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
