package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new SoundSlot.
  * @property name - The name of the slot.
  * @property asset - The asset id.
  * @property autoPlay - If true the slot will begin playing as soon as it is loaded.
  * @property volume - The volume modifier to play the sound with. In range 0-1.
  * @property pitch - The pitch modifier to play the sound with. Must be larger than 0.01.
  * @property startTime - The start time from which the sound will start playing.
  * @property duration - The duration of the sound that the slot will play starting from startTime.
  * @property loop - If true the slot will restart when it finishes playing.
  * @property overlap - If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @property isLoaded - Returns true if the asset of the slot is loaded.
  * @property isPlaying - Returns true if the slot is currently playing.
  * @property isPaused - Returns true if the slot is currently paused.
  * @property isStopped - Returns true if the slot is currently stopped.
  * @property instances - An array that contains all the {@link pc.SoundInstance}s currently being played by the slot.
  * @param component - The Component that created this slot.
  * @param name - The name of the slot.
  * @param options - Settings for the slot.
  * @param [options.volume = 1] - The playback volume, between 0 and 1.
  * @param [options.pitch = 1] - The relative pitch, default of 1, plays at normal pitch.
  * @param [options.loop = false] - If true the sound will restart when it reaches the end.
  * @param [options.startTime = 0] - The start time from which the sound will start playing.
  * @param [options.duration = null] - The duration of the sound that the slot will play starting from startTime.
  * @param [options.overlap = false] - If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @param [options.autoPlay = false] - If true the slot will start playing as soon as its audio asset is loaded.
  * @param [options.asset = null] - The asset id of the audio asset that is going to be played by this slot.
  */
@JSGlobal("pc.SoundSlot")
@js.native
class SoundSlot protected ()
  extends typings.playcanvas.pc.SoundSlot {
  def this(
    component: typings.playcanvas.pc.SoundComponent,
    name: String,
    options: typings.playcanvas.anon.Asset
  ) = this()
}

