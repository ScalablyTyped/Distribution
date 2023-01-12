package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueCount extends StObject {
  
  /** The amount of times that expression returned. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** The return value of the expression */
  var value: js.UndefOr[Any] = js.undefined
}
object ValueCount {
  
  inline def apply(): ValueCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueCount] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
