package typings.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
