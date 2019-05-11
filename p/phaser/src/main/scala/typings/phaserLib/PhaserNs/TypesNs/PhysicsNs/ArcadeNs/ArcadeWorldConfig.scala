package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeWorldConfig extends js.Object {
  /**
    * Sets {@link Phaser.Physics.Arcade.World#checkCollision}.
    */
  var checkCollision: js.UndefOr[CheckCollisionObject] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#debug}.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugBodyColor}.
    */
  var debugBodyColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowBody}.
    */
  var debugShowBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowStaticBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowVelocity: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugStaticBodyColor}.
    */
  var debugStaticBodyColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugVelocityColor}.
    */
  var debugVelocityColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#forceX}.
    */
  var forceX: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#fps}.
    */
  var fps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#gravity}.
    */
  var gravity: js.UndefOr[phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.height}.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#isPaused}.
    */
  var isPaused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#maxEntries}.
    */
  var maxEntries: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#OVERLAP_BIAS}.
    */
  var overlapBias: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#TILE_BIAS}.
    */
  var tileBias: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#timeScale}.
    */
  var timeScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#useTree}.
    */
  var useTree: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.width}.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.x}.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.y}.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ArcadeWorldConfig {
  @scala.inline
  def apply(
    checkCollision: CheckCollisionObject = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    debugBodyColor: scala.Int | scala.Double = null,
    debugShowBody: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowStaticBody: js.UndefOr[scala.Boolean] = js.undefined,
    debugShowVelocity: js.UndefOr[scala.Boolean] = js.undefined,
    debugStaticBodyColor: scala.Int | scala.Double = null,
    debugVelocityColor: scala.Int | scala.Double = null,
    forceX: js.UndefOr[scala.Boolean] = js.undefined,
    fps: scala.Int | scala.Double = null,
    gravity: phaserLib.PhaserNs.TypesNs.MathNs.Vector2Like = null,
    height: scala.Int | scala.Double = null,
    isPaused: js.UndefOr[scala.Boolean] = js.undefined,
    maxEntries: scala.Int | scala.Double = null,
    overlapBias: scala.Int | scala.Double = null,
    tileBias: scala.Int | scala.Double = null,
    timeScale: scala.Int | scala.Double = null,
    useTree: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ArcadeWorldConfig = {
    val __obj = js.Dynamic.literal()
    if (checkCollision != null) __obj.updateDynamic("checkCollision")(checkCollision)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (debugBodyColor != null) __obj.updateDynamic("debugBodyColor")(debugBodyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBody)) __obj.updateDynamic("debugShowBody")(debugShowBody)
    if (!js.isUndefined(debugShowStaticBody)) __obj.updateDynamic("debugShowStaticBody")(debugShowStaticBody)
    if (!js.isUndefined(debugShowVelocity)) __obj.updateDynamic("debugShowVelocity")(debugShowVelocity)
    if (debugStaticBodyColor != null) __obj.updateDynamic("debugStaticBodyColor")(debugStaticBodyColor.asInstanceOf[js.Any])
    if (debugVelocityColor != null) __obj.updateDynamic("debugVelocityColor")(debugVelocityColor.asInstanceOf[js.Any])
    if (!js.isUndefined(forceX)) __obj.updateDynamic("forceX")(forceX)
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused)
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    if (overlapBias != null) __obj.updateDynamic("overlapBias")(overlapBias.asInstanceOf[js.Any])
    if (tileBias != null) __obj.updateDynamic("tileBias")(tileBias.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useTree)) __obj.updateDynamic("useTree")(useTree)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldConfig]
  }
}

