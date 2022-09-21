package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../entity.js').Entity} Entity */
/** @typedef {import('./system.js').AudioListenerComponentSystem} AudioListenerComponentSystem */
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
    * @param {AudioListenerComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: AudioListenerComponentSystem, entity: Entity) = this()
  
  def setCurrentListener(): Unit = js.native
}
