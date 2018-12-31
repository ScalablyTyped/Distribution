package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.RigidBodyComponentSystem
  * @description Create a new RigidBodyComponentSystem
  * @class The RigidBodyComponentSystem maintains the dynamics world for simulating rigid bodies, it also controls global values for the world such as gravity.
  * Note: The RigidBodyComponentSystem is only valid if 3D Physics is enabled in your application. You can enable this in the application settings for your Depot.
  * @param {pc.Application} app The Application
  * @extends pc.ComponentSystem
  */
@JSGlobal("pc.RigidBodyComponentSystem")
@js.native
class RigidBodyComponentSystem protected () extends ComponentSystem {
  def this(app: Application) = this()
  /**
    * @function
    * @name pc.RigidBodyComponentSystem#raycastFirst
    * @description Raycast the world and return the first entity the ray hits. Fire a ray into the world from start to end,
    * if the ray hits an entity with a rigidbody component, it returns a {@link pc.RaycastResult}, otherwise returns null.
    * @param {pc.Vec3} start The world space point where the ray starts
    * @param {pc.Vec3} end The world space point where the ray ends
    * @returns {pc.RaycastResult} The result of the raycasting or null if there was no hit.
    */
  def raycastFirst(start: Vec3, end: Vec3): RaycastResult = js.native
  /**
    * @function
    * @name pc.RigidBodyComponentSystem#setGravity^2
    * @description Set the gravity vector for the 3D physics world
    * @param {pc.Vec3} gravity The gravity vector to use for the 3D physics world.
    */
  def setGravity(gravity: Vec3): scala.Unit = js.native
  /**
    * @function
    * @name pc.RigidBodyComponentSystem#setGravity
    * @description Set the gravity vector for the 3D physics world
    * @param {Number} x The x-component of the gravity vector
    * @param {Number} y The y-component of the gravity vector
    * @param {Number} z The z-component of the gravity vector
    */
  def setGravity(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
}

