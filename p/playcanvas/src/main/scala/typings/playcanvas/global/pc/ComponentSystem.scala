package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component Systems contain the logic and functionality to update all Components of a particular
  * type.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.ComponentSystem")
@js.native
open class ComponentSystem protected ()
  extends typings.playcanvas.mod.ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
