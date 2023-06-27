package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actual extends StObject {
  
  var actual: int
  
  var total: int
}
object Actual {
  
  inline def apply(actual: int, total: int): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
    
    inline def setActual(value: int): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: int): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
