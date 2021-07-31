package typings.playcanvas.pc

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait SoundSlot
  extends StObject
     with EventHandler {
  
  /**
    * The asset id.
    */
  var asset: Double | Null = js.native
  
  /**
    * If true the slot will begin playing as soon as it is loaded.
    */
  var autoPlay: Boolean = js.native
  
  /**
    * Clears any external nodes set by {@link pc.SoundSlot#setExternalNodes}.
    */
  def clearExternalNodes(): Unit = js.native
  
  /**
    * The duration of the sound that the slot will play starting from startTime.
    */
  var duration: Double = js.native
  
  /**
    * Gets an array that contains the two external nodes set by {@link pc.SoundSlot#setExternalNodes}.
    * @returns An array of 2 elements that contains the first and last nodes set by {@link pc.SoundSlot#setExternalNodes}.
    */
  def getExternalNodes(): js.Array[AudioNode] = js.native
  
  /**
    * An array that contains all the {@link pc.SoundInstance}s currently being played by the slot.
    */
  var instances: js.Array[SoundInstance] = js.native
  
  /**
    * Returns true if the asset of the slot is loaded.
    */
  var isLoaded: Boolean = js.native
  
  /**
    * Returns true if the slot is currently paused.
    */
  var isPaused: Boolean = js.native
  
  /**
    * Returns true if the slot is currently playing.
    */
  var isPlaying: Boolean = js.native
  
  /**
    * Returns true if the slot is currently stopped.
    */
  var isStopped: Boolean = js.native
  
  /**
    * Loads the asset assigned to this slot.
    */
  def load(): Unit = js.native
  
  /**
    * If true the slot will restart when it finishes playing.
    */
  var loop: Boolean = js.native
  
  /**
    * The name of the slot.
    */
  var name: String = js.native
  
  /**
    * If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
    */
  var overlap: Boolean = js.native
  
  /**
    * Pauses all sound instances. To continue playback call {@link pc.SoundSlot#resume}.
    * @returns True if the sound instances paused successfully, false otherwise.
    */
  def pause(): Boolean = js.native
  
  /**
    * The pitch modifier to play the sound with. Must be larger than 0.01.
    */
  var pitch: Double = js.native
  
  /**
    * Plays a sound. If {@link pc.SoundSlot#overlap} is true the new sound
    * instance will be played independently of any other instances already playing.
    * Otherwise existing sound instances will stop before playing the new sound.
    * @returns The new sound instance.
    */
  def play(): SoundInstance = js.native
  
  /**
    * Resumes playback of all paused sound instances.
    * @returns True if any instances were resumed.
    */
  def resume(): Boolean = js.native
  
  /**
    * Connect external Web Audio API nodes. Any sound played by this slot will
    * automatically attach the specified nodes to the source that plays the sound. You need to pass
    * the first node of the node graph that you created externally and the last node of that graph. The first
    * node will be connected to the audio source and the last node will be connected to the destination of the AudioContext (e.g. speakers).
    * @example
    * var context = app.systems.sound.context;
    * var analyzer = context.createAnalyzer();
    * var distortion = context.createWaveShaper();
    * var filter = context.createBiquadFilter();
    * analyzer.connect(distortion);
    * distortion.connect(filter);
    * slot.setExternalNodes(analyzer, filter);
    * @param firstNode - The first node that will be connected to the audio source of sound instances.
    * @param [lastNode] - The last node that will be connected to the destination of the AudioContext.
    * If unspecified then the firstNode will be connected to the destination instead.
    */
  def setExternalNodes(firstNode: AudioNode): Unit = js.native
  def setExternalNodes(firstNode: AudioNode, lastNode: AudioNode): Unit = js.native
  
  /**
    * The start time from which the sound will start playing.
    */
  var startTime: Double = js.native
  
  /**
    * Stops playback of all sound instances.
    * @returns True if any instances were stopped.
    */
  def stop(): Boolean = js.native
  
  /**
    * The volume modifier to play the sound with. In range 0-1.
    */
  var volume: Double = js.native
}
