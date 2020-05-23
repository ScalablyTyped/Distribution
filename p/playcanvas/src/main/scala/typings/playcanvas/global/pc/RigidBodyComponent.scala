package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new RigidBodyComponent.
  * @property mass - The mass of the body. This is only relevant for {@link pc.BODYTYPE_DYNAMIC}
  bodies, other types have infinite mass. Defaults to 1.
  * @property linearVelocity - Defines the speed of the body in a given direction.
  * @property angularVelocity - Defines the rotational speed of the body around each world axis.
  * @property linearDamping - Controls the rate at which a body loses linear velocity over time.
  Defaults to 0.
  * @property angularDamping - Controls the rate at which a body loses angular velocity over time.
  Defaults to 0.
  * @property linearFactor - Scaling factor for linear movement of the body in each axis.
  Defaults to 1 in all axes.
  * @property angularFactor - Scaling factor for angular movement of the body in each axis.
  Defaults to 1 in all axes.
  * @property friction - The friction value used when contacts occur between two bodies. A higher
  value indicates more friction. Should be set in the range 0 to 1. Defaults to 0.5.
  * @property restitution - Influences the amount of energy lost when two rigid bodies collide. The
  calculation multiplies the restitution values for both colliding bodies. A multiplied value of 0 means
  that all energy is lost in the collision while a value of 1 means that no energy is lost. Should be
  set in the range 0 to 1. Defaults to 0.
  * @property group - The collision group this body belongs to. Combine the group and the mask to
  prevent bodies colliding with each other. Defaults to 1.
  * @property mask - The collision mask sets which groups this body collides with. It is a bitfield
  of 16 bits, the first 8 bits are reserved for engine use. Defaults to 65535.
  * @property type - The rigid body type determines how the body is simulated. Can be:
  
  * {@link pc.BODYTYPE_STATIC}: infinite mass and cannot move.
  * {@link pc.BODYTYPE_DYNAMIC}: simulated according to applied forces.
  * {@link pc.BODYTYPE_KINEMATIC}: infinite mass and does not respond to forces but can still be moved by setting their velocity or position.
  
  Defaults to pc.BODYTYPE_STATIC.
  * @param system - The ComponentSystem that created this component.
  * @param entity - The entity this component is attached to.
  */
@JSGlobal("pc.RigidBodyComponent")
@js.native
class RigidBodyComponent protected ()
  extends typings.playcanvas.pc.RigidBodyComponent {
  def this(system: typings.playcanvas.pc.RigidBodyComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

