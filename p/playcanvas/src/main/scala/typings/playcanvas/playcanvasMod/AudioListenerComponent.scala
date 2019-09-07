package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.AudioListenerComponent
  * @classdesc Represents the audio listener in the 3D world, so that 3D positioned audio sources are heard correctly.
  * @description Create new AudioListenerComponent
  * @param {pc.AudioListenerComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @extends pc.Component
  */
@JSImport("playcanvas", "AudioListenerComponent")
@js.native
class AudioListenerComponent protected ()
  extends typings.playcanvas.pcNs.AudioListenerComponent {
  def this(
    system: typings.playcanvas.pcNs.AudioListenerComponentSystem,
    entity: typings.playcanvas.pcNs.Entity
  ) = this()
}

