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
    debugBodyColor: Int | Double = null,
    debugShowBody: js.UndefOr[Boolean] = js.undefined,
    debugShowStaticBody: js.UndefOr[Boolean] = js.undefined,
    debugShowVelocity: js.UndefOr[Boolean] = js.undefined,
    debugStaticBodyColor: Int | Double = null,
    debugVelocityColor: Int | Double = null,
    forceX: js.UndefOr[Boolean] = js.undefined,
    fps: Int | Double = null,
    gravity: Vector2Like = null,
    height: Int | Double = null,
    isPaused: js.UndefOr[Boolean] = js.undefined,
    maxEntries: Int | Double = null,
    overlapBias: Int | Double = null,
    tileBias: Int | Double = null,
    timeScale: Int | Double = null,
    useTree: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ArcadeWorldConfig = {
    val __obj = js.Dynamic.literal()
    if (checkCollision != null) __obj.updateDynamic("checkCollision")(checkCollision.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (debugBodyColor != null) __obj.updateDynamic("debugBodyColor")(debugBodyColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBody)) __obj.updateDynamic("debugShowBody")(debugShowBody.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowStaticBody)) __obj.updateDynamic("debugShowStaticBody")(debugShowStaticBody.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowVelocity)) __obj.updateDynamic("debugShowVelocity")(debugShowVelocity.asInstanceOf[js.Any])
    if (debugStaticBodyColor != null) __obj.updateDynamic("debugStaticBodyColor")(debugStaticBodyColor.asInstanceOf[js.Any])
    if (debugVelocityColor != null) __obj.updateDynamic("debugVelocityColor")(debugVelocityColor.asInstanceOf[js.Any])
    if (!js.isUndefined(forceX)) __obj.updateDynamic("forceX")(forceX.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused.asInstanceOf[js.Any])
    if (maxEntries != null) __obj.updateDynamic("maxEntries")(maxEntries.asInstanceOf[js.Any])
    if (overlapBias != null) __obj.updateDynamic("overlapBias")(overlapBias.asInstanceOf[js.Any])
    if (tileBias != null) __obj.updateDynamic("tileBias")(tileBias.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useTree)) __obj.updateDynamic("useTree")(useTree.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldConfig]
  }
}

