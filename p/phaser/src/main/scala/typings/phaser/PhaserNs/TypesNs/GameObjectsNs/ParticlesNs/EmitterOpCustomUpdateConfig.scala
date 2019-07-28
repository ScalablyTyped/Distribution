package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.Particle
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
  def onUpdate(particle: Particle, key: String, t: Double, value: Double): Unit = js.native
}

