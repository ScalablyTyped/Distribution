package typings.playable.withHlsMod

import typings.playable.liveStateMod.LiveState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/with-hls", "LIVE_STATES")
@js.native
object LIVE_STATES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LiveState with String] = js.native
  
  /* "live-state/ended" */ val ENDED: typings.playable.liveStateMod.LiveState.ENDED with String = js.native
  
  /* "live-state/initial" */ val INITIAL: typings.playable.liveStateMod.LiveState.INITIAL with String = js.native
  
  /* "live-state/none" */ val NONE: typings.playable.liveStateMod.LiveState.NONE with String = js.native
  
  /* "live-state/not-sync" */ val NOT_SYNC: typings.playable.liveStateMod.LiveState.NOT_SYNC with String = js.native
  
  /* "live-state/sync" */ val SYNC: typings.playable.liveStateMod.LiveState.SYNC with String = js.native
}
