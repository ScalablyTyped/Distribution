package typings.playcanvas.global.pc

import typings.playcanvas.anon.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pc.SoundInstance plays a {@link pc.Sound}.
  * @property volume - The volume modifier to play the sound with. In range 0-1.
  * @property pitch - The pitch modifier to play the sound with. Must be larger than 0.01.
  * @property startTime - The start time from which the sound will start playing.
  * @property currentTime - Gets or sets the current time of the sound that is playing. If the value provided is bigger than the duration of the instance it will wrap from the beginning.
  * @property duration - The duration of the sound that the instance will play starting from startTime.
  * @property loop - If true the instance will restart when it finishes playing.
  * @property isPlaying - Returns true if the instance is currently playing.
  * @property isPaused - Returns true if the instance is currently paused.
  * @property isStopped - Returns true if the instance is currently stopped.
  * @property isSuspended - Returns true if the instance is currently suspended because the window is not focused.
  * @property source - Gets the source that plays the sound resource. If the Web Audio API is not supported the type of source is <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/audio" target="_blank">Audio</a>. Source is only available after calling play.
  * @property sound - The sound resource that the instance will play.
  * @param manager - The sound manager.
  * @param sound - The sound to play.
  * @param options - Options for the instance.
  * @param [options.volume = 1] - The playback volume, between 0 and 1.
  * @param [options.pitch = 1] - The relative pitch, default of 1, plays at normal pitch.
  * @param [options.loop = false] - Whether the sound should loop when it reaches the end or not.
  * @param [options.startTime = 0] - The time from which the playback will start in seconds. Default is 0 to start at the beginning.
  * @param [options.duration = null] - The total time after the startTime in seconds when playback will stop or restart if loop is true.
  * @param [options.onPlay = null] - Function called when the instance starts playing.
  * @param [options.onPause = null] - Function called when the instance is paused.
  * @param [options.onResume = null] - Function called when the instance is resumed.
  * @param [options.onStop = null] - Function called when the instance is stopped.
  * @param [options.onEnd = null] - Function called when the instance ends.
  */
@JSGlobal("pc.SoundInstance")
@js.native
class SoundInstance protected ()
  extends StObject
     with typings.playcanvas.pc.SoundInstance {
  def this(manager: typings.playcanvas.pc.SoundManager, sound: typings.playcanvas.pc.Sound, options: Duration) = this()
}
