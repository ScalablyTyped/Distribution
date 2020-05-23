package typings.phaser.Phaser.Types.Physics.Arcade

import typings.phaser.Phaser.Types.Math.Vector2Like
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
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugBodyColor}.
    */
  var debugBodyColor: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowBody}.
    */
  var debugShowBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowStaticBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowVelocity: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugStaticBodyColor}.
    */
  var debugStaticBodyColor: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugVelocityColor}.
    */
  var debugVelocityColor: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#forceX}.
    */
  var forceX: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#fps}.
    */
  var fps: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#gravity}.
    */
  var gravity: js.UndefOr[Vector2Like] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.height}.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#isPaused}.
    */
  var isPaused: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#maxEntries}.
    */
  var maxEntries: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#OVERLAP_BIAS}.
    */
  var overlapBias: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#TILE_BIAS}.
    */
  var tileBias: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#timeScale}.
    */
  var timeScale: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#useTree}.
    */
  var useTree: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.width}.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.x}.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.y}.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ArcadeWorldConfig {
  @scala.inline
  def apply(
    checkCollision: CheckCollisionObject = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    debugBodyColor: js.UndefOr[Double] = js.undefined,
    debugShowBody: js.UndefOr[Boolean] = js.undefined,
    debugShowStaticBody: js.UndefOr[Boolean] = js.undefined,
    debugShowVelocity: js.UndefOr[Boolean] = js.undefined,
    debugStaticBodyColor: js.UndefOr[Double] = js.undefined,
    debugVelocityColor: js.UndefOr[Double] = js.undefined,
    forceX: js.UndefOr[Boolean] = js.undefined,
    fps: js.UndefOr[Double] = js.undefined,
    gravity: Vector2Like = null,
    height: js.UndefOr[Double] = js.undefined,
    isPaused: js.UndefOr[Boolean] = js.undefined,
    maxEntries: js.UndefOr[Double] = js.undefined,
    overlapBias: js.UndefOr[Double] = js.undefined,
    tileBias: js.UndefOr[Double] = js.undefined,
    timeScale: js.UndefOr[Double] = js.undefined,
    useTree: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ArcadeWorldConfig = {
    val __obj = js.Dynamic.literal()
    if (checkCollision != null) __obj.updateDynamic("checkCollision")(checkCollision.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugBodyColor)) __obj.updateDynamic("debugBodyColor")(debugBodyColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBody)) __obj.updateDynamic("debugShowBody")(debugShowBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowStaticBody)) __obj.updateDynamic("debugShowStaticBody")(debugShowStaticBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowVelocity)) __obj.updateDynamic("debugShowVelocity")(debugShowVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugStaticBodyColor)) __obj.updateDynamic("debugStaticBodyColor")(debugStaticBodyColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debugVelocityColor)) __obj.updateDynamic("debugVelocityColor")(debugVelocityColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceX)) __obj.updateDynamic("forceX")(forceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fps)) __obj.updateDynamic("fps")(fps.get.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEntries)) __obj.updateDynamic("maxEntries")(maxEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlapBias)) __obj.updateDynamic("overlapBias")(overlapBias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileBias)) __obj.updateDynamic("tileBias")(tileBias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeScale)) __obj.updateDynamic("timeScale")(timeScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTree)) __obj.updateDynamic("useTree")(useTree.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldConfig]
  }
}

