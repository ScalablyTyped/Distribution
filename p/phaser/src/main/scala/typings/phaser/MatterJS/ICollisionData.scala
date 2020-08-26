package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollisionData extends js.Object {
  var axisBody: Body = js.native
  var axisNumber: Double = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collided: Boolean = js.native
  var depth: Double = js.native
  var friction: Double = js.native
  var frictionStatic: Double = js.native
  var inverseMass: Double = js.native
  var normal: Vector = js.native
  var parentA: Body = js.native
  var parentB: Body = js.native
  var penetration: Vector = js.native
  var restitution: Double = js.native
  var slop: Double = js.native
  var supports: js.Array[Vector] = js.native
  var tangent: Vector = js.native
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
  @scala.inline
  implicit class ICollisionDataOps[Self <: ICollisionData] (val x: Self) extends AnyVal {
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
    def setAxisBody(value: Body): Self = this.set("axisBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisNumber(value: Double): Self = this.set("axisNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyA(value: Body): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyB(value: Body): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollided(value: Boolean): Self = this.set("collided", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrictionStatic(value: Double): Self = this.set("frictionStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverseMass(value: Double): Self = this.set("inverseMass", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: Vector): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentA(value: Body): Self = this.set("parentA", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentB(value: Body): Self = this.set("parentB", value.asInstanceOf[js.Any])
    @scala.inline
    def setPenetration(value: Vector): Self = this.set("penetration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlop(value: Double): Self = this.set("slop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsVarargs(value: Vector*): Self = this.set("supports", js.Array(value :_*))
    @scala.inline
    def setSupports(value: js.Array[Vector]): Self = this.set("supports", value.asInstanceOf[js.Any])
    @scala.inline
    def setTangent(value: Vector): Self = this.set("tangent", value.asInstanceOf[js.Any])
  }
  
}

