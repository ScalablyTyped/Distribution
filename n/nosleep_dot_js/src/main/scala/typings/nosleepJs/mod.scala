package typings.nosleepJs

import org.scalablytyped.runtime.Instantiable0
import typings.nosleepJs.mod.nosleep.NoSleep
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nosleep.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NoSleep
  
  object global {
    
    trait Window extends StObject {
      
      var NoSleep: Instantiable0[typings.nosleepJs.mod.nosleep.NoSleep]
    }
    object Window {
      
      inline def apply(NoSleep: Instantiable0[NoSleep]): Window = {
        val __obj = js.Dynamic.literal(NoSleep = NoSleep.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setNoSleep(value: Instantiable0[NoSleep]): Self = StObject.set(x, "NoSleep", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object nosleep {
    
    @js.native
    trait NoSleep extends StObject {
      
      def _addSourceToVideo(element: HTMLElement, `type`: String, dataURI: String): Unit = js.native
      
      def disable(): Unit = js.native
      
      def enable(): js.Promise[Any] = js.native
      
      def isEnabled: Boolean = js.native
    }
  }
}
