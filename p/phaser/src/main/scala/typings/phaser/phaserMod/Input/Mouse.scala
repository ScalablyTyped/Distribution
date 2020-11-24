package typings.phaser.phaserMod.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Input.Mouse")
@js.native
object Mouse extends js.Object {
  
  /**
    * The Mouse Manager is a helper class that belongs to the Input Manager.
    * 
    * Its role is to listen for native DOM Mouse Events and then pass them onto the Input Manager for further processing.
    * 
    * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
    */
  @js.native
  class MouseManager protected ()
    extends typings.phaser.Phaser.Input.Mouse.MouseManager {
    /**
      * 
      * @param inputManager A reference to the Input Manager.
      */
    def this(inputManager: typings.phaser.Phaser.Input.InputManager) = this()
  }
}
