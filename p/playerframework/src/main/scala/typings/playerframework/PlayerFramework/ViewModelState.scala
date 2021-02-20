package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewModelState extends StObject
@JSGlobal("PlayerFramework.ViewModelState")
@js.native
object ViewModelState extends StObject {
  
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
