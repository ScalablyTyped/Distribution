package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaybackState extends StObject
/**
  * The playback states of the music player.
  */
@JSGlobal("MusicKit.PlaybackState")
@js.native
object PlaybackState extends StObject {
  
  @js.native
  sealed trait ENDED
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait LOADING
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait NONE
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait PLAYING
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait SEEKING
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait STOPPED
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait completed
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait stalled
    extends StObject
       with PlaybackState
  
  @js.native
  sealed trait waiting
    extends StObject
       with PlaybackState
}
