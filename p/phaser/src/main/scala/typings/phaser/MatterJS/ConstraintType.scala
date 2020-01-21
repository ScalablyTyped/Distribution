package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintType extends js.Object {
  /**
    * Either the angle of BodyA, or a config value.
    *
    * @property angleA
    * @type number
    * @default 0
    */
  var angleA: Double
  /**
    * Either the angle of BodyB, or a config value.
    *
    * @property angleB
    * @type number
    * @default 0
    */
  var angleB: Double
  /**
    * A `Number` that specifies the angular stiffness of the constraint.
    *
    * @property angularStiffness
    * @type number
    * @default 0
    */
  var angularStiffness: Double
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @property bodyA
    * @type body
    * @default null
    */
  var bodyA: js.UndefOr[BodyType] = js.undefined
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @property bodyB
    * @type body
    * @default null
    */
  var bodyB: js.UndefOr[BodyType] = js.undefined
  /**
    * A `Number` that specifies the damping of the constraint, 
    * i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation.
    * Damping will only be apparent when the constraint also has a very low `stiffness`.
    * A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation.
    * A value of `0` means the constraint will apply no damping.
    *
    * @property damping
    * @type number
    * @default 0
    */
  var damping: Double
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: Double
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Constraint"
    */
  var label: String
  /**
    * A `Number` that specifies the target resting length of the constraint. 
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    * @property length
    * @type number
    */
  var length: Double
  /**
    * An object reserved for storing plugin-specific properties.
    *
    * @property plugin
    * @type {}
    */
  var plugin: js.Any
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointA
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointA: Vector
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyB` if defined, otherwise a world-space position.
    *
    * @property pointB
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointB: Vector
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: IConstraintRenderDefinition
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @property stiffness
    * @type number
    * @default 1
    */
  var stiffness: Double
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    * @readOnly
    */
  var `type`: String
}

object ConstraintType {
  @scala.inline
  def apply(
    angleA: Double,
    angleB: Double,
    angularStiffness: Double,
    damping: Double,
    id: Double,
    label: String,
    length: Double,
    plugin: js.Any,
    pointA: Vector,
    pointB: Vector,
    render: IConstraintRenderDefinition,
    stiffness: Double,
    `type`: String,
    bodyA: BodyType = null,
    bodyB: BodyType = null
  ): ConstraintType = {
    val __obj = js.Dynamic.literal(angleA = angleA.asInstanceOf[js.Any], angleB = angleB.asInstanceOf[js.Any], angularStiffness = angularStiffness.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pointA = pointA.asInstanceOf[js.Any], pointB = pointB.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bodyA != null) __obj.updateDynamic("bodyA")(bodyA.asInstanceOf[js.Any])
    if (bodyB != null) __obj.updateDynamic("bodyB")(bodyB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintType]
  }
}

