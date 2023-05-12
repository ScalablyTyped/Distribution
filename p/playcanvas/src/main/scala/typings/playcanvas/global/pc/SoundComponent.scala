package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Sound Component controls playback of {@link Sound}s.
  *
  * @augments Component
  */
@JSGlobal("pc.SoundComponent")
@js.native
open class SoundComponent protected ()
  extends typings.playcanvas.mod.SoundComponent {
  /**
    * Create a new Sound Component.
    *
    * @param {import('./system.js').SoundComponentSystem} system - The ComponentSystem that
    * created this component.
    * @param {import('../../entity.js').Entity} entity - The entity that the Component is attached
    * to.
    */
  def this(system: typings.playcanvas.mod.SoundComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
