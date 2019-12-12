package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.TextTrackReadyState.error
import typings.playerframework.PlayerFramework.TextTrackReadyState.loaded
import typings.playerframework.PlayerFramework.TextTrackReadyState.loading
import typings.playerframework.PlayerFramework.TextTrackReadyState.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextTrackReadyState with Double] = js.native
  /* 3 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 2 */ @js.native
  object loaded extends TopLevel[loaded with Double]
  
  /* 1 */ @js.native
  object loading extends TopLevel[loading with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

