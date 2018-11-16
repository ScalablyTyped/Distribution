package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSGlobal("PlayerFramework.ReadyState")
@js.native
object ReadyState extends js.Object {
  /**
  		* The player has data for the current playback position, but not enough data to play the next frame.
  		**/
  @js.native
  sealed trait currentData
    extends playerframeworkLib.PlayerFrameworkNs.ReadyState
  
  /**
  		* The player has enough data available to start playing.
  		**/
  @js.native
  sealed trait enoughData
    extends playerframeworkLib.PlayerFrameworkNs.ReadyState
  
  /**
  		* The player has data for the current playback position and at least the next frame.
  		**/
  @js.native
  sealed trait futureData
    extends playerframeworkLib.PlayerFrameworkNs.ReadyState
  
  /**
  		* The player has metadata for the audio/video.
  		**/
  @js.native
  sealed trait metadata
    extends playerframeworkLib.PlayerFrameworkNs.ReadyState
  
  /**
  		* The player has no information for the audio/video
  		**/
  @js.native
  sealed trait nothing
    extends playerframeworkLib.PlayerFrameworkNs.ReadyState
  
  /* 2 */ val currentData: currentData with scala.Double = js.native
  /* 4 */ val enoughData: enoughData with scala.Double = js.native
  /* 3 */ val futureData: futureData with scala.Double = js.native
  /* 1 */ val metadata: metadata with scala.Double = js.native
  /* 0 */ val nothing: nothing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.ReadyState with scala.Double] = js.native
}

