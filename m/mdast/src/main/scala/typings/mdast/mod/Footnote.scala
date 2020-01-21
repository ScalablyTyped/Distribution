package typings.mdast.mod

import typings.mdast.mdastStrings.footnote
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footnote
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Footnote: js.Array[PhrasingContent]
  @JSName("type")
  var type_Footnote: footnote
}

object Footnote {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: footnote,
    data: Data = null,
    position: Position = null
  ): Footnote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnote]
  }
}

