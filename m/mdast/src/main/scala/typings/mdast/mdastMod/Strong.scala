package typings.mdast.mdastMod

import typings.mdast.mdastStrings.strong
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strong
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Strong: js.Array[PhrasingContent]
  @JSName("type")
  var type_Strong: strong
}

object Strong {
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: strong, data: Data = null, position: Position = null): Strong = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Strong]
  }
}

