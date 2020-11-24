package typings.playable.uiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UIEvent extends js.Object
@JSImport("playable/dist/src/constants/events/ui", "UIEvent")
@js.native
object UIEvent extends js.Object {
  
  @js.native
  sealed trait CONTROL_DRAG_END extends UIEvent
  
  @js.native
  sealed trait CONTROL_DRAG_START extends UIEvent
  
  @js.native
  sealed trait DECREASE_VOLUME_WITH_KEYBOARD extends UIEvent
  
  @js.native
  sealed trait ENTER_FULL_SCREEN_CLICK extends UIEvent
  
  @js.native
  sealed trait ENTER_FULL_SCREEN_WITH_SCREEN_CLICK extends UIEvent
  
  @js.native
  sealed trait ENTER_PICTURE_IN_PICTURE_CLICK extends UIEvent
  
  @js.native
  sealed trait EXIT_FULL_SCREEN_CLICK extends UIEvent
  
  @js.native
  sealed trait EXIT_FULL_SCREEN_WITH_SCREEN_CLICK extends UIEvent
  
  @js.native
  sealed trait EXIT_PICTURE_IN_PICTURE_CLICK extends UIEvent
  
  @js.native
  sealed trait FOCUS_ENTER_ON_PLAYER extends UIEvent
  
  @js.native
  sealed trait FOCUS_LEAVE_ON_PLAYER extends UIEvent
  
  @js.native
  sealed trait FULL_SCREEN_STATE_CHANGED extends UIEvent
  
  @js.native
  sealed trait GO_BACKWARD_WITH_KEYBOARD extends UIEvent
  
  @js.native
  sealed trait GO_FORWARD_WITH_KEYBOARD extends UIEvent
  
  @js.native
  sealed trait HIDE_INTERACTION_INDICATOR extends UIEvent
  
  @js.native
  sealed trait INCREASE_VOLUME_WITH_KEYBOARD extends UIEvent
  
  @js.native
  sealed trait KEYBOARD_KEYDOWN_INTERCEPTED extends UIEvent
  
  @js.native
  sealed trait LOADER_HIDE extends UIEvent
  
  @js.native
  sealed trait LOADER_SHOW extends UIEvent
  
  @js.native
  sealed trait LOADING_COVER_HIDE extends UIEvent
  
  @js.native
  sealed trait LOADING_COVER_SHOW extends UIEvent
  
  @js.native
  sealed trait MAIN_BLOCK_HIDE extends UIEvent
  
  @js.native
  sealed trait MAIN_BLOCK_SHOW extends UIEvent
  
  @js.native
  sealed trait MOUSE_ENTER_ON_PLAYER extends UIEvent
  
  @js.native
  sealed trait MOUSE_LEAVE_ON_PLAYER extends UIEvent
  
  @js.native
  sealed trait MOUSE_MOVE_ON_PLAYER extends UIEvent
  
  @js.native
  sealed trait MUTE_CLICK extends UIEvent
  
  @js.native
  sealed trait MUTE_WITH_KEYBOARD extends UIEvent
  
  @js.native
  sealed trait PAUSE_CLICK extends UIEvent
  
  @js.native
  sealed trait PAUSE_WITH_SCREEN_CLICK extends UIEvent
  
  @js.native
  sealed trait PICTURE_IN_PICTURE_STATUS_CHANGE extends UIEvent
  
  @js.native
  sealed trait PLAY_CLICK extends UIEvent
  
  @js.native
  sealed trait PLAY_OVERLAY_CLICK extends UIEvent
  
  @js.native
  sealed trait PLAY_WITH_SCREEN_CLICK extends UIEvent
  
  @js.native
  sealed trait PROGRESS_CHANGE extends UIEvent
  
  @js.native
  sealed trait PROGRESS_DRAG_ENDED extends UIEvent
  
  @js.native
  sealed trait PROGRESS_DRAG_STARTED extends UIEvent
  
  @js.native
  sealed trait PROGRESS_SYNC_BUTTON_MOUSE_ENTER extends UIEvent
  
  @js.native
  sealed trait PROGRESS_SYNC_BUTTON_MOUSE_LEAVE extends UIEvent
  
  @js.native
  sealed trait PROGRESS_USER_PREVIEWING_FRAME extends UIEvent
  
  @js.native
  sealed trait RESIZE extends UIEvent
  
  @js.native
  sealed trait TOGGLE_PLAYBACK_WITH_KEYBOARD extends UIEvent
  
  @js.native
  sealed trait UNMUTE_CLICK extends UIEvent
  
  @js.native
  sealed trait UNMUTE_WITH_KEYBOARD extends UIEvent
  
  @js.native
  sealed trait VOLUME_CHANGE extends UIEvent
}
