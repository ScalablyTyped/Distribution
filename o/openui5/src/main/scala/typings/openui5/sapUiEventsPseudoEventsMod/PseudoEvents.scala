package typings.openui5.sapUiEventsPseudoEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @SINCE 1.58
  */
trait PseudoEvents extends StObject {
  
  /**
    * Ordered array of the {@link module:sap/ui/events/PseudoEvents.events}.
    *
    * Order is significant as some check methods rely on the fact that they are tested before other methods.
    * The array is processed during event analysis (when classifying browser events as pseudo events).
    */
  var order: Unit
}
object PseudoEvents {
  
  inline def apply(order: Unit): PseudoEvents = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PseudoEvents] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: Unit): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
