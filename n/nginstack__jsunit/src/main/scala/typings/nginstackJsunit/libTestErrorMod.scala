package typings.nginstackJsunit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestErrorMod {
  
  inline def apply(msg: String, details: String): Unit = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/jsunit/lib/TestError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TestError {
    def this(msg: String, details: String) = this()
    
    /* private */ /* CompleteClass */
    var _details: Any = js.native
    
    /* private */ /* CompleteClass */
    var _error: Any = js.native
  }
  @JSImport("@nginstack/jsunit/lib/TestError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TestError extends StObject {
    
    /* private */ var _details: Any
    
    /* private */ var _error: Any
  }
  object TestError {
    
    inline def apply(_details: Any, _error: Any): TestError = {
      val __obj = js.Dynamic.literal(_details = _details.asInstanceOf[js.Any], _error = _error.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestError]
    }
    
    extension [Self <: TestError](x: Self) {
      
      inline def set_details(value: Any): Self = StObject.set(x, "_details", value.asInstanceOf[js.Any])
      
      inline def set_error(value: Any): Self = StObject.set(x, "_error", value.asInstanceOf[js.Any])
    }
  }
}
