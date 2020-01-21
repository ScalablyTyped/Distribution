package typings.mdast.mod

import typings.mdast.mdastStrings.delete
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Delete: js.Array[PhrasingContent]
  @JSName("type")
  var type_Delete: delete
}

object Delete {
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: delete, data: Data = null, position: Position = null): Delete = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

