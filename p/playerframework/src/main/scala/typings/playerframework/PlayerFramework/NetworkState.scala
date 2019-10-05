package typings.playerframework.PlayerFramework

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
  sealed trait empty extends NetworkState
  
  /**
  		* The player has active audio/video and has selected a resource, but is not using the network.
  		**/
  @js.native
  sealed trait idle extends NetworkState
  
  /**
  		* The player is downloading data.
  		**/
  @js.native
  sealed trait loading extends NetworkState
  
  /**
  		* The player has no audio/video source.
  		**/
  @js.native
  sealed trait noSource extends NetworkState
  
  /* 0 */ val empty: typings.playerframework.PlayerFramework.NetworkState.empty with Double = js.native
  /* 1 */ val idle: typings.playerframework.PlayerFramework.NetworkState.idle with Double = js.native
  /* 2 */ val loading: typings.playerframework.PlayerFramework.NetworkState.loading with Double = js.native
  /* 3 */ val noSource: typings.playerframework.PlayerFramework.NetworkState.noSource with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkState with Double] = js.native
}

