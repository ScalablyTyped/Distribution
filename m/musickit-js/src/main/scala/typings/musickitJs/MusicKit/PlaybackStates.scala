package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaybackStates extends StObject
/**
  * The playback states of the music player.
  */
@JSGlobal("MusicKit.PlaybackStates")
@js.native
object PlaybackStates extends StObject {
  
  @js.native
  sealed trait completed
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait ended
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait loading
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait none
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait paused
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait playing
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait seeking
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait stalled
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait stopped
    extends StObject
       with PlaybackStates
  
  @js.native
  sealed trait waiting
    extends StObject
       with PlaybackStates
}
