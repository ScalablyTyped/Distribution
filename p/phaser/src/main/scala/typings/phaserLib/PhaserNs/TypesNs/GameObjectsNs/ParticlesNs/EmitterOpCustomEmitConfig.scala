package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterOpCustomEmitConfig extends _EmitterOpOnEmitType {
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  @JSName("onEmit")
  var onEmit_Original: EmitterOpOnEmitCallback = js.native
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  def onEmit(
    particle: phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle,
    key: java.lang.String,
    value: scala.Double
  ): scala.Unit = js.native
}

