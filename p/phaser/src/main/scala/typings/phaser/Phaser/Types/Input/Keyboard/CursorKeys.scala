package typings.phaser.Phaser.Types.Input.Keyboard

import typings.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorKeys extends js.Object {
  /**
    * A Key object mapping to the DOWN arrow key.
    */
  var down: js.UndefOr[Key] = js.undefined
  /**
    * A Key object mapping to the LEFT arrow key.
    */
  var left: js.UndefOr[Key] = js.undefined
  /**
    * A Key object mapping to the RIGHT arrow key.
    */
  var right: js.UndefOr[Key] = js.undefined
  /**
    * A Key object mapping to the SHIFT key.
    */
  var shift: js.UndefOr[Key] = js.undefined
  /**
    * A Key object mapping to the SPACE BAR key.
    */
  var space: js.UndefOr[Key] = js.undefined
  /**
    * A Key object mapping to the UP arrow key.
    */
  var up: js.UndefOr[Key] = js.undefined
}

object CursorKeys {
  @scala.inline
  def apply(
    down: Key = null,
    left: Key = null,
    right: Key = null,
    shift: Key = null,
    space: Key = null,
    up: Key = null
  ): CursorKeys = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (space != null) __obj.updateDynamic("space")(space)
    if (up != null) __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[CursorKeys]
  }
}

