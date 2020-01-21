package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonContainer extends JsonNode {
  /**
    * @returns The container's first child.
    */
  var first: js.UndefOr[ChildNode] = js.undefined
  /**
    * @returns The container's last child.
    */
  var last: js.UndefOr[ChildNode] = js.undefined
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[ChildNode]] = js.undefined
}

object JsonContainer {
  @scala.inline
  def apply(
    first: ChildNode = null,
    last: ChildNode = null,
    nodes: js.Array[ChildNode] = null,
    parent: JsonContainer = null,
    raws: NodeRaws = null,
    source: NodeSource = null,
    `type`: String = null
  ): JsonContainer = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (raws != null) __obj.updateDynamic("raws")(raws.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonContainer]
  }
}

