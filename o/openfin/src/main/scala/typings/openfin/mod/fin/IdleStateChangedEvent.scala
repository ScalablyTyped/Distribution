package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`idle-state-changed`
import typings.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdleStateChangedEvent extends js.Object {
  
  /**
    * How long in milliseconds since the user has been idle.
    */
  var elapsedTime: Double = js.native
  
  /**
    * true when the user is idle,false when the user has returned;
    */
  var isIdle: Boolean = js.native
  
  var topic: system = js.native
  
  var `type`: `idle-state-changed` = js.native
}
object IdleStateChangedEvent {
  
  @scala.inline
  def apply(elapsedTime: Double, isIdle: Boolean, topic: system, `type`: `idle-state-changed`): IdleStateChangedEvent = {
    val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleStateChangedEvent]
  }
  
  @scala.inline
  implicit class IdleStateChangedEventOps[Self <: IdleStateChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setElapsedTime(value: Double): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdle(value: Boolean): Self = this.set("isIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: system): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `idle-state-changed`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
