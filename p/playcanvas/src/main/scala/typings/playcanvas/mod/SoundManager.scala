package typings.playcanvas.mod

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
open class SoundManager () extends EventHandler {
  
  var AudioContext: Any = js.native
  
  /**
    * The underlying AudioContext, lazy loaded in the 'context' property.
    *
    * @type {AudioContext}
    * @private
    */
  /* private */ var _context: Any = js.native
  
  def _registerUnlockListeners(): Unit = js.native
  
  def _removeUnlockListeners(): Unit = js.native
  
  def _resume(): Unit = js.native
  
  def _suspend(): Unit = js.native
  
  def _unlockHandler(): Unit = js.native
  
  var _unlockHandlerFunc: Any = js.native
  
  var _userSuspended: Boolean = js.native
  
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
    * @param {import('./sound.js').Sound} sound - The Sound object to play.
    * @param {object} [options] - Optional options object.
    * @param {number} [options.volume] - The volume to playback at, between 0 and 1.
    * @param {boolean} [options.loop] - Whether to loop the sound when it reaches the end.
    * @returns {Channel} The channel playing the sound.
    * @private
    */
  /* private */ var playSound: Any = js.native
  
  /**
    * Create a new {@link Channel3d} and begin playback of the sound at the position specified.
    *
    * @param {import('./sound.js').Sound} sound - The Sound object to play.
    * @param {import('../../core/math/vec3.js').Vec3} position - The position of the sound in 3D space.
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
