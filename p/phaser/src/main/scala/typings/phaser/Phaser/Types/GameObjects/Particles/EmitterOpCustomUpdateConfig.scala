package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitterOpCustomUpdateConfig
  extends StObject
     with _EmitterOpOnUpdateType {
  
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  var onEmit: js.UndefOr[EmitterOpOnEmitCallback] = js.undefined
  
  /**
    * A callback that is invoked each time the emitter updates.
    */
  def onUpdate(particle: Particle, key: String, t: Double, value: Double): Unit
  /**
    * A callback that is invoked each time the emitter updates.
    */
  @JSName("onUpdate")
  var onUpdate_Original: EmitterOpOnUpdateCallback
}
object EmitterOpCustomUpdateConfig {
  
  inline def apply(onUpdate: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): EmitterOpCustomUpdateConfig = {
    val __obj = js.Dynamic.literal(onUpdate = js.Any.fromFunction4(onUpdate))
    __obj.asInstanceOf[EmitterOpCustomUpdateConfig]
  }
  
  extension [Self <: EmitterOpCustomUpdateConfig](x: Self) {
    
    inline def setOnEmit(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Unit): Self = StObject.set(x, "onEmit", js.Any.fromFunction3(value))
    
    inline def setOnEmitUndefined: Self = StObject.set(x, "onEmit", js.undefined)
    
    inline def setOnUpdate(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction4(value))
  }
}
