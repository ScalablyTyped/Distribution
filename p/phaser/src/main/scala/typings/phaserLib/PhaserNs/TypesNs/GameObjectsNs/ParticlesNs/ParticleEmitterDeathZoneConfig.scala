package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ParticleEmitterDeathZoneConfig {
  @scala.inline
  def apply(source: DeathZoneSource, `type`: java.lang.String = null): ParticleEmitterDeathZoneConfig = {
    val __obj = js.Dynamic.literal(source = source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ParticleEmitterDeathZoneConfig]
  }
}

