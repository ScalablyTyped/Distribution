package typings.nightwatch.mod

import typings.nightwatch.nightwatchNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTypedCallbackResult[T]
  extends StObject
     with NightwatchCallbackResult[T] {
  
  var error: js.Error
  
  var status: `0`
  
  var value: T
}
object NightwatchTypedCallbackResult {
  
  inline def apply[T](error: js.Error, value: T): NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = 0, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTypedCallbackResult[T]]
  }
  
  extension [Self <: NightwatchTypedCallbackResult[?], T](x: Self & NightwatchTypedCallbackResult[T]) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
