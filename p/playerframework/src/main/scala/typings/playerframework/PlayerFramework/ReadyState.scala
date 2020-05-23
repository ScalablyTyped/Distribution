package typings.playerframework.PlayerFramework

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
  sealed trait currentData extends ReadyState
  
  /**
    * The player has enough data available to start playing.
    **/
  @js.native
  sealed trait enoughData extends ReadyState
  
  /**
    * The player has data for the current playback position and at least the next frame.
    **/
  @js.native
  sealed trait futureData extends ReadyState
  
  /**
    * The player has metadata for the audio/video.
    **/
  @js.native
  sealed trait metadata extends ReadyState
  
  /**
    * The player has no information for the audio/video
    **/
  @js.native
  sealed trait nothing extends ReadyState
  
}

