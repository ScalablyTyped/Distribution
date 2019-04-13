package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonAtRule extends JsonContainer {
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[java.lang.String] = js.undefined
}

object JsonAtRule {
  @scala.inline
  def apply(
    first: ChildNode = null,
    last: ChildNode = null,
    name: java.lang.String = null,
    nodes: js.Array[ChildNode] = null,
    params: java.lang.String = null,
    parent: JsonContainer = null,
    raws: NodeRaws = null,
    source: NodeSource = null,
    `type`: java.lang.String = null
  ): JsonAtRule = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (params != null) __obj.updateDynamic("params")(params)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonAtRule]
  }
}

