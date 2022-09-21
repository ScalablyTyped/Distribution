package typings.ol

import typings.ol.eventsMod.Listener
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetMod {
  
  @JSImport("ol/events/Target", JSImport.Default)
  @js.native
  open class default () extends Target {
    def this(opt_target: Any) = this()
  }
  
  type EventTargetLike = EventTarget | Target
  
  @js.native
  trait Target
    extends typings.ol.disposableMod.default {
    
    def addEventListener(`type`: String, listener: Listener): Unit = js.native
    
    def dispatchEvent(event: String): js.UndefOr[Boolean] = js.native
    /**
      * Dispatches an event and calls all listeners listening for events
      * of this type. The event parameter can either be a string or an
      * Object with a type property.
      */
    def dispatchEvent(event: typings.ol.eventMod.default): js.UndefOr[Boolean] = js.native
    
    /**
      * Get the listeners for a specified event type. Listeners are returned in the
      * order that they will be called in.
      */
    def getListeners(`type`: String): js.UndefOr[js.Array[Listener]] = js.native
    
    def hasListener(): Boolean = js.native
    def hasListener(opt_type: String): Boolean = js.native
    
    def removeEventListener(`type`: String, listener: Listener): Unit = js.native
  }
}
