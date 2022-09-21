package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object surrogateListenerMod {
  
  inline def apply(
    handler: js.Function2[/* arg0 */ Event, /* arg1 */ js.Function1[/* arg0 */ Event, Any], Any],
    surrogatedListeners: js.Array[typings.nginstackEngine.listenerMod.^]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(handler.asInstanceOf[js.Any], surrogatedListeners.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/SurrogateListener", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SurrogateListener {
    def this(
      handler: js.Function2[/* arg0 */ Event, /* arg1 */ js.Function1[/* arg0 */ Event, Any], Any],
      surrogatedListeners: js.Array[typings.nginstackEngine.listenerMod.^]
    ) = this()
    
    /* CompleteClass */
    override def filterSurrogatedListeners(filterFn: js.Function1[/* arg0 */ typings.nginstackEngine.listenerMod.^, Any]): Unit = js.native
    
    /* CompleteClass */
    override def handleEvent(event: Event): Boolean = js.native
    
    /* CompleteClass */
    override def handler(arg0: Event, arg1: js.Function1[/* arg0 */ Event, Any]): Any = js.native
    
    /* CompleteClass */
    var surrogatedListeners: js.Array[typings.nginstackEngine.listenerMod.^] = js.native
  }
  @JSImport("@nginstack/engine/lib/event/SurrogateListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Event = typings.nginstackEngine.eventMod.^
  
  trait SurrogateListener extends StObject {
    
    def filterSurrogatedListeners(filterFn: js.Function1[/* arg0 */ typings.nginstackEngine.listenerMod.^, Any]): Unit
    
    def handleEvent(event: Event): Boolean
    
    def handler(arg0: Event, arg1: js.Function1[/* arg0 */ Event, Any]): Any
    
    var surrogatedListeners: js.Array[typings.nginstackEngine.listenerMod.^]
  }
  object SurrogateListener {
    
    inline def apply(
      filterSurrogatedListeners: js.Function1[/* arg0 */ typings.nginstackEngine.listenerMod.^, Any] => Unit,
      handleEvent: Event => Boolean,
      handler: (Event, js.Function1[/* arg0 */ Event, Any]) => Any,
      surrogatedListeners: js.Array[typings.nginstackEngine.listenerMod.^]
    ): SurrogateListener = {
      val __obj = js.Dynamic.literal(filterSurrogatedListeners = js.Any.fromFunction1(filterSurrogatedListeners), handleEvent = js.Any.fromFunction1(handleEvent), handler = js.Any.fromFunction2(handler), surrogatedListeners = surrogatedListeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[SurrogateListener]
    }
    
    extension [Self <: SurrogateListener](x: Self) {
      
      inline def setFilterSurrogatedListeners(value: js.Function1[/* arg0 */ typings.nginstackEngine.listenerMod.^, Any] => Unit): Self = StObject.set(x, "filterSurrogatedListeners", js.Any.fromFunction1(value))
      
      inline def setHandleEvent(value: Event => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      inline def setHandler(value: (Event, js.Function1[/* arg0 */ Event, Any]) => Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
      
      inline def setSurrogatedListeners(value: js.Array[typings.nginstackEngine.listenerMod.^]): Self = StObject.set(x, "surrogatedListeners", value.asInstanceOf[js.Any])
      
      inline def setSurrogatedListenersVarargs(value: typings.nginstackEngine.listenerMod.^ *): Self = StObject.set(x, "surrogatedListeners", js.Array(value*))
    }
  }
}
