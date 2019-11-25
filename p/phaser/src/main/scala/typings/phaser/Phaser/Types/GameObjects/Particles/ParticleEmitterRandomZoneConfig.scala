package typings.phaser.Phaser.Types.GameObjects.Particles

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
  var `type`: js.UndefOr[String] = js.undefined
}

object ParticleEmitterRandomZoneConfig {
  @scala.inline
  def apply(source: RandomZoneSource, `type`: String = null): ParticleEmitterRandomZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterRandomZoneConfig]
  }
}

