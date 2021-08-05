package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEmitterIEventEmitter extends StObject {
  
  var eventEmitter: IEventEmitter
}
object EventEmitterIEventEmitter {
  
  inline def apply(eventEmitter: IEventEmitter): EventEmitterIEventEmitter = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterIEventEmitter]
  }
  
  extension [Self <: EventEmitterIEventEmitter](x: Self) {
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}
