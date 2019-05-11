package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterEdgeZoneConfig extends js.Object {
  /**
    * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    */
  var quantity: phaserLib.integer
  /**
    * Whether one endpoint will be removed if it's identical to the other.
    */
  var seamless: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    */
  var source: EdgeZoneSource
  /**
    * The distance between each particle. When set, `quantity` is implied and should be set to 0.
    */
  var stepRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * 'edge'.
    */
  var `type`: java.lang.String
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: js.UndefOr[scala.Boolean] = js.undefined
}

object ParticleEmitterEdgeZoneConfig {
  @scala.inline
  def apply(
    quantity: phaserLib.integer,
    source: EdgeZoneSource,
    `type`: java.lang.String,
    seamless: js.UndefOr[scala.Boolean] = js.undefined,
    stepRate: scala.Int | scala.Double = null,
    yoyo: js.UndefOr[scala.Boolean] = js.undefined
  ): ParticleEmitterEdgeZoneConfig = {
    val __obj = js.Dynamic.literal(quantity = quantity, source = source)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless)
    if (stepRate != null) __obj.updateDynamic("stepRate")(stepRate.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[ParticleEmitterEdgeZoneConfig]
  }
}

