package typings
package playerframeworkLib.PlayerFrameworkNs

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
  sealed trait loading
    extends playerframeworkLib.PlayerFrameworkNs.ViewModelState
  
  /**
  		* The media is paused.
  		*/
  @js.native
  sealed trait paused
    extends playerframeworkLib.PlayerFrameworkNs.ViewModelState
  
  /**
  		* The media is playing.
  		*/
  @js.native
  sealed trait playing
    extends playerframeworkLib.PlayerFrameworkNs.ViewModelState
  
  /**
  		* No media is loaded.
  		*/
  @js.native
  sealed trait unloaded
    extends playerframeworkLib.PlayerFrameworkNs.ViewModelState
  
  /* 1 */ val loading: loading with scala.Double = js.native
  /* 2 */ val paused: paused with scala.Double = js.native
  /* 3 */ val playing: playing with scala.Double = js.native
  /* 0 */ val unloaded: unloaded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.ViewModelState with scala.Double] = js.native
}

