package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: js.Error
  
  def reset(): Unit
}
object Error {
  
  inline def apply(error: js.Error, reset: () => Unit): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
