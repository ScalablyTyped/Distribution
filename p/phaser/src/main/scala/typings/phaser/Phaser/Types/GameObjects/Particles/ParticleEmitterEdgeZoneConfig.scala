package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterEdgeZoneConfig extends js.Object {
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
  def apply(
    quantity: integer,
    source: EdgeZoneSource,
    `type`: String,
    seamless: js.UndefOr[Boolean] = js.undefined,
    stepRate: js.UndefOr[Double] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): ParticleEmitterEdgeZoneConfig = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepRate)) __obj.updateDynamic("stepRate")(stepRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterEdgeZoneConfig]
  }
}

