package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import typings.playcanvas.anon.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Sound Component controls playback of {@link Sound}s.
  *
  * @augments Component
  */
@JSImport("playcanvas", "SoundComponent")
@js.native
open class SoundComponent protected () extends Component {
  /**
    * Create a new Sound Component.
    *
    * @param {import('./system.js').SoundComponentSystem} system - The ComponentSystem that
    * created this component.
    * @param {import('../../entity.js').Entity} entity - The entity that the Component is attached
    * to.
    */
  def this(system: SoundComponentSystem, entity: Entity) = this()
  
  /** @private */
  /* private */ var _distanceModel: Any = js.native
  
  /**
    * Return a property from the slot with the specified name.
    *
    * @param {string} name - The name of the {@link SoundSlot} to look for.
    * @param {string} property - The name of the property to look for.
    * @returns {*} The value from the looked property inside the slot with specified name. May be undefined if slot does not exist.
    * @private
    */
  /* private */ var _getSlotProperty: Any = js.native
  
  /** @private */
  /* private */ var _maxDistance: Any = js.native
  
  /** @private */
  /* private */ var _pitch: Any = js.native
  
  /** @private */
  /* private */ var _playingBeforeDisable: Any = js.native
  
  /** @private */
  /* private */ var _positional: Any = js.native
  
  /** @private */
  /* private */ var _refDistance: Any = js.native
  
  /** @private */
  /* private */ var _rollOffFactor: Any = js.native
  
  /**
    * @type {Object<string, SoundSlot>}
    * @private
    */
  /* private */ var _slots: Any = js.native
  
  /**
    * Fired when a sound instance starts playing.
    *
    * @event SoundComponent#play
    * @param {SoundSlot} slot - The slot whose instance started playing.
    * @param {import('../../../platform/sound/instance.js').SoundInstance} instance - The instance
    * that started playing.
    */
  /**
    * Fired when a sound instance is paused.
    *
    * @event SoundComponent#pause
    * @param {SoundSlot} slot - The slot whose instance was paused.
    * @param {import('../../../platform/sound/instance.js').SoundInstance} instance - The instance
    * that was paused created to play the sound.
    */
  /**
    * Fired when a sound instance is resumed.
    *
    * @event SoundComponent#resume
    * @param {SoundSlot} slot - The slot whose instance was resumed.
    * @param {import('../../../platform/sound/instance.js').SoundInstance} instance - The instance
    * that was resumed.
    */
  /**
    * Fired when a sound instance is stopped.
    *
    * @event SoundComponent#stop
    * @param {SoundSlot} slot - The slot whose instance was stopped.
    * @param {import('../../../platform/sound/instance.js').SoundInstance} instance - The instance
    * that was stopped.
    */
  /**
    * Fired when a sound instance stops playing because it reached its ending.
    *
    * @event SoundComponent#end
    * @param {SoundSlot} slot - The slot whose instance ended.
    * @param {import('../../../platform/sound/instance.js').SoundInstance} instance - The instance
    * that ended.
    */
  /**
    * Update the specified property on all sound instances.
    *
    * @param {string} property - The name of the SoundInstance property to update.
    * @param {string|number} value - The value to set the property to.
    * @param {boolean} isFactor - True if the value is a factor of the slot property or false
    * if it is an absolute value.
    * @private
    */
  /* private */ var _updateSoundInstances: Any = js.native
  
  /** @private */
  /* private */ var _volume: Any = js.native
  
  /**
    * Creates a new {@link SoundSlot} with the specified name.
    *
    * @param {string} name - The name of the slot.
    * @param {object} [options] - Settings for the slot.
    * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
    * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
    * @param {boolean} [options.loop=false] - If true the sound will restart when it reaches the end.
    * @param {number} [options.startTime=0] - The start time from which the sound will start playing.
    * @param {number} [options.duration=null] - The duration of the sound that the slot will play
    * starting from startTime.
    * @param {boolean} [options.overlap=false] - If true then sounds played from slot will be
    * played independently of each other. Otherwise the slot will first stop the current sound
    * before starting the new one.
    * @param {boolean} [options.autoPlay=false] - If true the slot will start playing as soon as
    * its audio asset is loaded.
    * @param {number} [options.asset=null] - The asset id of the audio asset that is going to be
    * played by this slot.
    * @returns {SoundSlot|null} The new slot or null if the slot already exists.
    * @example
    * // get an asset by id
    * const asset = app.assets.get(10);
    * // add a slot
    * this.entity.sound.addSlot('beep', {
    *     asset: asset
    * });
    * // play
    * this.entity.sound.play('beep');
    */
  def addSlot(name: String): SoundSlot | Null = js.native
  def addSlot(name: String, options: Asset): SoundSlot | Null = js.native
  
  def distanceModel: String = js.native
  /**
    * Determines which algorithm to use to reduce the volume of the sound as it moves away from
    * the listener. Can be:
    *
    * - {@link DISTANCE_LINEAR}
    * - {@link DISTANCE_INVERSE}
    * - {@link DISTANCE_EXPONENTIAL}
    *
    * Defaults to {@link DISTANCE_LINEAR}.
    *
    * @type {string}
    */
  def distanceModel_=(arg: String): Unit = js.native
  
  /**
    * Returns true if the asset of the slot with the specified name is loaded..
    *
    * @param {string} name - The name of the {@link SoundSlot} to look for.
    * @returns {boolean} True if the slot with the specified name exists and its asset is loaded.
    */
  def isLoaded(name: String): Boolean = js.native
  
  /**
    * Returns true if the slot with the specified name is currently paused.
    *
    * @param {string} name - The name of the {@link SoundSlot} to look for.
    * @returns {boolean} True if the slot with the specified name exists and is currently paused.
    */
  def isPaused(name: String): Boolean = js.native
  
  /**
    * Returns true if the slot with the specified name is currently playing.
    *
    * @param {string} name - The name of the {@link SoundSlot} to look for.
    * @returns {boolean} True if the slot with the specified name exists and is currently playing.
    */
  def isPlaying(name: String): Boolean = js.native
  
  /**
    * Returns true if the slot with the specified name is currently stopped.
    *
    * @param {string} name - The name of the {@link SoundSlot} to look for.
    * @returns {boolean} True if the slot with the specified name exists and is currently stopped.
    */
  def isStopped(name: String): Boolean = js.native
  
  def maxDistance: Double = js.native
  /**
    * The maximum distance from the listener at which audio falloff stops. Note the volume of the
    * audio is not 0 after this distance, but just doesn't fall off anymore. Defaults to 10000.
    *
    * @type {number}
    */
  def maxDistance_=(arg: Double): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  /**
    * Pauses playback of the slot with the specified name. If the name is undefined then all slots
    * currently played will be paused. The slots can be resumed by calling {@link SoundComponent#resume}.
    *
    * @param {string} [name] - The name of the slot to pause. Leave undefined to pause everything.
    * @example
    * // pause all sounds
    * this.entity.sound.pause();
    * // pause a specific sound
    * this.entity.sound.pause('beep');
    */
  def pause(): Unit = js.native
  def pause(name: String): Unit = js.native
  
  def pitch: Double = js.native
  /**
    * The pitch modifier to play the audio with. Must be larger than 0.01. Defaults to 1.
    *
    * @type {number}
    */
  def pitch_=(arg: Double): Unit = js.native
  
  /**
    * Begins playing the sound slot with the specified name. The slot will restart playing if it
    * is already playing unless the overlap field is true in which case a new sound will be
    * created and played.
    *
    * @param {string} name - The name of the {@link SoundSlot} to play.
    * @returns {import('../../../platform/sound/instance.js').SoundInstance|null} The sound
    * instance that will be played. Returns null if the component or its parent entity is disabled
    * or if the SoundComponent has no slot with the specified name.
    * @example
    * // get asset by id
    * const asset = app.assets.get(10);
    * // create a slot and play it
    * this.entity.sound.addSlot('beep', {
    *     asset: asset
    * });
    * this.entity.sound.play('beep');
    */
  def play(name: String): SoundInstance | Null = js.native
  
  def positional: Boolean = js.native
  /**
    * If true the audio will play back at the location of the Entity in space, so the audio will
    * be affected by the position of the {@link AudioListenerComponent}. Defaults to true.
    *
    * @type {boolean}
    */
  def positional_=(arg: Boolean): Unit = js.native
  
  def refDistance: Double = js.native
  /**
    * The reference distance for reducing volume as the sound source moves further from the
    * listener. Defaults to 1.
    *
    * @type {number}
    */
  def refDistance_=(arg: Double): Unit = js.native
  
  /**
    * Removes the {@link SoundSlot} with the specified name.
    *
    * @param {string} name - The name of the slot.
    * @example
    * // remove a slot called 'beep'
    * this.entity.sound.removeSlot('beep');
    */
  def removeSlot(name: String): Unit = js.native
  
  /**
    * Resumes playback of the sound slot with the specified name if it's paused. If no name is
    * specified all slots will be resumed.
    *
    * @param {string} [name] - The name of the slot to resume. Leave undefined to resume everything.
    * @example
    * // resume all sounds
    * this.entity.sound.resume();
    * // resume a specific sound
    * this.entity.sound.resume('beep');
    */
  def resume(): Unit = js.native
  def resume(name: String): Unit = js.native
  
  def rollOffFactor: Double = js.native
  /**
    * The factor used in the falloff equation. Defaults to 1.
    *
    * @type {number}
    */
  def rollOffFactor_=(arg: Double): Unit = js.native
  
  /**
    * Returns the slot with the specified name.
    *
    * @param {string} name - The name of the slot.
    * @returns {SoundSlot|undefined} The slot.
    * @example
    * // get a slot and set its volume
    * this.entity.sound.slot('beep').volume = 0.5;
    *
    */
  def slot(name: String): js.UndefOr[SoundSlot] = js.native
  
  def slots: StringDictionary[SoundSlot] = js.native
  /**
    * A dictionary that contains the {@link SoundSlot}s managed by this SoundComponent.
    *
    * @type {Object<string, SoundSlot>}
    */
  def slots_=(arg: StringDictionary[SoundSlot]): Unit = js.native
  
  /**
    * Stops playback of the sound slot with the specified name if it's paused. If no name is
    * specified all slots will be stopped.
    *
    * @param {string} [name] - The name of the slot to stop. Leave undefined to stop everything.
    * @example
    * // stop all sounds
    * this.entity.sound.stop();
    * // stop a specific sound
    * this.entity.sound.stop('beep');
    */
  def stop(): Unit = js.native
  def stop(name: String): Unit = js.native
  
  def volume: Double = js.native
  /**
    * The volume modifier to play the audio with. In range 0-1. Defaults to 1.
    *
    * @type {number}
    */
  def volume_=(arg: Double): Unit = js.native
}
