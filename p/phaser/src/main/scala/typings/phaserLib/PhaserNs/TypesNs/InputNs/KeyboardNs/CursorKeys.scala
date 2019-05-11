package typings
package phaserLib.PhaserNs.TypesNs.InputNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorKeys extends js.Object {
  /**
    * A Key object mapping to the DOWN arrow key.
    */
  var down: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * A Key object mapping to the LEFT arrow key.
    */
  var left: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * A Key object mapping to the RIGHT arrow key.
    */
  var right: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * A Key object mapping to the SHIFT key.
    */
  var shift: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * A Key object mapping to the SPACE BAR key.
    */
  var space: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * A Key object mapping to the UP arrow key.
    */
  var up: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
}

object CursorKeys {
  @scala.inline
  def apply(
    down: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    left: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    right: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    shift: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    space: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    up: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null
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

