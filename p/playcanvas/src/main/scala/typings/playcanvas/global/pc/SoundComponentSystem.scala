package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a SoundComponentSystem.
  * @property volume - Sets / gets the volume for the entire Sound system. All sounds will have their volume
  multiplied by this value. Valid between [0, 1].
  * @property context - Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
  * @property manager - Gets / sets the sound manager.
  * @param app - The Application.
  * @param manager - The sound manager.
  */
@JSGlobal("pc.SoundComponentSystem")
@js.native
class SoundComponentSystem protected ()
  extends typings.playcanvas.pc.SoundComponentSystem {
  def this(app: typings.playcanvas.pc.Application, manager: typings.playcanvas.pc.SoundManager) = this()
}

