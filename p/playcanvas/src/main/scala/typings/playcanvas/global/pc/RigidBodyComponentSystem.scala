package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new RigidBodyComponentSystem.
  * @property gravity - The world space vector representing global gravity in the physics simulation.
  * Defaults to [0, -9.81, 0] which is an approximation of the gravitational force on Earth.
  * @param app - The Application.
  */
@JSGlobal("pc.RigidBodyComponentSystem")
@js.native
class RigidBodyComponentSystem protected ()
  extends typings.playcanvas.pc.RigidBodyComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}
