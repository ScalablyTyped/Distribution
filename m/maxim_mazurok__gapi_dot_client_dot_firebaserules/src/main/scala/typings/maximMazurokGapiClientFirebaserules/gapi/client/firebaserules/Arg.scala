package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arg extends StObject {
  
  /** Argument matches any value provided. */
  var anyValue: js.UndefOr[Any] = js.undefined
  
  /** Argument exactly matches value provided. */
  var exactValue: js.UndefOr[Any] = js.undefined
}
object Arg {
  
  inline def apply(): Arg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arg] (val x: Self) extends AnyVal {
    
    inline def setAnyValue(value: Any): Self = StObject.set(x, "anyValue", value.asInstanceOf[js.Any])
    
    inline def setAnyValueUndefined: Self = StObject.set(x, "anyValue", js.undefined)
    
    inline def setExactValue(value: Any): Self = StObject.set(x, "exactValue", value.asInstanceOf[js.Any])
    
    inline def setExactValueUndefined: Self = StObject.set(x, "exactValue", js.undefined)
  }
}
