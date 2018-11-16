package typings
package playerframeworkLib.PlayerFrameworkNs

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
  sealed trait ended
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media has finished, but the player is still executing ending operations.
  		**/
  @js.native
  sealed trait ending
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media has failed and the player must be reloaded.
  		**/
  @js.native
  sealed trait failed
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media has finished loading, but has not been opened yet.
  		**/
  @js.native
  sealed trait loaded
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media source is set, but the player is still executing loading operations.
  		**/
  @js.native
  sealed trait loading
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media can be played.
  		**/
  @js.native
  sealed trait opened
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media source is set and the player is waiting to load the media (e.g. autoload is false).
  		**/
  @js.native
  sealed trait pending
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media has been started and the player is either playing or paused.
  		**/
  @js.native
  sealed trait started
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The media has been told to start playing, but the player is still executing starting operations.
  		**/
  @js.native
  sealed trait starting
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /**
  		* The player is unloaded and no media source is set.
  		**/
  @js.native
  sealed trait unloaded
    extends playerframeworkLib.PlayerFrameworkNs.PlayerState
  
  /* 8 */ val ended: ended with scala.Double = js.native
  /* 7 */ val ending: ending with scala.Double = js.native
  /* 9 */ val failed: failed with scala.Double = js.native
  /* 3 */ val loaded: loaded with scala.Double = js.native
  /* 2 */ val loading: loading with scala.Double = js.native
  /* 4 */ val opened: opened with scala.Double = js.native
  /* 1 */ val pending: pending with scala.Double = js.native
  /* 6 */ val started: started with scala.Double = js.native
  /* 5 */ val starting: starting with scala.Double = js.native
  /* 0 */ val unloaded: unloaded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.PlayerState with scala.Double] = js.native
}

