package typings.phaser

import typings.phaser.Phaser.Geom.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccelerationX extends js.Object {
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.x}.
    */
  var accelerationX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.y}.
    */
  var accelerationY: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowDrag}.
    */
  var allowDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowGravity}.
    */
  var allowGravity: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#allowRotation}.
    */
  var allowRotation: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularAcceleration}.
    */
  var angularAcceleration: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularDrag}.
    */
  var angularDrag: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#angularVelocity}.
    */
  var angularVelocity: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.x}.
    */
  var bounceX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#bounce bounce.y}.
    */
  var bounceY: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#collideWorldBounds}.
    */
  var collideWorldBounds: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#setBoundsRectangle setBoundsRectangle}.
    */
  var customBoundsRectangle: js.UndefOr[Rectangle] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#drag drag.x}.
    */
  var dragX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#drag drag.y}.
    */
  var dragY: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#enable enable}.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#friction friction.x}.
    */
  var frictionX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#friction friction.y}.
    */
  var frictionY: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.x}.
    */
  var gravityX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#gravity gravity.y}.
    */
  var gravityY: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#immovable}.
    */
  var immovable: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#mass}.
    */
  var mass: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.x}.
    */
  var velocityX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.y}.
    */
  var velocityY: js.UndefOr[Double] = js.undefined
}

object Anon_AccelerationX {
  @scala.inline
  def apply(
    accelerationX: Int | Double = null,
    accelerationY: Int | Double = null,
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    allowGravity: js.UndefOr[Boolean] = js.undefined,
    allowRotation: js.UndefOr[Boolean] = js.undefined,
    angularAcceleration: Int | Double = null,
    angularDrag: Int | Double = null,
    angularVelocity: Int | Double = null,
    bounceX: Int | Double = null,
    bounceY: Int | Double = null,
    collideWorldBounds: js.UndefOr[Boolean] = js.undefined,
    customBoundsRectangle: Rectangle = null,
    dragX: Int | Double = null,
    dragY: Int | Double = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    frictionX: Int | Double = null,
    frictionY: Int | Double = null,
    gravityX: Int | Double = null,
    gravityY: Int | Double = null,
    immovable: js.UndefOr[Boolean] = js.undefined,
    mass: Int | Double = null,
    velocityX: Int | Double = null,
    velocityY: Int | Double = null
  ): Anon_AccelerationX = {
    val __obj = js.Dynamic.literal()
    if (accelerationX != null) __obj.updateDynamic("accelerationX")(accelerationX.asInstanceOf[js.Any])
    if (accelerationY != null) __obj.updateDynamic("accelerationY")(accelerationY.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGravity)) __obj.updateDynamic("allowGravity")(allowGravity.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRotation)) __obj.updateDynamic("allowRotation")(allowRotation.asInstanceOf[js.Any])
    if (angularAcceleration != null) __obj.updateDynamic("angularAcceleration")(angularAcceleration.asInstanceOf[js.Any])
    if (angularDrag != null) __obj.updateDynamic("angularDrag")(angularDrag.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity.asInstanceOf[js.Any])
    if (bounceX != null) __obj.updateDynamic("bounceX")(bounceX.asInstanceOf[js.Any])
    if (bounceY != null) __obj.updateDynamic("bounceY")(bounceY.asInstanceOf[js.Any])
    if (!js.isUndefined(collideWorldBounds)) __obj.updateDynamic("collideWorldBounds")(collideWorldBounds.asInstanceOf[js.Any])
    if (customBoundsRectangle != null) __obj.updateDynamic("customBoundsRectangle")(customBoundsRectangle.asInstanceOf[js.Any])
    if (dragX != null) __obj.updateDynamic("dragX")(dragX.asInstanceOf[js.Any])
    if (dragY != null) __obj.updateDynamic("dragY")(dragY.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (frictionX != null) __obj.updateDynamic("frictionX")(frictionX.asInstanceOf[js.Any])
    if (frictionY != null) __obj.updateDynamic("frictionY")(frictionY.asInstanceOf[js.Any])
    if (gravityX != null) __obj.updateDynamic("gravityX")(gravityX.asInstanceOf[js.Any])
    if (gravityY != null) __obj.updateDynamic("gravityY")(gravityY.asInstanceOf[js.Any])
    if (!js.isUndefined(immovable)) __obj.updateDynamic("immovable")(immovable.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (velocityX != null) __obj.updateDynamic("velocityX")(velocityX.asInstanceOf[js.Any])
    if (velocityY != null) __obj.updateDynamic("velocityY")(velocityY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccelerationX]
  }
}

