package typings
package phaserLib.PhaserNs.TypesNs.InputNs.GamepadNs

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
  var id: java.lang.String
  /**
    * The index of the Gamepad.
    */
  var index: phaserLib.integer
}

object Pad {
  @scala.inline
  def apply(id: java.lang.String, index: phaserLib.integer): Pad = {
    val __obj = js.Dynamic.literal(id = id, index = index)
  
    __obj.asInstanceOf[Pad]
  }
}

