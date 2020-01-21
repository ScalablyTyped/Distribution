package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterBodyConfig extends js.Object {
  /**
    * A number specifying the angle of the body, in radians.
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * A number, or array of numbers, to chamfer the vertices of the body, or a full Chamfer configuration object.
    */
  var chamfer: js.UndefOr[Double | js.Array[Double] | MatterChamferConfig] = js.undefined
  /**
    * The radius of this body if a circle.
    */
  var circleRadius: js.UndefOr[Double] = js.undefined
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    */
  var collisionFilter: js.UndefOr[MatterCollisionFilter] = js.undefined
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area. If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object. This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    */
  var density: js.UndefOr[Double] = js.undefined
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    */
  var force: js.UndefOr[Vector2Like] = js.undefined
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`. A value of `0` means that the body may slide indefinitely. A value of `1` means the body may come to a stop almost instantly after a force is applied.
    */
  var friction: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that defines the air friction of the body (air resistance). A value of `0` means the body will never slow as it moves through space. The higher the value, the faster a body slows when moving through space.
    */
  var frictionAir: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model). A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used. The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary. This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    */
  var frictionStatic: js.UndefOr[Double] = js.undefined
  /**
    * A `Vector` that scales the influence of World gravity when applied to this body.
    */
  var gravityScale: js.UndefOr[Vector2Like] = js.undefined
  /**
    * A boolean that toggles if this body should ignore world gravity or not.
    */
  var ignoreGravity: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean that toggles if this body should ignore pointer / mouse constraints or not.
    */
  var ignorePointer: js.UndefOr[Boolean] = js.undefined
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`). If you modify this value, you must also modify the `body.mass` property.
    */
  var inverseMass: js.UndefOr[Double] = js.undefined
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    */
  var isSensor: js.UndefOr[Boolean] = js.undefined
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    */
  var isStatic: js.UndefOr[Boolean] = js.undefined
  /**
    * An arbitrary string-based name to help identify this body.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead. If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    */
  var mass: js.UndefOr[Double] = js.undefined
  /**
    * A callback that is invoked for the duration that this Body is colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideActiveCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback that is invoked when this Body starts colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback that is invoked when this Body stops colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideEndCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * A collision callback dictionary used by the `Body.setOnCollideWith` function.
    */
  var onCollideWith: js.UndefOr[js.Any] = js.undefined
  /**
    * An array of bodies that make up this body. The first body in the array must always be a self reference to the current body instance. All bodies in the `parts` array together form a single rigid compound body.
    */
  var parts: js.UndefOr[js.Array[BodyType]] = js.undefined
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[js.Any] = js.undefined
  /**
    * A `Vector` that specifies the current world-space position of the body.
    */
  var position: js.UndefOr[Vector2Like] = js.undefined
  /**
    * The Debug Render configuration object for this body.
    */
  var render: js.UndefOr[MatterBodyRenderConfig] = js.undefined
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    */
  var restitution: js.UndefOr[Double] = js.undefined
  /**
    * A `Vector` that specifies the initial scale of the body.
    */
  var scale: js.UndefOr[Vector2Like] = js.undefined
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    */
  var sleepThreshold: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies. Avoid changing this value unless you understand the purpose of `slop` in physics engines. The default should generally suffice, although very large bodies may require larger values for stable stacking.
    */
  var slop: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    */
  var timeScale: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    */
  var torque: js.UndefOr[Double] = js.undefined
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body. These should be provided about the origin `(0, 0)`.
    */
  var vertices: js.UndefOr[js.Array[Vector2Like]] = js.undefined
}

object MatterBodyConfig {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    chamfer: Double | js.Array[Double] | MatterChamferConfig = null,
    circleRadius: Int | Double = null,
    collisionFilter: MatterCollisionFilter = null,
    density: Int | Double = null,
    force: Vector2Like = null,
    friction: Int | Double = null,
    frictionAir: Int | Double = null,
    frictionStatic: Int | Double = null,
    gravityScale: Vector2Like = null,
    ignoreGravity: js.UndefOr[Boolean] = js.undefined,
    ignorePointer: js.UndefOr[Boolean] = js.undefined,
    inverseMass: Int | Double = null,
    isSensor: js.UndefOr[Boolean] = js.undefined,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    mass: Int | Double = null,
    onCollideActiveCallback: js.Function = null,
    onCollideCallback: js.Function = null,
    onCollideEndCallback: js.Function = null,
    onCollideWith: js.Any = null,
    parts: js.Array[BodyType] = null,
    plugin: js.Any = null,
    position: Vector2Like = null,
    render: MatterBodyRenderConfig = null,
    restitution: Int | Double = null,
    scale: Vector2Like = null,
    sleepThreshold: Int | Double = null,
    slop: Int | Double = null,
    timeScale: Int | Double = null,
    torque: Int | Double = null,
    vertices: js.Array[Vector2Like] = null
  ): MatterBodyConfig = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (chamfer != null) __obj.updateDynamic("chamfer")(chamfer.asInstanceOf[js.Any])
    if (circleRadius != null) __obj.updateDynamic("circleRadius")(circleRadius.asInstanceOf[js.Any])
    if (collisionFilter != null) __obj.updateDynamic("collisionFilter")(collisionFilter.asInstanceOf[js.Any])
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (frictionAir != null) __obj.updateDynamic("frictionAir")(frictionAir.asInstanceOf[js.Any])
    if (frictionStatic != null) __obj.updateDynamic("frictionStatic")(frictionStatic.asInstanceOf[js.Any])
    if (gravityScale != null) __obj.updateDynamic("gravityScale")(gravityScale.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreGravity)) __obj.updateDynamic("ignoreGravity")(ignoreGravity.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePointer)) __obj.updateDynamic("ignorePointer")(ignorePointer.asInstanceOf[js.Any])
    if (inverseMass != null) __obj.updateDynamic("inverseMass")(inverseMass.asInstanceOf[js.Any])
    if (!js.isUndefined(isSensor)) __obj.updateDynamic("isSensor")(isSensor.asInstanceOf[js.Any])
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (onCollideActiveCallback != null) __obj.updateDynamic("onCollideActiveCallback")(onCollideActiveCallback.asInstanceOf[js.Any])
    if (onCollideCallback != null) __obj.updateDynamic("onCollideCallback")(onCollideCallback.asInstanceOf[js.Any])
    if (onCollideEndCallback != null) __obj.updateDynamic("onCollideEndCallback")(onCollideEndCallback.asInstanceOf[js.Any])
    if (onCollideWith != null) __obj.updateDynamic("onCollideWith")(onCollideWith.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (sleepThreshold != null) __obj.updateDynamic("sleepThreshold")(sleepThreshold.asInstanceOf[js.Any])
    if (slop != null) __obj.updateDynamic("slop")(slop.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (torque != null) __obj.updateDynamic("torque")(torque.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterBodyConfig]
  }
}

