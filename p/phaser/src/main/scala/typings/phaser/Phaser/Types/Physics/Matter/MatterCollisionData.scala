package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterCollisionData extends js.Object {
  /**
    * A reference to the dominant axis body.
    */
  var axisBody: BodyType
  /**
    * The index of the dominant collision axis vector (edge normal)
    */
  var axisNumber: Double
  /**
    * A reference to the first body involved in the collision.
    */
  var bodyA: BodyType
  /**
    * A reference to the second body involved in the collision.
    */
  var bodyB: BodyType
  /**
    * Have the pair collided or not?
    */
  var collided: Boolean
  /**
    * The depth of the collision on the minimum overlap.
    */
  var depth: Double
  /**
    * The resulting friction from the collision.
    */
  var friction: Double
  /**
    * The resulting static friction from the collision.
    */
  var frictionStatic: Double
  /**
    * The resulting inverse mass from the collision.
    */
  var inverseMass: Double
  /**
    * The collision normal, facing away from Body A.
    */
  var normal: Vector
  /**
    * A reference to the parent of Body A, or to Body A itself if it has no parent.
    */
  var parentA: BodyType
  /**
    * A reference to the parent of Body B, or to Body B itself if it has no parent.
    */
  var parentB: BodyType
  /**
    * The penetration distances between the two bodies.
    */
  var penetration: Vector
  /**
    * The resulting restitution from the collision.
    */
  var restitution: Double
  /**
    * The resulting slop from the collision.
    */
  var slop: Double
  /**
    * An array of support points, either exactly one or two points.
    */
  var supports: js.Array[Vector]
  /**
    * The tangent of the collision normal.
    */
  var tangent: Vector
}

object MatterCollisionData {
  @scala.inline
  def apply(
    axisBody: BodyType,
    axisNumber: Double,
    bodyA: BodyType,
    bodyB: BodyType,
    collided: Boolean,
    depth: Double,
    friction: Double,
    frictionStatic: Double,
    inverseMass: Double,
    normal: Vector,
    parentA: BodyType,
    parentB: BodyType,
    penetration: Vector,
    restitution: Double,
    slop: Double,
    supports: js.Array[Vector],
    tangent: Vector
  ): MatterCollisionData = {
    val __obj = js.Dynamic.literal(axisBody = axisBody.asInstanceOf[js.Any], axisNumber = axisNumber.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collided = collided.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], parentA = parentA.asInstanceOf[js.Any], parentB = parentB.asInstanceOf[js.Any], penetration = penetration.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterCollisionData]
  }
}

