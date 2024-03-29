package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Animation Component allows an Entity to playback animations on models.
  *
  * @augments Component
  */
@JSGlobal("pc.AnimationComponent")
@js.native
open class AnimationComponent protected ()
  extends typings.playcanvas.mod.AnimationComponent {
  /**
    * Create a new AnimationComponent instance.
    *
    * @param {import('./system.js').AnimationComponentSystem} system - The {@link ComponentSystem}
    * that created this component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.AnimationComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
