package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorFatalErrorMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/error/FatalError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FatalError {
    def this(args: Any*) = this()
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/error/FatalError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FatalError extends StObject {
    
    /* private */ var _name: Any
  }
  object FatalError {
    
    inline def apply(_name: Any): FatalError = {
      val __obj = js.Dynamic.literal(_name = _name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FatalError]
    }
    
    extension [Self <: FatalError](x: Self) {
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
