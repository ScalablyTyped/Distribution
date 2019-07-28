package typings.mdast.mdastMod

import typings.mdast.mdastStrings.emphasis
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emphasis
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Emphasis: js.Array[PhrasingContent]
  @JSName("type")
  var type_Emphasis: emphasis
}

object Emphasis {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: emphasis,
    data: Data = null,
    position: Position = null
  ): Emphasis = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Emphasis]
  }
}

