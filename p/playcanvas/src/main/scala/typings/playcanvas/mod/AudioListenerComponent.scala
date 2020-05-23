package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create new AudioListenerComponent.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSImport("playcanvas", "AudioListenerComponent")
@js.native
class AudioListenerComponent protected ()
  extends typings.playcanvas.pc.Component {
  def this(system: typings.playcanvas.pc.AudioListenerComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

