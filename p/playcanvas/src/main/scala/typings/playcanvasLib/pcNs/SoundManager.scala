package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.SoundManager
  * @class The SoundManager is used to load and play audio. As well as apply system-wide settings
  * like global volume, suspend and resume.
  * @description Creates a new sound manager.
  * @param {Object} [options]
  * @param {Boolean} [options.forceWebAudioApi] Always use the Web Audio API even check indicates that it if not available
  * @property {pc.Listener} listener Gets / sets the audio listener
  * @property {Number} volume Global volume for the manager. All {@link pc.SoundInstance}s will scale their volume with this volume. Valid between [0, 1].
  */
@JSGlobal("pc.SoundManager")
@js.native
class SoundManager protected () extends js.Object {
  def this(options: playcanvasLib.Anon_ForceWebAudioApi) = this()
  var listener: Listener = js.native
  var volume: scala.Double = js.native
  /**
    * @private
    * @function
    * @name pc.SoundManager.hasAudio
    * @description Reports whether this device supports the HTML5 Audio tag API
    * @returns true if HTML5 Audio tag API is supported and false otherwise
    */
  /* private */ def hasAudio(): scala.Boolean = js.native
  /**
    * @private
    * @function
    * @name pc.SoundManager.hasAudioContext
    * @description Reports whether this device supports the Web Audio API
    * @returns true if Web Audio is supported and false otherwise
    */
  /* private */ def hasAudioContext(): scala.Boolean = js.native
  /**
    * @private
    * @function
    * @name pc.SoundManager#playSound
    * @description Create a new pc.Channel and begin playback of the sound.
    * @param {pc.Sound} sound The Sound object to play.
    * @param {Object} options
    * @param {Number} [options.volume] The volume to playback at, between 0 and 1.
    * @param {Boolean} [options.loop] Whether to loop the sound when it reaches the end.
    */
  /* private */ def playSound(sound: Sound, options: playcanvasLib.Anon_LoopVolume): Channel = js.native
  /**
    * @private
    * @function
    * @name pc.SoundManager#playSound3d
    * @description Create a new pc.Channel3d and begin playback of the sound at the position specified
    * @param {pc.Sound} sound The Sound object to play.
    * @param {pc.Vec3} position The position of the sound in 3D space.
    * @param {Object} options
    * @param {Number} [options.volume] The volume to playback at, between 0 and 1.
    * @param {Boolean} [options.loop] Whether to loop the sound when it reaches the end.
    */
  /* private */ def playSound3d(sound: Sound, position: Vec3, options: playcanvasLib.Anon_LoopVolume): Channel3d = js.native
}

