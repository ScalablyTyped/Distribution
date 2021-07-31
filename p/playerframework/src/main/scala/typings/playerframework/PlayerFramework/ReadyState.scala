package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadyState extends StObject
@JSGlobal("PlayerFramework.ReadyState")
@js.native
object ReadyState extends StObject {
  
  /**
    * The player has data for the current playback position, but not enough data to play the next frame.
    **/
  @js.native
  sealed trait currentData
    extends StObject
       with ReadyState
  
  /**
    * The player has enough data available to start playing.
    **/
  @js.native
  sealed trait enoughData
    extends StObject
       with ReadyState
  
  /**
    * The player has data for the current playback position and at least the next frame.
    **/
  @js.native
  sealed trait futureData
    extends StObject
       with ReadyState
  
  /**
    * The player has metadata for the audio/video.
    **/
  @js.native
  sealed trait metadata
    extends StObject
       with ReadyState
  
  /**
    * The player has no information for the audio/video
    **/
  @js.native
  sealed trait nothing
    extends StObject
       with ReadyState
}
