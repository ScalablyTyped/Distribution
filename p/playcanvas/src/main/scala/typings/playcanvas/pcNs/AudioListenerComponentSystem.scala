package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.AudioListenerComponentSystem
  * @class Component System for adding and removing {@link pc.AudioComponent} objects to Entities.
  * @description Create a new AudioListenerComponentSystem
  * @extends pc.ComponentSystem
  */
@JSGlobal("pc.AudioListenerComponentSystem")
@js.native
class AudioListenerComponentSystem protected () extends ComponentSystem {
  def this(app: Application, manager: SoundManager) = this()
}

