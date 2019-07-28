package typings.mdast.mdastMod

import typings.mdast.mdastStrings.footnoteReference
import typings.unist.unistMod.Data
import typings.unist.unistMod.Node
import typings.unist.unistMod.Position
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
    val __obj = js.Dynamic.literal(identifier = identifier)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[FootnoteReference]
  }
}

