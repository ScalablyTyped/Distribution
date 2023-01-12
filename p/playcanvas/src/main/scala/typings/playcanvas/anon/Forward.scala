package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forward extends StObject {
  
  var depth: Double
  
  var forward: Double
  
  var immediate: Double
  
  var instanced: Double
  
  var misc: Double
  
  var removedByInstancing: Double
  
  var shadow: Double
  
  var skinned: Double
  
  var total: Double
}
object Forward {
  
  inline def apply(
    depth: Double,
    forward: Double,
    immediate: Double,
    instanced: Double,
    misc: Double,
    removedByInstancing: Double,
    shadow: Double,
    skinned: Double,
    total: Double
  ): Forward = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], instanced = instanced.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], removedByInstancing = removedByInstancing.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], skinned = skinned.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forward]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Forward] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setForward(value: Double): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setImmediate(value: Double): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setInstanced(value: Double): Self = StObject.set(x, "instanced", value.asInstanceOf[js.Any])
    
    inline def setMisc(value: Double): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    inline def setRemovedByInstancing(value: Double): Self = StObject.set(x, "removedByInstancing", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: Double): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setSkinned(value: Double): Self = StObject.set(x, "skinned", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
