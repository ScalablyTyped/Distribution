package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.ReadyState.currentData
import typings.playerframework.PlayerFramework.ReadyState.enoughData
import typings.playerframework.PlayerFramework.ReadyState.futureData
import typings.playerframework.PlayerFramework.ReadyState.metadata
import typings.playerframework.PlayerFramework.ReadyState.nothing
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
  /* 2 */ @js.native
  object currentData extends TopLevel[currentData with Double]
  
  /* 4 */ @js.native
  object enoughData extends TopLevel[enoughData with Double]
  
  /* 3 */ @js.native
  object futureData extends TopLevel[futureData with Double]
  
  /* 1 */ @js.native
  object metadata extends TopLevel[metadata with Double]
  
  /* 0 */ @js.native
  object nothing extends TopLevel[nothing with Double]
  
}

