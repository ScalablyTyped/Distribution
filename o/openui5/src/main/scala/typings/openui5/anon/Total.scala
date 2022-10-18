package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Total extends StObject {
  
  var actual: int
  
  var total: int
}
object Total {
  
  inline def apply(actual: int, total: int): Total = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total]
  }
  
  extension [Self <: Total](x: Self) {
    
    inline def setActual(value: int): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: int): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
