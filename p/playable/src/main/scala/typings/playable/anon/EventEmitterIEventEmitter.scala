package typings.playable.anon

import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventEmitterIEventEmitter] (val x: Self) extends AnyVal {
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}
