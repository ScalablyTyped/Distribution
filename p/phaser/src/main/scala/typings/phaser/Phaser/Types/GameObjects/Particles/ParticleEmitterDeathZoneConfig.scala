package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterDeathZoneConfig extends js.Object {
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
  implicit class ParticleEmitterDeathZoneConfigOps[Self <: ParticleEmitterDeathZoneConfig] (val x: Self) extends AnyVal {
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
    def setSource(value: DeathZoneSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

