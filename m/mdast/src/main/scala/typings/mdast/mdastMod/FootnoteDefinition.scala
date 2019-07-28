package typings.mdast.mdastMod

import typings.mdast.mdastStrings.footnoteDefinition
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
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
    val __obj = js.Dynamic.literal(children = children, identifier = identifier)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[FootnoteDefinition]
  }
}

