package typings
package playerframeworkLib.PlayerFrameworkNs

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
  sealed trait error
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackReadyState
  
  /**
  		* The track is loaded.
  		*/
  @js.native
  sealed trait loaded
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackReadyState
  
  /**
  		* The track is currently loading.
  		*/
  @js.native
  sealed trait loading
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackReadyState
  
  /**
  		* The track is unloaded.
  		*/
  @js.native
  sealed trait none
    extends playerframeworkLib.PlayerFrameworkNs.TextTrackReadyState
  
  /* 3 */ val error: error with scala.Double = js.native
  /* 2 */ val loaded: loaded with scala.Double = js.native
  /* 1 */ val loading: loading with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.TextTrackReadyState with scala.Double] = js.native
}

