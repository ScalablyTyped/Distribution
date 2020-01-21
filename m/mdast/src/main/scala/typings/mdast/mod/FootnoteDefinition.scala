package typings.mdast.mod

import typings.mdast.mdastStrings.footnoteDefinition
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FootnoteDefinition
  extends Parent
     with Association
     with DefinitionContent {
  @JSName("children")
  var children_FootnoteDefinition: js.Array[BlockContent]
  @JSName("type")
  var type_FootnoteDefinition: footnoteDefinition
}

object FootnoteDefinition {
  @scala.inline
  def apply(
    children: js.Array[BlockContent],
    identifier: String,
    `type`: footnoteDefinition,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): FootnoteDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteDefinition]
  }
}

