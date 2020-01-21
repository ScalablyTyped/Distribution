package typings.mdast.mod

import typings.mdast.mdastStrings.linkReference
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkReference
  extends Parent
     with Reference
     with PhrasingContent {
  @JSName("children")
  var children_LinkReference: js.Array[StaticPhrasingContent]
  @JSName("type")
  var type_LinkReference: linkReference
}

object LinkReference {
  @scala.inline
  def apply(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): LinkReference = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkReference]
  }
}

