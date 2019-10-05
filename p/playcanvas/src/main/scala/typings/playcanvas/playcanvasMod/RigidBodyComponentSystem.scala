package typings.playcanvas.playcanvasMod

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
@JSImport("playcanvas", "RigidBodyComponentSystem")
@js.native
class RigidBodyComponentSystem protected ()
  extends typings.playcanvas.pc.RigidBodyComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}

