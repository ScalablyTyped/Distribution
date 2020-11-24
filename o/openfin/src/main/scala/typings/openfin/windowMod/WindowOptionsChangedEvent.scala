package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowOptionMod.WindowOption
import typings.openfin.windowOptionMod.WindowOptionDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOptionsChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var diff: WindowOptionDiff = js.native
  
  var options: WindowOption = js.native
}
object WindowOptionsChangedEvent {
  
  @scala.inline
  def apply[Topic, Type](
    diff: WindowOptionDiff,
    name: String,
    options: WindowOption,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowOptionsChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptionsChangedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowOptionsChangedEventOps[Self <: WindowOptionsChangedEvent[_, _], Topic, Type] (val x: Self with (WindowOptionsChangedEvent[Topic, Type])) extends AnyVal {
    
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
    def setDiff(value: WindowOptionDiff): Self = this.set("diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: WindowOption): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
