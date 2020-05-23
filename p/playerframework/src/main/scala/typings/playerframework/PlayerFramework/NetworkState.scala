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
  
}

