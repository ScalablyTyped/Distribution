package typings.playcanvas.mod

import typings.playcanvas.anon.Duration
import typings.std.AudioBufferSourceNode
import typings.std.AudioNode
import typings.std.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SoundInstance plays a {@link Sound}.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "SoundInstance")
@js.native
open class SoundInstance protected () extends EventHandler {
  /**
    * Create a new SoundInstance instance.
    *
    * @param {import('./manager.js').SoundManager} manager - The sound manager.
    * @param {import('./sound.js').Sound} sound - The sound to play.
    * @param {object} options - Options for the instance.
    * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
    * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
    * @param {boolean} [options.loop=false] - Whether the sound should loop when it reaches the
    * end or not.
    * @param {number} [options.startTime=0] - The time from which the playback will start in
    * seconds. Default is 0 to start at the beginning.
    * @param {number} [options.duration=0] - The total time after the startTime in seconds when
    * playback will stop or restart if loop is true.
    * @param {Function} [options.onPlay=null] - Function called when the instance starts playing.
    * @param {Function} [options.onPause=null] - Function called when the instance is paused.
    * @param {Function} [options.onResume=null] - Function called when the instance is resumed.
    * @param {Function} [options.onStop=null] - Function called when the instance is stopped.
    * @param {Function} [options.onEnd=null] - Function called when the instance ends.
    */
  def this(manager: SoundManager, sound: Sound, options: Duration) = this()
  
  /**
    * The connected node is the one that is connected to the destination (speakers). Any
    * external nodes will be connected to this node.
    *
    * @type {AudioNode|null}
    * @private
    */
  /* private */ var _connectorNode: Any = js.native
  
  /**
    * Creates the source for the instance.
    *
    * @returns {AudioBufferSourceNode|null} Returns the created source or null if the sound
    * instance has no {@link Sound} associated with it.
    * @private
    */
  /* private */ var _createSource: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _currentOffset: Any = js.native
  
  /**
    * Manually keep track of the playback position because the Web Audio API does not
    * provide a way to do this accurately if the playbackRate is not 1.
    *
    * @type {number}
    * @private
    */
  /* private */ var _currentTime: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _duration: Any = js.native
  
  /** @private */
  /* private */ var _endedHandler: Any = js.native
  
  /**
    * The first external node set by a user.
    *
    * @type {AudioNode|null}
    * @private
    */
  /* private */ var _firstNode: Any = js.native
  
  /**
    * Creates internal audio nodes and connects them.
    *
    * @private
    */
  /* private */ var _initializeNodes: Any = js.native
  
  /**
    * The input node is the one that is connected to the source.
    *
    * @type {AudioNode|null}
    * @private
    */
  /* private */ var _inputNode: Any = js.native
  
  /** @private */
  /* private */ var _isReady: Any = js.native
  
  /**
    * The last external node set by a user.
    *
    * @type {AudioNode|null}
    * @private
    */
  /* private */ var _lastNode: Any = js.native
  
  /** @private */
  /* private */ var _loadedMetadataHandler: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _loop: Any = js.native
  
  /**
    * @type {import('./manager.js').SoundManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /** @private */
  /* private */ var _onEndCallback: Any = js.native
  
  /** @private */
  /* private */ var _onEnded: Any = js.native
  
  /**
    * Handle the manager's 'destroy' event.
    *
    * @private
    */
  /* private */ var _onManagerDestroy: Any = js.native
  
  /**
    * Handle the manager's 'resume' event.
    *
    * @private
    */
  /* private */ var _onManagerResume: Any = js.native
  
  /**
    * Handle the manager's 'suspend' event.
    *
    * @private
    */
  /* private */ var _onManagerSuspend: Any = js.native
  
  /**
    * Handle the manager's 'volumechange' event.
    *
    * @private
    */
  /* private */ var _onManagerVolumeChange: Any = js.native
  
  /** @private */
  /* private */ var _onPause: Any = js.native
  
  /** @private */
  /* private */ var _onPauseCallback: Any = js.native
  
  /** @private */
  /* private */ var _onPlay: Any = js.native
  
  /** @private */
  /* private */ var _onPlayCallback: Any = js.native
  
  /** @private */
  /* private */ var _onResume: Any = js.native
  
  /** @private */
  /* private */ var _onResumeCallback: Any = js.native
  
  /** @private */
  /* private */ var _onStop: Any = js.native
  
  /** @private */
  /* private */ var _onStopCallback: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _pitch: Any = js.native
  
  /**
    * Immediately play the sound.
    * This method assumes the AudioContext is ready (not suspended or locked).
    *
    * @private
    */
  /* private */ var _playAudioImmediate: Any = js.native
  
  /**
    * If true then the instance will start playing its source when its created.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _playWhenLoaded: Any = js.native
  
  /**
    * @type {import('./sound.js').Sound}
    * @private
    */
  /* private */ var _sound: Any = js.native
  
  /**
    * @type {number|null}
    * @private
    */
  /* private */ var _startOffset: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _startTime: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _startedAt: Any = js.native
  
  /**
    * Start at 'stopped'.
    *
    * @type {number}
    * @private
    */
  /* private */ var _state: Any = js.native
  
  /**
    * Greater than 0 if we want to suspend the event handled to the 'onended' event.
    * When an 'onended' event is suspended, this counter is decremented by 1.
    * When a future 'onended' event is to be suspended, this counter is incremented by 1.
    *
    * @type {number}
    * @private
    */
  /* private */ var _suspendEndEvent: Any = js.native
  
  /**
    * True if we want to suspend firing instance events.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _suspendInstanceEvents: Any = js.native
  
  /**
    * True if the manager was suspended.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _suspended: Any = js.native
  
  /** @private */
  /* private */ var _timeUpdateHandler: Any = js.native
  
  /**
    * Sets the current time taking into account the time the instance started playing, the current
    * pitch and the current time offset.
    *
    * @private
    */
  /* private */ var _updateCurrentTime: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _volume: Any = js.native
  
  /**
    * Set to true if a play() request was issued when the AudioContext was still suspended,
    * and will therefore wait until it is resumed to play the audio.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _waitingContextSuspension: Any = js.native
  
  /**
    * Clears any external nodes set by {@link SoundInstance#setExternalNodes}.
    */
  def clearExternalNodes(): Unit = js.native
  
  def currentTime: Double = js.native
  /**
    * Fired when the instance starts playing its source.
    *
    * @event SoundInstance#play
    */
  /**
    * Fired when the instance is paused.
    *
    * @event SoundInstance#pause
    */
  /**
    * Fired when the instance is resumed.
    *
    * @event SoundInstance#resume
    */
  /**
    * Fired when the instance is stopped.
    *
    * @event SoundInstance#stop
    */
  /**
    * Fired when the sound currently played by the instance ends.
    *
    * @event SoundInstance#end
    */
  /**
    * Gets or sets the current time of the sound that is playing. If the value provided is bigger
    * than the duration of the instance it will wrap from the beginning.
    *
    * @type {number}
    */
  def currentTime_=(arg: Double): Unit = js.native
  
  def duration: Double = js.native
  /**
    * The duration of the sound that the instance will play starting from startTime.
    *
    * @type {number}
    */
  def duration_=(arg: Double): Unit = js.native
  
  var gain: GainNode = js.native
  
  /**
    * Gets any external nodes set by {@link SoundInstance#setExternalNodes}.
    *
    * @returns {AudioNode[]} Returns an array that contains the two nodes set by
    * {@link SoundInstance#setExternalNodes}.
    */
  def getExternalNodes(): js.Array[AudioNode] = js.native
  
  /**
    * Returns true if the instance is currently paused.
    *
    * @type {boolean}
    */
  def isPaused: Boolean = js.native
  
  /**
    * Returns true if the instance is currently playing.
    *
    * @type {boolean}
    */
  def isPlaying: Boolean = js.native
  
  /**
    * Returns true if the instance is currently stopped.
    *
    * @type {boolean}
    */
  def isStopped: Boolean = js.native
  
  /**
    * Returns true if the instance is currently suspended because the window is not focused.
    *
    * @type {boolean}
    */
  def isSuspended: Boolean = js.native
  
  def loop: Boolean = js.native
  /**
    * If true the instance will restart when it finishes playing.
    *
    * @type {boolean}
    */
  def loop_=(arg: Boolean): Unit = js.native
  
  /**
    * Pauses playback of sound. Call resume() to resume playback from the same position.
    *
    * @returns {boolean} Returns true if the sound was paused.
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
    * Attempt to begin playback the sound.
    * If the AudioContext is suspended, the audio will only start once it's resumed.
    * If the sound is already playing, this will restart the sound.
    *
    * @returns {boolean} True if the sound was started immediately.
    */
  def play(): Boolean = js.native
  
  /**
    * Resumes playback of the sound. Playback resumes at the point that the audio was paused.
    *
    * @returns {boolean} Returns true if the sound was resumed.
    */
  def resume(): Boolean = js.native
  
  /**
    * Connects external Web Audio API nodes. You need to pass the first node of the node graph
    * that you created externally and the last node of that graph. The first node will be
    * connected to the audio source and the last node will be connected to the destination of the
    * AudioContext (e.g. speakers). Requires Web Audio API support.
    *
    * @param {AudioNode} firstNode - The first node that will be connected to the audio source of sound instances.
    * @param {AudioNode} [lastNode] - The last node that will be connected to the destination of the AudioContext.
    * If unspecified then the firstNode will be connected to the destination instead.
    * @example
    * const context = app.systems.sound.context;
    * const analyzer = context.createAnalyzer();
    * const distortion = context.createWaveShaper();
    * const filter = context.createBiquadFilter();
    * analyzer.connect(distortion);
    * distortion.connect(filter);
    * instance.setExternalNodes(analyzer, filter);
    */
  def setExternalNodes(firstNode: AudioNode): Unit = js.native
  def setExternalNodes(firstNode: AudioNode, lastNode: AudioNode): Unit = js.native
  
  def sound: Sound = js.native
  /**
    * The sound resource that the instance will play.
    *
    * @type {import('./sound.js').Sound}
    */
  def sound_=(arg: Sound): Unit = js.native
  
  /**
    * Gets the source that plays the sound resource. If the Web Audio API is not supported the
    * type of source is [Audio](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/audio).
    * Source is only available after calling play.
    *
    * @type {AudioBufferSourceNode}
    */
  var source: AudioBufferSourceNode = js.native
  
  def startTime: Double = js.native
  /**
    * The start time from which the sound will start playing.
    *
    * @type {number}
    */
  def startTime_=(arg: Double): Unit = js.native
  
  /**
    * Stops playback of sound. Calling play() again will restart playback from the beginning of
    * the sound.
    *
    * @returns {boolean} Returns true if the sound was stopped.
    */
  def stop(): Boolean = js.native
  
  def volume: Double = js.native
  /**
    * The volume modifier to play the sound with. In range 0-1.
    *
    * @type {number}
    */
  def volume_=(arg: Double): Unit = js.native
}
