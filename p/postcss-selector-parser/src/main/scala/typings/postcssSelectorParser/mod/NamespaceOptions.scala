package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.PartialSpaces
import typings.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceOptions[Value /* <: js.UndefOr[String] */] extends NodeOptions[Value] {
  var namespace: js.UndefOr[String | `true`] = js.undefined
}

object NamespaceOptions {
  @scala.inline
  def apply[Value /* <: js.UndefOr[String] */](
    value: Value,
    namespace: String | `true` = null,
    source: NodeSource = null,
    sourceIndex: Int | Double = null,
    spaces: PartialSpaces = null
  ): NamespaceOptions[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceIndex != null) __obj.updateDynamic("sourceIndex")(sourceIndex.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceOptions[Value]]
  }
}

