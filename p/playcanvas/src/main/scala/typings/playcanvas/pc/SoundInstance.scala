package typings.playcanvas.pc

import typings.std.AudioBufferSourceNode
import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait SoundInstance extends EventHandler {
  /**
    * Gets or sets the current time of the sound that is playing. If the value provided is bigger than the duration of the instance it will wrap from the beginning.
    */
  var currentTime: Double = js.native
  /**
    * The duration of the sound that the instance will play starting from startTime.
    */
  var duration: Double = js.native
  /**
    * Returns true if the instance is currently paused.
    */
  var isPaused: Boolean = js.native
  /**
    * Returns true if the instance is currently playing.
    */
  var isPlaying: Boolean = js.native
  /**
    * Returns true if the instance is currently stopped.
    */
  var isStopped: Boolean = js.native
  /**
    * Returns true if the instance is currently suspended because the window is not focused.
    */
  var isSuspended: Boolean = js.native
  /**
    * If true the instance will restart when it finishes playing.
    */
  var loop: Boolean = js.native
  /**
    * The pitch modifier to play the sound with. Must be larger than 0.01.
    */
  var pitch: Double = js.native
  /**
    * The sound resource that the instance will play.
    */
  var sound: Sound = js.native
  /**
    * Gets the source that plays the sound resource. If the Web Audio API is not supported the type of source is <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/audio" target="_blank">Audio</a>. Source is only available after calling play.
    */
  var source: AudioBufferSourceNode = js.native
  /**
    * The start time from which the sound will start playing.
    */
  var startTime: Double = js.native
  /**
    * The volume modifier to play the sound with. In range 0-1.
    */
  var volume: Double = js.native
  /**
    * Clears any external nodes set by {@link pc.SoundInstance#setExternalNodes}.
    */
  def clearExternalNodes(): Unit = js.native
  /**
    * Gets any external nodes set by {@link pc.SoundInstance#setExternalNodes}.
    * @returns Returns an array that contains the two nodes set by {@link pc.SoundInstance#setExternalNodes}.
    */
  def getExternalNodes(): js.Array[AudioNode] = js.native
  /**
    * Pauses playback of sound. Call resume() to resume playback from the same position.
    * @returns Returns true if the sound was paused.
    */
  def pause(): Boolean = js.native
  /**
    * Begins playback of sound. If the sound is not loaded this will return false.
    If the sound is already playing this will restart the sound.
    * @returns True if the sound was started.
    */
  def play(): Boolean = js.native
  /**
    * Resumes playback of the sound. Playback resumes at the point that the audio was paused.
    * @returns Returns true if the sound was resumed.
    */
  def resume(): Boolean = js.native
  /**
    * Connects external Web Audio API nodes. You need to pass
    the first node of the node graph that you created externally and the last node of that graph. The first
    node will be connected to the audio source and the last node will be connected to the destination of the
    AudioContext (e.g. speakers). Requires Web Audio API support.
    * @example
    * var context = app.systems.sound.context;
    var analyzer = context.createAnalyzer();
    var distortion = context.createWaveShaper();
    var filter = context.createBiquadFilter();
    analyzer.connect(distortion);
    distortion.connect(filter);
    instance.setExternalNodes(analyzer, filter);
    * @param firstNode - The first node that will be connected to the audio source of sound instances.
    * @param [lastNode] - The last node that will be connected to the destination of the AudioContext.
    If unspecified then the firstNode will be connected to the destination instead.
    */
  def setExternalNodes(firstNode: AudioNode): Unit = js.native
  def setExternalNodes(firstNode: AudioNode, lastNode: AudioNode): Unit = js.native
  /**
    * Stops playback of sound. Calling play() again will restart playback from the beginning of the sound.
    * @returns Returns true if the sound was stopped.
    */
  def stop(): Boolean = js.native
}

