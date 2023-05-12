package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _EmitterOpOnEmitType extends StObject
object _EmitterOpOnEmitType {
  
  inline def EmitterOpCustomEmitConfig(onEmit: (/* particle */ Particle, /* key */ String, /* value */ Double) => Double): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig = {
    val __obj = js.Dynamic.literal(onEmit = js.Any.fromFunction3(onEmit))
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig]
  }
  
  inline def EmitterOpRandomConfig(random: js.Array[Double]): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig]
  }
  
  inline def EmitterOpRandomMinMaxConfig(max: Double, min: Double): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig]
  }
  
  inline def EmitterOpRandomStartEndConfig(end: Double, random: Boolean, start: Double): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig]
  }
  
  inline def EmitterOpSteppedConfig(end: Double, start: Double, steps: Double): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig]
  }
}
