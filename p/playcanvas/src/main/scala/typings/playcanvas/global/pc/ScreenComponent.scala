package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ScreenComponent enables the Entity to render child {@link ElementComponent}s using anchors and
  * positions in the ScreenComponent's space.
  *
  * @augments Component
  */
@JSGlobal("pc.ScreenComponent")
@js.native
open class ScreenComponent protected ()
  extends typings.playcanvas.mod.ScreenComponent {
  /**
    * Create a new ScreenComponent.
    *
    * @param {import('./system.js').ScreenComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.ScreenComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
