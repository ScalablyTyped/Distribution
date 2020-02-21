package typings.playcanvas.pc

import typings.playcanvas.AnonAsset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.SoundComponent
  * @augments pc.Component
  * @classdesc The Sound Component controls playback of {@link pc.Sound}s.
  * @description Create a new Sound Component.
  * @param {pc.SoundComponentSystem} system - The ComponentSystem that created this
  * component.
  * @param {pc.Entity} entity - The entity that the Component is attached to.
  * @property {number} volume The volume modifier to play the audio with. In range 0-1.
  * @property {number} pitch The pitch modifier to play the audio with. Must be larger
  * than 0.01.
  * @property {boolean} positional If true the audio will play back at the location
  * of the Entity in space, so the audio will be affected by the position of the
  * {@link pc.AudioListenerComponent}.
  * @property {string} distanceModel Determines which algorithm to use to reduce the
  * volume of the sound as it moves away from the listener. Can be:
  *
  * * {@link pc.DISTANCE_LINEAR}
  * * {@link pc.DISTANCE_INVERSE}
  * * {@link pc.DISTANCE_EXPONENTIAL}
  *
  * Default is {@link pc.DISTANCE_LINEAR}.
  * @property {number} refDistance The reference distance for reducing volume as the
  * sound source moves further from the listener.
  * @property {number} maxDistance The maximum distance from the listener at which audio
  * falloff stops. Note the volume of the audio is not 0 after this distance, but just
  * doesn't fall off anymore.
  * @property {number} rollOffFactor The factor used in the falloff equation.
  * @property {object} slots A dictionary that contains the {@link pc.SoundSlot}s managed
  * by this Component.
  */
@JSGlobal("pc.SoundComponent")
@js.native
class SoundComponent protected () extends Component {
  def this(system: SoundComponentSystem, entity: Entity) = this()
  /**
    * Determines which algorithm to use to reduce the
    * volume of the sound as it moves away from the listener. Can be:
    * * {@link pc.DISTANCE_LINEAR}
    * * {@link pc.DISTANCE_INVERSE}
    * * {@link pc.DISTANCE_EXPONENTIAL}
    * Default is {@link pc.DISTANCE_LINEAR}.
    */
  var distanceModel: String = js.native
  /**
    * The maximum distance from the listener at which audio
    * falloff stops. Note the volume of the audio is not 0 after this distance, but just
    * doesn't fall off anymore.
    */
  var maxDistance: Double = js.native
  /**
    * The pitch modifier to play the audio with. Must be larger
    * than 0.01.
    */
  var pitch: Double = js.native
  /**
    * If true the audio will play back at the location
    * of the Entity in space, so the audio will be affected by the position of the
    * {@link pc.AudioListenerComponent}.
    */
  var positional: Boolean = js.native
  /**
    * The reference distance for reducing volume as the
    * sound source moves further from the listener.
    */
  var refDistance: Double = js.native
  /**
    * The factor used in the falloff equation.
    */
  var rollOffFactor: Double = js.native
  /**
    * A dictionary that contains the {@link pc.SoundSlot}s managed
    * by this Component.
    */
  var slots: js.Any = js.native
  /**
    * The volume modifier to play the audio with. In range 0-1.
    */
  var volume: Double = js.native
  /**
    * @function
    * @name pc.SoundComponent#addSlot
    * @description Creates a new {@link pc.SoundSlot} with the specified name.
    * @param {string} name - The name of the slot.
    * @param {object} [options] - Settings for the slot.
    * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
    * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
    * @param {boolean} [options.loop=false] - If true the sound will restart when it reaches the end.
    * @param {number} [options.startTime=0] - The start time from which the sound will start playing.
    * @param {number} [options.duration=null] - The duration of the sound that the slot will play starting from startTime.
    * @param {boolean} [options.overlap=false] - If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
    * @param {boolean} [options.autoPlay=false] - If true the slot will start playing as soon as its audio asset is loaded.
    * @param {number} [options.asset=null] - The asset id of the audio asset that is going to be played by this slot.
    * @returns {pc.SoundSlot} The new slot.
    * @example
    * // get an asset by id
    * var asset = app.assets.get(10);
    * // add a slot
    * this.entity.sound.addSlot('beep', {
    *     asset: asset
    * });
    * // play
    * this.entity.sound.play('beep');
    */
  def addSlot(name: String): SoundSlot = js.native
  def addSlot(name: String, options: AnonAsset): SoundSlot = js.native
  /**
    * @function
    * @name pc.SoundComponent#pause
    * @description Pauses playback of the slot with the specified name. If the name is undefined then all slots currently played will be paused. The slots can be resumed by calling {@link pc.SoundComponent#resume}.
    * @param {string} [name] - The name of the slot to pause. Leave undefined to pause everything.
    * @example
    * // pause all sounds
    * this.entity.sound.pause();
    * // pause a specific sound
    * this.entity.sound.pause('beep');
    */
  def pause(): Unit = js.native
  def pause(name: String): Unit = js.native
  /**
    * @function
    * @name pc.SoundComponent#play
    * @description Begins playing the sound slot with the specified name. The slot will restart playing if it is already playing unless the overlap field is true in which case a new sound will be created and played.
    * @param {string} name - The name of the {@link pc.SoundSlot} to play.
    * @example
    * // get asset by id
    * var asset = app.assets.get(10);
    * // create a slot and play it
    * this.entity.sound.addSlot('beep', {
    *     asset: asset
    * });
    * this.entity.sound.play('beep');
    * @returns {pc.SoundInstance} The sound instance that will be played.
    */
  def play(name: String): SoundInstance = js.native
  /**
    * @function
    * @name pc.SoundComponent#removeSlot
    * @description Removes the {@link pc.SoundSlot} with the specified name.
    * @param {string} name - The name of the slot.
    * @example
    * // remove a slot called 'beep'
    * this.entity.sound.removeSlot('beep');
    */
  def removeSlot(name: String): Unit = js.native
  /**
    * @function
    * @name pc.SoundComponent#resume
    * @description Resumes playback of the sound slot with the specified name if it's paused. If no name is specified all slots will be resumed.
    * @param {string} name - The name of the slot to resume. Leave undefined to resume everything.
    * @example
    * // resume all sounds
    * this.entity.sound.resume();
    * // resume a specific sound
    * this.entity.sound.resume('beep');
    */
  def resume(name: String): Unit = js.native
  /**
    * @function
    * @name pc.SoundComponent#slot
    * @description Returns the slot with the specified name.
    * @param {string} name - The name of the slot.
    * @returns {pc.SoundSlot} The slot.
    * @example
    * // get a slot and set its volume
    * this.entity.sound.slot('beep').volume = 0.5;
    *
    */
  def slot(name: String): SoundSlot = js.native
  /**
    * @function
    * @name pc.SoundComponent#stop
    * @description Stops playback of the sound slot with the specified name if it's paused. If no name is specified all slots will be stopped.
    * @param {string} name - The name of the slot to stop. Leave undefined to stop everything.
    * @example
    * // stop all sounds
    * this.entity.sound.stop();
    * // stop a specific sound
    * this.entity.sound.stop('beep');
    */
  def stop(name: String): Unit = js.native
}

