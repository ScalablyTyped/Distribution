package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactError extends StObject {
  
  var reactError: Null
}
object ReactError {
  
  inline def apply(reactError: Null): ReactError = {
    val __obj = js.Dynamic.literal(reactError = reactError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactError]
  }
  
  extension [Self <: ReactError](x: Self) {
    
    inline def setReactError(value: Null): Self = StObject.set(x, "reactError", value.asInstanceOf[js.Any])
  }
}
