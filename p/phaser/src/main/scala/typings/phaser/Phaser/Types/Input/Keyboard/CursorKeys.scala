package typings.phaser.Phaser.Types.Input.Keyboard

import typings.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorKeys extends js.Object {
  /**
    * A Key object mapping to the DOWN arrow key.
    */
  var down: js.UndefOr[Key] = js.native
  /**
    * A Key object mapping to the LEFT arrow key.
    */
  var left: js.UndefOr[Key] = js.native
  /**
    * A Key object mapping to the RIGHT arrow key.
    */
  var right: js.UndefOr[Key] = js.native
  /**
    * A Key object mapping to the SHIFT key.
    */
  var shift: js.UndefOr[Key] = js.native
  /**
    * A Key object mapping to the SPACE BAR key.
    */
  var space: js.UndefOr[Key] = js.native
  /**
    * A Key object mapping to the UP arrow key.
    */
  var up: js.UndefOr[Key] = js.native
}

object CursorKeys {
  @scala.inline
  def apply(): CursorKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorKeys]
  }
  @scala.inline
  implicit class CursorKeysOps[Self <: CursorKeys] (val x: Self) extends AnyVal {
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
    def setDown(value: Key): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setLeft(value: Key): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Key): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setShift(value: Key): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    @scala.inline
    def setSpace(value: Key): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setUp(value: Key): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
  
}

