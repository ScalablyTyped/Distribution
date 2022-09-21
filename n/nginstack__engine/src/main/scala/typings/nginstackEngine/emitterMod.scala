package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_parentProperty: String): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_parentProperty.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/event/Emitter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Emitter {
    def this(opt_parentProperty: String) = this()
  }
  @JSImport("@nginstack/engine/lib/event/Emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Emitter extends StObject {
    
    def addListenersFromEmitter(emitter: Emitter): Unit = js.native
    def addListenersFromEmitter(emitter: Emitter, opt_type: String): Unit = js.native
    
    def assignListeners(emitter: Emitter): Unit = js.native
    def assignListeners(emitter: Emitter, opt_type: String): Unit = js.native
    def assignListeners(emitter: Emitter, opt_type: js.Array[String]): Unit = js.native
    
    var duplicationHandling: Any = js.native
    
    def emit(event: typings.nginstackEngine.eventMod.^): Boolean = js.native
    
    def filterListeners(filterFn: js.Function1[/* arg0 */ typings.nginstackEngine.listenerMod.^, Boolean]): Unit = js.native
    def filterListeners(
      filterFn: js.Function1[/* arg0 */ typings.nginstackEngine.listenerMod.^, Boolean],
      opt_type: String
    ): Unit = js.native
    
    def hasListeners(`type`: String): Boolean = js.native
    def hasListeners(`type`: js.Array[String]): Boolean = js.native
    
    def listenerCompareFunction(arg0: js.Function1[/* repeated */ Any, Any], arg1: js.Function1[/* repeated */ Any, Any]): Boolean = js.native
    
    def listenerHandlers(`type`: String): js.Array[js.Function1[/* arg0 */ typings.nginstackEngine.eventMod.^, Any]] = js.native
    
    def listeners(): js.Array[typings.nginstackEngine.listenerMod.^] = js.native
    def listeners(opt_type: String): js.Array[typings.nginstackEngine.listenerMod.^] = js.native
    
    /* private */ var listenersByType_ : Any = js.native
    
    /* private */ var listeners_ : Any = js.native
    
    def off(`type`: String, listener: js.Function1[/* arg0 */ typings.nginstackEngine.eventMod.^, Any]): Unit = js.native
    def off(`type`: String, listener: typings.nginstackEngine.listenerMod.^): Unit = js.native
    
    def offAll(): Unit = js.native
    def offAll(opt_type: String): Unit = js.native
    
    def on(`type`: String, listener: js.Function1[/* arg0 */ typings.nginstackEngine.eventMod.^, Any]): Unit = js.native
    
    /* private */ var parentProperty_ : Any = js.native
    
    def registerEventType(`type`: String): Unit = js.native
    def registerEventType(`type`: js.Array[String]): Unit = js.native
    
    /* private */ var registeredEventTypes_ : Any = js.native
    
    def replaceListeners(
      `type`: String,
      listener: js.Function2[
          /* arg0 */ typings.nginstackEngine.eventMod.^, 
          /* arg1 */ js.Function1[/* arg0 */ typings.nginstackEngine.eventMod.^, Any], 
          Any
        ]
    ): Unit = js.native
    def replaceListeners(`type`: String, listener: typings.nginstackEngine.listenerMod.^): Unit = js.native
    
    def unregisterEventType(`type`: String): Unit = js.native
    def unregisterEventType(`type`: js.Array[String]): Unit = js.native
  }
}
