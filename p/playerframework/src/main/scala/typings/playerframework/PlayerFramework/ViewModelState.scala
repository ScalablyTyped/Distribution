package typings.playerframework.PlayerFramework

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
  
  /* 1 */ val loading: typings.playerframework.PlayerFramework.ViewModelState.loading with Double = js.native
  /* 2 */ val paused: typings.playerframework.PlayerFramework.ViewModelState.paused with Double = js.native
  /* 3 */ val playing: typings.playerframework.PlayerFramework.ViewModelState.playing with Double = js.native
  /* 0 */ val unloaded: typings.playerframework.PlayerFramework.ViewModelState.unloaded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewModelState with Double] = js.native
}

