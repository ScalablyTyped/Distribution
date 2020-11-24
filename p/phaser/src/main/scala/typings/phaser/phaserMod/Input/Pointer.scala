package typings.phaser.phaserMod.Input

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Pointer object encapsulates both mouse and touch input within Phaser.
  * 
  * By default, Phaser will create 2 pointers for your game to use. If you require more, i.e. for a multi-touch
  * game, then use the `InputPlugin.addPointer` method to do so, rather than instantiating this class directly,
  * otherwise it won't be managed by the input system.
  * 
  * You can reference the current active pointer via `InputPlugin.activePointer`. You can also use the properties
  * `InputPlugin.pointer1` through to `pointer10`, for each pointer you have enabled in your game.
  * 
  * The properties of this object are set by the Input Plugin during processing. This object is then sent in all
  * input related events that the Input Plugin emits, so you can reference properties from it directly in your
  * callbacks.
  */
@JSImport("phaser", "Input.Pointer")
@js.native
class Pointer protected ()
  extends typings.phaser.Phaser.Input.Pointer {
  /**
    * 
    * @param manager A reference to the Input Manager.
    * @param id The internal ID of this Pointer.
    */
  def this(manager: typings.phaser.Phaser.Input.InputManager, id: integer) = this()
}
