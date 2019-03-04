package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutOption extends js.Object {
  var active: js.Function
  var failed: js.Function
  var key: java.lang.String
}

object ShortcutOption {
  @scala.inline
  def apply(active: js.Function, failed: js.Function, key: java.lang.String): ShortcutOption = {
    val __obj = js.Dynamic.literal(active = active, failed = failed, key = key)
  
    __obj.asInstanceOf[ShortcutOption]
  }
}

