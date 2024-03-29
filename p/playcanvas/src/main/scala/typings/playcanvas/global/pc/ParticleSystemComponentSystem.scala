package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows an Entity to render a particle system.
  *
  * @augments ComponentSystem
  */
@JSGlobal("pc.ParticleSystemComponentSystem")
@js.native
open class ParticleSystemComponentSystem protected ()
  extends typings.playcanvas.mod.ParticleSystemComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
