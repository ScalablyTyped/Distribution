package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionData extends js.Object {
  var axisBody: Body
  var axisNumber: Double
  var bodyA: Body
  var bodyB: Body
  var collided: Boolean
  var depth: Double
  var friction: Double
  var frictionStatic: Double
  var inverseMass: Double
  var normal: Vector
  var parentA: Body
  var parentB: Body
  var penetration: Vector
  var restitution: Double
  var slop: Double
  var supports: js.Array[Vector]
  var tangent: Vector
}

object ICollisionData {
  @scala.inline
  def apply(
    axisBody: Body,
    axisNumber: Double,
    bodyA: Body,
    bodyB: Body,
    collided: Boolean,
    depth: Double,
    friction: Double,
    frictionStatic: Double,
    inverseMass: Double,
    normal: Vector,
    parentA: Body,
    parentB: Body,
    penetration: Vector,
    restitution: Double,
    slop: Double,
    supports: js.Array[Vector],
    tangent: Vector
  ): ICollisionData = {
    val __obj = js.Dynamic.literal(axisBody = axisBody.asInstanceOf[js.Any], axisNumber = axisNumber.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collided = collided.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], parentA = parentA.asInstanceOf[js.Any], parentB = parentB.asInstanceOf[js.Any], penetration = penetration.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionData]
  }
}

