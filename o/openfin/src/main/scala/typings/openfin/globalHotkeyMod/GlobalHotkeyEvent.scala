package typings.openfin.globalHotkeyMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'global-hotkey' extends 'window' | 'view' ? openfin.openfin/_v2/api/events/base.WindowEvent<'global-hotkey', Type> : 'global-hotkey' extends 'frame' ? openfin.openfin/_v2/api/events/frame.FrameEvent<Type> : 'global-hotkey' extends 'application' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : 'global-hotkey' extends 'external-window' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : openfin.openfin/_v2/api/events/base.BaseEvent<'global-hotkey', Type> */ trait GlobalHotkeyEvent[Type] extends js.Object {
  var hotkey: String
  var identity: Identity
}

object GlobalHotkeyEvent {
  @scala.inline
  def apply[Type](hotkey: String, identity: Identity): GlobalHotkeyEvent[Type] = {
    val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalHotkeyEvent[Type]]
  }
}

