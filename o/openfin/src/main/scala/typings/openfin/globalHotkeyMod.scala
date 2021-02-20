package typings.openfin

import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalHotkeyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'global-hotkey' extends 'window' | 'view' ? openfin.openfin/_v2/api/events/base.WindowEvent<'global-hotkey', Type> : 'global-hotkey' extends 'frame' ? openfin.openfin/_v2/api/events/frame.FrameEvent<Type> : 'global-hotkey' extends 'application' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : 'global-hotkey' extends 'external-window' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : openfin.openfin/_v2/api/events/base.BaseEvent<'global-hotkey', Type> */ @js.native
  trait GlobalHotkeyEvent[Type] extends StObject {
    
    var hotkey: String = js.native
    
    var identity: Identity = js.native
  }
  object GlobalHotkeyEvent {
    
    @scala.inline
    def apply[Type](hotkey: String, identity: Identity): GlobalHotkeyEvent[Type] = {
      val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalHotkeyEvent[Type]]
    }
    
    @scala.inline
    implicit class GlobalHotkeyEventMutableBuilder[Self <: GlobalHotkeyEvent[_], Type] (val x: Self with GlobalHotkeyEvent[Type]) extends AnyVal {
      
      @scala.inline
      def setHotkey(value: String): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalHotkeyEvents extends BaseEventMap
}
