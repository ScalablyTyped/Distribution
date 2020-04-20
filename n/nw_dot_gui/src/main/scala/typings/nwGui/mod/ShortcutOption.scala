package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutOption extends js.Object {
  var active: js.Function
  var failed: js.Function
  var key: String
}

object ShortcutOption {
  @scala.inline
  def apply(active: js.Function, failed: js.Function, key: String): ShortcutOption = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutOption]
  }
}

