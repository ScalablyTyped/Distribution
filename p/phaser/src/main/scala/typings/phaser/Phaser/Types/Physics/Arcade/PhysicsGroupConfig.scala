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
    accelerationX: js.UndefOr[Double] = js.undefined,
    accelerationY: js.UndefOr[Double] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    allowGravity: js.UndefOr[Boolean] = js.undefined,
    allowRotation: js.UndefOr[Boolean] = js.undefined,
    angularAcceleration: js.UndefOr[Double] = js.undefined,
    angularDrag: js.UndefOr[Double] = js.undefined,
    angularVelocity: js.UndefOr[Double] = js.undefined,
    bounceX: js.UndefOr[Double] = js.undefined,
    bounceY: js.UndefOr[Double] = js.undefined,
    classType: js.Function = null,
    collideWorldBounds: js.UndefOr[Boolean] = js.undefined,
    createCallback: /* item */ GameObject => Unit = null,
    createMultipleCallback: /* items */ js.Array[GameObject] => Unit = null,
    customBoundsRectangle: Rectangle = null,
    defaultFrame: String | integer = null,
    defaultKey: String = null,
    dragX: js.UndefOr[Double] = js.undefined,
    dragY: js.UndefOr[Double] = js.undefined,
    enable: js.UndefOr[Boolean] = js.undefined,
    frictionX: js.UndefOr[Double] = js.undefined,
    frictionY: js.UndefOr[Double] = js.undefined,
    gravityX: js.UndefOr[Double] = js.undefined,
    gravityY: js.UndefOr[Double] = js.undefined,
    immovable: js.UndefOr[Boolean] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    name: String = null,
    removeCallback: /* item */ GameObject => Unit = null,
    runChildUpdate: js.UndefOr[Boolean] = js.undefined,
    velocityX: js.UndefOr[Double] = js.undefined,
    velocityY: js.UndefOr[Double] = js.undefined
  ): PhysicsGroupConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accelerationX)) __obj.updateDynamic("accelerationX")(accelerationX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accelerationY)) __obj.updateDynamic("accelerationY")(accelerationY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGravity)) __obj.updateDynamic("allowGravity")(allowGravity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRotation)) __obj.updateDynamic("allowRotation")(allowRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularAcceleration)) __obj.updateDynamic("angularAcceleration")(angularAcceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularDrag)) __obj.updateDynamic("angularDrag")(angularDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularVelocity)) __obj.updateDynamic("angularVelocity")(angularVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceX)) __obj.updateDynamic("bounceX")(bounceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceY)) __obj.updateDynamic("bounceY")(bounceY.get.asInstanceOf[js.Any])
    if (classType != null) __obj.updateDynamic("classType")(classType.asInstanceOf[js.Any])
    if (!js.isUndefined(collideWorldBounds)) __obj.updateDynamic("collideWorldBounds")(collideWorldBounds.get.asInstanceOf[js.Any])
    if (createCallback != null) __obj.updateDynamic("createCallback")(js.Any.fromFunction1(createCallback))
    if (createMultipleCallback != null) __obj.updateDynamic("createMultipleCallback")(js.Any.fromFunction1(createMultipleCallback))
    if (customBoundsRectangle != null) __obj.updateDynamic("customBoundsRectangle")(customBoundsRectangle.asInstanceOf[js.Any])
    if (defaultFrame != null) __obj.updateDynamic("defaultFrame")(defaultFrame.asInstanceOf[js.Any])
    if (defaultKey != null) __obj.updateDynamic("defaultKey")(defaultKey.asInstanceOf[js.Any])
    if (!js.isUndefined(dragX)) __obj.updateDynamic("dragX")(dragX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragY)) __obj.updateDynamic("dragY")(dragY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionX)) __obj.updateDynamic("frictionX")(frictionX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionY)) __obj.updateDynamic("frictionY")(frictionY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gravityX)) __obj.updateDynamic("gravityX")(gravityX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gravityY)) __obj.updateDynamic("gravityY")(gravityY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immovable)) __obj.updateDynamic("immovable")(immovable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (removeCallback != null) __obj.updateDynamic("removeCallback")(js.Any.fromFunction1(removeCallback))
    if (!js.isUndefined(runChildUpdate)) __obj.updateDynamic("runChildUpdate")(runChildUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityX)) __obj.updateDynamic("velocityX")(velocityX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityY)) __obj.updateDynamic("velocityY")(velocityY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsGroupConfig]
  }
}

