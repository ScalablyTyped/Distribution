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
  
  @scala.inline
  def apply(source: RandomZoneSource): ParticleEmitterRandomZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterRandomZoneConfig]
  }
  
  @scala.inline
  implicit class ParticleEmitterRandomZoneConfigMutableBuilder[Self <: ParticleEmitterRandomZoneConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: RandomZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
