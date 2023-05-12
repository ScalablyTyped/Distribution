package typings.playcanvas.global.pc

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
@JSGlobal("pc.RigidBodyComponentSystem")
@js.native
open class RigidBodyComponentSystem protected ()
  extends typings.playcanvas.mod.RigidBodyComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
