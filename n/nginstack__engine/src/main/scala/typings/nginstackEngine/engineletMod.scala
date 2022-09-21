package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineletMod {
  
  inline def apply(engineletClassName: String): Unit = ^.asInstanceOf[js.Dynamic].apply(engineletClassName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/java/Enginelet", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Enginelet {
    def this(engineletClassName: String) = this()
    
    /* CompleteClass */
    override def handleCommand(commandName: String, param1: String, param2: String, paramN: String): String = js.native
  }
  @JSImport("@nginstack/engine/lib/java/Enginelet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Enginelet extends StObject {
    
    def handleCommand(commandName: String, param1: String, param2: String, paramN: String): String
  }
  object Enginelet {
    
    inline def apply(handleCommand: (String, String, String, String) => String): Enginelet = {
      val __obj = js.Dynamic.literal(handleCommand = js.Any.fromFunction4(handleCommand))
      __obj.asInstanceOf[Enginelet]
    }
    
    extension [Self <: Enginelet](x: Self) {
      
      inline def setHandleCommand(value: (String, String, String, String) => String): Self = StObject.set(x, "handleCommand", js.Any.fromFunction4(value))
    }
  }
}
