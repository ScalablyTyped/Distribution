package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.AudioListenerComponentSystem
  * @extends pc.ComponentSystem
  * @classdesc Component System for adding and removing {@link pc.AudioComponent} objects to Entities.
  * @description Create a new AudioListenerComponentSystem
  * @param {pc.Application} app The application managing this system.
  * @param {pc.SoundManager} manager A sound manager instance.
  */
@JSImport("playcanvas", "AudioListenerComponentSystem")
@js.native
class AudioListenerComponentSystem protected ()
  extends typings.playcanvas.pcNs.AudioListenerComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application, manager: typings.playcanvas.pcNs.SoundManager) = this()
}

