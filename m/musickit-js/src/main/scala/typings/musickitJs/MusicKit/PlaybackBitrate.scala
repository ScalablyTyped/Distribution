package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaybackBitrate extends StObject
/**
  * The playback bit rate of the music player.
  */
@JSGlobal("MusicKit.PlaybackBitrate")
@js.native
object PlaybackBitrate extends StObject {
  
  @js.native
  sealed trait HIGH
    extends StObject
       with PlaybackBitrate
  
  @js.native
  sealed trait STANDARD
    extends StObject
       with PlaybackBitrate
}
