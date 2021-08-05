package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListValue extends StObject {
  
  /** Repeated field of dynamically typed values. */
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}
object ListValue {
  
  inline def apply(): ListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListValue]
  }
  
  extension [Self <: ListValue](x: Self) {
    
    inline def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
