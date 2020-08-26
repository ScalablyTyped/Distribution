package typings.phaser.Phaser.Types.Physics.Arcade

import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeWorldConfig extends js.Object {
  /**
    * Sets {@link Phaser.Physics.Arcade.World#checkCollision}.
    */
  var checkCollision: js.UndefOr[CheckCollisionObject] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#debug}.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults bodyDebugColor}.
    */
  var debugBodyColor: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowBody}.
    */
  var debugShowBody: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowStaticBody: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
    */
  var debugShowVelocity: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults staticBodyDebugColor}.
    */
  var debugStaticBodyColor: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#defaults velocityDebugColor}.
    */
  var debugVelocityColor: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#forceX}.
    */
  var forceX: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#fps}.
    */
  var fps: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#gravity}.
    */
  var gravity: js.UndefOr[Vector2Like] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.height}.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#isPaused}.
    */
  var isPaused: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#maxEntries}.
    */
  var maxEntries: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#OVERLAP_BIAS}.
    */
  var overlapBias: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#TILE_BIAS}.
    */
  var tileBias: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#timeScale}.
    */
  var timeScale: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#useTree}.
    */
  var useTree: js.UndefOr[Boolean] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.width}.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.x}.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.y}.
    */
  var y: js.UndefOr[Double] = js.native
}

object ArcadeWorldConfig {
  @scala.inline
  def apply(): ArcadeWorldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcadeWorldConfig]
  }
  @scala.inline
  implicit class ArcadeWorldConfigOps[Self <: ArcadeWorldConfig] (val x: Self) extends AnyVal {
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
    def setCheckCollision(value: CheckCollisionObject): Self = this.set("checkCollision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckCollision: Self = this.set("checkCollision", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDebugBodyColor(value: Double): Self = this.set("debugBodyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugBodyColor: Self = this.set("debugBodyColor", js.undefined)
    @scala.inline
    def setDebugShowBody(value: Boolean): Self = this.set("debugShowBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowBody: Self = this.set("debugShowBody", js.undefined)
    @scala.inline
    def setDebugShowStaticBody(value: Boolean): Self = this.set("debugShowStaticBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowStaticBody: Self = this.set("debugShowStaticBody", js.undefined)
    @scala.inline
    def setDebugShowVelocity(value: Boolean): Self = this.set("debugShowVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowVelocity: Self = this.set("debugShowVelocity", js.undefined)
    @scala.inline
    def setDebugStaticBodyColor(value: Double): Self = this.set("debugStaticBodyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugStaticBodyColor: Self = this.set("debugStaticBodyColor", js.undefined)
    @scala.inline
    def setDebugVelocityColor(value: Double): Self = this.set("debugVelocityColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugVelocityColor: Self = this.set("debugVelocityColor", js.undefined)
    @scala.inline
    def setForceX(value: Boolean): Self = this.set("forceX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceX: Self = this.set("forceX", js.undefined)
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    @scala.inline
    def setGravity(value: Vector2Like): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPaused: Self = this.set("isPaused", js.undefined)
    @scala.inline
    def setMaxEntries(value: Double): Self = this.set("maxEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEntries: Self = this.set("maxEntries", js.undefined)
    @scala.inline
    def setOverlapBias(value: Double): Self = this.set("overlapBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlapBias: Self = this.set("overlapBias", js.undefined)
    @scala.inline
    def setTileBias(value: Double): Self = this.set("tileBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileBias: Self = this.set("tileBias", js.undefined)
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeScale: Self = this.set("timeScale", js.undefined)
    @scala.inline
    def setUseTree(value: Boolean): Self = this.set("useTree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTree: Self = this.set("useTree", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

