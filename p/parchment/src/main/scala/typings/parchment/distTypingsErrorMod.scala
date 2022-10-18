package typings.parchment

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsErrorMod {
  
  @JSImport("parchment/dist/typings/error", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ParchmentError {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_ParchmentError: String = js.native
  }
  
  trait ParchmentError
    extends StObject
       with Error {
    
    @JSName("stack")
    var stack_ParchmentError: String
  }
  object ParchmentError {
    
    inline def apply(message: String, name: String, stack: String): ParchmentError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParchmentError]
    }
    
    extension [Self <: ParchmentError](x: Self) {
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
