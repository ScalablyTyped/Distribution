package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A LayoutGroupComponent enables the Entity to position and scale child {@link ElementComponent}s
  * according to configurable layout rules.
  *
  * @augments Component
  */
@JSGlobal("pc.LayoutGroupComponent")
@js.native
open class LayoutGroupComponent protected ()
  extends typings.playcanvas.mod.LayoutGroupComponent {
  /**
    * Create a new LayoutGroupComponent instance.
    *
    * @param {import('./system.js').LayoutGroupComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.LayoutGroupComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
