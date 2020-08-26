package typings.openfin.globalHotkeyMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'global-hotkey' extends 'window' | 'view' ? openfin.openfin/_v2/api/events/base.WindowEvent<'global-hotkey', Type> : 'global-hotkey' extends 'frame' ? openfin.openfin/_v2/api/events/frame.FrameEvent<Type> : 'global-hotkey' extends 'application' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : 'global-hotkey' extends 'external-window' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : openfin.openfin/_v2/api/events/base.BaseEvent<'global-hotkey', Type> */ @js.native
trait GlobalHotkeyEvent[Type] extends js.Object {
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
  implicit class GlobalHotkeyEventOps[Self <: GlobalHotkeyEvent[_], Type] (val x: Self with GlobalHotkeyEvent[Type]) extends AnyVal {
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
    def setHotkey(value: String): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
  }
  
}

