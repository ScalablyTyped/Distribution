package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`idle-state-changed`
import typings.openfin.openfinStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdleStateChangedEvent extends StObject {
  
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
  implicit class IdleStateChangedEventMutableBuilder[Self <: IdleStateChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdle(value: Boolean): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `idle-state-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
