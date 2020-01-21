package typings.playcanvas.pc

import typings.playcanvas.AnonForceWebAudioApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SoundManager
  * @extends pc.EventHandler
  * @classdesc The SoundManager is used to load and play audio. As well as apply system-wide settings
  * like global volume, suspend and resume.
  * @description Creates a new sound manager.
  * @param {Object} [options] Options options object.
  * @param {Boolean} [options.forceWebAudioApi] Always use the Web Audio API even check indicates that it if not available
  * @property {Number} volume Global volume for the manager. All {@link pc.SoundInstance}s will scale their volume with this volume. Valid between [0, 1].
  */
@JSGlobal("pc.SoundManager")
@js.native
class SoundManager () extends EventHandler {
  def this(options: AnonForceWebAudioApi) = this()
  /**
    * Global volume for the manager. All {@link pc.SoundInstance}s will scale their volume with this volume. Valid between [0, 1].
    */
  var volume: Double = js.native
}

