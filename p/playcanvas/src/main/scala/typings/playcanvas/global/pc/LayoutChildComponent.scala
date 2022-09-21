package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../entity.js').Entity} Entity */
/** @typedef {import('./system.js').LayoutChildComponentSystem} LayoutChildComponentSystem */
/**
  * A LayoutChildComponent enables the Entity to control the sizing applied to it by its parent
  * {@link LayoutGroupComponent}.
  *
  * @augments Component
  */
@JSGlobal("pc.LayoutChildComponent")
@js.native
open class LayoutChildComponent protected ()
  extends typings.playcanvas.mod.LayoutChildComponent {
  /**
    * Create a new LayoutChildComponent.
    *
    * @param {LayoutChildComponentSystem} system - The ComponentSystem that created this
    * Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.LayoutChildComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
