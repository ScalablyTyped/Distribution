package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGyroscopeChangeCallbackResult extends StObject {
  
  var res: Result
}
object OnGyroscopeChangeCallbackResult {
  
  inline def apply(res: Result): OnGyroscopeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGyroscopeChangeCallbackResult]
  }
  
  extension [Self <: OnGyroscopeChangeCallbackResult](x: Self) {
    
    inline def setRes(value: Result): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
