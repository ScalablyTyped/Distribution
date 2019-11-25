package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonAtRule extends JsonContainer {
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[String] = js.undefined
}

object JsonAtRule {
  @scala.inline
  def apply(
    first: ChildNode = null,
    last: ChildNode = null,
    name: String = null,
    nodes: js.Array[ChildNode] = null,
    params: String = null,
    parent: JsonContainer = null,
    raws: NodeRaws = null,
    source: NodeSource = null,
    `type`: String = null
  ): JsonAtRule = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (raws != null) __obj.updateDynamic("raws")(raws.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonAtRule]
  }
}

