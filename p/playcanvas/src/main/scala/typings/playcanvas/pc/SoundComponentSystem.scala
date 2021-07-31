package typings.playcanvas.pc

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a SoundComponentSystem.
  * @property volume - Sets / gets the volume for the entire Sound system. All sounds will have their volume
  * multiplied by this value. Valid between [0, 1].
  * @property context - Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
  * @property manager - Gets / sets the sound manager.
  * @param app - The Application.
  * @param manager - The sound manager.
  */
@js.native
trait SoundComponentSystem
  extends StObject
     with EventHandler {
  
  /**
    * Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
    */
  var context: AudioContext = js.native
  
  /**
    * Gets / sets the sound manager.
    */
  var manager: SoundManager = js.native
  
  /**
    * Sets / gets the volume for the entire Sound system. All sounds will have their volume
    multiplied by this value. Valid between [0, 1].
    */
  var volume: Double = js.native
}
