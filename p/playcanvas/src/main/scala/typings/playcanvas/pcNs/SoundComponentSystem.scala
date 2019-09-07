package typings.playcanvas.pcNs

import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SoundComponentSystem
  * @classdesc Manages creation of {@link pc.SoundComponent}s.
  * @description Create a SoundComponentSystem
  * @param {pc.Application} app The Application
  * @param {pc.SoundManager} manager The sound manager
  * @property {Number} volume Sets / gets the volume for the entire Sound system. All sounds will have their volume
  * multiplied by this value. Valid between [0, 1].
  * @property {AudioContext} context Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
  * @property {pc.SoundManager} manager Gets / sets the sound manager
  * @extends pc.ComponentSystem
  */
@JSGlobal("pc.SoundComponentSystem")
@js.native
class SoundComponentSystem protected () extends ComponentSystem {
  def this(app: Application, manager: SoundManager) = this()
  /**
    * Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
    */
  var context: AudioContext = js.native
  /**
    * Gets / sets the sound manager
    */
  var manager: SoundManager = js.native
  /**
    * Sets / gets the volume for the entire Sound system. All sounds will have their volume
    * multiplied by this value. Valid between [0, 1].
    */
  var volume: Double = js.native
}

