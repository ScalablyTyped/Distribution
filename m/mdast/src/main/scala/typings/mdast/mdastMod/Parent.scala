package typings.mdast.mdastMod

import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent
  extends typings.unist.unistMod.Parent {
  @JSName("children")
  var children_Parent: js.Array[Content]
}

object Parent {
  @scala.inline
  def apply(children: js.Array[Content], `type`: String, data: Data = null, position: Position = null): Parent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

