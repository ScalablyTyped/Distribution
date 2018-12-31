package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @name pc.AudioListenerComponent
  * @class Represents the audio listener in the 3D world, so that 3D positioned audio sources are heard correctly.
  * @description Create new AudioListenerComponent
  * @param {pc.AudioListenerComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @extends pc.Component
  */
@JSGlobal("pc.AudioListenerComponent")
@js.native
class AudioListenerComponent protected () extends Component {
  def this(system: AudioListenerComponentSystem, entity: Entity) = this()
}

