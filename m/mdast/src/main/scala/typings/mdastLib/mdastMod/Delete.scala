package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Delete: js.Array[PhrasingContent]
  @JSName("type")
  var type_Delete: mdastLib.mdastLibStrings.delete
}

object Delete {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: mdastLib.mdastLibStrings.delete,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Delete = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Delete]
  }
}

