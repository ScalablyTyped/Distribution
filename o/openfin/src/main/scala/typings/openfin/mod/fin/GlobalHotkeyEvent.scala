package typings.openfin.mod.fin

import typings.openfin.anon.EntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalHotkeyEvent extends StObject {
  
  var hotkey: String = js.native
  
  /**
    * The Identity that has just registered the hotkey
    */
  var identity: EntityType = js.native
  
  var topic: String = js.native
  
  var `type`: OpenFinGlobalHotkeyEventType = js.native
}
object GlobalHotkeyEvent {
  
  @scala.inline
  def apply(hotkey: String, identity: EntityType, topic: String, `type`: OpenFinGlobalHotkeyEventType): GlobalHotkeyEvent = {
    val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHotkeyEvent]
  }
  
  @scala.inline
  implicit class GlobalHotkeyEventMutableBuilder[Self <: GlobalHotkeyEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHotkey(value: String): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: EntityType): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OpenFinGlobalHotkeyEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
