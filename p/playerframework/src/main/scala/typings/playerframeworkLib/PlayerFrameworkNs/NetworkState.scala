package typings
package playerframeworkLib.PlayerFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkState extends js.Object

@JSGlobal("PlayerFramework.NetworkState")
@js.native
object NetworkState extends js.Object {
  /**
  		* The player has not yet initialized any audio/video.
  		**/
  @js.native
  sealed trait empty
    extends playerframeworkLib.PlayerFrameworkNs.NetworkState
  
  /**
  		* The player has active audio/video and has selected a resource, but is not using the network.
  		**/
  @js.native
  sealed trait idle
    extends playerframeworkLib.PlayerFrameworkNs.NetworkState
  
  /**
  		* The player is downloading data.
  		**/
  @js.native
  sealed trait loading
    extends playerframeworkLib.PlayerFrameworkNs.NetworkState
  
  /**
  		* The player has no audio/video source.
  		**/
  @js.native
  sealed trait noSource
    extends playerframeworkLib.PlayerFrameworkNs.NetworkState
  
  /* 0 */ val empty: empty with scala.Double = js.native
  /* 1 */ val idle: idle with scala.Double = js.native
  /* 2 */ val loading: loading with scala.Double = js.native
  /* 3 */ val noSource: noSource with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.NetworkState with scala.Double] = js.native
}

