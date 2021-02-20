package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitterOpCustomUpdateConfig extends _EmitterOpOnUpdateType {
  
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  var onEmit: js.UndefOr[EmitterOpOnEmitCallback] = js.native
  
  /**
    * A callback that is invoked each time the emitter updates.
    */
  def onUpdate(particle: Particle, key: String, t: Double, value: Double): Unit = js.native
  /**
    * A callback that is invoked each time the emitter updates.
    */
  @JSName("onUpdate")
  var onUpdate_Original: EmitterOpOnUpdateCallback = js.native
}
