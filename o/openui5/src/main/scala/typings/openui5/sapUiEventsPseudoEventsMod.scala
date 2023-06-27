package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.ATypes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiEventsPseudoEventsMod extends Shortcut {
  
  @JSImport("sap/ui/events/PseudoEvents", JSImport.Default)
  @js.native
  val default: PseudoEvents = js.native
  
  /**
    * @since 1.58
    */
  trait PseudoEvents extends StObject {
    
    /**
      * Map of all so called "pseudo events", a useful classification of standard browser events as implied by
      * SAP product standards.
      *
      * This map is intended to be used internally in UI5 framework and UI5 Controls.
      *
      * Whenever a browser event is recognized as one or more pseudo events, then this classification is attached
      * to the original {@link jQuery.Event} object and thereby delivered to any jQuery-style listeners registered
      * for that browser event.
      *
      * Pure JavaScript listeners can evaluate the classification information using the {@link jQuery.Event.prototype.isPseudoType }
      * method.
      *
      * Instead of using the procedure as described above, the SAPUI5 controls and elements should simply implement
      * an `onpseudo-event(oEvent)` method. It will be invoked only when that specific pseudo event has
      * been recognized. This simplifies event dispatching even further.
      */
    var events: Record[String, ATypes]
    
    /**
      * Ordered array of the {@link module:sap/ui/events/PseudoEvents.events}.
      *
      * Order is significant as some check methods rely on the fact that they are tested before other methods.
      * The array is processed during event analysis (when classifying browser events as pseudo events).
      */
    var order: Unit
  }
  object PseudoEvents {
    
    inline def apply(events: Record[String, ATypes], order: Unit): PseudoEvents = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[PseudoEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PseudoEvents] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: Record[String, ATypes]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Unit): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = PseudoEvents
  
  /* This means you don't have to write `default`, but can instead just say `sapUiEventsPseudoEventsMod.foo` */
  override def _to: PseudoEvents = default
}
