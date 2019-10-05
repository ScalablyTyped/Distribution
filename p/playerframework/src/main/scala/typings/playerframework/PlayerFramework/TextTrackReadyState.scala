package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextTrackReadyState extends js.Object

@JSGlobal("PlayerFramework.TextTrackReadyState")
@js.native
object TextTrackReadyState extends js.Object {
  /**
  		* The track failed to load.
  		*/
  @js.native
  sealed trait error extends TextTrackReadyState
  
  /**
  		* The track is loaded.
  		*/
  @js.native
  sealed trait loaded extends TextTrackReadyState
  
  /**
  		* The track is currently loading.
  		*/
  @js.native
  sealed trait loading extends TextTrackReadyState
  
  /**
  		* The track is unloaded.
  		*/
  @js.native
  sealed trait none extends TextTrackReadyState
  
  /* 3 */ val error: typings.playerframework.PlayerFramework.TextTrackReadyState.error with Double = js.native
  /* 2 */ val loaded: typings.playerframework.PlayerFramework.TextTrackReadyState.loaded with Double = js.native
  /* 1 */ val loading: typings.playerframework.PlayerFramework.TextTrackReadyState.loading with Double = js.native
  /* 0 */ val none: typings.playerframework.PlayerFramework.TextTrackReadyState.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextTrackReadyState with Double] = js.native
}

