package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags extends StObject {
  
  var color: js.Array[Double]
  
  var depth: Double
  
  var flags: Double
  
  var stencil: Double
}
object Flags {
  
  inline def apply(color: js.Array[Double], depth: Double, flags: Double, stencil: Double): Flags = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  extension [Self <: Flags](x: Self) {
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setStencil(value: Double): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
  }
}
