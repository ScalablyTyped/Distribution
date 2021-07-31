package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkState extends StObject
@JSGlobal("PlayerFramework.NetworkState")
@js.native
object NetworkState extends StObject {
  
  /**
    * The player has not yet initialized any audio/video.
    **/
  @js.native
  sealed trait empty
    extends StObject
       with NetworkState
  
  /**
    * The player has active audio/video and has selected a resource, but is not using the network.
    **/
  @js.native
  sealed trait idle
    extends StObject
       with NetworkState
  
  /**
    * The player is downloading data.
    **/
  @js.native
  sealed trait loading
    extends StObject
       with NetworkState
  
  /**
    * The player has no audio/video source.
    **/
  @js.native
  sealed trait noSource
    extends StObject
       with NetworkState
}
