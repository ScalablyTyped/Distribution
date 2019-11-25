package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterDeathZoneConfig extends js.Object {
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
  @scala.inline
  def apply(source: DeathZoneSource, `type`: String = null): ParticleEmitterDeathZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterDeathZoneConfig]
  }
}

