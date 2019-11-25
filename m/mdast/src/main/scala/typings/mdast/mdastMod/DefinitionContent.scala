package typings.mdast.mdastMod

import typings.mdast.mdastStrings.definition
import typings.mdast.mdastStrings.footnoteDefinition
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mdastMod.Definition
  - typings.mdast.mdastMod.FootnoteDefinition
*/
trait DefinitionContent extends _TopLevelContent

object DefinitionContent {
  @scala.inline
  def Definition(
    identifier: String,
    `type`: definition,
    url: String,
    data: Data = null,
    label: String = null,
    position: Position = null,
    title: String = null
  ): DefinitionContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionContent]
  }
  @scala.inline
  def FootnoteDefinition(
    children: js.Array[BlockContent],
    identifier: String,
    `type`: footnoteDefinition,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): DefinitionContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionContent]
  }
}

