package typings.playcanvas.global.pc

import typings.playcanvas.anon.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SoundInstance plays a {@link Sound}.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.SoundInstance")
@js.native
open class SoundInstance protected ()
  extends typings.playcanvas.mod.SoundInstance {
  /**
    * Create a new SoundInstance instance.
    *
    * @param {SoundManager} manager - The sound manager.
    * @param {Sound} sound - The sound to play.
    * @param {object} options - Options for the instance.
    * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
    * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
    * @param {boolean} [options.loop=false] - Whether the sound should loop when it reaches the
    * end or not.
    * @param {number} [options.startTime=0] - The time from which the playback will start in
    * seconds. Default is 0 to start at the beginning.
    * @param {number} [options.duration=0] - The total time after the startTime in seconds when
    * playback will stop or restart if loop is true.
    * @param {Function} [options.onPlay=null] - Function called when the instance starts playing.
    * @param {Function} [options.onPause=null] - Function called when the instance is paused.
    * @param {Function} [options.onResume=null] - Function called when the instance is resumed.
    * @param {Function} [options.onStop=null] - Function called when the instance is stopped.
    * @param {Function} [options.onEnd=null] - Function called when the instance ends.
    */
  def this(
    manager: typings.playcanvas.mod.SoundManager,
    sound: typings.playcanvas.mod.Sound,
    options: Duration
  ) = this()
}
