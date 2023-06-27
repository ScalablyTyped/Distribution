package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.playcanvas.anon.Cameras
import typings.playcanvas.anon.FilterCallback
import typings.playcanvas.anon.FilterCollisionGroup
import typings.playcanvas.anon.TypeofRigidBodyComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The RigidBodyComponentSystem maintains the dynamics world for simulating rigid bodies, it also
  * controls global values for the world such as gravity. Note: The RigidBodyComponentSystem is only
  * valid if 3D Physics is enabled in your application. You can enable this in the application
  * settings for your project.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "RigidBodyComponentSystem")
@js.native
open class RigidBodyComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: TypeofRigidBodyComponent & (Instantiable2[/* system */ RigidBodyComponentSystem, /* entity */ Entity, RigidBodyComponent]) = js.native
  
  var DataType: Instantiable0[RigidBodyComponentData] = js.native
  
  /**
    * Checks for collisions and fires collision events.
    *
    * @param {number} world - The pointer to the dynamics world that invoked this callback.
    * @param {number} timeStep - The amount of simulation time processed in the last simulation tick.
    * @private
    */
  /* private */ var _checkForCollisions: Any = js.native
  
  /**
    * Removes collisions that no longer exist from the collisions list and fires collisionend
    * events to the related entities.
    *
    * @private
    */
  /* private */ var _cleanOldCollisions: Any = js.native
  
  /**
    * @type {RigidBodyComponent[]}
    * @private
    */
  /* private */ var _compounds: Any = js.native
  
  def _createContactPointFromAmmo(contactPoint: Any): Any = js.native
  
  def _createContactResult(other: Any, contacts: Any): Any = js.native
  
  def _createReverseContactPointFromAmmo(contactPoint: Any): Any = js.native
  
  def _createSingleContactResult(a: Any, b: Any, contactPoint: Any): Any = js.native
  
  /**
    * @type {RigidBodyComponent[]}
    * @private
    */
  /* private */ var _dynamic: Any = js.native
  
  /**
    * @type {Float32Array}
    * @private
    */
  /* private */ var _gravityFloat32: Any = js.native
  
  /**
    * Returns true if the entity has a contact event attached and false otherwise.
    *
    * @param {import('../../entity.js').Entity} entity - Entity to test.
    * @returns {boolean} True if the entity has a contact and false otherwise.
    * @private
    */
  /* private */ var _hasContactEvent: Any = js.native
  
  /**
    * @type {RigidBodyComponent[]}
    * @private
    */
  /* private */ var _kinematic: Any = js.native
  
  var _stats: Cameras = js.native
  
  /**
    * Stores a collision between the entity and other in the contacts map and returns true if it
    * is a new collision.
    *
    * @param {import('../../entity.js').Entity} entity - The entity.
    * @param {import('../../entity.js').Entity} other - The entity that collides with the first
    * entity.
    * @returns {boolean} True if this is a new collision, false otherwise.
    * @private
    */
  /* private */ var _storeCollision: Any = js.native
  
  /**
    * @type {RigidBodyComponent[]}
    * @private
    */
  /* private */ var _triggers: Any = js.native
  
  def addBody(body: Any, group: Any, mask: Any): Unit = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var collisionConfiguration: Any = js.native
  
  var contactPointPool: ObjectPool = js.native
  
  var contactResultPool: ObjectPool = js.native
  
  def createBody(mass: Any, shape: Any, transform: Any): Any = js.native
  
  def destroyBody(body: Any): Unit = js.native
  
  var dispatcher: Any = js.native
  
  var dynamicsWorld: Any = js.native
  
  /**
    * @type {number}
    * @ignore
    */
  var fixedTimeStep: Double = js.native
  
  /**
    * The world space vector representing global gravity in the physics simulation. Defaults to
    * [0, -9.81, 0] which is an approximation of the gravitational force on Earth.
    *
    * @type {Vec3}
    */
  var gravity: Vec3 = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  /**
    * @type {number}
    * @ignore
    */
  var maxSubSteps: Double = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  /**
    * Fired when a contact occurs between two rigid bodies.
    *
    * @event RigidBodyComponentSystem#contact
    * @param {SingleContactResult} result - Details of the contact between the two bodies.
    */
  /**
    * Called once Ammo has been loaded. Responsible for creating the physics world.
    *
    * @ignore
    */
  def onLibraryLoaded(): Unit = js.native
  
  def onRemove(entity: Any, component: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  var overlappingPairCache: Any = js.native
  
  /**
    * Raycast the world and return all entities the ray hits. It returns an array of
    * {@link RaycastResult}, one for each hit. If no hits are detected, the returned array will be
    * of length 0. Results are sorted by distance with closest first.
    *
    * @param {Vec3} start - The world space point where the ray starts.
    * @param {Vec3} end - The world space point where the ray ends.
    * @param {object} [options] - The additional options for the raycasting.
    * @param {boolean} [options.sort] - Whether to sort raycast results based on distance with closest
    * first. Defaults to false.
    * @param {number} [options.filterCollisionGroup] - Collision group to apply to the raycast.
    * @param {number} [options.filterCollisionMask] - Collision mask to apply to the raycast.
    * @param {any[]} [options.filterTags] - Tags filters. Defined the same way as a {@link Tags#has}
    * query but within an array.
    * @param {Function} [options.filterCallback] - Custom function to use to filter entities.
    * Must return true to proceed with result. Takes the entity to evaluate as argument.
    *
    * @returns {RaycastResult[]} An array of raycast hit results (0 length if there were no hits).
    *
    * @example
    * // Return all results of a raycast between 0, 2, 2 and 0, -2, -2
    * const hits = this.app.systems.rigidbody.raycastAll(new Vec3(0, 2, 2), new Vec3(0, -2, -2));
    * @example
    * // Return all results of a raycast between 0, 2, 2 and 0, -2, -2
    * // where hit entity is tagged with `bird` OR `mammal`
    * const hits = this.app.systems.rigidbody.raycastAll(new Vec3(0, 2, 2), new Vec3(0, -2, -2), {
    *     filterTags: [ "bird", "mammal" ]
    * });
    * @example
    * // Return all results of a raycast between 0, 2, 2 and 0, -2, -2
    * // where hit entity has a `camera` component
    * const hits = this.app.systems.rigidbody.raycastAll(new Vec3(0, 2, 2), new Vec3(0, -2, -2), {
    *     filterCallback: (entity) => entity && entity.camera
    * });
    * @example
    * // Return all results of a raycast between 0, 2, 2 and 0, -2, -2
    * // where hit entity is tagged with (`carnivore` AND `mammal`) OR (`carnivore` AND `reptile`)
    * // and the entity has an `anim` component
    * const hits = this.app.systems.rigidbody.raycastAll(new Vec3(0, 2, 2), new Vec3(0, -2, -2), {
    *     filterTags: [
    *         [ "carnivore", "mammal" ],
    *         [ "carnivore", "reptile" ]
    *     ],
    *     filterCallback: (entity) => entity && entity.anim
    * });
    */
  def raycastAll(start: Vec3, end: Vec3): js.Array[RaycastResult] = js.native
  def raycastAll(start: Vec3, end: Vec3, options: FilterCollisionGroup): js.Array[RaycastResult] = js.native
  
  /**
    * Raycast the world and return the first entity the ray hits. Fire a ray into the world from
    * start to end, if the ray hits an entity with a collision component, it returns a
    * {@link RaycastResult}, otherwise returns null.
    *
    * @param {Vec3} start - The world space point where the ray starts.
    * @param {Vec3} end - The world space point where the ray ends.
    * @param {object} [options] - The additional options for the raycasting.
    * @param {number} [options.filterCollisionGroup] - Collision group to apply to the raycast.
    * @param {number} [options.filterCollisionMask] - Collision mask to apply to the raycast.
    * @param {any[]} [options.filterTags] - Tags filters. Defined the same way as a {@link Tags#has}
    * query but within an array.
    * @param {Function} [options.filterCallback] - Custom function to use to filter entities.
    * Must return true to proceed with result. Takes one argument: the entity to evaluate.
    *
    * @returns {RaycastResult|null} The result of the raycasting or null if there was no hit.
    */
  def raycastFirst(start: Vec3, end: Vec3): RaycastResult | Null = js.native
  def raycastFirst(start: Vec3, end: Vec3, options: FilterCallback): RaycastResult | Null = js.native
  
  def removeBody(body: Any): Unit = js.native
  
  @JSName("schema")
  var schema_RigidBodyComponentSystem: js.Array[String] = js.native
  
  var singleContactResultPool: ObjectPool = js.native
  
  var solver: Any = js.native
}
