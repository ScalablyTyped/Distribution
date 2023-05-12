package typings.node.vmMod

import typings.node.anon.JsMemoryEstimate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryMeasurement extends StObject {
  
  var total: JsMemoryEstimate
}
object MemoryMeasurement {
  
  inline def apply(total: JsMemoryEstimate): MemoryMeasurement = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryMeasurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryMeasurement] (val x: Self) extends AnyVal {
    
    inline def setTotal(value: JsMemoryEstimate): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
