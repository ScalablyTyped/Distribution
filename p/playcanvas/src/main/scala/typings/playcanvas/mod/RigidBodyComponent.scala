package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rigidbody component, when combined with a {@link CollisionComponent}, allows your entities
  * to be simulated using realistic physics. A rigidbody component will fall under gravity and
  * collide with other rigid bodies. Using scripts, you can apply forces and impulses to rigid
  * bodies.
  *
  * You should never need to use the RigidBodyComponent constructor. To add an RigidBodyComponent to
  * a {@link Entity}, use {@link Entity#addComponent}:
  *
  * ```javascript
  * // Create a static 1x1x1 box-shaped rigid body
  * const entity = pc.Entity();
  * entity.addComponent("rigidbody"); // Without options, this defaults to a 'static' body
  * entity.addComponent("collision"); // Without options, this defaults to a 1x1x1 box shape
  * ```
  *
  * To create a dynamic sphere with mass of 10, do:
  *
  * ```javascript
  * const entity = pc.Entity();
  * entity.addComponent("rigidbody", {
  *     type: pc.BODYTYPE_DYNAMIC,
  *     mass: 10
  * });
  * entity.addComponent("collision", {
  *     type: "sphere"
  * });
  * ```
  *
  * Relevant 'Engine-only' examples:
  *
  * - [Falling shapes](http://playcanvas.github.io/#physics/falling-shapes)
  * - [Vehicle physics](http://playcanvas.github.io/#physics/vehicle)
  *
  * @augments Component
  */
@JSImport("playcanvas", "RigidBodyComponent")
@js.native
open class RigidBodyComponent protected () extends Component {
  /**
    * Create a new RigidBodyComponent instance.
    *
    * @param {import('./system.js').RigidBodyComponentSystem} system - The ComponentSystem that
    * created this component.
    * @param {import('../../entity.js').Entity} entity - The entity this component is attached to.
    */
  def this(system: RigidBodyComponentSystem, entity: Entity) = this()
  
  /** @private */
  /* private */ var _angularDamping: Any = js.native
  
  /** @private */
  /* private */ var _angularFactor: Any = js.native
  
  /** @private */
  /* private */ var _angularVelocity: Any = js.native
  
  /** @private */
  /* private */ var _body: Any = js.native
  
  /** @private */
  /* private */ var _friction: Any = js.native
  
  /**
    * Writes an entity transform into an Ammo.btTransform but ignoring scale.
    *
    * @param {object} transform - The ammo transform to write the entity transform to.
    * @private
    */
  /* private */ var _getEntityTransform: Any = js.native
  
  /** @private */
  /* private */ var _group: Any = js.native
  
  /** @private */
  /* private */ var _linearDamping: Any = js.native
  
  /** @private */
  /* private */ var _linearFactor: Any = js.native
  
  /** @private */
  /* private */ var _linearVelocity: Any = js.native
  
  /** @private */
  /* private */ var _mask: Any = js.native
  
  /** @private */
  /* private */ var _mass: Any = js.native
  
  /** @private */
  /* private */ var _restitution: Any = js.native
  
  /** @private */
  /* private */ var _rollingFriction: Any = js.native
  
  /** @private */
  /* private */ var _simulationEnabled: Any = js.native
  
  /** @private */
  /* private */ var _type: Any = js.native
  
  /**
    * Sets an entity's transform to match that of the world transformation matrix of a dynamic
    * rigid body's motion state.
    *
    * @private
    */
  /* private */ var _updateDynamic: Any = js.native
  
  /**
    * Writes the entity's world transformation matrix into the motion state of a kinematic body.
    *
    * @private
    */
  /* private */ var _updateKinematic: Any = js.native
  
  /**
    * Forcibly activate the rigid body simulation. Only affects rigid bodies of type
    * {@link BODYTYPE_DYNAMIC}.
    */
  def activate(): Unit = js.native
  
  def angularDamping: Double = js.native
  /**
    * Controls the rate at which a body loses angular velocity over time.
    *
    * @type {number}
    */
  def angularDamping_=(arg: Double): Unit = js.native
  
  def angularFactor: Vec3 = js.native
  /**
    * Scaling factor for angular movement of the body in each axis. Only valid for rigid bodies of
    * type {@link BODYTYPE_DYNAMIC}. Defaults to 1 in all axes (body can freely rotate).
    *
    * @type {Vec3}
    */
  def angularFactor_=(arg: Vec3): Unit = js.native
  
  def angularVelocity: Vec3 = js.native
  /**
    * Defines the rotational speed of the body around each world axis.
    *
    * @type {Vec3}
    */
  def angularVelocity_=(arg: Vec3): Unit = js.native
  
  /**
    * Apply an force to the body at a point. By default, the force is applied at the origin of the
    * body. However, the force can be applied at an offset this point by specifying a world space
    * vector from the body's origin to the point of application. This function has two valid
    * signatures. You can either specify the force (and optional relative point) via 3D-vector or
    * numbers.
    *
    * @param {Vec3|number} x - A 3-dimensional vector representing the force in world-space or
    * the x-component of the force in world-space.
    * @param {Vec3|number} [y] - An optional 3-dimensional vector representing the relative point
    * at which to apply the impulse in world-space or the y-component of the force in world-space.
    * @param {number} [z] - The z-component of the force in world-space.
    * @param {number} [px] - The x-component of a world-space offset from the body's position
    * where the force is applied.
    * @param {number} [py] - The y-component of a world-space offset from the body's position
    * where the force is applied.
    * @param {number} [pz] - The z-component of a world-space offset from the body's position
    * where the force is applied.
    * @example
    * // Apply an approximation of gravity at the body's center
    * this.entity.rigidbody.applyForce(0, -10, 0);
    * @example
    * // Apply an approximation of gravity at 1 unit down the world Z from the center of the body
    * this.entity.rigidbody.applyForce(0, -10, 0, 0, 0, 1);
    * @example
    * // Apply a force at the body's center
    * // Calculate a force vector pointing in the world space direction of the entity
    * const force = this.entity.forward.clone().mulScalar(100);
    *
    * // Apply the force
    * this.entity.rigidbody.applyForce(force);
    * @example
    * // Apply a force at some relative offset from the body's center
    * // Calculate a force vector pointing in the world space direction of the entity
    * const force = this.entity.forward.clone().mulScalar(100);
    *
    * // Calculate the world space relative offset
    * const relativePos = new pc.Vec3();
    * const childEntity = this.entity.findByName('Engine');
    * relativePos.sub2(childEntity.getPosition(), this.entity.getPosition());
    *
    * // Apply the force
    * this.entity.rigidbody.applyForce(force, relativePos);
    */
  def applyForce(
    x: Vec3 | Double,
    y: js.UndefOr[Vec3 | Double],
    z: js.UndefOr[Double],
    px: js.UndefOr[Double],
    py: js.UndefOr[Double],
    pz: js.UndefOr[Double]
  ): Unit = js.native
  
  /**
    * Apply an impulse (instantaneous change of velocity) to the body at a point. This function
    * has two valid signatures. You can either specify the impulse (and optional relative point)
    * via 3D-vector or numbers.
    *
    * @param {Vec3|number} x - A 3-dimensional vector representing the impulse in world-space or
    * the x-component of the impulse in world-space.
    * @param {Vec3|number} [y] - An optional 3-dimensional vector representing the relative point
    * at which to apply the impulse in the local-space of the entity or the y-component of the
    * impulse to apply in world-space.
    * @param {number} [z] - The z-component of the impulse to apply in world-space.
    * @param {number} [px] - The x-component of the point at which to apply the impulse in the
    * local-space of the entity.
    * @param {number} [py] - The y-component of the point at which to apply the impulse in the
    * local-space of the entity.
    * @param {number} [pz] - The z-component of the point at which to apply the impulse in the
    * local-space of the entity.
    * @example
    * // Apply an impulse along the world-space positive y-axis at the entity's position.
    * const impulse = new pc.Vec3(0, 10, 0);
    * entity.rigidbody.applyImpulse(impulse);
    * @example
    * // Apply an impulse along the world-space positive y-axis at 1 unit down the positive
    * // z-axis of the entity's local-space.
    * const impulse = new pc.Vec3(0, 10, 0);
    * const relativePoint = new pc.Vec3(0, 0, 1);
    * entity.rigidbody.applyImpulse(impulse, relativePoint);
    * @example
    * // Apply an impulse along the world-space positive y-axis at the entity's position.
    * entity.rigidbody.applyImpulse(0, 10, 0);
    * @example
    * // Apply an impulse along the world-space positive y-axis at 1 unit down the positive
    * // z-axis of the entity's local-space.
    * entity.rigidbody.applyImpulse(0, 10, 0, 0, 0, 1);
    */
  def applyImpulse(
    x: Vec3 | Double,
    y: js.UndefOr[Vec3 | Double],
    z: js.UndefOr[Double],
    px: js.UndefOr[Double],
    py: js.UndefOr[Double],
    pz: js.UndefOr[Double]
  ): Unit = js.native
  
  def applyTorque(x: Double): Unit = js.native
  def applyTorque(x: Double, y: Double): Unit = js.native
  def applyTorque(x: Double, y: Double, z: Double): Unit = js.native
  def applyTorque(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Apply torque (rotational force) to the body. This function has two valid signatures. You can
    * either specify the torque force with a 3D-vector or with 3 numbers.
    *
    * @param {Vec3|number} x - A 3-dimensional vector representing the torque force in world-space
    * or the x-component of the torque force in world-space.
    * @param {number} [y] - The y-component of the torque force in world-space.
    * @param {number} [z] - The z-component of the torque force in world-space.
    * @example
    * // Apply via vector
    * const torque = new pc.Vec3(0, 10, 0);
    * entity.rigidbody.applyTorque(torque);
    * @example
    * // Apply via numbers
    * entity.rigidbody.applyTorque(0, 10, 0);
    */
  def applyTorque(x: Vec3): Unit = js.native
  def applyTorque(x: Vec3, y: Double): Unit = js.native
  def applyTorque(x: Vec3, y: Double, z: Double): Unit = js.native
  def applyTorque(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def applyTorqueImpulse(x: Double): Unit = js.native
  def applyTorqueImpulse(x: Double, y: Double): Unit = js.native
  def applyTorqueImpulse(x: Double, y: Double, z: Double): Unit = js.native
  def applyTorqueImpulse(x: Double, y: Unit, z: Double): Unit = js.native
  /**
    * Apply a torque impulse (rotational force applied instantaneously) to the body. This function
    * has two valid signatures. You can either specify the torque force with a 3D-vector or with 3
    * numbers.
    *
    * @param {Vec3|number} x - A 3-dimensional vector representing the torque impulse in
    * world-space or the x-component of the torque impulse in world-space.
    * @param {number} [y] - The y-component of the torque impulse in world-space.
    * @param {number} [z] - The z-component of the torque impulse in world-space.
    * @example
    * // Apply via vector
    * const torque = new pc.Vec3(0, 10, 0);
    * entity.rigidbody.applyTorqueImpulse(torque);
    * @example
    * // Apply via numbers
    * entity.rigidbody.applyTorqueImpulse(0, 10, 0);
    */
  def applyTorqueImpulse(x: Vec3): Unit = js.native
  def applyTorqueImpulse(x: Vec3, y: Double): Unit = js.native
  def applyTorqueImpulse(x: Vec3, y: Double, z: Double): Unit = js.native
  def applyTorqueImpulse(x: Vec3, y: Unit, z: Double): Unit = js.native
  
  def body: Any = js.native
  def body_=(arg: Any): Unit = js.native
  
  /**
    * If the Entity has a Collision shape attached then create a rigid body using this shape. This
    * method destroys the existing body.
    *
    * @private
    */
  /* private */ var createBody: Any = js.native
  
  /**
    * Remove a body from the simulation.
    *
    * @ignore
    */
  def disableSimulation(): Unit = js.native
  
  /**
    * Add a body to the simulation.
    *
    * @ignore
    */
  def enableSimulation(): Unit = js.native
  
  def friction: Double = js.native
  /**
    * The friction value used when contacts occur between two bodies. A higher value indicates
    * more friction. Should be set in the range 0 to 1. Defaults to 0.5.
    *
    * @type {number}
    */
  def friction_=(arg: Double): Unit = js.native
  
  def group: Double = js.native
  /**
    * The collision group this body belongs to. Combine the group and the mask to prevent bodies
    * colliding with each other. Defaults to 1.
    *
    * @type {number}
    */
  def group_=(arg: Double): Unit = js.native
  
  /**
    * Returns true if the rigid body is currently actively being simulated. I.e. Not 'sleeping'.
    *
    * @returns {boolean} True if the body is active.
    */
  def isActive(): Boolean = js.native
  
  /**
    * Returns true if the rigid body is of type {@link BODYTYPE_KINEMATIC}.
    *
    * @returns {boolean} True if kinematic.
    */
  def isKinematic(): Boolean = js.native
  
  /**
    * Returns true if the rigid body is of type {@link BODYTYPE_STATIC}.
    *
    * @returns {boolean} True if static.
    */
  def isStatic(): Boolean = js.native
  
  /**
    * Returns true if the rigid body is of type {@link BODYTYPE_STATIC} or {@link BODYTYPE_KINEMATIC}.
    *
    * @returns {boolean} True if static or kinematic.
    */
  def isStaticOrKinematic(): Boolean = js.native
  
  def linearDamping: Double = js.native
  /**
    * Controls the rate at which a body loses linear velocity over time. Defaults to 0.
    *
    * @type {number}
    */
  def linearDamping_=(arg: Double): Unit = js.native
  
  def linearFactor: Vec3 = js.native
  /**
    * Scaling factor for linear movement of the body in each axis. Only valid for rigid bodies of
    * type {@link BODYTYPE_DYNAMIC}. Defaults to 1 in all axes (body can freely move).
    *
    * @type {Vec3}
    */
  def linearFactor_=(arg: Vec3): Unit = js.native
  
  def linearVelocity: Vec3 = js.native
  /**
    * Defines the speed of the body in a given direction.
    *
    * @type {Vec3}
    */
  def linearVelocity_=(arg: Vec3): Unit = js.native
  
  def mask: Double = js.native
  /**
    * The collision mask sets which groups this body collides with. It is a bitfield of 16 bits,
    * the first 8 bits are reserved for engine use. Defaults to 65535.
    *
    * @type {number}
    */
  def mask_=(arg: Double): Unit = js.native
  
  def mass: Double = js.native
  /**
    * The mass of the body. This is only relevant for {@link BODYTYPE_DYNAMIC} bodies, other types
    * have infinite mass. Defaults to 1.
    *
    * @type {number}
    */
  def mass_=(arg: Double): Unit = js.native
  
  def restitution: Double = js.native
  /**
    * Influences the amount of energy lost when two rigid bodies collide. The calculation
    * multiplies the restitution values for both colliding bodies. A multiplied value of 0 means
    * that all energy is lost in the collision while a value of 1 means that no energy is lost.
    * Should be set in the range 0 to 1. Defaults to 0.
    *
    * @type {number}
    */
  def restitution_=(arg: Double): Unit = js.native
  
  def rollingFriction: Double = js.native
  /**
    * Sets a torsional friction orthogonal to the contact point. Defaults to 0.
    *
    * @type {number}
    */
  def rollingFriction_=(arg: Double): Unit = js.native
  
  /**
    * Set the rigid body transform to be the same as the Entity transform. This must be called
    * after any Entity transformation functions (e.g. {@link Entity#setPosition}) are called in
    * order to update the rigid body to match the Entity.
    *
    * @private
    */
  /* private */ var syncEntityToBody: Any = js.native
  
  /**
    * Teleport an entity to a new world-space position, optionally setting orientation. This
    * function should only be called for rigid bodies that are dynamic. This function has three
    * valid signatures. The first takes a 3-dimensional vector for the position and an optional
    * 3-dimensional vector for Euler rotation. The second takes a 3-dimensional vector for the
    * position and an optional quaternion for rotation. The third takes 3 numbers for the position
    * and an optional 3 numbers for Euler rotation.
    *
    * @param {Vec3|number} x - A 3-dimensional vector holding the new position or the new position
    * x-coordinate.
    * @param {Quat|Vec3|number} [y] - A 3-dimensional vector or quaternion holding the new
    * rotation or the new position y-coordinate.
    * @param {number} [z] - The new position z-coordinate.
    * @param {number} [rx] - The new Euler x-angle value.
    * @param {number} [ry] - The new Euler y-angle value.
    * @param {number} [rz] - The new Euler z-angle value.
    * @example
    * // Teleport the entity to the origin
    * entity.rigidbody.teleport(pc.Vec3.ZERO);
    * @example
    * // Teleport the entity to the origin
    * entity.rigidbody.teleport(0, 0, 0);
    * @example
    * // Teleport the entity to world-space coordinate [1, 2, 3] and reset orientation
    * const position = new pc.Vec3(1, 2, 3);
    * entity.rigidbody.teleport(position, pc.Vec3.ZERO);
    * @example
    * // Teleport the entity to world-space coordinate [1, 2, 3] and reset orientation
    * entity.rigidbody.teleport(1, 2, 3, 0, 0, 0);
    */
  def teleport(
    x: Vec3 | Double,
    y: js.UndefOr[Quat | Vec3 | Double],
    z: js.UndefOr[Double],
    rx: js.UndefOr[Double],
    ry: js.UndefOr[Double],
    rz: js.UndefOr[Double]
  ): Unit = js.native
  
  def `type`: String = js.native
  /**
    * The rigid body type determines how the body is simulated. Can be:
    *
    * - {@link BODYTYPE_STATIC}: infinite mass and cannot move.
    * - {@link BODYTYPE_DYNAMIC}: simulated according to applied forces.
    * - {@link BODYTYPE_KINEMATIC}: infinite mass and does not respond to forces (can only be
    * moved by setting the position and rotation of component's {@link Entity}).
    *
    * Defaults to {@link BODYTYPE_STATIC}.
    *
    * @type {string}
    */
  def type_=(arg: String): Unit = js.native
}
object RigidBodyComponent {
  
  @JSImport("playcanvas", "RigidBodyComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when a contact occurs between two rigid bodies.
    *
    * @event RigidBodyComponent#contact
    * @param {ContactResult} result - Details of the contact between the two rigid bodies.
    */
  /**
    * Fired when two rigid bodies start touching.
    *
    * @event RigidBodyComponent#collisionstart
    * @param {ContactResult} result - Details of the contact between the two rigid bodies.
    */
  /**
    * Fired when two rigid bodies stop touching.
    *
    * @event RigidBodyComponent#collisionend
    * @param {import('../../entity.js').Entity} other - The {@link Entity} that stopped touching this rigid body.
    */
  /**
    * Fired when a rigid body enters a trigger volume.
    *
    * @event RigidBodyComponent#triggerenter
    * @param {import('../../entity.js').Entity} other - The {@link Entity} with trigger volume that this rigid body entered.
    */
  /**
    * Fired when a rigid body exits a trigger volume.
    *
    * @event RigidBodyComponent#triggerleave
    * @param {import('../../entity.js').Entity} other - The {@link Entity} with trigger volume that this rigid body exited.
    */
  /** @ignore */
  /* static member */
  inline def onLibraryLoaded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLibraryLoaded")().asInstanceOf[Unit]
}
