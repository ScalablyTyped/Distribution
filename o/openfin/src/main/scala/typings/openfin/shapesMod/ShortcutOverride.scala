package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutOverride extends Hotkey {
  var command: String
}

object ShortcutOverride {
  @scala.inline
  def apply(command: String, keys: String, preventDefault: js.UndefOr[Boolean] = js.undefined): ShortcutOverride = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutOverride]
  }
}

