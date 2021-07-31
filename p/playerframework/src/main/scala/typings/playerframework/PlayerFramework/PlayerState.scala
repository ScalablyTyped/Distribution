package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayerState extends StObject
@JSGlobal("PlayerFramework.PlayerState")
@js.native
object PlayerState extends StObject {
  
  /**
    * The media has ended.
    **/
  @js.native
  sealed trait ended
    extends StObject
       with PlayerState
  
  /**
    * The media has finished, but the player is still executing ending operations.
    **/
  @js.native
  sealed trait ending
    extends StObject
       with PlayerState
  
  /**
    * The media has failed and the player must be reloaded.
    **/
  @js.native
  sealed trait failed
    extends StObject
       with PlayerState
  
  /**
    * The media has finished loading, but has not been opened yet.
    **/
  @js.native
  sealed trait loaded
    extends StObject
       with PlayerState
  
  /**
    * The media source is set, but the player is still executing loading operations.
    **/
  @js.native
  sealed trait loading
    extends StObject
       with PlayerState
  
  /**
    * The media can be played.
    **/
  @js.native
  sealed trait opened
    extends StObject
       with PlayerState
  
  /**
    * The media source is set and the player is waiting to load the media (e.g. autoload is false).
    **/
  @js.native
  sealed trait pending
    extends StObject
       with PlayerState
  
  /**
    * The media has been started and the player is either playing or paused.
    **/
  @js.native
  sealed trait started
    extends StObject
       with PlayerState
  
  /**
    * The media has been told to start playing, but the player is still executing starting operations.
    **/
  @js.native
  sealed trait starting
    extends StObject
       with PlayerState
  
  /**
    * The player is unloaded and no media source is set.
    **/
  @js.native
  sealed trait unloaded
    extends StObject
       with PlayerState
}
