package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterRandomZoneConfig extends js.Object {
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.RandomZone#source}.
    */
  var source: RandomZoneSource
  /**
    * 'random'.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ParticleEmitterRandomZoneConfig {
  @scala.inline
  def apply(source: RandomZoneSource, `type`: java.lang.String = null): ParticleEmitterRandomZoneConfig = {
    val __obj = js.Dynamic.literal(source = source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ParticleEmitterRandomZoneConfig]
  }
}

