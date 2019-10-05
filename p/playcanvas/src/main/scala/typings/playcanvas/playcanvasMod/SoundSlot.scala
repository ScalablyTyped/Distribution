package typings.playcanvas.playcanvasMod

import typings.playcanvas.Anon_Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SoundSlot
  * @extends pc.EventHandler
  * @classdesc The SoundSlot controls playback of an audio asset.
  * @description Create a new SoundSlot
  * @param {pc.SoundComponent} component The Component that created this slot.
  * @param {String} name The name of the slot.
  * @param {Object} options Settings for the slot
  * @param {Number} [options.volume=1] The playback volume, between 0 and 1.
  * @param {Number} [options.pitch=1] The relative pitch, default of 1, plays at normal pitch.
  * @param {Boolean} [options.loop=false] If true the sound will restart when it reaches the end.
  * @param {Number} [options.startTime=0] The start time from which the sound will start playing.
  * @param {Number} [options.duration=null] The duration of the sound that the slot will play starting from startTime.
  * @param {Boolean} [options.overlap=false] If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @param {Boolean} [options.autoPlay=false] If true the slot will start playing as soon as its audio asset is loaded.
  * @param {Number} [options.asset=null] The asset id of the audio asset that is going to be played by this slot.
  * @property {String} name The name of the slot
  * @property {String} asset The asset id
  * @property {Boolean} autoPlay If true the slot will begin playing as soon as it is loaded
  * @property {Number} volume The volume modifier to play the sound with. In range 0-1.
  * @property {Number} pitch The pitch modifier to play the sound with. Must be larger than 0.01
  * @property {Number} startTime The start time from which the sound will start playing.
  * @property {Number} duration The duration of the sound that the slot will play starting from startTime.
  * @property {Boolean} loop If true the slot will restart when it finishes playing
  * @property {Boolean} overlap If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @property {Boolean} isLoaded Returns true if the asset of the slot is loaded.
  * @property {Boolean} isPlaying Returns true if the slot is currently playing.
  * @property {Boolean} isPaused Returns true if the slot is currently paused.
  * @property {Boolean} isStopped Returns true if the slot is currently stopped.
  * @property {pc.SoundInstance[]} instances An array that contains all the {@link pc.SoundInstance}s currently being played by the slot.
  */
@JSImport("playcanvas", "SoundSlot")
@js.native
class SoundSlot protected ()
  extends typings.playcanvas.pc.SoundSlot {
  def this(component: typings.playcanvas.pc.SoundComponent, name: String, options: Anon_Asset) = this()
}

