package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Break
  extends StaticPhrasingContent
     with unistLib.unistMod.Node {
  @JSName("type")
  var type_Break: mdastLib.mdastLibStrings.break
}

object Break {
  @scala.inline
  def apply(
    `type`: mdastLib.mdastLibStrings.break,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Break = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Break]
  }
}

