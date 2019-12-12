package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.PlayerState.ended
import typings.playerframework.PlayerFramework.PlayerState.ending
import typings.playerframework.PlayerFramework.PlayerState.failed
import typings.playerframework.PlayerFramework.PlayerState.loaded
import typings.playerframework.PlayerFramework.PlayerState.loading
import typings.playerframework.PlayerFramework.PlayerState.opened
import typings.playerframework.PlayerFramework.PlayerState.pending
import typings.playerframework.PlayerFramework.PlayerState.started
import typings.playerframework.PlayerFramework.PlayerState.starting
import typings.playerframework.PlayerFramework.PlayerState.unloaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayerState extends js.Object

@JSGlobal("PlayerFramework.PlayerState")
@js.native
object PlayerState extends js.Object {
  /**
  		* The media has ended.
  		**/
  @js.native
  sealed trait ended extends PlayerState
  
  /**
  		* The media has finished, but the player is still executing ending operations.
  		**/
  @js.native
  sealed trait ending extends PlayerState
  
  /**
  		* The media has failed and the player must be reloaded.
  		**/
  @js.native
  sealed trait failed extends PlayerState
  
  /**
  		* The media has finished loading, but has not been opened yet.
  		**/
  @js.native
  sealed trait loaded extends PlayerState
  
  /**
  		* The media source is set, but the player is still executing loading operations.
  		**/
  @js.native
  sealed trait loading extends PlayerState
  
  /**
  		* The media can be played.
  		**/
  @js.native
  sealed trait opened extends PlayerState
  
  /**
  		* The media source is set and the player is waiting to load the media (e.g. autoload is false).
  		**/
  @js.native
  sealed trait pending extends PlayerState
  
  /**
  		* The media has been started and the player is either playing or paused.
  		**/
  @js.native
  sealed trait started extends PlayerState
  
  /**
  		* The media has been told to start playing, but the player is still executing starting operations.
  		**/
  @js.native
  sealed trait starting extends PlayerState
  
  /**
  		* The player is unloaded and no media source is set.
  		**/
  @js.native
  sealed trait unloaded extends PlayerState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayerState with Double] = js.native
  /* 8 */ @js.native
  object ended extends TopLevel[ended with Double]
  
  /* 7 */ @js.native
  object ending extends TopLevel[ending with Double]
  
  /* 9 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 3 */ @js.native
  object loaded extends TopLevel[loaded with Double]
  
  /* 2 */ @js.native
  object loading extends TopLevel[loading with Double]
  
  /* 4 */ @js.native
  object opened extends TopLevel[opened with Double]
  
  /* 1 */ @js.native
  object pending extends TopLevel[pending with Double]
  
  /* 6 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 5 */ @js.native
  object starting extends TopLevel[starting with Double]
  
  /* 0 */ @js.native
  object unloaded extends TopLevel[unloaded with Double]
  
}

