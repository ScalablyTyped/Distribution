package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventEventTypeErrorMod {
  
  inline def apply(error: String, solution: String, details: String, code: String): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(error: String, solution: String, details: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], solution.asInstanceOf[js.Any], details.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/EventTypeError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EventTypeError {
    def this(error: String, solution: String, details: String, code: String) = this()
    def this(error: String, solution: String, details: String, code: Double) = this()
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/event/EventTypeError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EventTypeError extends StObject {
    
    /* private */ var _name: Any
  }
  object EventTypeError {
    
    inline def apply(_name: Any): EventTypeError = {
      val __obj = js.Dynamic.literal(_name = _name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTypeError]
    }
    
    extension [Self <: EventTypeError](x: Self) {
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
