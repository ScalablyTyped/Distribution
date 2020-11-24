package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`hide-on-close`
import typings.openfin.openfinStrings.closing
import typings.openfin.openfinStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowHiddenEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var reason: closing | hide | `hide-on-close` = js.native
}
object WindowHiddenEvent {
  
  @scala.inline
  def apply[Topic, Type](name: String, reason: closing | hide | `hide-on-close`, topic: Topic, `type`: Type, uuid: String): WindowHiddenEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHiddenEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowHiddenEventOps[Self <: WindowHiddenEvent[_, _], Topic, Type] (val x: Self with (WindowHiddenEvent[Topic, Type])) extends AnyVal {
    
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
    def setReason(value: closing | hide | `hide-on-close`): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
