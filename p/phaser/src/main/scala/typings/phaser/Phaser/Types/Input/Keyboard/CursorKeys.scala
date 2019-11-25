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
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorKeys]
  }
}

