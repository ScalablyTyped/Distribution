package typings.playable.anon

import typings.playable.eventEmitterTypesMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitterIEventEmitter extends js.Object {
  
  var eventEmitter: IEventEmitter = js.native
}
object EventEmitterIEventEmitter {
  
  @scala.inline
  def apply(eventEmitter: IEventEmitter): EventEmitterIEventEmitter = {
    val __obj = js.Dynamic.literal(eventEmitter = eventEmitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitterIEventEmitter]
  }
  
  @scala.inline
  implicit class EventEmitterIEventEmitterOps[Self <: EventEmitterIEventEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventEmitter(value: IEventEmitter): Self = this.set("eventEmitter", value.asInstanceOf[js.Any])
  }
}
