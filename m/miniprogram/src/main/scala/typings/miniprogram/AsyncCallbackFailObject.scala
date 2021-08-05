package typings.miniprogram

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncCallbackFailObject
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var error: Double
  
  var errorMessage: js.UndefOr[String] = js.undefined
}
object AsyncCallbackFailObject {
  
  inline def apply(error: Double): AsyncCallbackFailObject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncCallbackFailObject]
  }
  
  extension [Self <: AsyncCallbackFailObject](x: Self) {
    
    inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
