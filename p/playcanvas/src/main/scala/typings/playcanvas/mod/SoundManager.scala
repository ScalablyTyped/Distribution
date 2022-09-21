package typings.playcanvas.mod

import typings.playcanvas.anon.ForceWebAudioApi
import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SoundManager is used to load and play audio. It also applies system-wide settings like
  * global volume, suspend and resume.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "SoundManager")
@js.native
/**
  * Create a new SoundManager instance.
  *
  * @param {object} [options] - Options options object.
  * @param {boolean} [options.forceWebAudioApi] - Always use the Web Audio API, even if check
  * indicates that it is not available.
  */
open class SoundManager () extends EventHandler {
  def this(options: ForceWebAudioApi) = this()
  
  /**
    * Add the necessary Window EventListeners to comply with auto-play policies,
    * and correctly unlock and resume the AudioContext.
    * For more info, https://developers.google.com/web/updates/2018/11/web-audio-autoplay.
    *
    * @private
    */
  /* private */ var _addContextUnlockListeners: Any = js.native
  
  /**
    * The underlying AudioContext, lazy loaded in the 'context' property.
    *
    * @type {AudioContext}
    * @private
    */
  /* private */ var _context: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _forceWebAudioApi: Any = js.native
  
  /**
    * Remove all USER_INPUT_EVENTS unlock event listeners, if they're still attached.
    *
    * @private
    */
  /* private */ var _removeUserInputListeners: Any = js.native
  
  /**
    * The function callback attached to the Window events USER_INPUT_EVENTS
    *
    * @type {EventListenerOrEventListenerObject}
    * @private
    */
  /* private */ var _resumeContextCallback: Any = js.native
  
  /**
    * Set to to true when suspend() was called explitly (either manually or on visibility change),
    * and reset to false after resume() is called.
    * This value is not directly bound to AudioContext.state.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _selfSuspended: Any = js.native
  
  /**
    * If true, the AudioContext is in a special 'suspended' state where it needs to be resumed
    * from a User event. In addition, some devices and browsers require that a blank sound be played.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _unlocked: Any = js.native
  
  /**
    * Set after the unlock flow is triggered, but hasn't completed yet.
    * Used to avoid starting multiple 'unlock' flows at the same time.
    *
    * @type {boolean}
    * @private
    */
  /* private */ var _unlocking: Any = js.native
  
  var _volume: Double = js.native
  
  /**
    * Get the Web Audio API context.
    *
    * @type {AudioContext}
    * @ignore
    */
  def context: AudioContext = js.native
  
  def destroy(): Unit = js.native
  
  var listener: Listener = js.native
  
  /**
    * Create a new {@link Channel} and begin playback of the sound.
    *
    * @param {Sound} sound - The Sound object to play.
    * @param {object} options - Optional options object.
    * @param {number} [options.volume] - The volume to playback at, between 0 and 1.
    * @param {boolean} [options.loop] - Whether to loop the sound when it reaches the end.
    * @returns {Channel} The channel playing the sound.
    * @private
    */
  /* private */ var playSound: Any = js.native
  
  /**
    * Create a new {@link Channel3d} and begin playback of the sound at the position specified.
    *
    * @param {Sound} sound - The Sound object to play.
    * @param {Vec3} position - The position of the sound in 3D space.
    * @param {object} options - Optional options object.
    * @param {number} [options.volume] - The volume to playback at, between 0 and 1.
    * @param {boolean} [options.loop] - Whether to loop the sound when it reaches the end.
    * @returns {Channel3d} The 3D channel playing the sound.
    * @private
    */
  /* private */ var playSound3d: Any = js.native
  
  def resume(): Unit = js.native
  
  def suspend(): Unit = js.native
  
  def suspended: Boolean = js.native
  
  def volume: Double = js.native
  /**
    * Global volume for the manager. All {@link SoundInstance}s will scale their volume with this
    * volume. Valid between [0, 1].
    *
    * @type {number}
    */
  def volume_=(arg: Double): Unit = js.native
}
