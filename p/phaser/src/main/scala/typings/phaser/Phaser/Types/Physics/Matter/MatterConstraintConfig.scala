package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterConstraintConfig extends js.Object {
  /**
    * The angleA of the constraint. If bodyA is set, the angle of bodyA is used instead.
    */
  var angleA: js.UndefOr[Double] = js.undefined
  /**
    * The angleB of the constraint. If bodyB is set, the angle of bodyB is used instead.
    */
  var angleB: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` that specifies the angular stiffness of the constraint.
    */
  var angularStiffness: js.UndefOr[Double] = js.undefined
  /**
    * The first possible `Body` that this constraint is attached to.
    */
  var bodyA: js.UndefOr[BodyType] = js.undefined
  /**
    * The second possible `Body` that this constraint is attached to.
    */
  var bodyB: js.UndefOr[BodyType] = js.undefined
  /**
    * A `Number` that specifies the damping of the constraint, i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation. Damping will only be apparent when the constraint also has a very low `stiffness`. A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation. A value of `0` means the constraint will apply no damping.
    */
  var damping: js.UndefOr[Double] = js.undefined
  /**
    * An arbitrary string-based name to help identify this constraint.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * A `Number` that specifies the target resting length of the constraint. It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[js.Any] = js.undefined
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    */
  var pointA: js.UndefOr[Vector2Like] = js.undefined
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyB` if defined, otherwise a world-space position.
    */
  var pointB: js.UndefOr[Vector2Like] = js.undefined
  /**
    * The Debug Render configuration object for this constraint.
    */
  var render: js.UndefOr[MatterConstraintRenderConfig] = js.undefined
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts like a soft spring.
    */
  var stiffness: js.UndefOr[Double] = js.undefined
}

object MatterConstraintConfig {
  @scala.inline
  def apply(
    angleA: Int | Double = null,
    angleB: Int | Double = null,
    angularStiffness: Int | Double = null,
    bodyA: BodyType = null,
    bodyB: BodyType = null,
    damping: Int | Double = null,
    label: String = null,
    length: Int | Double = null,
    plugin: js.Any = null,
    pointA: Vector2Like = null,
    pointB: Vector2Like = null,
    render: MatterConstraintRenderConfig = null,
    stiffness: Int | Double = null
  ): MatterConstraintConfig = {
    val __obj = js.Dynamic.literal()
    if (angleA != null) __obj.updateDynamic("angleA")(angleA.asInstanceOf[js.Any])
    if (angleB != null) __obj.updateDynamic("angleB")(angleB.asInstanceOf[js.Any])
    if (angularStiffness != null) __obj.updateDynamic("angularStiffness")(angularStiffness.asInstanceOf[js.Any])
    if (bodyA != null) __obj.updateDynamic("bodyA")(bodyA.asInstanceOf[js.Any])
    if (bodyB != null) __obj.updateDynamic("bodyB")(bodyB.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (pointA != null) __obj.updateDynamic("pointA")(pointA.asInstanceOf[js.Any])
    if (pointB != null) __obj.updateDynamic("pointB")(pointB.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterConstraintConfig]
  }
}

