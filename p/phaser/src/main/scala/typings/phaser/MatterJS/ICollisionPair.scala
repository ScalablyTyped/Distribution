package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollisionPair extends js.Object {
  var activeContacts: js.Array[Vector] = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var collision: ICollisionData = js.native
  var confirmedActive: Boolean = js.native
  var friction: Double = js.native
  var frictionStatic: Double = js.native
  var id: String = js.native
  var inverseMass: Double = js.native
  var isActive: Boolean = js.native
  var isSensor: Boolean = js.native
  var restitution: Double = js.native
  var separation: Double = js.native
  var slop: Double = js.native
  var timeCreated: Double = js.native
  var timeUpdated: Double = js.native
}

object ICollisionPair {
  @scala.inline
  def apply(
    activeContacts: js.Array[Vector],
    bodyA: Body,
    bodyB: Body,
    collision: ICollisionData,
    confirmedActive: Boolean,
    friction: Double,
    frictionStatic: Double,
    id: String,
    inverseMass: Double,
    isActive: Boolean,
    isSensor: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): ICollisionPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collision = collision.asInstanceOf[js.Any], confirmedActive = confirmedActive.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionPair]
  }
  @scala.inline
  implicit class ICollisionPairOps[Self <: ICollisionPair] (val x: Self) extends AnyVal {
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
    def setActiveContactsVarargs(value: Vector*): Self = this.set("activeContacts", js.Array(value :_*))
    @scala.inline
    def setActiveContacts(value: js.Array[Vector]): Self = this.set("activeContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyA(value: Body): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyB(value: Body): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollision(value: ICollisionData): Self = this.set("collision", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirmedActive(value: Boolean): Self = this.set("confirmedActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrictionStatic(value: Double): Self = this.set("frictionStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverseMass(value: Double): Self = this.set("inverseMass", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSensor(value: Boolean): Self = this.set("isSensor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparation(value: Double): Self = this.set("separation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlop(value: Double): Self = this.set("slop", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeUpdated(value: Double): Self = this.set("timeUpdated", value.asInstanceOf[js.Any])
  }
  
}

