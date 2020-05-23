package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new AudioListenerComponentSystem.
  * @param app - The application managing this system.
  * @param manager - A sound manager instance.
  */
@JSImport("playcanvas", "AudioListenerComponentSystem")
@js.native
class AudioListenerComponentSystem protected ()
  extends typings.playcanvas.pc.EventHandler {
  def this(app: typings.playcanvas.pc.Application, manager: typings.playcanvas.pc.SoundManager) = this()
}

