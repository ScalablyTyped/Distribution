package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventListenerMod {
  
  inline def apply(handler: js.Function1[/* arg0 */ Event, Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/Listener", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Listener {
    def this(handler: js.Function1[/* arg0 */ Event, Any]) = this()
    
    /* CompleteClass */
    override def handleEvent(evt: Any): Boolean = js.native
    
    /* CompleteClass */
    override def handler(arg0: Event): Any = js.native
  }
  @JSImport("@nginstack/engine/lib/event/Listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  trait Listener extends StObject {
    
    def handleEvent(evt: Any): Boolean
    
    def handler(arg0: Event): Any
  }
  object Listener {
    
    inline def apply(handleEvent: Any => Boolean, handler: Event => Any): Listener = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent), handler = js.Any.fromFunction1(handler))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      inline def setHandleEvent(value: Any => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      inline def setHandler(value: Event => Any): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    }
  }
}
