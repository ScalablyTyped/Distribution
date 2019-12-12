package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.ViewModelState.loading
import typings.playerframework.PlayerFramework.ViewModelState.paused
import typings.playerframework.PlayerFramework.ViewModelState.playing
import typings.playerframework.PlayerFramework.ViewModelState.unloaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewModelState extends js.Object

@JSGlobal("PlayerFramework.ViewModelState")
@js.native
object ViewModelState extends js.Object {
  /**
  		* The media is loading.
  		*/
  @js.native
  sealed trait loading extends ViewModelState
  
  /**
  		* The media is paused.
  		*/
  @js.native
  sealed trait paused extends ViewModelState
  
  /**
  		* The media is playing.
  		*/
  @js.native
  sealed trait playing extends ViewModelState
  
  /**
  		* No media is loaded.
  		*/
  @js.native
  sealed trait unloaded extends ViewModelState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewModelState with Double] = js.native
  /* 1 */ @js.native
  object loading extends TopLevel[loading with Double]
  
  /* 2 */ @js.native
  object paused extends TopLevel[paused with Double]
  
  /* 3 */ @js.native
  object playing extends TopLevel[playing with Double]
  
  /* 0 */ @js.native
  object unloaded extends TopLevel[unloaded with Double]
  
}

