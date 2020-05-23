package typings.playcanvas.pc

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
@js.native
trait RigidBodyComponent extends Component {
  /**
    * Controls the rate at which a body loses angular velocity over time.
    * Defaults to 0.
    */
  var angularDamping: Double = js.native
  /**
    * Scaling factor for angular movement of the body in each axis.
    * Defaults to 1 in all axes.
    */
  var angularFactor: Vec3 = js.native
  /**
    * Defines the rotational speed of the body around each world axis.
    */
  var angularVelocity: Vec3 = js.native
  /**
    * The friction value used when contacts occur between two bodies. A higher
    * value indicates more friction. Should be set in the range 0 to 1. Defaults to 0.5.
    */
  var friction: Double = js.native
  /**
    * The collision group this body belongs to. Combine the group and the mask to
    * prevent bodies colliding with each other. Defaults to 1.
    */
  var group: Double = js.native
  /**
    * Controls the rate at which a body loses linear velocity over time.
    * Defaults to 0.
    */
  var linearDamping: Double = js.native
  /**
    * Scaling factor for linear movement of the body in each axis.
    * Defaults to 1 in all axes.
    */
  var linearFactor: Vec3 = js.native
  /**
    * Defines the speed of the body in a given direction.
    */
  var linearVelocity: Vec3 = js.native
  /**
    * The collision mask sets which groups this body collides with. It is a bitfield
    * of 16 bits, the first 8 bits are reserved for engine use. Defaults to 65535.
    */
  var mask: Double = js.native
  /**
    * The mass of the body. This is only relevant for {@link pc.BODYTYPE_DYNAMIC}
    * bodies, other types have infinite mass. Defaults to 1.
    */
  var mass: Double = js.native
  /**
    * Influences the amount of energy lost when two rigid bodies collide. The
    * calculation multiplies the restitution values for both colliding bodies. A multiplied value of 0 means
    * that all energy is lost in the collision while a value of 1 means that no energy is lost. Should be
    * set in the range 0 to 1. Defaults to 0.
    */
  var restitution: Double = js.native
  /**
    * The rigid body type determines how the body is simulated. Can be:
    * * {@link pc.BODYTYPE_STATIC}: infinite mass and cannot move.
    * * {@link pc.BODYTYPE_DYNAMIC}: simulated according to applied forces.
    * * {@link pc.BODYTYPE_KINEMATIC}: infinite mass and does not respond to forces but can still be moved by setting their velocity or position.
    * Defaults to pc.BODYTYPE_STATIC.
    */
  var `type`: String = js.native
  /**
    * Forcibly activate the rigid body simulation.
    */
  def activate(): Unit = js.native
  def applyForce(x: Double): Unit = js.native
  def applyForce(x: Double, y: Double): Unit = js.native
  def applyForce(x: Double, y: Double, z: Double): Unit = js.native
  def applyForce(x: Double, y: Double, z: Double, px: Double): Unit = js.native
  def applyForce(x: Double, y: Double, z: Double, px: Double, py: Double): Unit = js.native
  def applyForce(x: Double, y: Double, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  def applyForce(x: Double, y: Vec3): Unit = js.native
  def applyForce(x: Double, y: Vec3, z: Double): Unit = js.native
  def applyForce(x: Double, y: Vec3, z: Double, px: Double): Unit = js.native
  def applyForce(x: Double, y: Vec3, z: Double, px: Double, py: Double): Unit = js.native
  def applyForce(x: Double, y: Vec3, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  /**
    * Apply an force to the body at a point. By default, the force is applied at the origin of the
    body. However, the force can be applied at an offset this point by specifying a world space vector from
    the body's origin to the point of application. This function has two valid signatures. You can either
    specify the force (and optional relative point) via 3D-vector or numbers.
    * @example
    * // Apply an approximation of gravity at the body's center
    this.entity.rigidbody.applyForce(0, -10, 0);
    * @example
    * // Apply an approximation of gravity at 1 unit down the world Z from the center of the body
    this.entity.rigidbody.applyForce(0, -10, 0, 0, 0, 1);
    * @example
    * // Apply a force at the body's center
    // Calculate a force vector pointing in the world space direction of the entity
    var force = this.entity.forward.clone().scale(100);
    
    // Apply the force
    this.entity.rigidbody.applyForce(force);
    * @example
    * // Apply a force at some relative offset from the body's center
    // Calculate a force vector pointing in the world space direction of the entity
    var force = this.entity.forward.clone().scale(100);
    
    // Calculate the world space relative offset
    var relativePos = new pc.Vec3();
    var childEntity = this.entity.findByName('Engine');
    relativePos.sub2(childEntity.getPosition(), this.entity.getPosition());
    
    // Apply the force
    this.entity.rigidbody.applyForce(force, relativePos);
    * @param x - A 3-dimensional vector representing the force in world-space or
    the x-component of the force in world-space.
    * @param [y] - An optional 3-dimensional vector representing the relative point at
    which to apply the impulse in world-space or the y-component of the force in world-space.
    * @param [z] - The z-component of the force in world-space.
    * @param [px] - The x-component of a world-space offset from the body's position where the force is applied.
    * @param [py] - The y-component of a world-space offset from the body's position where the force is applied.
    * @param [pz] - The z-component of a world-space offset from the body's position where the force is applied.
    */
  def applyForce(x: Vec3): Unit = js.native
  def applyForce(x: Vec3, y: Double): Unit = js.native
  def applyForce(x: Vec3, y: Double, z: Double): Unit = js.native
  def applyForce(x: Vec3, y: Double, z: Double, px: Double): Unit = js.native
  def applyForce(x: Vec3, y: Double, z: Double, px: Double, py: Double): Unit = js.native
  def applyForce(x: Vec3, y: Double, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  def applyForce(x: Vec3, y: Vec3): Unit = js.native
  def applyForce(x: Vec3, y: Vec3, z: Double): Unit = js.native
  def applyForce(x: Vec3, y: Vec3, z: Double, px: Double): Unit = js.native
  def applyForce(x: Vec3, y: Vec3, z: Double, px: Double, py: Double): Unit = js.native
  def applyForce(x: Vec3, y: Vec3, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  def applyImpulse(x: Double): Unit = js.native
  def applyImpulse(x: Double, y: Double): Unit = js.native
  def applyImpulse(x: Double, y: Double, z: Double): Unit = js.native
  def applyImpulse(x: Double, y: Double, z: Double, px: Double): Unit = js.native
  def applyImpulse(x: Double, y: Double, z: Double, px: Double, py: Double): Unit = js.native
  def applyImpulse(x: Double, y: Double, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  def applyImpulse(x: Double, y: Vec3): Unit = js.native
  def applyImpulse(x: Double, y: Vec3, z: Double): Unit = js.native
  def applyImpulse(x: Double, y: Vec3, z: Double, px: Double): Unit = js.native
  def applyImpulse(x: Double, y: Vec3, z: Double, px: Double, py: Double): Unit = js.native
  def applyImpulse(x: Double, y: Vec3, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  /**
    * Apply an impulse (instantaneous change of velocity) to the body at a point.
    This function has two valid signatures. You can either specify the impulse (and optional relative
    point) via 3D-vector or numbers.
    * @example
    * // Apply an impulse along the world-space positive y-axis at the entity's position.
    var impulse = new pc.Vec3(0, 10, 0);
    entity.rigidbody.applyImpulse(impulse);
    * @example
    * // Apply an impulse along the world-space positive y-axis at 1 unit down the positive
    // z-axis of the entity's local-space.
    var impulse = new pc.Vec3(0, 10, 0);
    var relativePoint = new pc.Vec3(0, 0, 1);
    entity.rigidbody.applyImpulse(impulse, relativePoint);
    * @example
    * // Apply an impulse along the world-space positive y-axis at the entity's position.
    entity.rigidbody.applyImpulse(0, 10, 0);
    * @example
    * // Apply an impulse along the world-space positive y-axis at 1 unit down the positive
    // z-axis of the entity's local-space.
    entity.rigidbody.applyImpulse(0, 10, 0, 0, 0, 1);
    * @param x - A 3-dimensional vector representing the impulse in world-space or
    the x-component of the impulse in world-space.
    * @param [y] - An optional 3-dimensional vector representing the relative point at
    which to apply the impulse in the local-space of the entity or the y-component of the impulse to
    apply in world-space.
    * @param [z] - The z-component of the impulse to apply in world-space.
    * @param [px = 0] - The x-component of the point at which to apply the impulse in the local-space of the entity.
    * @param [py = 0] - The y-component of the point at which to apply the impulse in the local-space of the entity.
    * @param [pz = 0] - The z-component of the point at which to apply the impulse in the local-space of the entity.
    */
  def applyImpulse(x: Vec3): Unit = js.native
  def applyImpulse(x: Vec3, y: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Double, z: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Double, z: Double, px: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Double, z: Double, px: Double, py: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Double, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Vec3): Unit = js.native
  def applyImpulse(x: Vec3, y: Vec3, z: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Vec3, z: Double, px: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Vec3, z: Double, px: Double, py: Double): Unit = js.native
  def applyImpulse(x: Vec3, y: Vec3, z: Double, px: Double, py: Double, pz: Double): Unit = js.native
  def applyTorque(x: Double): Unit = js.native
  def applyTorque(x: Double, y: Double): Unit = js.native
  def applyTorque(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * Apply torque (rotational force) to the body. This function has two valid signatures.
    You can either specify the torque force with a 3D-vector or with 3 numbers.
    * @example
    * // Apply via vector
    var torque = new pc.Vec3(0, 10, 0);
    entity.rigidbody.applyTorque(torque);
    * @example
    * // Apply via numbers
    entity.rigidbody.applyTorque(0, 10, 0);
    * @param x - A 3-dimensional vector representing the torque force in world-space or
    the x-component of the torque force in world-space.
    * @param [y] - The y-component of the torque force in world-space.
    * @param [z] - The z-component of the torque force in world-space.
    */
  def applyTorque(x: Vec3): Unit = js.native
  def applyTorque(x: Vec3, y: Double): Unit = js.native
  def applyTorque(x: Vec3, y: Double, z: Double): Unit = js.native
  def applyTorqueImpulse(x: Double): Unit = js.native
  def applyTorqueImpulse(x: Double, y: Double): Unit = js.native
  def applyTorqueImpulse(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * Apply a torque impulse (rotational force applied instantaneously) to the body.
    This function has two valid signatures. You can either specify the torque force with a 3D-vector
    or with 3 numbers.
    * @example
    * // Apply via vector
    var torque = new pc.Vec3(0, 10, 0);
    entity.rigidbody.applyTorqueImpulse(torque);
    * @example
    * // Apply via numbers
    entity.rigidbody.applyTorqueImpulse(0, 10, 0);
    * @param x - A 3-dimensional vector representing the torque impulse in world-space or
    the x-component of the torque impulse in world-space.
    * @param [y] - The y-component of the torque impulse in world-space.
    * @param [z] - The z-component of the torque impulse in world-space.
    */
  def applyTorqueImpulse(x: Vec3): Unit = js.native
  def applyTorqueImpulse(x: Vec3, y: Double): Unit = js.native
  def applyTorqueImpulse(x: Vec3, y: Double, z: Double): Unit = js.native
  /**
    * Returns true if the rigid body is currently actively being simulated. I.e. Not 'sleeping'.
    * @returns True if the body is active.
    */
  def isActive(): Boolean = js.native
  /**
    * Returns true if the rigid body is of type {@link pc.BODYTYPE_KINEMATIC}.
    * @returns True if kinematic.
    */
  def isKinematic(): Boolean = js.native
  /**
    * Returns true if the rigid body is of type {@link pc.BODYTYPE_STATIC}.
    * @returns True if static.
    */
  def isStatic(): Boolean = js.native
  /**
    * Returns true if the rigid body is of type {@link pc.BODYTYPE_STATIC} or {@link pc.BODYTYPE_KINEMATIC}.
    * @returns True if static or kinematic.
    */
  def isStaticOrKinematic(): Boolean = js.native
  def teleport(x: Double, y: Double): Unit = js.native
  def teleport(x: Double, y: Double, z: Double): Unit = js.native
  def teleport(x: Double, y: Double, z: Double, rx: Double): Unit = js.native
  def teleport(x: Double, y: Double, z: Double, rx: Double, ry: Double): Unit = js.native
  def teleport(x: Double, y: Double, z: Double, rx: Double, ry: Double, rz: Double): Unit = js.native
  def teleport(x: Double, y: Quat): Unit = js.native
  def teleport(x: Double, y: Quat, z: Double): Unit = js.native
  def teleport(x: Double, y: Quat, z: Double, rx: Double): Unit = js.native
  def teleport(x: Double, y: Quat, z: Double, rx: Double, ry: Double): Unit = js.native
  def teleport(x: Double, y: Quat, z: Double, rx: Double, ry: Double, rz: Double): Unit = js.native
  def teleport(x: Double, y: Vec3): Unit = js.native
  def teleport(x: Double, y: Vec3, z: Double): Unit = js.native
  def teleport(x: Double, y: Vec3, z: Double, rx: Double): Unit = js.native
  def teleport(x: Double, y: Vec3, z: Double, rx: Double, ry: Double): Unit = js.native
  def teleport(x: Double, y: Vec3, z: Double, rx: Double, ry: Double, rz: Double): Unit = js.native
  def teleport(x: Vec3, y: Double): Unit = js.native
  def teleport(x: Vec3, y: Double, z: Double): Unit = js.native
  def teleport(x: Vec3, y: Double, z: Double, rx: Double): Unit = js.native
  def teleport(x: Vec3, y: Double, z: Double, rx: Double, ry: Double): Unit = js.native
  def teleport(x: Vec3, y: Double, z: Double, rx: Double, ry: Double, rz: Double): Unit = js.native
  def teleport(x: Vec3, y: Quat): Unit = js.native
  def teleport(x: Vec3, y: Quat, z: Double): Unit = js.native
  def teleport(x: Vec3, y: Quat, z: Double, rx: Double): Unit = js.native
  def teleport(x: Vec3, y: Quat, z: Double, rx: Double, ry: Double): Unit = js.native
  def teleport(x: Vec3, y: Quat, z: Double, rx: Double, ry: Double, rz: Double): Unit = js.native
  /**
    * Teleport an entity to a new world-space position, optionally setting orientation. This function
    should only be called for rigid bodies that are dynamic. This function has three valid signatures.
    The first takes a 3-dimensional vector for the position and an optional 3-dimensional vector for Euler rotation.
    The second takes a 3-dimensional vector for the position and an optional quaternion for rotation.
    The third takes 3 numbers for the position and an optional 3 numbers for Euler rotation.
    * @example
    * // Teleport the entity to the origin
    entity.rigidbody.teleport(pc.Vec3.ZERO);
    * @example
    * // Teleport the entity to the origin
    entity.rigidbody.teleport(0, 0, 0);
    * @example
    * // Teleport the entity to world-space coordinate [1, 2, 3] and reset orientation
    var position = new pc.Vec3(1, 2, 3);
    entity.rigidbody.teleport(position, pc.Vec3.ZERO);
    * @example
    * // Teleport the entity to world-space coordinate [1, 2, 3] and reset orientation
    entity.rigidbody.teleport(1, 2, 3, 0, 0, 0);
    * @param x - A 3-dimensional vector holding the new position or the new position x-coordinate.
    * @param y - A 3-dimensional vector or quaternion holding the new rotation or the new
    position y-coordinate.
    * @param [z] - The new position z-coordinate.
    * @param [rx] - The new Euler x-angle value.
    * @param [ry] - The new Euler y-angle value.
    * @param [rz] - The new Euler z-angle value.
    */
  def teleport(x: Vec3, y: Vec3): Unit = js.native
  def teleport(x: Vec3, y: Vec3, z: Double): Unit = js.native
  def teleport(x: Vec3, y: Vec3, z: Double, rx: Double): Unit = js.native
  def teleport(x: Vec3, y: Vec3, z: Double, rx: Double, ry: Double): Unit = js.native
  def teleport(x: Vec3, y: Vec3, z: Double, rx: Double, ry: Double, rz: Double): Unit = js.native
}

