package typings.mdast.mod

import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent
  extends typings.unist.mod.Parent

object Parent {
  @scala.inline
  def apply(children: js.Array[Node], `type`: String, data: Data = null, position: Position = null): Parent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

