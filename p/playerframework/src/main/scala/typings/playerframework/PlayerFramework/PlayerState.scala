package typings.playerframework.PlayerFramework

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
  
  /* 8 */ val ended: typings.playerframework.PlayerFramework.PlayerState.ended with Double = js.native
  /* 7 */ val ending: typings.playerframework.PlayerFramework.PlayerState.ending with Double = js.native
  /* 9 */ val failed: typings.playerframework.PlayerFramework.PlayerState.failed with Double = js.native
  /* 3 */ val loaded: typings.playerframework.PlayerFramework.PlayerState.loaded with Double = js.native
  /* 2 */ val loading: typings.playerframework.PlayerFramework.PlayerState.loading with Double = js.native
  /* 4 */ val opened: typings.playerframework.PlayerFramework.PlayerState.opened with Double = js.native
  /* 1 */ val pending: typings.playerframework.PlayerFramework.PlayerState.pending with Double = js.native
  /* 6 */ val started: typings.playerframework.PlayerFramework.PlayerState.started with Double = js.native
  /* 5 */ val starting: typings.playerframework.PlayerFramework.PlayerState.starting with Double = js.native
  /* 0 */ val unloaded: typings.playerframework.PlayerFramework.PlayerState.unloaded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlayerState with Double] = js.native
}

