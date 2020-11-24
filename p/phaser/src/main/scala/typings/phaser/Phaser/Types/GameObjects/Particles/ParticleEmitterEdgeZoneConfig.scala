package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleEmitterEdgeZoneConfig extends js.Object {
  
  /**
    * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    */
  var quantity: integer = js.native
  
  /**
    * Whether one endpoint will be removed if it's identical to the other.
    */
  var seamless: js.UndefOr[Boolean] = js.native
  
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    */
  var source: EdgeZoneSource = js.native
  
  /**
    * The distance between each particle. When set, `quantity` is implied and should be set to 0.
    */
  var stepRate: js.UndefOr[Double] = js.native
  
  /**
    * 'edge'.
    */
  var `type`: String = js.native
  
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}
object ParticleEmitterEdgeZoneConfig {
  
  @scala.inline
  def apply(quantity: integer, source: EdgeZoneSource, `type`: String): ParticleEmitterEdgeZoneConfig = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterEdgeZoneConfig]
  }
  
  @scala.inline
  implicit class ParticleEmitterEdgeZoneConfigOps[Self <: ParticleEmitterEdgeZoneConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EdgeZoneSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", js.undefined)
    
    @scala.inline
    def setStepRate(value: Double): Self = this.set("stepRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepRate: Self = this.set("stepRate", js.undefined)
    
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
}
