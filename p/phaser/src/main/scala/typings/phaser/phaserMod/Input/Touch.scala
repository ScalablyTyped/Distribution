package typings.phaser.phaserMod.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Input.Touch")
@js.native
object Touch extends js.Object {
  /**
    * The Touch Manager is a helper class that belongs to the Input Manager.
    * 
    * Its role is to listen for native DOM Touch Events and then pass them onto the Input Manager for further processing.
    * 
    * You do not need to create this class directly, the Input Manager will create an instance of it automatically.
    */
  @js.native
  class TouchManager protected ()
    extends typings.phaser.Phaser.Input.Touch.TouchManager {
    /**
      * 
      * @param inputManager A reference to the Input Manager.
      */
    def this(inputManager: typings.phaser.Phaser.Input.InputManager) = this()
  }
  
}

