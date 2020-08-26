package typings.phaser.Phaser.Types.Input.Gamepad

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Gamepad object, as extracted from GamepadEvent.
  */
@js.native
trait Pad extends js.Object {
  /**
    * The ID of the Gamepad.
    */
  var id: String = js.native
  /**
    * The index of the Gamepad.
    */
  var index: integer = js.native
}

object Pad {
  @scala.inline
  def apply(id: String, index: integer): Pad = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pad]
  }
  @scala.inline
  implicit class PadOps[Self <: Pad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: integer): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

