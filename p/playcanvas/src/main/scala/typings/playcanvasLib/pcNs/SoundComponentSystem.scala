package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.SoundComponentSystem
  * @class Manages creation of {@link pc.SoundComponent}s.
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
  var context: stdLib.AudioContext = js.native
  var manager: SoundManager = js.native
  var volume: scala.Double = js.native
}

