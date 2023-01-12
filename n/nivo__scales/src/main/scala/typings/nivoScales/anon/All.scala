package typings.nivoScales.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  var all: js.Array[Any]
  
  var max: Any
  
  var min: Any
}
object All {
  
  inline def apply(all: js.Array[Any], max: Any, min: Any): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
    
    inline def setAll(value: js.Array[Any]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllVarargs(value: Any*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setMax(value: Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
