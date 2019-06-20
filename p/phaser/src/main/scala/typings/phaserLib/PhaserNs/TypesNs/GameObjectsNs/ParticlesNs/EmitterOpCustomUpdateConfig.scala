package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterOpCustomUpdateConfig extends _EmitterOpOnUpdateType {
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  var onEmit: js.UndefOr[EmitterOpOnEmitCallback] = js.native
  /**
    * A callback that is invoked each time the emitter updates.
    */
  @JSName("onUpdate")
  var onUpdate_Original: EmitterOpOnUpdateCallback = js.native
  /**
    * A callback that is invoked each time the emitter updates.
    */
  def onUpdate(
    particle: phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle,
    key: java.lang.String,
    t: scala.Double,
    value: scala.Double
  ): scala.Unit = js.native
}

