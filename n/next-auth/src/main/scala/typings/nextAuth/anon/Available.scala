package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Available extends StObject {
  
  var available: Double
  
  var total: Double
}
object Available {
  
  inline def apply(available: Double, total: Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  
  extension [Self <: Available](x: Self) {
    
    inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
