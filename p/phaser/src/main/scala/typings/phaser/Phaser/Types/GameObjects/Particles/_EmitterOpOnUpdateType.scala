package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _EmitterOpOnUpdateType extends StObject
object _EmitterOpOnUpdateType {
  
  inline def EmitterOpCustomUpdateConfig(
    onUpdate: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Double
  ): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig = {
    val __obj = js.Dynamic.literal(onUpdate = js.Any.fromFunction4(onUpdate))
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig]
  }
  
  inline def EmitterOpEaseConfig(end: Double, start: Double): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig]
  }
  
  inline def EmitterOpInterpolationConfig(values: js.Array[Double]): typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpInterpolationConfig = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.EmitterOpInterpolationConfig]
  }
}
