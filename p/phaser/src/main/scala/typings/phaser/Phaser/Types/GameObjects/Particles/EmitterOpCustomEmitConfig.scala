package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitterOpCustomEmitConfig
  extends StObject
     with _EmitterOpOnEmitType {
  
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  def onEmit(particle: Particle, key: String, value: Double): Unit
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  @JSName("onEmit")
  var onEmit_Original: EmitterOpOnEmitCallback
}
object EmitterOpCustomEmitConfig {
  
  @scala.inline
  def apply(onEmit: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): EmitterOpCustomEmitConfig = {
    val __obj = js.Dynamic.literal(onEmit = js.Any.fromFunction3(onEmit))
    __obj.asInstanceOf[EmitterOpCustomEmitConfig]
  }
  
  @scala.inline
  implicit class EmitterOpCustomEmitConfigMutableBuilder[Self <: EmitterOpCustomEmitConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEmit(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "onEmit", js.Any.fromFunction3(value))
  }
}
