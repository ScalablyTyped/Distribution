package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDeclaration extends JsonNode {
  /**
    * True if the declaration has an !important annotation.
    */
  var important: js.UndefOr[Boolean] = js.undefined
}

object JsonDeclaration {
  @scala.inline
  def apply(
    important: js.UndefOr[Boolean] = js.undefined,
    parent: JsonContainer = null,
    raws: NodeRaws = null,
    source: NodeSource = null,
    `type`: String = null
  ): JsonDeclaration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (raws != null) __obj.updateDynamic("raws")(raws.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDeclaration]
  }
}

