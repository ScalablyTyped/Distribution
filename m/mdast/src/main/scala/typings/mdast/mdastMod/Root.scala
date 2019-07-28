package typings.mdast.mdastMod

import typings.mdast.mdastStrings.root
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends Parent {
  @JSName("type")
  var type_Root: root
}

object Root {
  @scala.inline
  def apply(children: js.Array[Content], `type`: root, data: Data = null, position: Position = null): Root = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Root]
  }
}

