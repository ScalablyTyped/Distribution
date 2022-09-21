package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  /** The result is undefined, meaning the result could not be computed. */
  var undefined: js.UndefOr[Any] = js.undefined
  
  /** The result is an actual value. The type of the value must match that of the type declared by the service. */
  var value: js.UndefOr[Any] = js.undefined
}
object Result {
  
  inline def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setUndefined(value: Any): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
