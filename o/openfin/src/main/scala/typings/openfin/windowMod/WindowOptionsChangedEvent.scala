package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowOptionMod.WindowOption
import typings.openfin.windowOptionMod.WindowOptionDiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowOptionsChangedEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var diff: WindowOptionDiff
  
  var options: WindowOption
}
object WindowOptionsChangedEvent {
  
  inline def apply[Topic, Type](
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
  
  extension [Self <: WindowOptionsChangedEvent[?, ?], Topic, Type](x: Self & (WindowOptionsChangedEvent[Topic, Type])) {
    
    inline def setDiff(value: WindowOptionDiff): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: WindowOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
