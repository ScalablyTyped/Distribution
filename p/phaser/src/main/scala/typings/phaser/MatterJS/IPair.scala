package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPair extends js.Object {
  var activeContacts: js.Any = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var contacts: js.Any = js.native
  var friction: Double = js.native
  var frictionStatic: Double = js.native
  var id: Double = js.native
  var inverseMass: Double = js.native
  var isActive: Boolean = js.native
  var restitution: Double = js.native
  var separation: Double = js.native
  var slop: Double = js.native
  var timeCreated: Double = js.native
  var timeUpdated: Double = js.native
}

object IPair {
  @scala.inline
  def apply(
    activeContacts: js.Any,
    bodyA: Body,
    bodyB: Body,
    contacts: js.Any,
    friction: Double,
    frictionStatic: Double,
    id: Double,
    inverseMass: Double,
    isActive: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): IPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPair]
  }
  @scala.inline
  implicit class IPairOps[Self <: IPair] (val x: Self) extends AnyVal {
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
    def setActiveContacts(value: js.Any): Self = this.set("activeContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyA(value: Body): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyB(value: Body): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    @scala.inline
    def setContacts(value: js.Any): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrictionStatic(value: Double): Self = this.set("frictionStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverseMass(value: Double): Self = this.set("inverseMass", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
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

