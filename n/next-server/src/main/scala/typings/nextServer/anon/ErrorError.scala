package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorError extends StObject {
  
  var error: typings.std.Error
}
object ErrorError {
  
  inline def apply(error: typings.std.Error): ErrorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorError]
  }
  
  extension [Self <: ErrorError](x: Self) {
    
    inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
