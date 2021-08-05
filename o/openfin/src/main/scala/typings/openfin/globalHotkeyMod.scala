package typings.openfin

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalHotkeyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'global-hotkey' extends 'window' | 'view' ? openfin.openfin/_v2/api/events/base.WindowEvent<'global-hotkey', Type> : 'global-hotkey' extends 'frame' ? openfin.openfin/_v2/api/events/frame.FrameEvent<Type> : 'global-hotkey' extends 'application' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : 'global-hotkey' extends 'external-window' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : openfin.openfin/_v2/api/events/base.BaseEvent<'global-hotkey', Type> */ trait GlobalHotkeyEvent[Type] extends StObject {
    
    var hotkey: String
    
    var identity: Identity
  }
  object GlobalHotkeyEvent {
    
    inline def apply[Type](hotkey: String, identity: Identity): GlobalHotkeyEvent[Type] = {
      val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalHotkeyEvent[Type]]
    }
    
    extension [Self <: GlobalHotkeyEvent[?], Type](x: Self & GlobalHotkeyEvent[Type]) {
      
      inline def setHotkey(value: String): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalHotkeyEvents
    extends StObject
       with BaseEventMap
}
