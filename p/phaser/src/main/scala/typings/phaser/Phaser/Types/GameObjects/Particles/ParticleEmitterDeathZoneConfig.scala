package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterDeathZoneConfig
  extends StObject
     with DeathZoneObject {
  
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.DeathZone#source}.
    */
  var source: DeathZoneSource
  
  /**
    * 'onEnter' or 'onLeave'.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParticleEmitterDeathZoneConfig {
  
  inline def apply(source: DeathZoneSource): ParticleEmitterDeathZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterDeathZoneConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticleEmitterDeathZoneConfig] (val x: Self) extends AnyVal {
    
    inline def setSource(value: DeathZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
