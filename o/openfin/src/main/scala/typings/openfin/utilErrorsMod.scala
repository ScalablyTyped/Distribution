package typings.openfin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilErrorsMod {
  
  @JSImport("openfin/_v2/util/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorToPOJO(error: Error): ErrorPlainObject = ^.asInstanceOf[js.Dynamic].applyDynamic("errorToPOJO")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorPlainObject]
  
  trait ErrorPlainObject extends StObject {
    
    var message: String
    
    var stack: String
  }
  object ErrorPlainObject {
    
    inline def apply(message: String, stack: String): ErrorPlainObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorPlainObject]
    }
    
    extension [Self <: ErrorPlainObject](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
