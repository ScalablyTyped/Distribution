package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowOptionMod.WindowOption
import typings.openfin.windowOptionMod.WindowOptionDiff
import org.scalablytyped.runtime.StObject
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
  implicit class WindowOptionsChangedEventMutableBuilder[Self <: WindowOptionsChangedEvent[_, _], Topic, Type] (val x: Self with (WindowOptionsChangedEvent[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setDiff(value: WindowOptionDiff): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: WindowOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
