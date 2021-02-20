package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with config options for interactions.
  */
@js.native
trait InteractionOptions extends StObject {
  
  def handleEvent(event: MapBrowserEvent): Boolean = js.native
}
object InteractionOptions {
  
  @scala.inline
  def apply(handleEvent: MapBrowserEvent => Boolean): InteractionOptions = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[InteractionOptions]
  }
  
  @scala.inline
  implicit class InteractionOptionsMutableBuilder[Self <: InteractionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleEvent(value: MapBrowserEvent => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
