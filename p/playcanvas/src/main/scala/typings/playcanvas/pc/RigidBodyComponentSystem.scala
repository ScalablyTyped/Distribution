package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new RigidBodyComponentSystem.
  * @property gravity - The world space vector representing global gravity in the physics simulation.
  * Defaults to [0, -9.81, 0] which is an approximation of the gravitational force on Earth.
  * @param app - The Application.
  */
@js.native
trait RigidBodyComponentSystem extends EventHandler {
  /**
    * The world space vector representing global gravity in the physics simulation.
    Defaults to [0, -9.81, 0] which is an approximation of the gravitational force on Earth.
    */
  var gravity: Vec3 = js.native
  /**
    * Raycast the world and return all entities the ray hits. It returns an array
    * of {@link pc.RaycastResult}, one for each hit. If no hits are detected, the returned
    * array will be of length 0.
    * @param start - The world space point where the ray starts.
    * @param end - The world space point where the ray ends.
    * @returns An array of raycast hit results (0 length if there were no hits).
    */
  def raycastAll(start: Vec3, end: Vec3): js.Array[RaycastResult] = js.native
  /**
    * Raycast the world and return the first entity the ray hits. Fire a ray into the world from start to end,
    * if the ray hits an entity with a collision component, it returns a {@link pc.RaycastResult}, otherwise returns null.
    * @param start - The world space point where the ray starts.
    * @param end - The world space point where the ray ends.
    * @returns The result of the raycasting or null if there was no hit.
    */
  def raycastFirst(start: Vec3, end: Vec3): RaycastResult = js.native
}

