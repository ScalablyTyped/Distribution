package typings.phaser.PhaserNs.TypesNs.CoreNs

import typings.phaser.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldConfig
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldConfig
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterWorldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsConfig extends js.Object {
  /**
    * Arcade Physics configuration.
    */
  var arcade: js.UndefOr[ArcadeWorldConfig] = js.undefined
  /**
    * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
    */
  var default: js.UndefOr[String] = js.undefined
  /**
    * Impact Physics configuration.
    */
  var impact: js.UndefOr[WorldConfig] = js.undefined
  /**
    * Matter Physics configuration.
    */
  var matter: js.UndefOr[MatterWorldConfig] = js.undefined
}

object PhysicsConfig {
  @scala.inline
  def apply(
    arcade: ArcadeWorldConfig = null,
    default: String = null,
    impact: WorldConfig = null,
    matter: MatterWorldConfig = null
  ): PhysicsConfig = {
    val __obj = js.Dynamic.literal()
    if (arcade != null) __obj.updateDynamic("arcade")(arcade)
    if (default != null) __obj.updateDynamic("default")(default)
    if (impact != null) __obj.updateDynamic("impact")(impact)
    if (matter != null) __obj.updateDynamic("matter")(matter)
    __obj.asInstanceOf[PhysicsConfig]
  }
}

