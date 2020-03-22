package typings.phaser.Phaser.Types.Physics.Arcade

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCallback
import typings.phaser.Phaser.Types.GameObjects.Group.GroupMultipleCreateCallback
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phaser.Phaser.Types.GameObjects.Group.GroupConfig & {  collideWorldBounds ? :boolean,   customBoundsRectangle ? :phaser.Phaser.Geom.Rectangle,   accelerationX ? :number,   accelerationY ? :number,   allowDrag ? :boolean,   allowGravity ? :boolean,   allowRotation ? :boolean,   bounceX ? :number,   bounceY ? :number,   dragX ? :number,   dragY ? :number,   enable ? :boolean,   gravityX ? :number,   gravityY ? :number,   frictionX ? :number,   frictionY ? :number,   velocityX ? :number,   velocityY ? :number,   angularVelocity ? :number,   angularAcceleration ? :number,   angularDrag ? :number,   mass ? :number,   immovable ? :boolean} */
trait PhysicsGroupConfig extends js.Object {
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.x}.
    */
  var accelerationX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#acceleration acceleration.y}.
    */
  var accelerationY: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#active}.
    */
  var active: js.UndefOr[Boolean] = js.undefined
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
    * Sets {@link Phaser.GameObjects.Group#classType}.
    */
  var classType: js.UndefOr[js.Function] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#collideWorldBounds}.
    */
  var collideWorldBounds: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#createCallback}.
    */
  var createCallback: js.UndefOr[GroupCallback] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
    */
  var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#setBoundsRectangle setBoundsRectangle}.
    */
  var customBoundsRectangle: js.UndefOr[Rectangle] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
    */
  var defaultFrame: js.UndefOr[String | integer] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#defaultKey}.
    */
  var defaultKey: js.UndefOr[String] = js.undefined
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
    * Sets {@link Phaser.GameObjects.Group#maxSize}.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#name}.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#removeCallback}.
    */
  var removeCallback: js.UndefOr[GroupCallback] = js.undefined
  /**
    * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
    */
  var runChildUpdate: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.x}.
    */
  var velocityX: js.UndefOr[Double] = js.undefined
  /**
    * Sets {@link Phaser.Physics.Arcade.Body#velocity velocity.y}.
    */
  var velocityY: js.UndefOr[Double] = js.undefined
}

object PhysicsGroupConfig {
  @scala.inline
  def apply(
    accelerationX: Int | Double = null,
    accelerationY: Int | Double = null,
    active: js.UndefOr[Boolean] = js.undefined,
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    allowGravity: js.UndefOr[Boolean] = js.undefined,
    allowRotation: js.UndefOr[Boolean] = js.undefined,
    angularAcceleration: Int | Double = null,
    angularDrag: Int | Double = null,
    angularVelocity: Int | Double = null,
    bounceX: Int | Double = null,
    bounceY: Int | Double = null,
    classType: js.Function = null,
    collideWorldBounds: js.UndefOr[Boolean] = js.undefined,
    createCallback: /* item */ GameObject => Unit = null,
    createMultipleCallback: /* items */ js.Array[GameObject] => Unit = null,
    customBoundsRectangle: Rectangle = null,
    defaultFrame: String | integer = null,
    defaultKey: String = null,
    dragX: Int | Double = null,
    dragY: Int | Double = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    frictionX: Int | Double = null,
    frictionY: Int | Double = null,
    gravityX: Int | Double = null,
    gravityY: Int | Double = null,
    immovable: js.UndefOr[Boolean] = js.undefined,
    mass: Int | Double = null,
    maxSize: Int | Double = null,
    name: String = null,
    removeCallback: /* item */ GameObject => Unit = null,
    runChildUpdate: js.UndefOr[Boolean] = js.undefined,
    velocityX: Int | Double = null,
    velocityY: Int | Double = null
  ): PhysicsGroupConfig = {
    val __obj = js.Dynamic.literal()
    if (accelerationX != null) __obj.updateDynamic("accelerationX")(accelerationX.asInstanceOf[js.Any])
    if (accelerationY != null) __obj.updateDynamic("accelerationY")(accelerationY.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGravity)) __obj.updateDynamic("allowGravity")(allowGravity.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRotation)) __obj.updateDynamic("allowRotation")(allowRotation.asInstanceOf[js.Any])
    if (angularAcceleration != null) __obj.updateDynamic("angularAcceleration")(angularAcceleration.asInstanceOf[js.Any])
    if (angularDrag != null) __obj.updateDynamic("angularDrag")(angularDrag.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity.asInstanceOf[js.Any])
    if (bounceX != null) __obj.updateDynamic("bounceX")(bounceX.asInstanceOf[js.Any])
    if (bounceY != null) __obj.updateDynamic("bounceY")(bounceY.asInstanceOf[js.Any])
    if (classType != null) __obj.updateDynamic("classType")(classType.asInstanceOf[js.Any])
    if (!js.isUndefined(collideWorldBounds)) __obj.updateDynamic("collideWorldBounds")(collideWorldBounds.asInstanceOf[js.Any])
    if (createCallback != null) __obj.updateDynamic("createCallback")(js.Any.fromFunction1(createCallback))
    if (createMultipleCallback != null) __obj.updateDynamic("createMultipleCallback")(js.Any.fromFunction1(createMultipleCallback))
    if (customBoundsRectangle != null) __obj.updateDynamic("customBoundsRectangle")(customBoundsRectangle.asInstanceOf[js.Any])
    if (defaultFrame != null) __obj.updateDynamic("defaultFrame")(defaultFrame.asInstanceOf[js.Any])
    if (defaultKey != null) __obj.updateDynamic("defaultKey")(defaultKey.asInstanceOf[js.Any])
    if (dragX != null) __obj.updateDynamic("dragX")(dragX.asInstanceOf[js.Any])
    if (dragY != null) __obj.updateDynamic("dragY")(dragY.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (frictionX != null) __obj.updateDynamic("frictionX")(frictionX.asInstanceOf[js.Any])
    if (frictionY != null) __obj.updateDynamic("frictionY")(frictionY.asInstanceOf[js.Any])
    if (gravityX != null) __obj.updateDynamic("gravityX")(gravityX.asInstanceOf[js.Any])
    if (gravityY != null) __obj.updateDynamic("gravityY")(gravityY.asInstanceOf[js.Any])
    if (!js.isUndefined(immovable)) __obj.updateDynamic("immovable")(immovable.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (removeCallback != null) __obj.updateDynamic("removeCallback")(js.Any.fromFunction1(removeCallback))
    if (!js.isUndefined(runChildUpdate)) __obj.updateDynamic("runChildUpdate")(runChildUpdate.asInstanceOf[js.Any])
    if (velocityX != null) __obj.updateDynamic("velocityX")(velocityX.asInstanceOf[js.Any])
    if (velocityY != null) __obj.updateDynamic("velocityY")(velocityY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsGroupConfig]
  }
}

