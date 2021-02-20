package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTrackReadyState extends StObject
@JSGlobal("PlayerFramework.TextTrackReadyState")
@js.native
object TextTrackReadyState extends StObject {
  
  /**
    * The track failed to load.
    */
  @js.native
  sealed trait error extends TextTrackReadyState
  
  /**
    * The track is loaded.
    */
  @js.native
  sealed trait loaded extends TextTrackReadyState
  
  /**
    * The track is currently loading.
    */
  @js.native
  sealed trait loading extends TextTrackReadyState
  
  /**
    * The track is unloaded.
    */
  @js.native
  sealed trait none extends TextTrackReadyState
}
