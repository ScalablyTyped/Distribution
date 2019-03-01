package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThematicBreak
  extends BlockContent
     with unistLib.unistMod.Node {
  @JSName("type")
  var type_ThematicBreak: mdastLib.mdastLibStrings.thematicBreak
}

object ThematicBreak {
  @scala.inline
  def apply(
    `type`: mdastLib.mdastLibStrings.thematicBreak,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): ThematicBreak = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ThematicBreak]
  }
}

