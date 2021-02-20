package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitterIEventEmitter extends StObject {
  
  var eventEmitter: IEventEmitter = js.native
}
object EventEmitterIEventEmitter {
  
  @scala.inline
  def apply(eventEmitter: IEventEmitter): EventEmitterIEventEmitter = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterIEventEmitter]
  }
  
  @scala.inline
  implicit class EventEmitterIEventEmitterMutableBuilder[Self <: EventEmitterIEventEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
  }
}
