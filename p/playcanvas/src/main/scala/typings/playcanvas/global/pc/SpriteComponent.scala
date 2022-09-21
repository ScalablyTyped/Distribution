package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables an Entity to render a simple static sprite or sprite animations.
  *
  * @augments Component
  */
@JSGlobal("pc.SpriteComponent")
@js.native
open class SpriteComponent protected ()
  extends typings.playcanvas.mod.SpriteComponent {
  /**
    * Create a new SpriteComponent instance.
    *
    * @param {SpriteComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.SpriteComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
