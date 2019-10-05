package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.RigidBodyComponentSystem
  * @extends pc.ComponentSystem
  * @classdesc The RigidBodyComponentSystem maintains the dynamics world for simulating rigid bodies,
  * it also controls global values for the world such as gravity. Note: The RigidBodyComponentSystem
  * is only valid if 3D Physics is enabled in your application. You can enable this in the application
  * settings for your project.
  * @description Create a new RigidBodyComponentSystem
  * @param {pc.Application} app The Application
  * @property {pc.Vec3} gravity The world space vector representing global gravity in the physics simulation.
  * Defaults to [0, -9.81, 0] which is an approximation of the gravitational force on Earth.
  */
@JSGlobal("pc.RigidBodyComponentSystem")
@js.native
class RigidBodyComponentSystem protected () extends ComponentSystem {
  def this(app: Application) = this()
  /**
    * The world space vector representing global gravity in the physics simulation.
    * Defaults to [0, -9.81, 0] which is an approximation of the gravitational force on Earth.
    */
  var gravity: Vec3 = js.native
  /**
    * @function
    * @name pc.RigidBodyComponentSystem#raycastFirst
    * @description Raycast the world and return the first entity the ray hits. Fire a ray into the world from start to end,
    * if the ray hits an entity with a collision component, it returns a {@link pc.RaycastResult}, otherwise returns null.
    * @param {pc.Vec3} start The world space point where the ray starts
    * @param {pc.Vec3} end The world space point where the ray ends
    * @returns {pc.RaycastResult} The result of the raycasting or null if there was no hit.
    */
  def raycastFirst(start: Vec3, end: Vec3): RaycastResult = js.native
}

