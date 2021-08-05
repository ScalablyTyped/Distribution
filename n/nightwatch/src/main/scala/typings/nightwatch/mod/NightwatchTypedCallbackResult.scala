package typings.nightwatch.mod

import typings.nightwatch.nightwatchNumbers.`0`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTypedCallbackResult[T]
  extends StObject
     with NightwatchCallbackResult[T] {
  
  var state: Error | String
  
  var status: `0`
  
  var value: T
}
object NightwatchTypedCallbackResult {
  
  inline def apply[T](state: Error | String, value: T): NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = 0, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTypedCallbackResult[T]]
  }
  
  extension [Self <: NightwatchTypedCallbackResult[?], T](x: Self & NightwatchTypedCallbackResult[T]) {
    
    inline def setState(value: Error | String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
