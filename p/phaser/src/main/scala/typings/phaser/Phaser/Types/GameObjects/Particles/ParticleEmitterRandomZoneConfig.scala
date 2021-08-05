package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterRandomZoneConfig extends StObject {
  
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.RandomZone#source}.
    */
  var source: RandomZoneSource
  
  /**
    * 'random'.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParticleEmitterRandomZoneConfig {
  
  inline def apply(source: RandomZoneSource): ParticleEmitterRandomZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterRandomZoneConfig]
  }
  
  extension [Self <: ParticleEmitterRandomZoneConfig](x: Self) {
    
    inline def setSource(value: RandomZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
