package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Sound Component.
  * @property volume - The volume modifier to play the audio with. In range 0-1.
  * @property pitch - The pitch modifier to play the audio with. Must be larger
  than 0.01.
  * @property positional - If true the audio will play back at the location
  of the Entity in space, so the audio will be affected by the position of the
  {@link pc.AudioListenerComponent}.
  * @property distanceModel - Determines which algorithm to use to reduce the
  volume of the sound as it moves away from the listener. Can be:
  
  * {@link pc.DISTANCE_LINEAR}
  * {@link pc.DISTANCE_INVERSE}
  * {@link pc.DISTANCE_EXPONENTIAL}
  
  Default is {@link pc.DISTANCE_LINEAR}.
  * @property refDistance - The reference distance for reducing volume as the
  sound source moves further from the listener.
  * @property maxDistance - The maximum distance from the listener at which audio
  falloff stops. Note the volume of the audio is not 0 after this distance, but just
  doesn't fall off anymore.
  * @property rollOffFactor - The factor used in the falloff equation.
  * @property slots - A dictionary that contains the {@link pc.SoundSlot}s managed
  by this Component.
  * @param system - The ComponentSystem that created this
  component.
  * @param entity - The entity that the Component is attached to.
  */
@js.native
trait SoundComponent extends Component {
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
    * Creates a new {@link pc.SoundSlot} with the specified name.
    * @example
    * // get an asset by id
    var asset = app.assets.get(10);
    // add a slot
    this.entity.sound.addSlot('beep', {
    asset: asset
    });
    // play
    this.entity.sound.play('beep');
    * @param name - The name of the slot.
    * @param [options] - Settings for the slot.
    * @param [options.volume = 1] - The playback volume, between 0 and 1.
    * @param [options.pitch = 1] - The relative pitch, default of 1, plays at normal pitch.
    * @param [options.loop = false] - If true the sound will restart when it reaches the end.
    * @param [options.startTime = 0] - The start time from which the sound will start playing.
    * @param [options.duration = null] - The duration of the sound that the slot will play starting from startTime.
    * @param [options.overlap = false] - If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
    * @param [options.autoPlay = false] - If true the slot will start playing as soon as its audio asset is loaded.
    * @param [options.asset = null] - The asset id of the audio asset that is going to be played by this slot.
    * @returns The new slot.
    */
  def addSlot(name: String): SoundSlot = js.native
  def addSlot(name: String, options: typings.playcanvas.anon.Asset): SoundSlot = js.native
  /**
    * Pauses playback of the slot with the specified name. If the name is undefined then all slots currently played will be paused. The slots can be resumed by calling {@link pc.SoundComponent#resume}.
    * @example
    * // pause all sounds
    this.entity.sound.pause();
    // pause a specific sound
    this.entity.sound.pause('beep');
    * @param [name] - The name of the slot to pause. Leave undefined to pause everything.
    */
  def pause(): Unit = js.native
  def pause(name: String): Unit = js.native
  /**
    * Begins playing the sound slot with the specified name. The slot will restart playing if it is already playing unless the overlap field is true in which case a new sound will be created and played.
    * @example
    * // get asset by id
    var asset = app.assets.get(10);
    // create a slot and play it
    this.entity.sound.addSlot('beep', {
    asset: asset
    });
    this.entity.sound.play('beep');
    * @param name - The name of the {@link pc.SoundSlot} to play.
    * @returns The sound instance that will be played.
    */
  def play(name: String): SoundInstance = js.native
  /**
    * Removes the {@link pc.SoundSlot} with the specified name.
    * @example
    * // remove a slot called 'beep'
    this.entity.sound.removeSlot('beep');
    * @param name - The name of the slot.
    */
  def removeSlot(name: String): Unit = js.native
  /**
    * Resumes playback of the sound slot with the specified name if it's paused. If no name is specified all slots will be resumed.
    * @example
    * // resume all sounds
    this.entity.sound.resume();
    // resume a specific sound
    this.entity.sound.resume('beep');
    * @param name - The name of the slot to resume. Leave undefined to resume everything.
    */
  def resume(name: String): Unit = js.native
  /**
    * Returns the slot with the specified name.
    * @example
    * // get a slot and set its volume
    this.entity.sound.slot('beep').volume = 0.5;
    * @param name - The name of the slot.
    * @returns The slot.
    */
  def slot(name: String): SoundSlot = js.native
  /**
    * Stops playback of the sound slot with the specified name if it's paused. If no name is specified all slots will be stopped.
    * @example
    * // stop all sounds
    this.entity.sound.stop();
    // stop a specific sound
    this.entity.sound.stop('beep');
    * @param name - The name of the slot to stop. Leave undefined to stop everything.
    */
  def stop(name: String): Unit = js.native
}

