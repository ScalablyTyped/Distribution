package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.RigidBodyComponent
  * @extends pc.Component
  * @classdesc The rigidbody component, when combined with a {@link pc.CollisionComponent}, allows your
  * entities to be simulated using realistic physics.
  * A rigidbody component will fall under gravity and collide with other rigid bodies. Using scripts, you
  * can apply forces and impulses to rigid bodies.
  * @description Create a new RigidBodyComponent
  * @param {pc.RigidBodyComponentSystem} system The ComponentSystem that created this component
  * @param {pc.Entity} entity The entity this component is attached to
  * @property {Number} mass The mass of the body. This is only relevant for {@link pc.BODYTYPE_DYNAMIC}
  * bodies, other types have infinite mass. Defaults to 1.
  * @property {pc.Vec3} linearVelocity Defines the speed of the body in a given direction.
  * @property {pc.Vec3} angularVelocity Defines the rotational speed of the body around each world axis.
  * @property {Number} linearDamping Controls the rate at which a body loses linear velocity over time.
  * Defaults to 0.
  * @property {Number} angularDamping Controls the rate at which a body loses angular velocity over time.
  * Defaults to 0.
  * @property {pc.Vec3} linearFactor Scaling factor for linear movement of the body in each axis.
  * Defaults to 1 in all axes.
  * @property {pc.Vec3} angularFactor Scaling factor for angular movement of the body in each axis.
  * Defaults to 1 in all axes.
  * @property {Number} friction The friction value used when contacts occur between two bodies. A higher
  * value indicates more friction. Should be set in the range 0 to 1. Defaults to 0.5.
  * @property {Number} restitution Influences the amount of energy lost when two rigid bodies collide. The
  * calculation multiplies the restitution values for both colliding bodies. A multiplied value of 0 means
  * that all energy is lost in the collision while a value of 1 means that no energy is lost. Should be
  * set in the range 0 to 1. Defaults to 0.
  * @property {Number} group The collision group this body belongs to. Combine the group and the mask to
  * prevent bodies colliding with each other. Defaults to 1.
  * @property {Number} mask The collision mask sets which groups this body collides with. It is a bitfield
  * of 16 bits, the first 8 bits are reserved for engine use. Defaults to 65535.
  * @property {String} type The rigid body type determines how the body is simulated. Can be:
  * <ul>
  *     <li>pc.BODYTYPE_STATIC: infinite mass and cannot move.</li>
  *     <li>pc.BODYTYPE_DYNAMIC: simulated according to applied forces.</li>
  *     <li>pc.BODYTYPE_KINEMATIC: infinite mass and does not respond to forces but can still be moved by setting their velocity or position.</li>
  * </ul>
  * Defaults to pc.BODYTYPE_STATIC.
  */
@JSImport("playcanvas", "RigidBodyComponent")
@js.native
class RigidBodyComponent protected ()
  extends typings.playcanvas.pc.RigidBodyComponent {
  def this(system: typings.playcanvas.pc.RigidBodyComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

