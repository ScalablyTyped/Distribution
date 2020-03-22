package typings.playcanvas.mod

import typings.playcanvas.AnonAsset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SoundSlot
  * @augments pc.EventHandler
  * @classdesc The SoundSlot controls playback of an audio asset.
  * @description Create a new SoundSlot.
  * @param {pc.SoundComponent} component - The Component that created this slot.
  * @param {string} name - The name of the slot.
  * @param {object} options - Settings for the slot.
  * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
  * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
  * @param {boolean} [options.loop=false] - If true the sound will restart when it reaches the end.
  * @param {number} [options.startTime=0] - The start time from which the sound will start playing.
  * @param {number} [options.duration=null] - The duration of the sound that the slot will play starting from startTime.
  * @param {boolean} [options.overlap=false] - If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @param {boolean} [options.autoPlay=false] - If true the slot will start playing as soon as its audio asset is loaded.
  * @param {number} [options.asset=null] - The asset id of the audio asset that is going to be played by this slot.
  * @property {string} name The name of the slot.
  * @property {number|null} asset The asset id.
  * @property {boolean} autoPlay If true the slot will begin playing as soon as it is loaded.
  * @property {number} volume The volume modifier to play the sound with. In range 0-1.
  * @property {number} pitch The pitch modifier to play the sound with. Must be larger than 0.01.
  * @property {number} startTime The start time from which the sound will start playing.
  * @property {number} duration The duration of the sound that the slot will play starting from startTime.
  * @property {boolean} loop If true the slot will restart when it finishes playing.
  * @property {boolean} overlap If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @property {boolean} isLoaded Returns true if the asset of the slot is loaded.
  * @property {boolean} isPlaying Returns true if the slot is currently playing.
  * @property {boolean} isPaused Returns true if the slot is currently paused.
  * @property {boolean} isStopped Returns true if the slot is currently stopped.
  * @property {pc.SoundInstance[]} instances An array that contains all the {@link pc.SoundInstance}s currently being played by the slot.
  */
@JSImport("playcanvas", "SoundSlot")
@js.native
class SoundSlot protected ()
  extends typings.playcanvas.pc.SoundSlot {
  def this(component: typings.playcanvas.pc.SoundComponent, name: String, options: AnonAsset) = this()
}

