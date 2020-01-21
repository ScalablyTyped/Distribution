package typings.mdast.mod

import typings.mdast.mdastStrings.paragraph
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_Paragraph: js.Array[PhrasingContent]
  @JSName("type")
  var type_Paragraph: paragraph
}

object Paragraph {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: paragraph,
    data: Data = null,
    position: Position = null
  ): Paragraph = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
}

