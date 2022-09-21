package typings.openfin

import typings.openfin.emitterMapMod.EmitterMap
import typings.openfin.transportMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventAggregatorMod {
  
  @JSImport("openfin/_v2/api/events/eventAggregator", "EventAggregator")
  @js.native
  open class EventAggregator () extends EmitterMap {
    
    def dispatchEvent(message: Message[Any]): Boolean = js.native
  }
}
