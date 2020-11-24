package typings.openfin.systemMod

import typings.openfin.eventsBaseMod.BaseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdleEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  
  var elapsedTime: Double = js.native
  
  var isIdle: Boolean = js.native
}
object IdleEvent {
  
  @scala.inline
  def apply[Topic, Type](elapsedTime: Double, isIdle: Boolean, topic: Topic, `type`: Type): IdleEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class IdleEventOps[Self <: IdleEvent[_, _], Topic, Type] (val x: Self with (IdleEvent[Topic, Type])) extends AnyVal {
    
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
  }
}
