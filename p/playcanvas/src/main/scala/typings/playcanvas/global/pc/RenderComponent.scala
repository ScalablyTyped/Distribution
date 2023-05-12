package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables an Entity to render a {@link Mesh} or a primitive shape. This component attaches
  * {@link MeshInstance} geometry to the Entity.
  *
  * @property {import('../../entity.js').Entity} rootBone A reference to the entity to be used as
  * the root bone for any skinned meshes that are rendered by this component.
  * @augments Component
  */
@JSGlobal("pc.RenderComponent")
@js.native
open class RenderComponent protected ()
  extends typings.playcanvas.mod.RenderComponent {
  /**
    * Create a new RenderComponent.
    *
    * @param {import('./system.js').RenderComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.RenderComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
