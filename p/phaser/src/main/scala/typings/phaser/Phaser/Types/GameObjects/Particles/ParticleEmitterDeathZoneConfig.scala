package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleEmitterDeathZoneConfig extends StObject {
  
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.DeathZone#source}.
    */
  var source: DeathZoneSource = js.native
  
  /**
    * 'onEnter' or 'onLeave'.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ParticleEmitterDeathZoneConfig {
  
  @scala.inline
  def apply(source: DeathZoneSource): ParticleEmitterDeathZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterDeathZoneConfig]
  }
  
  @scala.inline
  implicit class ParticleEmitterDeathZoneConfigMutableBuilder[Self <: ParticleEmitterDeathZoneConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: DeathZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
