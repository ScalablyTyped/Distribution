package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Strong: js.Array[PhrasingContent]
  @JSName("type")
  var type_Strong: mdastLib.mdastLibStrings.strong
}

object Strong {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: mdastLib.mdastLibStrings.strong,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Strong = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Strong]
  }
}

