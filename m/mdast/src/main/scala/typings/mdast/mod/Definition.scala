package typings.mdast.mod

import typings.mdast.mdastStrings.definition
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition
  extends DefinitionContent
     with Node
     with Association
     with Resource {
  @JSName("type")
  var type_Definition: definition
}

object Definition {
  @scala.inline
  def apply(
    identifier: String,
    `type`: definition,
    url: String,
    data: Data = null,
    label: String = null,
    position: Position = null,
    title: String = null
  ): Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

