package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Geom.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig
  - typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig
  - typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone
  - typings.phaser.Phaser.GameObjects.Particles.Zones.RandomZone
*/
trait EmitZoneObject extends StObject
object EmitZoneObject {
  
  inline def EdgeZone(
    changeSource: EdgeZoneSource => typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone,
    counter: Double,
    getPoint: Particle => Unit,
    points: js.Array[Point],
    quantity: Double,
    seamless: Boolean,
    source: EdgeZoneSource | RandomZoneSource,
    stepRate: Double,
    total: Double,
    updateSource: () => typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone,
    yoyo: Boolean
  ): typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone = {
    val __obj = js.Dynamic.literal(changeSource = js.Any.fromFunction1(changeSource), counter = counter.asInstanceOf[js.Any], getPoint = js.Any.fromFunction1(getPoint), points = points.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], seamless = seamless.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stepRate = stepRate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updateSource = js.Any.fromFunction0(updateSource), yoyo = yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.GameObjects.Particles.Zones.EdgeZone]
  }
  
  inline def ParticleEmitterEdgeZoneConfig(quantity: Double, source: EdgeZoneSource, `type`: String): typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig]
  }
  
  inline def ParticleEmitterRandomZoneConfig(source: RandomZoneSource): typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig]
  }
  
  inline def RandomZone(getPoint: Particle => Unit, source: RandomZoneSource, total: Double): typings.phaser.Phaser.GameObjects.Particles.Zones.RandomZone = {
    val __obj = js.Dynamic.literal(getPoint = js.Any.fromFunction1(getPoint), source = source.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.phaser.Phaser.GameObjects.Particles.Zones.RandomZone]
  }
}
