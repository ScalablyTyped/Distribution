package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDeclaration extends JsonNode {
  /**
    * True if the declaration has an !important annotation.
    */
  var important: js.UndefOr[scala.Boolean] = js.undefined
}

object JsonDeclaration {
  @scala.inline
  def apply(
    important: js.UndefOr[scala.Boolean] = js.undefined,
    parent: JsonContainer = null,
    raws: NodeRaws = null,
    source: NodeSource = null,
    `type`: java.lang.String = null
  ): JsonDeclaration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonDeclaration]
  }
}

