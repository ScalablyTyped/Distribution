package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterEdgeZoneConfig extends StObject {
  
  /**
    * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    */
  var quantity: integer
  
  /**
    * Whether one endpoint will be removed if it's identical to the other.
    */
  var seamless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    */
  var source: EdgeZoneSource
  
  /**
    * The distance between each particle. When set, `quantity` is implied and should be set to 0.
    */
  var stepRate: js.UndefOr[Double] = js.undefined
  
  /**
    * 'edge'.
    */
  var `type`: String
  
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}
object ParticleEmitterEdgeZoneConfig {
  
  @scala.inline
  def apply(quantity: integer, source: EdgeZoneSource, `type`: String): ParticleEmitterEdgeZoneConfig = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterEdgeZoneConfig]
  }
  
  @scala.inline
  implicit class ParticleEmitterEdgeZoneConfigMutableBuilder[Self <: ParticleEmitterEdgeZoneConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
    
    @scala.inline
    def setSource(value: EdgeZoneSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepRate(value: Double): Self = StObject.set(x, "stepRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepRateUndefined: Self = StObject.set(x, "stepRate", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
  }
}
