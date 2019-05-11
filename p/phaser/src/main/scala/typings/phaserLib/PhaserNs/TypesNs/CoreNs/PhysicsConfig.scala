package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsConfig extends js.Object {
  /**
    * Arcade Physics configuration.
    */
  var arcade: js.UndefOr[phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldConfig] = js.undefined
  /**
    * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
    */
  var default: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Impact Physics configuration.
    */
  var impact: js.UndefOr[phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldConfig] = js.undefined
  /**
    * Matter Physics configuration.
    */
  var matter: js.UndefOr[phaserLib.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterWorldConfig] = js.undefined
}

object PhysicsConfig {
  @scala.inline
  def apply(
    arcade: phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs.ArcadeWorldConfig = null,
    default: java.lang.String = null,
    impact: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldConfig = null,
    matter: phaserLib.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterWorldConfig = null
  ): PhysicsConfig = {
    val __obj = js.Dynamic.literal()
    if (arcade != null) __obj.updateDynamic("arcade")(arcade)
    if (default != null) __obj.updateDynamic("default")(default)
    if (impact != null) __obj.updateDynamic("impact")(impact)
    if (matter != null) __obj.updateDynamic("matter")(matter)
    __obj.asInstanceOf[PhysicsConfig]
  }
}

