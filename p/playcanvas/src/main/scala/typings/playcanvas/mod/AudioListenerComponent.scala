package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the audio listener in the 3D world, so that 3D positioned audio sources are heard
  * correctly.
  *
  * @augments Component
  */
@JSImport("playcanvas", "AudioListenerComponent")
@js.native
open class AudioListenerComponent protected () extends Component {
  /**
    * Create a new AudioListenerComponent instance.
    *
    * @param {import('./system.js').AudioListenerComponentSystem} system - The ComponentSystem
    * that created this component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this component is
    * attached to.
    */
  def this(system: AudioListenerComponentSystem, entity: Entity) = this()
  
  def setCurrentListener(): Unit = js.native
}
