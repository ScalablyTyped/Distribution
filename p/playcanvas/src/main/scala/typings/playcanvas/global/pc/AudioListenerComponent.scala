package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the audio listener in the 3D world, so that 3D positioned audio sources are heard
  * correctly.
  *
  * @augments Component
  */
@JSGlobal("pc.AudioListenerComponent")
@js.native
open class AudioListenerComponent protected ()
  extends typings.playcanvas.mod.AudioListenerComponent {
  /**
    * Create a new AudioListenerComponent instance.
    *
    * @param {import('./system.js').AudioListenerComponentSystem} system - The ComponentSystem
    * that created this component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.AudioListenerComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
