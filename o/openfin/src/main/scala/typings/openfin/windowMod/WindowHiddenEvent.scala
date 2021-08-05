package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`hide-on-close`
import typings.openfin.openfinStrings.closing
import typings.openfin.openfinStrings.hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowHiddenEvent[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var reason: closing | hide | `hide-on-close`
}
object WindowHiddenEvent {
  
  inline def apply[Topic, Type](name: String, reason: closing | hide | `hide-on-close`, topic: Topic, `type`: Type, uuid: String): WindowHiddenEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHiddenEvent[Topic, Type]]
  }
  
  extension [Self <: WindowHiddenEvent[?, ?], Topic, Type](x: Self & (WindowHiddenEvent[Topic, Type])) {
    
    inline def setReason(value: closing | hide | `hide-on-close`): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
