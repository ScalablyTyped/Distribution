package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for interactions.
  */
trait InteractionOptions extends StObject {
  
  def handleEvent(event: MapBrowserEvent): Boolean
}
object InteractionOptions {
  
  inline def apply(handleEvent: MapBrowserEvent => Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[InteractionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionOptions] (val x: Self) extends AnyVal {
    
    inline def setHandleEvent(value: MapBrowserEvent => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
