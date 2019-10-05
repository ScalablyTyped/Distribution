package typings.phaser.Phaser.Types.Input.Gamepad

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Gamepad object, as extracted from GamepadEvent.
  */
trait Pad extends js.Object {
  /**
    * The ID of the Gamepad.
    */
  var id: String
  /**
    * The index of the Gamepad.
    */
  var index: integer
}

object Pad {
  @scala.inline
  def apply(id: String, index: integer): Pad = {
    val __obj = js.Dynamic.literal(id = id, index = index)
  
    __obj.asInstanceOf[Pad]
  }
}

