package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRule extends JsonContainer {
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[String] = js.undefined
  /**
    * An array containing the rule's individual selectors.
    * Groups of selectors are split at commas.
    */
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
}

object JsonRule {
  @scala.inline
  def apply(
    first: ChildNode = null,
    last: ChildNode = null,
    nodes: js.Array[ChildNode] = null,
    parent: JsonContainer = null,
    raws: NodeRaws = null,
    selector: String = null,
    selectors: js.Array[String] = null,
    source: NodeSource = null,
    `type`: String = null
  ): JsonRule = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonRule]
  }
}

