package typings.openfin.mod.fin

import typings.openfin.openfinStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowBaseEvent extends StObject {
  
  /**
    * the name of the window
    */
  var name: String = js.native
  
  /**
    * always window
    */
  var topic: window = js.native
  
  /**
    * window event type
    */
  var `type`: OpenFinWindowEventType = js.native
  
  /**
    * the UUID of the application the window belongs to
    */
  var uuid: String = js.native
}
object WindowBaseEvent {
  
  @scala.inline
  def apply(name: String, topic: window, `type`: OpenFinWindowEventType, uuid: String): WindowBaseEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBaseEvent]
  }
  
  @scala.inline
  implicit class WindowBaseEventMutableBuilder[Self <: WindowBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: window): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OpenFinWindowEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
