package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typings.phaser.Phaser.Types.Physics.Impact.WorldConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
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
    if (arcade != null) __obj.updateDynamic("arcade")(arcade.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (impact != null) __obj.updateDynamic("impact")(impact.asInstanceOf[js.Any])
    if (matter != null) __obj.updateDynamic("matter")(matter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsConfig]
  }
}

