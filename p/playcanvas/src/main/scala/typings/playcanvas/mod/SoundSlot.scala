package typings.playcanvas.mod

import typings.playcanvas.anon.Asset
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SoundSlot controls playback of an audio asset.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "SoundSlot")
@js.native
open class SoundSlot protected () extends EventHandler {
  /**
    * Create a new SoundSlot.
    *
    * @param {import('./component.js').SoundComponent} component - The Component that created this
    * slot.
    * @param {string} [name] - The name of the slot. Defaults to 'Untitled'.
    * @param {object} [options] - Settings for the slot.
    * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
    * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
    * @param {boolean} [options.loop=false] - If true the sound will restart when it reaches the
    * end.
    * @param {number} [options.startTime=0] - The start time from which the sound will start
    * playing.
    * @param {number} [options.duration=null] - The duration of the sound that the slot will play
    * starting from startTime.
    * @param {boolean} [options.overlap=false] - If true then sounds played from slot will be
    * played independently of each other. Otherwise the slot will first stop the current sound
    * before starting the new one.
    * @param {boolean} [options.autoPlay=false] - If true the slot will start playing as soon as
    * its audio asset is loaded.
    * @param {number} [options.asset=null] - The asset id of the audio asset that is going to be
    * played by this slot.
    */
  def this(component: SoundComponent) = this()
  def this(component: SoundComponent, name: String) = this()
  def this(component: SoundComponent, name: String, options: Asset) = this()
  def this(component: SoundComponent, name: Unit, options: Asset) = this()
  
  var _asset: Double = js.native
  
  var _assets: AssetRegistry = js.native
  
  var _autoPlay: Boolean = js.native
  
  var _component: SoundComponent = js.native
  
  /**
    * Creates a new {@link SoundInstance} with the properties of the slot.
    *
    * @returns {SoundInstance} The new instance.
    * @private
    */
  /* private */ var _createInstance: Any = js.native
  
  var _duration: Double = js.native
  
  var _firstNode: AudioNode = js.native
  
  /**
    * Reports whether an asset is set on this slot.
    *
    * @returns {boolean} Returns true if the slot has an asset assigned.
    * @private
    */
  /* private */ var _hasAsset: Any = js.native
  
  var _lastNode: AudioNode = js.native
  
  var _loop: Boolean = js.native
  
  var _manager: Any = js.native
  
  def _onAssetAdd(asset: Any): Unit = js.native
  
  def _onAssetLoad(asset: Any): Unit = js.native
  
  def _onAssetRemoved(asset: Any): Unit = js.native
  
  def _onInstanceEnd(instance: Any): Unit = js.native
  
  var _onInstanceEndHandler: Any = js.native
  
  def _onInstancePause(instance: Any): Unit = js.native
  
  var _onInstancePauseHandler: Any = js.native
  
  def _onInstancePlay(instance: Any): Unit = js.native
  
  var _onInstancePlayHandler: Any = js.native
  
  def _onInstanceResume(instance: Any): Unit = js.native
  
  var _onInstanceResumeHandler: Any = js.native
  
  def _onInstanceStop(instance: Any): Unit = js.native
  
  var _onInstanceStopHandler: Any = js.native
  
  var _overlap: Boolean = js.native
  
  var _pitch: Double = js.native
  
  var _startTime: Double = js.native
  
  var _volume: Double = js.native
  
  def asset: Double = js.native
  /**
    * The asset id.
    *
    * @type {number|null}
    */
  def asset_=(arg: Double): Unit = js.native
  
  def autoPlay: Boolean = js.native
  /**
    * If true the slot will begin playing as soon as it is loaded.
    *
    * @type {boolean}
    */
  def autoPlay_=(arg: Boolean): Unit = js.native
  
  /**
    * Clears any external nodes set by {@link SoundSlot#setExternalNodes}.
    */
  def clearExternalNodes(): Unit = js.native
  
  def duration: Double = js.native
  /**
    * The duration of the sound that the slot will play starting from startTime.
    *
    * @type {number}
    */
  def duration_=(arg: Double): Unit = js.native
  
  /**
    * Gets an array that contains the two external nodes set by {@link SoundSlot#setExternalNodes}.
    *
    * @returns {AudioNode[]} An array of 2 elements that contains the first and last nodes set by
    * {@link SoundSlot#setExternalNodes}.
    */
  def getExternalNodes(): js.Array[AudioNode] = js.native
  
  /**
    * An array that contains all the {@link SoundInstance}s currently being played by the slot.
    *
    * @type {SoundInstance[]}
    */
  var instances: js.Array[SoundInstance] = js.native
  
  /**
    * Returns true if the asset of the slot is loaded.
    *
    * @type {boolean}
    */
  def isLoaded: Boolean = js.native
  
  /**
    * Returns true if the slot is currently paused.
    *
    * @type {boolean}
    */
  def isPaused: Boolean = js.native
  
  /**
    * Returns true if the slot is currently playing.
    *
    * @type {boolean}
    */
  def isPlaying: Boolean = js.native
  
  /**
    * Returns true if the slot is currently stopped.
    *
    * @type {boolean}
    */
  def isStopped: Boolean = js.native
  
  /**
    * Loads the asset assigned to this slot.
    */
  def load(): Unit = js.native
  
  def loop: Boolean = js.native
  /**
    * If true the slot will restart when it finishes playing.
    *
    * @type {boolean}
    */
  def loop_=(arg: Boolean): Unit = js.native
  
  /**
    * The name of the slot.
    *
    * @type {string}
    */
  var name: String = js.native
  
  def overlap: Boolean = js.native
  /**
    * If true then sounds played from slot will be played independently of each other. Otherwise
    * the slot will first stop the current sound before starting the new one.
    *
    * @type {boolean}
    */
  def overlap_=(arg: Boolean): Unit = js.native
  
  /**
    * Pauses all sound instances. To continue playback call {@link SoundSlot#resume}.
    *
    * @returns {boolean} True if the sound instances paused successfully, false otherwise.
    */
  def pause(): Boolean = js.native
  
  def pitch: Double = js.native
  /**
    * The pitch modifier to play the sound with. Must be larger than 0.01.
    *
    * @type {number}
    */
  def pitch_=(arg: Double): Unit = js.native
  
  /**
    * Fired when a sound instance starts playing.
    *
    * @event SoundSlot#play
    * @param {SoundInstance} instance - The instance that started playing.
    */
  /**
    * Fired when a sound instance is paused.
    *
    * @event SoundSlot#pause
    * @param {SoundInstance} instance - The instance that was paused created to play the sound.
    */
  /**
    * Fired when a sound instance is resumed.
    *
    * @event SoundSlot#resume
    * @param {SoundInstance} instance - The instance that was resumed.
    */
  /**
    * Fired when a sound instance is stopped.
    *
    * @event SoundSlot#stop
    * @param {SoundInstance} instance - The instance that was stopped.
    */
  /**
    * Fired when the asset assigned to the slot is loaded.
    *
    * @event SoundSlot#load
    * @param {Sound} sound - The sound resource that was loaded.
    */
  /**
    * Plays a sound. If {@link SoundSlot#overlap} is true the new sound instance will be played
    * independently of any other instances already playing. Otherwise existing sound instances
    * will stop before playing the new sound.
    *
    * @returns {SoundInstance} The new sound instance.
    */
  def play(): SoundInstance = js.native
  
  /**
    * Resumes playback of all paused sound instances.
    *
    * @returns {boolean} True if any instances were resumed.
    */
  def resume(): Boolean = js.native
  
  /**
    * Connect external Web Audio API nodes. Any sound played by this slot will automatically
    * attach the specified nodes to the source that plays the sound. You need to pass the first
    * node of the node graph that you created externally and the last node of that graph. The
    * first node will be connected to the audio source and the last node will be connected to the
    * destination of the AudioContext (e.g. speakers).
    *
    * @param {AudioNode} firstNode - The first node that will be connected to the audio source of
    * sound instances.
    * @param {AudioNode} [lastNode] - The last node that will be connected to the destination of
    * the AudioContext. If unspecified then the firstNode will be connected to the destination
    * instead.
    * @example
    * const context = app.systems.sound.context;
    * const analyzer = context.createAnalyzer();
    * const distortion = context.createWaveShaper();
    * const filter = context.createBiquadFilter();
    * analyzer.connect(distortion);
    * distortion.connect(filter);
    * slot.setExternalNodes(analyzer, filter);
    */
  def setExternalNodes(firstNode: AudioNode): Unit = js.native
  def setExternalNodes(firstNode: AudioNode, lastNode: AudioNode): Unit = js.native
  
  def startTime: Double = js.native
  /**
    * The start time from which the sound will start playing.
    *
    * @type {number}
    */
  def startTime_=(arg: Double): Unit = js.native
  
  /**
    * Stops playback of all sound instances.
    *
    * @returns {boolean} True if any instances were stopped.
    */
  def stop(): Boolean = js.native
  
  def updatePosition(position: Any): Unit = js.native
  
  def volume: Double = js.native
  /**
    * The volume modifier to play the sound with. In range 0-1.
    *
    * @type {number}
    */
  def volume_=(arg: Double): Unit = js.native
}
