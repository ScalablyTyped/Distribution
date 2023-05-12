package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AnimComponentSystem manages creating and deleting AnimComponents.
  *
  * @augments ComponentSystem
  */
@JSGlobal("pc.AnimComponentSystem")
@js.native
open class AnimComponentSystem protected ()
  extends typings.playcanvas.mod.AnimComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: typings.playcanvas.mod.AppBase) = this()
}
