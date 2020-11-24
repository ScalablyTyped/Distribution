package typings.openfin.mod.fin

import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowBaseEvent extends js.Object {
  
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
  implicit class WindowBaseEventOps[Self <: WindowBaseEvent] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: window): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OpenFinWindowEventType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
