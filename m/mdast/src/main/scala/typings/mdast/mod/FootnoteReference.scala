package typings.mdast.mod

import typings.mdast.mdastStrings.footnoteReference
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FootnoteReference
  extends StaticPhrasingContent
     with Node
     with Association {
  @JSName("type")
  var type_FootnoteReference: footnoteReference
}

object FootnoteReference {
  @scala.inline
  def apply(
    identifier: String,
    `type`: footnoteReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReference]
  }
}

