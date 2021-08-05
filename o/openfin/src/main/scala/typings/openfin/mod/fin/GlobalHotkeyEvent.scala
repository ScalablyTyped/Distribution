package typings.openfin.mod.fin

import typings.openfin.anon.EntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalHotkeyEvent extends StObject {
  
  var hotkey: String
  
  /**
    * The Identity that has just registered the hotkey
    */
  var identity: EntityType
  
  var topic: String
  
  var `type`: OpenFinGlobalHotkeyEventType
}
object GlobalHotkeyEvent {
  
  inline def apply(hotkey: String, identity: EntityType, topic: String, `type`: OpenFinGlobalHotkeyEventType): GlobalHotkeyEvent = {
    val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHotkeyEvent]
  }
  
  extension [Self <: GlobalHotkeyEvent](x: Self) {
    
    inline def setHotkey(value: String): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: EntityType): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpenFinGlobalHotkeyEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
