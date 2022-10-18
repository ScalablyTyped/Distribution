package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionArgsErrorMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/function/ArgsError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ArgsError {
    def this(args: Any*) = this()
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/function/ArgsError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/function/ArgsError", "INVALID_PARAMETER_TYPE")
  @js.native
  val INVALID_PARAMETER_TYPE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/function/ArgsError", "REQUIRED_PARAMETER")
  @js.native
  val REQUIRED_PARAMETER: Double = js.native
  
  trait ArgsError extends StObject {
    
    /* private */ var _name: Any
  }
  object ArgsError {
    
    inline def apply(_name: Any): ArgsError = {
      val __obj = js.Dynamic.literal(_name = _name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsError]
    }
    
    extension [Self <: ArgsError](x: Self) {
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
