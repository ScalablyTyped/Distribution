package typings.openfin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilErrorsMod {
  
  @JSImport("openfin/_v2/util/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def errorToPOJO(error: Error): ErrorPlainObject = ^.asInstanceOf[js.Dynamic].applyDynamic("errorToPOJO")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorPlainObject]
  
  trait ErrorPlainObject extends StObject {
    
    var message: String
    
    var stack: String
  }
  object ErrorPlainObject {
    
    @scala.inline
    def apply(message: String, stack: String): ErrorPlainObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorPlainObject]
    }
    
    @scala.inline
    implicit class ErrorPlainObjectMutableBuilder[Self <: ErrorPlainObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
